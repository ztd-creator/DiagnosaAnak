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

public class p28 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p28);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p28 = findViewById(R.id.diagnosaMulai);
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

                p28.setText("apakah si anak baru terkena cedera kepala atau cedera di mata?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga!" + "</b> " +
                            "Kemungkinan penyebab. Suatu cedera kepala bisa mempengaruhi bagian otak yang mengontrol penglihatan. Cedera kepala yang mempengaruhi penglihatan, serta semua cedera mata harus segera diperiksa secara medis." +
                            "Tindakan. Di rumah sakit, cederanya akan diperiksa dan mungkin si anak perlu menjalani beberapa tes, misalanya sinar-X kepala dan scan MRI, untuk menentukan bentuk penanganan yang tepat.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga!" + "</b> " +
                             "Kemungkinan penyebab dan tindakan. Hilang penglihatan yang terjadi tiba-tiba selalu merupakan gejala serius, walaupun mungkin hanya berlangsung singkat atau menyerang hanya satu mata. Mata si anak perlu diteliti oleh seorang spesialis. Mungkin si anak juga perlu dirawat inap untuk menjalani beberapa tes.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Juling bisa menyebabkan penglihatan ganda. Hal ini karena gambar yang dikirim ke otak dari mata tidak sama. Bila juling tidak dibenahi, otak akan menekam gambar dari salah satu mata, dan penglihatan akan gagal tampil secara normalnya. Periksanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa mata si anak dan mungkin akan merujuknya ke dokter mata, yang akan menjelaskan beberapa pilihan umtuk menangani juling.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")){
                    p28.setText("apakah salah satu atau kedua matanya merah dan nyeri?");
                    posisi="dl1";}

                else if(posisi.equals("dl1")){
                    p28.setText("Adakah cairan lengket seperti nanah, dan apakah penglihatannya normal kembali setelah di bersihkan?");
                    posisi="dll1";}

                else
                if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Penglihatan kabur mungkin disebabkan oleh keluarnya cairan akibat konjungtivitis, yaitu suatu infeksi oleh bakteri. Penglihatan anak anda akan pulih kembali setelah matanya dibersihkan." +
                            "Tindakan. Dokter mungkin akan meresepkan salep atau tetesmata antibiotik, yang perlu diberikan selama beberapa hari.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d6")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Rabun jauh sulit melihat objek yang jauh) atau rabun dekat adalah sebuah kemungkinan. Periksakanlah ke dokter mata." +
                            "Tindakan. Dokter mata akan memeriksa mata dan penglihatan si anak. Si anak mungkin perlu memakai kacamata.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d7")){
                    p28.setText("sudah pernahkah hal ini terjadi, dan apakah berlanjut dengan sakit kepala parah?");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Migrain, sakit kepala parah kambuhan, bisa bermula sejak anak-anak. Hal ini lebih mungkin lagi bila salah satu atau dua orangtua si anak juga mengidapnya. Periksakanlah ke dokter." +
                            "Tindakan. Bila benar karena migrain, dokter akan meresepkan peredanyeri untuk digunakan ketika timbul serangan. Cobalah lakukan tindakan meredakan sakit kepala pada anak dan untuk mengurangi frekuensi serangan migrain.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab dan tindakan. Obat tertentu bisa menyebabkan penglihatan kabur sebagai efek samping. Tanyakanlah ke dokter boleh/tidaknya mengentikan pemberian obat resepnya.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebabyebab. Mungkin ini akibat iritis, radang di bagian berwarna mata." +
                            "Tindakan. Dokter akan merujuknya ke spesialis untuk memeriksa matanya dan mencari kelainan lain yang biasanya menyertai, misalnya arthritis. Bila didiagnosa iritis, si anak perlu segera diobati dengan tetes mata atau tablet kortikosteroid untuk mencegah kerusakan permanen pada penglihatannya.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}








            }

        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null || posisi.equals("rev")) {
                    p28.setText("apakah si anak tiba-tiba kehilangan seluruh atau sebagian penglihatannya?");
                    posisi = "d2"; }

                else if(posisi.equals("d2")){
                    p28.setText("apakah penglihatan si anak menjadi berganda?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p28.setText("apakah penglihatannya kabur di semua jarak pandang?");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p28.setText("apakah si anak sulit melihat benda dekat ataupun jauh?");
                    posisi="d6";}

                else if(posisi.equals("d6")){
                    p28.setText("apakah si anak melihat bersit cahaya atau berkunang-kunang?");
                    posisi="d7";}

                else if(posisi.equals("d7")){
                    p28.setText("PERIKSAKAN KE DOKTER DALAM 24 JAM BILA ANAK ANDA MENGALAMI GANGGUAN PENGLIHATAN DAN BELUM BISA TERDIAGNOSA DARI DIAGRAM INI.");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }

                else if(posisi.equals("dl3")){
                    p28.setText("PERIKSAKAN KE DOKTER DALAM 24 JAM BILA ANAK ANDA MENGALAMI GANGGUAN PENGLIHATAN DAN BELUM BISA TERDIAGNOSA DARI DIAGRAM INI.");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }

                else if(posisi.equals("dl1")){
                    p28.setText("Mungkinkah si anak tertelan obat untuk orang dewasa atau termakan tanaman atau jamur beracun?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p28.setText("apakah si anak sedang memakai suatu obat resep?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Suatu kelainan memfokus yang parah mungkin penyebab kaburnya penglihatan di semua jarak pandang. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa mata si anak dan mungkin menyarankan agar si anak diperiksa lengkap oleh dokter mata. Tergantung pada hasilnya, si anak mungkin perlu memakai kacamata dan/atau rujukan ke spesialis untuk penanganan lebih lanjut.";
                    p28.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

            }
        });
    }}