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

public class p54 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p54);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p54 = findViewById(R.id.diagnosaMulai);
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

                p54.setText("Apakah usia anak anda di bawah 8 tahun dan adakah salah satu gejala pubertas berikut?" +
                        "1. bulu kemaluan" +
                        "2. dada membesar" +
                        "3. haid");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
<<<<<<< HEAD
                        String sourceString = "<b>" + "Pubertas anak anda sudah dimulai terlalu dini. Seringkali tidak diketahui apa penyebab pubertas terlalu dini, namun pada beberapa kasus hal itu diduga karena ada masalah dipusat kendali pembuatan hormone di otak. Periksakanlah ke dokter." + "<b>" +
=======
                        String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +  "Pubertas anak anda sudah dimulai terlalu dini. Seringkali tidak diketahui apa penyebab pubertas terlalu dini, namun pada beberapa kasus hal itu diduga karena ada masalah dipusat kendali pembuatan hormone di otak. Periksakanlah ke dokter." + "<b>" +
>>>>>>> origin/master
                                "Tindakan "+ "</b>"+ "Dokter akan memeriksa hasil tes darah dan merujuk si anak ke seorang spesialis. Bila sudah memasuki pubertas , si anak mungkin akan diberi resep obat untuk memperlambat prosesnya. Obat itu akan menjaga agar penurunan laju pertumbuh";
                        p54.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}


                else if(posisi.equals("d3")){
<<<<<<< HEAD
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB Adalah biasa bila seorang gadis mengalami kekacauan jadwal haid di tahun-tahun pertama. Bisa sampai 40 siklus sebelum tubuh memapankan polanya. Namun kemungkinan hamil juga perlu dipertimbangkan.";
=======
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" + "Adalah biasa bila seorang gadis mengalami kekacauan jadwal haid di tahun-tahun pertama. Bisa sampai 40 siklus sebelum tubuh memapankan polanya. Namun kemungkinan hamil juga perlu dipertimbangkan.";
>>>>>>> origin/master
                    p54.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")) {
                    p54.setText("Adakah salah satu pubertas berikut?" +
                            "1. bulu kemaluan" +
                            "2. bulu ketiak" +
                            "3. pembesaran dada");
                    posisi = "dl2";
                }

                else
                if(posisi.equals("dl2")){
                String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Meskipun belum haid, si anak sudah menunjukkan mulainya tanda-tanda pubertas. Walaupun lebih lambat dari normal, hal ini tidak perlu dicemaskan. Ia akan terus tumbuh normal, dan pubertas akan selesai dalam 5 tahun. Tidak perlu memeriksakannya ke dokter, kecuali bila anda atau anak anda cemas ";
                p54.setText(Html.fromHtml(sourceString));
                ya.startAnimation( animFadeOut );
                tdk.startAnimation( animFadeOut );
                ya.setVisibility(View.GONE);
                tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dll2")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Penanganan yang pernah dijalaninya mungkin telah mempengaruhi pemroduksi hormone. Konsultasikanlah ke dokter, yang akan memeriksa si anak dan meminta hasil tes darah untuk mengukur tingkat hormonnya. Bila perlu, dolter bisa merujuk si anak ke seorang spesialis.";
                    p54.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dlll2")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Terlalu kurus atau berolahraga terlalu berat bisa mempengaruhi produksi hormone di bagian otak yang mengontrol timbulnya pubertas dan siklus haid. Konsultasikan ke dokter akan kemungkinan penyebab tersembunyi seperti kelainan kebiasaan makan bisa dihindari.";
                    p54.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dllll2")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Beberapa penyakit berat menahun bisa menunda sementara mulainya pubertas. Bicarakanlah hal itu dengan dokter yang biasa merawat si anak.";
                    p54.setText(Html.fromHtml(sourceString));
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
                    p54.setText("Apakah usia si anak di atas 14 tahun dan ia belum mulai haid?");
                    posisi="d2";
                }

                else if(posisi.equals("d2")) {
                    p54.setText("Pernahkah si anak mendapat haid namun kini berhenti lagi?");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter.";
                    p54.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl2")) {
                    p54.setText("Pernahkah si anak mendapat perawatan khemoterapi atau radioterapi?");
                    posisi = "dll2";
                }

                else if(posisi.equals("dll2")) {
                    p54.setText("Apakah di sangat kurus atau apakah ia berolahraga berat?");
                    posisi = "dlll2";
                }

                else if(posisi.equals("dlll2")) {
                    p54.setText("Apakah si anak sedang mengalami sakit menahun, misalnya sistik fibrosis atau arthritis?");
                    posisi = "dllll2";
                }
                    else
                    if(posisi.equals("dllll2")){
                        String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + " Anak anda mengalami pubertas terlambat. Walau seringkali tidak jelas penyebab pubertas terlambat, namun hal itu cenderung diturunkan dalam keluargan dan lebih umum terjadi pada anak yang bertubuh pendek. Konsultasikan ke dokter, yang setelah memeriksanya mungkin akan minta si anak menjalani tes darah untuk mengukur tingkat hormonnya. Bila perlu, dokter juga akan merujuk anak anda ke seorang spesialis.";
                        p54.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}


            }
        });
    }


}
