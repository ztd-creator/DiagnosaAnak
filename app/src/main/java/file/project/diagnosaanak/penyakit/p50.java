package file.project.diagnosaanak.penyakit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.diagnosaanak.R;

public class p50 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p50);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p50 = findViewById(R.id.diagnosaMulai);
        ya = findViewById(R.id.btn_yaa);
        tdk = findViewById(R.id.btn_tidakk);
        mulai = findViewById(R.id.btn_mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mulai.startAnimation( animFadeOut );
                findViewById(R.id.cardviewDiagnosa).startAnimation(animShow);
                mulai.setVisibility(View.GONE);
                findViewById(R.id.cardviewDiagnosa).setVisibility(View.VISIBLE);

                p50.setText("Mungkinkah si anak beru terkena cedera?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString =  "</b> " + "Bawa ke dokter sekarang juga" +
                            "KEMUNGKINAN PENYEBAB DAN TINDAKAN Pada anak kecil, satu-satunya bukti cedera mungkin hanyalah lemas atau enggan bertumpu ke kaki yang cedera. Dokter akan memeriksa si anak untuk memastikan diagnosa ini, dan bila perlu akan merujuk si anak ke rumah sakit untuk menjalani beberapa tes dan perawatan. ";
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "// MAU DIKEMBANGKAN -----------------------------------------------------------------------------" ;
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d3")) {
                    p50.setText("apakah si anak baru saja terinfeksi, misalnya tenggorokan serak?");
                    posisi = "dl3";
                }

                else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "BAWA KE DOKTER DALAM 24 JAM" + "</b> " + " KEMUNGKINAN PENYEBAB Mungkin ia mengalami iritasi pinggul, yaitu permukaan sendi meradan akibat infeksi lain di tubuh baru baru ini" + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter akan memeriksa si anak dan meminta pemeriksaan sinar - X";
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("dll3")) {
                    String sourceString = "<b>" + "BAWA KE DOKTER DALAM 24 JAM" + "</b> " + " KEMUNGKINAN PENYEBAB Penyakit Perthes,yaitu kepala femur (tulang paha) berubah bentuk akibat kurangnya pasokan darah ke tulang tersebut." + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter akan memeriksa dan meminta anak di scan ultrasonik.";
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("dlll3")) {
                    String sourceString = "<b>" + "BAWA KE DOKTER DALAM 24 JAM" + "</b> " + " KEMUNGKINAN PENYEBAB Gejala ini mungkin disebabkan oleh epifisis femur tergeser.Pada kondisi ini, ujung pertumbuhan femur(tulang paha) di pinggul sebagian tergeser atau terpisah dari tulang di sebelahnya" + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter akan memeriksa dan meminta anak dan meminta dilakukan pemeriksaan Sinar - X.";
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }
        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("d1")){
                    p50.setText("Adakah bengkak nyeri di lutut atau pergelangan kakinya?");
                    posisi="d2";
                }

                else if(posisi.equals("d2")) {
                    p50.setText("Apakah si anak mengeluh sakit atau todak enak di pinggul atau paha, tanpa ada bengkak atau merah?");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p50.setText("Adakah benjolan atau bengkak meradang di selangkang?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")){
                    String sourceString = "<b>" + "BAWA KE DOKTER DALAM 24 JAM" + "</b> " + " KEMUNGKINAN PENYEBAB Pembengkakan bonggol limfe bisa membuat seorang anak sulit berjalan wajar. Bengkaknya mungkin disebabkan oleh infeksi seperti demam-kelenjar atau sebagai reaksi atau sebuah cedera di tungkai ataupun kaki." + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter akan memeriksa si anak dan juga melakukan tes darah untuk memeriksa adanya infeksi. Bila ada cedera yang terinfeksi, akan diperlukan antibiotika.";
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl3")) {
                    p50.setText("Apakah usianya si anak antara 4-8 tahun?");
                    posisi = "dll3";
                }

                else if(posisi.equals("dll3")) {
                    p50.setText("Apakah usia si anak antara 10-16 tahun?");
                    posisi = "dlll3";
                }



                else if (posisi.equals("dlll3")) {
                    String sourceString = "<b>" + "Periksakan ke Dokter Dalam 24 Jam";
                    p50.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}



            }
        });
    }


}
