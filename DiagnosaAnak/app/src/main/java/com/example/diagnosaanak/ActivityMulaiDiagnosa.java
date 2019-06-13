package com.example.diagnosaanak;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ActivityMulaiDiagnosa extends AppCompatActivity {
    String kodePenyakit;
    String namaRow;
    int success, noD;
    TextView diagnosa;
    Button btn_next;
    JSONParser jParser = new JSONParser();
    JSONArray daftarPenyakit = null;
    ProgressDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_diagnosa);
        diagnosa = (TextView)findViewById(R.id.diagnosa);
        kodePenyakit = getIntent().getStringExtra("kodePenyakit");
        Toast.makeText(getApplicationContext(),kodePenyakit,Toast.LENGTH_LONG).show();
        btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaRow = "diagnosa_";
                noD=noD+1;
                new ReadPenyakitTask().execute();

            }
        });
//        new ReadPenyakitTask().execute();
    }
    class ReadPenyakitTask extends AsyncTask<String, Void, String>
    {
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(ActivityMulaiDiagnosa.this);
            pDialog.setMessage("Mohon Tunggu..");
            pDialog.setIndeterminate(true);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... sText) {
            String returnResult = getListPenyakit(); //memanggil method getMhsList()
            return returnResult;

        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            pDialog.dismiss();
            if(result.equalsIgnoreCase("Exception Caught"))
            {
                Toast.makeText(ActivityMulaiDiagnosa.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
            }

            if(result.equalsIgnoreCase("no results"))
            {
                Toast.makeText(ActivityMulaiDiagnosa.this, "Data empty", Toast.LENGTH_LONG).show();
            }

        }


        //method untuk memperoleh daftar mahasiswa dari JSON
        public String getListPenyakit()
        {
            Penyakit tempPenyakit = new Penyakit();
            List<NameValuePair> parameter = new ArrayList<NameValuePair>();
            try {
                JSONObject json = jParser.makeHttpRequest(server.URL+"dataDiagnosa.php?kodePenyakit="+kodePenyakit+"&namaRow="+namaRow+noD,"POST", parameter);

                int success = json.getInt("success");
                if (success == 1) { //Ada record Data (SUCCESS = 1)
                    //Getting Array of daftar_mhs

                    daftarPenyakit = json.getJSONArray("penyakit");
                    // looping through All daftar_mhs
                    for (int i = 0; i < daftarPenyakit.length() ; i++){
                        JSONObject c = daftarPenyakit.getJSONObject(i);
                        String isiDiagnosa =c.getString("isiDiagnosa");
                                diagnosa.setText(isiDiagnosa);

                    }
                    return "OK";
                }
                else {
                    //Tidak Ada Record Data (SUCCESS = 0)
                    return "no results";
                }

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception Caught";
            }
        }

    }

}
