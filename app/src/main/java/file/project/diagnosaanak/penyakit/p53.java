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

public class p53 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p53);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p53 = findViewById(R.id.diagnosaMulai);
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

                p53.setText("Adakah salah satu gejala pubertas berikut:" +
                        "1. pembesaran penis dan testis" +
                        "2. tumbuhnya bulu kemaluan" +
                        "3. suara memberat" +
                        "4. sering ereksi");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p53.setText("Apakah usianya dibawah 9 tahun?");
                    posisi = "dl1";



        } else
            if(posisi.equals("dl1")){
                String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Pubertas bisa mulai terlalu dini pada anak-anak. Seringkali hal ini tanpa penyebab jelas, namun pada beberapa kasus ini bisa disebabkan oleh masalah  di pusat kendali produksi hormone di otak. Konsultasikan ke dokter." + "<b>" +
                        "Tindakan "+ "</b>"+ "Dokter akan memeriksa si anak dan mungkin meminta si anak menjalani tes darah untuk memeriksa tingkat hormonnya. Bila perlu dokter juga akan merujuk si anak ke seorang spesialis. Bila pubertas sudah dimulai, bisa diresepkan beberapa obat hormon untuk  ";
                p53.setText(Html.fromHtml(sourceString));
                ya.startAnimation( animFadeOut );
                tdk.startAnimation( animFadeOut );
                ya.setVisibility(View.GONE);
                tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dll1")){
            String sourceString = "<b >" + "KEMUNGKINAN PENYEBAB DAN TINDAKA" + "<b>" +  "Si anak sudah menunjukkan gejala awal pubertas. Walau lebih lambat dari normal, hal ini tidak perlu dicemaskan. Ia akan terus tumbuh, dan pubertas baru akan selesai dalam 5 tahun berikutnya. Selamat si anak tampak sehat dan terus tumbuh, agaknya tidak perlu memeriksakannya ke dokter.";
            p53.setText(Html.fromHtml(sourceString));
            ya.startAnimation( animFadeOut );
            tdk.startAnimation( animFadeOut );
            ya.setVisibility(View.GONE);
            tdk.setVisibility(View.GONE);}


   else if(posisi.equals("d2")) {
            p53.setText("Apakah si anak mengidap sakit menahun seperti sistik fibrosis atau arthritis?");
            posisi = "dl2";
        }

        else if(posisi.equals("dl2")){
            String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" + "Beberapa sakit menahun bisa menunda sementara mulainya pubertas. Tanyakan kecemasan anda ini pada dokter yang biasa menangani si anak.";
            p53.setText(Html.fromHtml(sourceString));
            ya.startAnimation( animFadeOut );
            tdk.startAnimation( animFadeOut );
            ya.setVisibility(View.GONE);
            tdk.setVisibility(View.GONE);}

        else if(posisi.equals("dll2")){
            String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Kerusakan di testis karena penyakit atau pengobatan di masa lalu bisa mengurangi produksi hormone pria yang diperlukan agar pubertas berlangsung. Periksakanlah ke dokter." + "<b>" +
                    "Tindakan "+ "</b>"+ "Dokter akan memeriksa si anak dan mungkin meminta hasil tes darah untuk mengukur tingkat hormone. Bila perlu, dokter akan merujuknya ke spesialis.";
            p53.setText(Html.fromHtml(sourceString));
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
                p53.setText("apakah usianya 15 tahun atau lebih?");
                posisi="d2";

            }
        else if(posisi.equals("d2")){
        String sourceString = "<b>" + "Periksalah Ke Dokter";
        p53.setText(Html.fromHtml(sourceString));
        ya.startAnimation( animFadeOut );
        tdk.startAnimation( animFadeOut );
        ya.setVisibility(View.GONE);
        tdk.setVisibility(View.GONE);}


        else if(posisi.equals("dl1")) {
        p53.setText("Apakah usianya 15 tahun atau lebih?");
        posisi = "dll1";
        }

        else if(posisi.equals("dll1")){
        String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" +  "Pada anak lelaki,  ini wajar karena gejala pertama pubertas akan terjadi di antara usia 9-15 tahun. Bila si anak mencemaskan tubuhnya lebih pendek daripada teman-temannya, yakinkan dia bahwa tubuhnya akan segera meninggi. Lonjakan laju pertumbuhan remajanya biasanya mulai di pertengahan sampai akhir pubertas.";
        p53.setText(Html.fromHtml(sourceString));
        ya.startAnimation( animFadeOut );
        tdk.startAnimation( animFadeOut );
        ya.setVisibility(View.GONE);
        tdk.setVisibility(View.GONE);}


        else if(posisi.equals("dl2")) {
        p53.setText("Pernahkah si anak menjalani khemoterapi atau radioterapi, atau pernahkah ia menjalani pembedahan di testis?");
        posisi = "dll2";
        }

        else if(posisi.equals("dll2")){
        String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Timbulnya pubertas anak anda tertunda. Walau biasanya tanpa sebab jelas, hal ini biasanya diturunkan dan lebih umum dialami anak yang bertubuh pendek. Kebanyakan pubertas dimulai di usia 16 tahun tanpa perawatan. Konsultasikan ke dokter." + "<b>" +
        "Tindakan "+ "</b>"+ "Dokter akan memeriksa si anak dan mungkin meminta hasil tes darah untuk mengukur tingkat hormon. Bila perlu, dokter akan merujuk si anak ke spesialis untuk menjalani penanganan hormone.";
        p53.setText(Html.fromHtml(sourceString));
        ya.startAnimation( animFadeOut );
        tdk.startAnimation( animFadeOut );
        ya.setVisibility(View.GONE);
        tdk.setVisibility(View.GONE);}

            }
        });
    }


}
