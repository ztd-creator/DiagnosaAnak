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

public class p32 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p32);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p32 = findViewById(R.id.diagnosaMulai);
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

                p32.setText("apakah temperatur tubuhnya 38°C atau lebih?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p32.setText("adakah benjolan bengkak meradang di ketiak dan/atau selangkang?");
                    posisi = "dl1";
                }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Demam kelenjar (mononukleosis menular), sebuah infeksi virus yang menyebabkan pembengkakan kelenjar, bisa menyebabkan tenggorokan nyeri." +
                            "Tindakan. Bila menduga disebabkan demam kelenjar, dokter akan meminta pemeriksaan darah untuk memastikan diagnosa ini. Tidak ada pengobatan khusus untuk demam kelenjar, walau langkah-langkah meredakan demam dan meredakan nyeri tenggorokan akan bisa mengurangi penderitaan si anak.";
                    p32.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Ada kemungkinan ini demam merah, yaitu suatu infeksi tenggorokan oleh bakteri. Ruamnya lebih nyata di lipatan kulit, misalnya di ketiak. Si anak mungkin juga muntah." +
                            "Tindakan. Dokter akan mengambil contoh jaringan tenggorokan si anak untuk memastikan diagnosa ini. Pengobatan yang diberikan adalah dengan antibiotik.";
                    p32.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab dan tindakan. Radang di tenggorokan (pharingitis) atau di tongsil (tonsilitis) adalah sangat mungkin. Peradangan ini akibat infeksi virus atau bakteri. Setelah memeriksa, dokter akan meresepkan antibiotik. Selain itu, lakukan juga tindakan meredakan nyeri tenggorokan pada si anak.";
                    p32.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Pilek atau infeksi virus lain bisa menyebabkan nyeri tenggorokan." +
                            "Tindakan. Lakukan penanganan sendiri atas pileknya. Bila si anak juga demam, redakanlah. Gejalanya akan mulai membaik dalam beberapa hari. Bila tidak membaik juga, atau timbuk gejala lain, periksakanlah ke dokter.";
                    p32.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }

        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("rev")){
                    p32.setText("apakah si anak bersin, dan/atau apakah hidungnya berlendir?");
                    posisi="dl2"; }

                else if(posisi.equals("dl1")){
                    p32.setText("adakah ruam merah di tubuh dan anggota tubuh?");
                    posisi="d2";}

                else if(posisi.equals("d2")){
                    p32.setText("apakah si anak enggan makan makanan padat, dan apakah dia tampak lesu?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p32.setText("apakah si anak bersin, dan/atau apakah hidungnya berlendir?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Radang tenggorokan akibat infeksi virus ringan atau akibat ititasi mungkin penyebab gejala ini." +
                            "Tindakan. Redakanlah sendiri nyeri tenggorokan si anak. Periksakanlah ke dokter bila si anak belum membaik dalam beberapa hari.";
                    p32.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}



            }
        });
    }}