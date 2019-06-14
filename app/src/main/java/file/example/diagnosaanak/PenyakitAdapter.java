package file.example.diagnosaanak;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.diagnosaanak.R;

import java.util.ArrayList;

public class PenyakitAdapter extends BaseAdapter {
    private Activity activity;
    //private ArrayList<HashMap<String, String>> data;
    private ArrayList<Penyakit> data_penyakit=new ArrayList<Penyakit>();

    private static LayoutInflater inflater = null;

    public PenyakitAdapter(Activity a, ArrayList<Penyakit> d) {
        activity = a;
        data_penyakit = d;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public int getCount() {
        return data_penyakit.size();
    }
    public Object getItem(int position) {
        return data_penyakit.get(position);
    }
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null)
            view = inflater.inflate(R.layout.list_nama_penyakit, null);
        TextView kode_penyakit = (TextView) view.findViewById(R.id.kode_penyakit);
        TextView nama_penyakit = (TextView) view.findViewById(R.id.nama_penyakit);
        //TextView nim_mhs = (TextView) vi.findViewById(R.id.nim_mhs);

        Penyakit daftar_penyakit = data_penyakit.get(position);
        kode_penyakit.setText(daftar_penyakit.getKode_penyakit());
        final String kode = daftar_penyakit.getKode_penyakit();
        nama_penyakit.setText(daftar_penyakit.getNama_penyakit());
        CardView cardClick = (CardView) view.findViewById(R.id.cardClick);
        cardClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PenyakitAdapter.inflater.getContext(), ActivityMulaiDiagnosa.class);
                intent.putExtra("kodePenyakit", kode);
                (PenyakitAdapter.inflater.getContext()).startActivity(intent);
            }
        });


        return view;
    }
}

