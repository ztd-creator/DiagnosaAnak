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

public class p34 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p34);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p34 = findViewById(R.id.diagnosaMulai);
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

                p34.setText("apakah masalah pernafasan si anak baru timbul beberapa menit yang lalu?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "BAHAYA! Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Mungyia tersedakbenda asing yang terhirup, misalnya sepotong makanan atau benda kecil, terutama bila terjadi saat ia sedang makan." +
                            "Tindakan. Sambil menunggu bantuan medis, ikuti tindakan pertolongan pertama untuk tersedak. Di rumahsakit, setelah si anak diperiksa, semua benda asing penyumbat bisa dikeluarkan.";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "BAHAYA! Bawa ke Dokter Dalam 24 Jam" + "</b> " + "Kemungkinan penyebab. Gangguan pernapasan bisa disebabkan oleh suatu kondisi serius yang memerlukan perhatian darurat medis." +
                            "Tindakan. Si anak perlu menjalani beberapa pemeriksaan, meliputi sinar-X dada dan pengukuran oksigen darah. Penyebab yang sebenarnya harus ditangani, dan si anak bisa diberi oksigen untuk membantu pernapasannya.";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "Bawa ke dokter sekarang juga" + "</b> " + "kemungkinan penyebab dan tindakan, Mungkin ini karena bronkhiolitis (infeksi virus di paru-paru). Si anak perlu menjalani beberapa tes di rumah sakit. Penanganan untuk kondisi ini meliputi pemberian oksigen dan obat bronkhodilator";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")){
                    p34.setText("apakah si anak berliur atau tidak bisa menelan?");
                    posisi="dl1";}

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "BAHAYA! Bawa ke Dokter Dalam 24 Jam" + "</b> " + "Kemungkinan penyebab. Epiglottitis, peradangan dan pembengkakan tingkap tulang rawan pencegah makanan masuk ke saluran napas utama, bisa menimbulkan sumbatan di saluran napas. Kondisi ini kini sudah jarang terjadi karena adanya imunisasi menangkal bakteri Haemophilus Influenzae tipe B (HiB) yang menyebabkannya.\n" +
                            "Tindakan. Si anak memerlukan perawatan darurat di rumah sakit untuk mendapat bantuan oksigen dan diberi obat antibiotika.";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")){
                    p34.setText("apakah nafasnya juga bersuling?");
                    posisi="dl2";}

                else if(posisi.equals("dl2")){
                    p34.setText("pernahkah si anak didiagnosa mengidap asma?");
                    posisi="dll1";}

                else
                if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "BAHAYA! Bawa ke Dokter Dalam 24 Jam" + "</b> " + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga!\n" +
                            "Kemungkinan penyebab. Serangan asma parah adalah sebuah kemungkinan.\n" +
                            "Tindakan. Sambil menunggu bantuan medis, berikan pada si anak beberapa semprotan penghirup qtau nebuliser pelega sesuai pedoman perawatan kulit baginya dan lakukan tindakan memudahkan bernapas pada serangan asma . Di rumah sakit, si anak anak menjalani beberapa pemeriksaan, termasuk pengukuran tingkat oksigen darah. Ia juga akan diberi oksigen dan obat bronkholidator maupun pil kortikosteroid untuk memudahkan pernafasannya";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Suatu infeksi dada seperti pneumonia (infeksi rongga udara di paru-paru) adalah kemungkinan penyebab gejala ini." +
                            "Tindakan. Bila membenarkan diagnosa ini, dokter akan meresepkan antibiotik dan melakukan pemeriksaan sinar-X dada. Lakukan tindakan untuk mengurangi temperatur si anak dan pastikan dia banyak minum cairan. Kadang-kadang, diperlukan rawat inap agar tingkat oksigen darah si anak bisa diukur dan diberikan fisioterapi.";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p34.setText("Apakah nafas si anak kini sedang bersuling?");
                    posisi="dl4";}

                else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Mungkin si anak mengidap asma. akan lebih memudahkan dokter mendiagnosa bila diperiksa ketika gejalanya sedang timbul." +
                            "Tindakan. Bila batuk atau sesekali bersulingnya masih timbul, dokter juga akan meresepkan penghirup kortikosteroid. Kadang-kadang, pada anak kecil pemberian obat bisa dilakukan melalui masker wajah.";
                    p34.setText(Html.fromHtml(sourceString));
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
                    p34.setText("adakah salah satu tanda bahaya ini :" +
                            "1. Bibir atau lidah membiru" +
                            "2. Mengantuk yang tidak wajar" +
                            "3. Tidak mampu bersuara atau berbicara");
                    posisi = "d2"; }

                else if(posisi.equals("d2")){
                    p34.setText("Apakah usia si anak kurang dari 1 tahun?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p34.setText("apakah nafas si anak serak dan keras, dan/atau batuk-batuk keras?");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p34.setText("apakah nafas si anak terengah-rengah tidak wajar?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p34.setText("adakah salah satu gejala berikut?" +
                            "1. nafas bersuling" +
                            "2. batuk-batuk di malam hari" +
                            "3. batuk-batuk setelah olahraga" +
                            "4. batuk-batuk saat berada di hawa dingin");
                    posisi="d6";}

                else if(posisi.equals("dl2")){
                    p34.setText("apakah temperatur si anak 38°C atau lebih?");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Napas terengah-engah bisa timbul akibat adanya kelainan serius di jantung atau paru-paru, atau pada beberapa kasus, bisa disebabkan oleh kecemasan." +
                            "Tindakan. Dokter akan memeriksa si anak dan mungkin akan meminta beberapa tes, misalnya sinar-X dada untuk menentukan penyebab napasnya tersengal dan cara penanganannya yang paling tepat.";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Gejala ini mungkin karena asma ringan. Periksakanlah ke dokter yang mungkin juga akan mengukur tingkat hembusan maksimum anak anda. Bila mencurigai asma, dokter juga akan menyarankan pengobatan dengan penghirup bronkodilator untuk meredakan gejala dan juga meresepkan kortikosteroida.";
                    p34.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p34.setText("PERIKSAKAN KE DOKTER BILA GANGGUAN PERNAPASAN ANAK ANDA BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dll1")){
                        String sourceString = "<b>" + "BAHAYA! Bawa ke Dokter Dalam 24 Jam" + "</b> " + "Kemungkinan penyebab. Mungkin ini serangan pertama asma pada si anak." +
                                "Tindakan. Sambil menunggu bantuan medis, lakukan sendiri tindakan memudahkan bernapas pada serabgan asma (atas). Begitu di rumah sakit, si anak akan segera diperiksa  Bila diagnosa asma terpastikan, dokter akan meresepkan bronkodilator atau penghirup kortikosteroid untuk memudahkan si anak bernapas.";
                        p34.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}



            }
        });
    }}