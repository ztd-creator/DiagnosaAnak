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

public class p21 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p21);
        posisi = null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation(this, R.anim.show);
        animHide = AnimationUtils.loadAnimation(this, R.anim.hide);

        final TextView p21 = findViewById(R.id.diagnosaMulai);
        ya = findViewById(R.id.btn_yaa);
        tdk = findViewById(R.id.btn_tidakk);
        mulai = findViewById(R.id.btn_mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mulai.startAnimation(animFadeOut);
                findViewById(R.id.cardviewDiagnosa).startAnimation(animShow);
                mulai.setVisibility(View.GONE);
                findViewById(R.id.cardviewDiagnosa).setVisibility(View.VISIBLE);

                p21.setText("apakah si anak mengalami demam?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p21.setText("adakah salah satu gejala berikut?" +
                            "1. sakit kepala parah" +
                            "2. leher terasa nyeri ketika menunduk" +
                            "3. tidak menyukai cahaya terang " +
                            "4. mengantuk atau bingung" +
                            "5. ruam datar merah yang tidak memudar bila di tekan");
                    posisi = "dl1";
                } else if (posisi.equals("dl1")) {
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga" +
                            "Kemungkinan penyebab. Meningitis, yaitu peradangan selaput pembungkus otak akibat infeksi, mungkin penyebab gejala ini." + "<b>" +
                            "tindakan " + "</b>" + "Bila diduga meningitis, si anak mungkin perlu segera dirawat inap. Ia akan mendapat penanganan segera setelah dengan antibiotik dan mungkin memerlukan perawatan intensif.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d2")) {
                    p21.setText("apakah si anak baru terbentur di kepala dalam 24 jam terakhir?");
                    posisi = "dl2";
                } else if (posisi.equals("dl2")) {
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga!" +
                            " Mungkin ia mengalami cedera otak karena benturan di kepala." + "<b>" +
                            "tindakan " + "</b>" + "Di rumah sakit, si anak akan dawasi cermat dan perlu menjalani beberapa tes, misalnya scan-CT untuk menetapkan penanganan yang tepat.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d3")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Bawa ke Dokter Dalam 24 Jam\n" +
                            "Kemungkinan penyebab. Sakit kepala dengan ciri seperti ini bisa menandakan ada suatu kelainan serius di otak.\n" +
                            "Tindakan. Dokter akan segera merujuk si anak ke rumahsakit untuk menjalani beberapa tes, misalnya MRI atau scan-CT untuk menetapkan penyebab dan penanganan yang tepat.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d4")) {
                    p21.setText("adakah sakit kepalnya sering timbul dengan atau didahului salah satu gejala berikut?" +
                            "1. mual atau muntah" +
                            "2. sakit perut" +
                            "3. penglihatan berkunang-kunang" +
                            "4. tampak pucat ");
                    posisi = "dl2";
                } else if (posisi.equals("dl2")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Sakit kepala parah dengan gejala seperti ini mungkin migrain, terutama bila anggota keluarga ada juga yang mengidap migrain. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa si anak untuk menutup kemungkinan penyebab lain. Gejalanya seringkali bisa diredakan sendiri dengan obat peredanyeri dan antiemetika (obat pereda mual), banyak minum dan istirahat di ruang gelap. Anda juga perlu mencari faktor pencetusnya, yang bisa berupa makanan atau aktifitas.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d5")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Suatu keluhan di mata kadang-kadang bisa menyebabkan sakit kepala setelah melakukan hal-hal seperti itu. Periksakanlah ke dokter mata." +
                            "Tindakan. Setelah melakukan beberapa tes penglihatan lengkap, bila ada masalah pada penglihatan, dokter mata akan meresepkan kacamata yang sesuai untuk si anak. Bila penglihatannya normal, dokter mata akan merujuk anda ke dokter umum untuk mencari penyebab sakit kepala tersebut.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d6")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Sinusitis (radang pada selaput penyekat rongga-rongga di tengkorak) mungkin penyebab sakit kepala seperti ini, terutama bila si anak baru terserang pilek atau hidung berlendir atau tersumbat. Anak-anak berusia dibawah 8 tahun jarang terserang karena sinusnya belum terbentuk." +
                            "Tindakan. Berikan parasetamol untuk mengatasi nyerinya. Menghirup uap juga bisa menolong. Bila si anak belum membaik dalam 2 hari, periksakanlah ke dokter dalam 24 jam; mungkin si anak memerlukan antibiotika";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d7")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kecemasan adalah penyebab terbanyak sakit kepala pada anak-anak." +
                            "Tindakan. Ajaklah si anak mengungkapkan masalah dan kecemasan yang dialaminya, dan carilah pola sakit kepalanya. Hubungi gurunya untuk mencari informasi lebih banyak. Periksakanlah ke dokter bila anda dan si anak tidak bisa mengatasi masalahnya atai bila sakit kepalanya sering timbul.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d8")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab dan tindakan. Obat resep tertentu bisa berefek samping menimbulkan sakit kepala. Konsultasikan ke dokternya. Sementara itu, jangan hentikan pemakaian obat resepnya.";
                    p21.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d8")) {
                    p21.setText("seringkah sakit kepalanya, berkurangkah frekuensinya, atau berubahkah sifat sakit kepalanya?");
                    posisi = "dl3";

                }
            }
        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null || posisi.equals("rev")) {
                    p21.setText("apakah si anak baru terbentur di kepala dalam 24 jam terakhir?");
                    posisi = "d2";
                }
                else if(posisi.equals("d2")){
                    p21.setText("apakah sakit kepalanya hanya saat bangun tidur atau membuatnya terbangun dari tidur?");
                    posisi="d3";}
                else if(posisi.equals("d3")){
                        p21.setText("adakah sakit kepalnya sering timbul dengan atau didahului salah satu gejala berikut?\n" +
                                "1. mual atau muntah" +
                                "2. sakit perut" +
                                "3. penglihatan berkunang-kunang" +
                                "4. tampak pucat ");
                posisi="d4";}

                        else if(posisi.equals("d4")){
                p21.setText("apakah sakit kepalanya timbul setelah membaca atau menggunakan komputer?");
                posisi="d5";
            }
                else if(posisi.equals("d5")){
                p21.setText("adakah sakit kepalanya sesuai dengan ciri berikut?" +
                        "1. terasa terutama di dahi dan wajah atau gigi" +
                        "2. semakin terasa ketika membungkuk");
                posisi="d6";
            }
                else if(posisi.equals("d6")){
                p21.setText("mungkinkah si anak sedang tegang atau ketakutan di rumah atau di sekolah?");
                posisi="d7";
            }
                else if(posisi.equals("d7")){
                p21.setText("apakah si anak sedang memakai obat resep?");
                posisi="d8";
            }
                else if(posisi.equals("dl2")){
                String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Sakit demam seringkali disertai dengan sakit kepala.";
                p21.setText(Html.fromHtml(sourceString));
                ya.startAnimation( animFadeOut );
                tdk.startAnimation( animFadeOut );
                ya.setVisibility(View.GONE);
                tdk.setVisibility(View.GONE);
            }
                else if(posisi.equals("dl3")) {
                p21.setText("Segera periksa ke dokter!");
                ya.startAnimation(animFadeOut);
                tdk.startAnimation(animFadeOut);
                ya.setVisibility(View.GONE);
                tdk.setVisibility(View.GONE);
            }
            }
        });
    }}

