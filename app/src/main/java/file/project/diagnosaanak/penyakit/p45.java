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

public class p45 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p45);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p45 = findViewById(R.id.diagnosaMulai);
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

                p45.setText("Apakah sakit di penis itu hanya saat buang air kecil?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    String sourceString = "<b>" + "Masalah Masalah Kemih" ;
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "Bahaya ! Bawa Ke Rumah Sakit Sekarang Juga" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Testis terpuntir, yaitu salah satu atau kedua testis terpuntir di dalam skrotum sehingga menghambat pasokan darah, adalah sebuah kemungkinan. Kondisi ini bisa timbul setelah sebuah benturan namun sering terjadi begitu saja di saat sedang tidur." + "<b>" +
                            "Tindakan " + "</b>" + "Pembedahan segera, sangat diperlukan, untuk mengembalikan posisi testis dan memulihkan pasokan darah. Selama pembedahan, kedua testis akan diikatkan ke skrotum untuk mencegahnya.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d3")) {
                    p45.setText("Adakah salah satu hal berikut pada bengkaknya? 1. Lebih kecil atau hilang di pagi hari 2. Membesar ketika si anak menangis atau batuk");
                    posisi = "dl3";
                }

                else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "EMUNGKINAN PENYEBAB Si anak mungkin menderita hernia, yaitu sebagian kecil usus menerobos bagian yang lemah di dinding perut. Kondisi ini paling banyak terjadi pada bayi."  +
                            "Tindakan " + "</b>" + "Dokter akan memeriksa si anak. Bila diagnosa ini benar, hernianya harus diperbaiki untuk mencegah kemungkinan terjepitnya bagian usus tersebut. Operasinya dilakukan di bawah pembiusan umum.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d4")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Kulit skrotum bisa meradang akibat reaksi alergi terhadap deterjen pencuci popok, atau juga bisa karena infeksi jamur." + "<b>" +
                            "Tindakan " + "</b>" + "Setelah memeriksa, dokter akan memberikan krim korkosteroid bila penyebabnya adalah alergi, atau krim antijamur bila penyebabnya infeksi jamur. Bila disebabkan alergi, gantilah deterjen dengan yang non-biologis dan bilaslah popoknya baik-baik.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d5")) {
                    p45.setText("Apakah si anak kedinginan atau ketakutan?");
                    posisi = "dl5";
                }

                else if (posisi.equals("dl5")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> "  + "Otot-otot pemegang testis menarik testis masuk ke selangkangan untuk melindunginya dari dingin dan di saat sedang tertekan. Sesudah si anak bias bersantai dengan berendam air hangat, testisnya akan kembali teraba. Bila kedua testisnya tidak teraba, periksakanlah ke dokter.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d6")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> "  +  "Balanitis, yaitu kulup meradang karena infeksi atau iritasi bahan kimia, adalah kemungkinan penyebabnya."  +
                            "Tindakan " + "</b>" + " Pastikan bahwa penis dan kulup si anak sering dibilas air. Bila gejalanya tidak hilang dalam 48 jam, periksakan ke dokter. Dokter mungkin akan meresepkan krim antibiotika  atau antijamur. Selanjutnya, jangan gunakan sabun berpewangi dan gunakanlah deterjen biologis untuk mencuci pakaian. Bila kondisi ini sering terjadi, mungkin dokter akan menyarankan dikhitan.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d7")) {
                    String sourceString = "<b>" + "Bahaya ! Bawa Ke Rumah Sakit Sekarang Juga" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "<b>" + "Kulup yang tidak bias kembali akan bias merusakkan pasokan darah ke kepala penis bila tidak segera ditangani."  +
                            "Tindakan " + "</b>" + " Sambil menunggu bantuan medis, kompres dengan es untuk meredakan sakitnya. Di rumah sakit, dokter mungkin akan mencoba mengembalikan kulup, namun mungkin diperlukan sayatan kecil di bawah bius lokal. Khitan segera biasanya diperlukan untuk mencegah masalah itu timbul kembali.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d8")) {
                    p45.setText("Apakah usianya di atas 4 tahun dan/atau apakah kulupnya melembung ketika ia berkemih?");
                    posisi = "dl8";
                }

                else if (posisi.equals("dl8")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak mengalami phimosis, yaitu lubang kulup terlalu kecil. Hal itu akan menghambat aliran urin dan menimbulkan infeksi kambuhan kepala penis. Periksakan ke dokter." +
                            "<b>" + "Tindakan " + "</b>" + " Jangan terlalu kuat menarik kulup karena hal itu akan semakin mempersempit lubang kulup. Dokter akan memeriksa si anak untuk memastikan diagnosa ini dan memastikan tidak ada infeksi lain. Dokter mungkin juga akan menyarankan dikhitan.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }
            }


        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("d1")){
                    p45.setText("Apakah skrotum si anak terasa sakit?");
                    posisi = "d2";
                }

                else if(posisi.equals("d2")) {
                    p45.setText("Adakah bengkak di skrotum yang tidak nyeri?");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p45.setText("Apakah kulit skrotum tampak merah dan meradang?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                    p45.setText("Apakah salah satu atau kedua testis hilang dari skrotum si anak?");
                    posisi = "d5";
                }

                else if(posisi.equals("d5")) {
                    p45.setText("Apakah terdapat perih iritasi, atau kemerahan di ujung penis si anak?");
                    posisi = "d6";
                }

                else if(posisi.equals("d6")) {
                    p45.setText("Apakah kulupnya tertarik dan anda tidak bisa mengembalikannya?");
                    posisi = "d7";
                }

                else if(posisi.equals("d7")) {
                    p45.setText("Apakah anda menduga kulupnya terlalu ketat?");
                    posisi = "d8";
                }

                else if (posisi.equals("d8")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Dalam 24 Jam" + "</b> " +
                            "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + " Mungkin ia mengalami hidrosel, yaitu suatu kondisi tidak berbahaya berupa penumpukan cairan di sekitar testis. Hal ini bias pada bayi baru lahir dan biasanya menghilang setelah si anak berusia 6 bulan. Dokter mungkin akan meminta si anak di scan ultrasonic untuk mencari kemungkinan adanya kerusakan testis sebagai penyebab. Pada umumnya hidrosel pada anak anak akan hilang sendiri tanpa perawatan.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dl5")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin salah satu atau kedua testisnya gagal menyembul penuh ke skrotum. Periksakanlah ke dokter." + "<b>" +
                            "Tindakan " + "</b>" + "Dokter akan memeriksanya, dan bila testisnya belum juga keluar, mungkin dokter akan memeriksanya secara berkala. Pada kebanyakan kasus, testis akan keluar sendiri, biasanya setelah usia setahun. Namun bila belum keluar setelah usia 1-2 tahun, mungkin diperlukan operasi untuk menarik testis keluar ke skrotum demi menjaga kesuburan si anak kemudian hari.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dl8")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + " Kulit kulup biasanya tidak bisa ditarik pada anak usia di bawah setahun. Setelah si anak makin besar berangsur-angsur kulup menjadi terlepas dari kepala penis sehingga mudah ditarik. Menarik kulup terlalu kuat akan bisa menimbulkan kerusakan serius dan memperburuk keadaan. Periksakan ke dokter bila anda masih cemas atau bila kulup si anak masih belum bisa ditarik setelah usianya 4 tahun. Dokter mungkin akan menyarankan dikhitan.";
                    p45.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }
            }
        });
    }


}
