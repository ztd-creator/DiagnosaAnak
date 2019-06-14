package file.example.diagnosaanak;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diagnosaanak.R;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class ActivityMulaiDiagnosa extends AppCompatActivity {
    String kodePenyakit;
    String namaRow;
    int success, noD,noDL;
    TextView diagnosa;
    int triggerD,triggerDLL,triggetDL_T;
    private Button btn_tidak, btn_ya;
    JSONParser jParser = new JSONParser();
    JSONArray daftarPenyakit = null;
    private ProgressDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_diagnosa);
        diagnosa = (TextView)findViewById(R.id.diagnosa);
        kodePenyakit = getIntent().getStringExtra("kodePenyakit");
        triggerDLL = 0;
        new ReadPenyakitTaskTidak().execute();
        Toast.makeText(getApplicationContext(),kodePenyakit,Toast.LENGTH_LONG).show();
        btn_ya = (Button)findViewById(R.id.btn_ya);
        btn_ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new ReadPenyakitTaskYa().execute();

            }
        });

        btn_tidak = (Button)findViewById(R.id.btn_next);
        btn_tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new ReadPenyakitTaskTidak().execute();

            }
        });


    }
    //----------------------------YA
    class ReadPenyakitTaskYa extends AsyncTask<String, Void, String>
    {
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
            String returnResult = getListPenyakit();
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
            if(result.equalsIgnoreCase("null"))
            {
                btn_tidak.setVisibility(View.GONE);
                btn_ya.setVisibility(View.GONE);
            }

        }


        public String getListPenyakit()
        {
            if(triggerDLL == 0){
                namaRow = "diagLanjut_";
                noDL=noDL+1;
            }

            List<NameValuePair> parameter = new ArrayList<NameValuePair>();
            try {
                JSONObject json = jParser.makeHttpRequest(server.URL+"dataDiagnosaLanjut.php?kodePenyakit="+kodePenyakit+"&namaRow="+namaRow+noD,"POST", parameter);
                int success = json.getInt("success");
                if(success == 1){
                    //Tidak Ada Record Data (SUCCESS = 0)
                    daftarPenyakit = json.getJSONArray("penyakit");
                    diagnosa.setText("Segera Periksa ke dokter");
                    //Toast.makeText(getApplicationContext(),"Kosong",Toast.LENGTH_LONG).show();

                    return "null";
                }else if (success == 2) { //Ada record Data (SUCCESS = 1)
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
                    Toast.makeText(getApplicationContext(),"Kosong2",Toast.LENGTH_LONG).show();
                    return "no results";
                }


            } catch (Exception e) {
                e.printStackTrace();
                return "Exception Caught";
            }

        }

    }

    //----------------------------TIDAK

    class ReadPenyakitTaskTidak extends AsyncTask<String, Void, String>
    {
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
            if(result.equalsIgnoreCase("null"))
            {
                btn_tidak.setVisibility(View.GONE);
                btn_ya.setVisibility(View.GONE);
            }

        }


        public String getListPenyakit()
        {
            if(triggerD == 0){
                namaRow = "diagnosa_";
                noD=noD+1;
            }

            List<NameValuePair> parameter = new ArrayList<NameValuePair>();
            try {
                JSONObject json = jParser.makeHttpRequest(server.URL+"dataDiagnosa.php?kodePenyakit="+kodePenyakit+"&namaRow="+namaRow+noD,"POST", parameter);
                int success = json.getInt("success");
                if(success == 1){
                    //Tidak Ada Record Data (SUCCESS = 0)
                    daftarPenyakit = json.getJSONArray("penyakit");
                    diagnosa.setText("Segera Periksa ke dokter");
                    //Toast.makeText(getApplicationContext(),"Kosong",Toast.LENGTH_LONG).show();

                    return "null";
                }else if (success == 2) { //Ada record Data (SUCCESS = 1)
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
                    Toast.makeText(getApplicationContext(),"Kosong2",Toast.LENGTH_LONG).show();
                    return "no results";
                }


            } catch (Exception e) {
                e.printStackTrace();
                return "Exception Caught";
            }

        }

    }


}
