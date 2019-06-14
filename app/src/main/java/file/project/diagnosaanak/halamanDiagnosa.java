package file.project.diagnosaanak;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.example.diagnosaanak.R;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class halamanDiagnosa extends AppCompatActivity {
    ListView list;

    JSONParser jParser = new JSONParser();
    ArrayList<Penyakit> daftar_penyakit = new ArrayList<Penyakit>();
    JSONArray daftarPenyakit = null;
    String url_read_penyakit = server.URL+"read_penyakit.php";
    // JSON Node names, ini harus sesuai yang di API
    public static final String TAG_SUCCESS = "success";
    public static final String TAG_PENYAKIT = "penyakit";
    public static final String TAG_KODE_PENYAKIT = "kode_penyakit";
    public static final String TAG_NAMA_PENYAKIT = "nama_penyakit";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_diagnosa);

        list = (ListView) findViewById(R.id.listview_penyakit);

        //jalankan ReadMhsTask
        ReadPenyakitTask m = (ReadPenyakitTask) new ReadPenyakitTask().execute();


    }


    class ReadPenyakitTask extends AsyncTask<String, Void, String>
    {
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(halamanDiagnosa.this);
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
                Toast.makeText(halamanDiagnosa.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
            }

            if(result.equalsIgnoreCase("no results"))
            {
                Toast.makeText(halamanDiagnosa.this, "Data empty", Toast.LENGTH_LONG).show();
            }
            else
            {
                list.setAdapter(new PenyakitAdapter(halamanDiagnosa.this,daftar_penyakit)); //Adapter menampilkan data mahasiswa ke dalam listView
            }
        }


        //method untuk memperoleh daftar mahasiswa dari JSON
        public String getListPenyakit()
        {
            Penyakit tempPenyakit = new Penyakit();
            List<NameValuePair> parameter = new ArrayList<NameValuePair>();
            try {
                JSONObject json = jParser.makeHttpRequest(url_read_penyakit,"POST", parameter);

                int success = json.getInt(TAG_SUCCESS);
                if (success == 1) { //Ada record Data (SUCCESS = 1)
                    //Getting Array of daftar_mhs
                    daftarPenyakit = json.getJSONArray(TAG_PENYAKIT);
                    // looping through All daftar_mhs
                    for (int i = 0; i < daftarPenyakit.length() ; i++){
                        JSONObject c = daftarPenyakit.getJSONObject(i);
                        tempPenyakit = new Penyakit();
                        tempPenyakit.setKode_penyakit(c.getString(TAG_KODE_PENYAKIT));
                        tempPenyakit.setNama_penyakit(c.getString(TAG_NAMA_PENYAKIT));

                        daftar_penyakit.add(tempPenyakit);
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

