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

public class p41 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p41);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p41 = findViewById(R.id.diagnosaMulai);
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

                p41.setText("apakah si anak mengalami sakit perut parah?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "Kemungkinan Penyebab " + "</b> " + " Sembelit yang timbul disertai sakit perut parah bisa diakibatkan oleh sumbatan usus atau kelainan serius lain di usus.";
                    p41.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Di hawa panas, anak-anak bisa mengalami dehidrasi, yang bisa membuat tinjanya mengeras atau berbutir-butir. Hilangnya cairan tubuh karena demam atau muntah juga bisa mengacaukan kegiatan usus." + "<b>" +
                            "Tindakan "+ "</b>"+ "Buatlah agar si anak banyak minum. Pola kegiatan ususnya akan kembali normal dalam beberapa haru. Bila si anak masih juga sembelit, periksakanlah ke dokter.\n";
                    p41.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                    else if(posisi.equals("d3")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + " Sebuah rekah-jaringan (robek atau belah) di dam anus adalah kemungkinan penyebabnya. Sebuah rekahan akan menyebabkan nyeri buang air besar, yang bisa membuat si anak takut buang air besar karena takut sakit lagi. Konsultasikan ke dokter yang bisa meresepkan pelunak tinja dan akan bisa mengurangi sakit saat buang air besar. Lakukan juga langkah-langkah mencegah sembelit kambuh. ";
                    p41.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Mungkin si anak sengaja menahannya. Hal ini menunjukkan adanya kecemasan saat belajar buang air besar. Bila usia si anak dibawah 18 bulan, ada baiknya menunda dulu belajar hal itu sampai ia berusia setidaknya 2 tahun. Bila anak anda tidak buang air besar selama 4 hari, periksakanlah ke dokter dalam 24 jam";
                    p41.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " +  " Sembelit bisa merupakan efek samping obat tertentu termasuk obat batuk yang dijual bebas. Hentikan semua pemakaian obat bebas, namun jangan hentikan pemakaian obat resep apapun. Bila masalahnya menetap, konsultasikan ke dokter.";
                    p41.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " +  " Suatu perubahan pola makan bisa menyebabkan kekacauan ringan dalam kebiasaan buang air besar. Sembelit bisa dialami anak yang baru masuk sekolah bila ia enggan memakai kamar kecil sekolah atau enggan minta ijin untuk ke kamar kecil. Tidak diperlukan perawatan khusus bila si anak tampak sehat. Pastikan bahwa makanannya cukup sehat. Kebiasaan buang air besar akan kembali normal dalam beberapa minggu.";
                    p41.setText(Html.fromHtml(sourceString));
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
                    p41.setText("apakah hawanya sangat panas, atau apakah si anaka sedang demam atau baru muntah??");
                    posisi="d2";
                }

                else if(posisi.equals("d2")) {
                    p41.setText("adakah salah satu gejala berikut?" +
                            "1. nyeri ketika buang air besar" +
                            "2. darah di tinja");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p41.setText("apakah si anak baru mulai belajar atau baru bisa buang air besar?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                    p41.setText("apakah si anak sedang minum suatu obat?");
                    posisi = "d5";
                }

                else if(posisi.equals("d5")) {
                    p41.setText("adakah perubahan baru dalam menu atau kebiasaan harian si anak?");
                    posisi = "d6";
                }

                else
                if(posisi.equals("d6")){
                    String sourceString = "<b>" + "PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI.";
                    p41.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}
            }
        });
    }


}
