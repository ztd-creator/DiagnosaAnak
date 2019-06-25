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

public class p48 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p48);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p48 = findViewById(R.id.diagnosaMulai);
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

                p48.setText("Apakah nyerinya setelah sebuah kecelakaan atau jatuh?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p48.setText("adakah sendi yang tidak bisa di gerakkan, atau adakah salah satu tanda bahaya?");
                    posisi = "dl1";
                }

                else if (posisi.equals("dl1")) {
                    String sourceString = "<b>" + "Bahaya! bawa ke rumah sakit sekarang juga" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak menderita cedera serius, misalnya patah tulang sendi atau tulang punggung" + "<b>" +
                            "Tindakan " + "</b>" + "Si anak diperiksa sinar X untuk mendeteksi setiap kerusakan. Bila diduga ada cedera tulang punggung, mungkin ia juga perlu menjalani CT-Scan. Penanganan akan tergantung pada lingkup dan tempat cederanya";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d2")) {
                    p48.setText("Apakah sendi itu merah, panas, atau bengkak,dan/atau apakah si anak juga demam?");
                    posisi = "dl2";
                }

                else if (posisi.equals("dl2")) {
                    String sourceString = "<b>" + "Bawa Kedokter Sekarang Juga" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Arthritis septik, yaitu radang sendri akibat infeksi,adalah sebuah kemungkinan." + "<b>" +
                            "Tindakan " + "</b>" + "Dokter bisa saja merujuk untuk diperiksa di rumah sakit. Mungkin diperlukan pemeriksaan dan analisis contoh cairan sendi untuk memastikan diagnosa. Bila diagnosanya arthritis septik, si anak akan diobati dengan antibiotika di rumah sakit";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dl2")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Nyeri di salah satu daerah ini bisa menandakan adanya masalah di sendi pinggul, yang sering membuat anak lemas." + "<b>";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d3")) {
                    p48.setText("Adakah ruam ungu di bokong dan bagian belakang kaki?");
                    posisi = "dl3";
                }

                else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "Bawa Kedokter Dalam 24 Jam" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak kena penyakit kulit Henoch-schonlein, yaitu beberapa pembuluh darah halus menjadi rapuh dan darah merembes. Sejumlah kecil darah bisa merembes ke sendi, kulit, usus dan ginjal menimbulkan nyeri. Namun kondisi ini tidak berbahaya."  +
                            "Tindakan " + "</b>" + " Dokter akan memeriksa dan meminta hasil tes darah dan urin untuk memastikan diagnose ini.bila gejalanya ringan, tidak diperlukan tindakan medis. Bila nyerinya parah, akan diresepkan obat kortikosteroid. Kondiri ini biasanya menghilang dalam kurang dari sebulan tanpa meninggalkan kerusakan permanen.";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dll3")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Dalam 24 Jam" + "</b> " +
                            "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Mungkin ia mengidap arthritis sistemik juvenil, yaitu sistem kekebalan tubuh menyerang sendi, dan pada beberapa kasus, juga menyerang organ dalam. Dokter akan merujuk untuk menjalani beberapa tes di rumah sakit. Bila diagnosa ini terpastikan,penanganan akan meliputi obat anti radang nonsteroid, dan pada beberapa kasus, ditambah dengan obat kortikosteroid" ;
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("dlll3")){
                    String sourceString = "<b>" + "Bawa Ke Dokter Dalam 24 Jam" + "</b> " +
                            "</b>" +   "Kemungkinan Penyebab dan TIndakan "+ "</b>" + "arthritis reaktif, yaitu radang sendi akibat suatu infeksi lain sebelumnya, adalah sebuah kemungkinan. dokter akan melakukan beberapa tes untuk memastikan bahwa infeksinya sudah benar-benar bersih dan akan meresepkan obat antiradang nonsteroid. arthritis reaktif biasanya membaik dalam beberapa minggu.";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")) {
                    p48.setText("Apakah ia terbangun di tengah malam karena sakit di punggung, atau punggung kaku pada saat terbangun?");
                    posisi = "d5";
                }


                else if (posisi.equals("d5")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Dalam 24 Jam" + "</b> " +
                            "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Mungkin terjadi sebuah masalah serius misalnya kelainan tulang atau arthritis di tulang punggung. Dokter akan meminta pemeriksan sinar-X punggung, serta tes darah untuk menetapkan diagnose dan menentukan penanganan yang tepat." ;
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d6")) {
                    String sourceString = "<b>" + "Bawa Kedokter Dalam 24 Jam" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Tulang punggung melengkung ke samping disebut scoliosis. Sebagian anak terlahir sudah seperti itu dan ditangani sejak tahun-tahun pertama. Namun ada juga yang timbul belakangan, dan yang terbanyak di usia remaja." +
                            "Tindakan " + "</b>" + "Dokter akan meneliti lengkungan tulang punggung itu dan merujuk ke spesialis. Pada beberapa kasus, tidak perlu penganan medis, namun bila melengkungnya parah, penanganan berbentuk latihan dan kadang ditambah penopang mungkin diperlukan untuk memperbaikinya dan mencegahnya berkembang lebih jauh.";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }


                else if (posisi.equals("d7")) {
                    String sourceString = "<b>" + "Bawa Kedokter Dalam 24 Jam" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Terkilir ringan ligamen atau otot punggung adalah penyebab paling mungkin nyeri yang di alami si anak." +
                            "Tindakan " + "</b>" + "Berikan obat pereda nyeri sesuai dosis yang dianjurkan. Mintalah si anak menghindari olahraga dulu sampai nyerinya hilang. Bawa ke dokter dalam 24 jam bila nyerinya parah atau belum membaik esok harinya.";
                    p48.setText(Html.fromHtml(sourceString));
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
                    p48.setText("apakah skitnya di satu sendi saja?");
                    posisi = "d2";
                }

                else if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Terkilir ringan di satu ligament atau otot adalah penyebab paling mungkin nyeri yang dialami si anak." + "<b>" +
                            "Tindakan "+ "</b>"+ "Ikuti saran penanganan terkilir pada anak-anak. Bawalah ke dokter dalam 24 jam bila nyerinya parah atau belum membaik esok harinya.";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")) {
                    p48.setText("Adakah beberapa sendi yang bengkak dan nyeri?");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p48.setText("Anda mencemaskan anak anda punya masalah di punggung?");
                    posisi = "d4";
                }

                else if(posisi.equals("dl2")) {
                    p48.setText("Adakah nyeri di pinggul paha, atau selangkang?");
                    posisi = "dll2";
                }

                else if (posisi.equals("dll2")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("d4")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


                else if(posisi.equals("dl3")) {
                    p48.setText("apakah si anak demam, merasa lesu,dan/atau ada bintik-bintik ruam?");
                    posisi = "dll3";
                }

                else if(posisi.equals("dll3")) {
                    p48.setText("Apakah si anak baru saja terserang suatu infeksi, misalnya tenggorokan serak atau infeksi dada?");
                    posisi = "dlll3";

                }
                else if (posisi.equals("dlll3")) {
                    String sourceString = "<b>" + "Bawa Kedokter Dalam 24 Jam" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Ada kemungkinan ini gejala arthritis juvenil kronis, yaitu sistem kekebalan tubuh menyerang sendi, dan pada beberapa kasus juga menyerang mata sendiri" + "<b>" +
                            "Tindakan " + "</b>" + "Si anak akan dirujuk ke rumah sakit untuk tes darah dan pemeriksaan lengkap mata.Mungkin akan diresepkan obat antiradang nonsteroid dan kortikosteroid";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d5")) {
                    p48.setText("Apakah tulang punggung si anak tampak melengkung ke samping?");
                    posisi = "d6";


                }

                else if(posisi.equals("d6")) {
                    p48.setText("Apakah nyeri punggungnya timbul setelah berolahraga berat?");
                    posisi = "d7";
                }
                else if(posisi.equals("d7")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter";
                    p48.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }

        });
    }


}
