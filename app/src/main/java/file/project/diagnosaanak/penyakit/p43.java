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

public class p43 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p43);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p43 = findViewById(R.id.diagnosaMulai);
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

                p43.setText("apakah si anak merasa nyeri saat berkemih?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p43.setText("apakah penis atau vulva si anak tampak merah dan atau perih?");
                    posisi = "dl1";
                }

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak menderita infeksi saluran kemih." + "<b>" +
                            "Tindakan " + "</b>" + "Bila memungkinkan, wadahi contoh urin dalam sebuah wadah bersih, dan bawalah ke dokter untuk diperiksa. bila dokter menduga karena infeksi, contoh urin akan di analisis di laboratorium untuk memastikan diagnosa ini. sementara itu si anak akan diberi antibiotika. pada beberapa kasus diperlukan tes lajutan, misalnya scan ultrasonic untuk mencari adanya masalah yang berkaitan.";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dl1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Semua kondisi yang membuat kuliat di daerah kelamin meradang akan menimbulkan perih ketika berkemih. nyerinya timbul karena kulit yang meradang terkena urin. pada bayi dan anak-anak yang belum bisa ke kamar kecil sendiri, ruam popok adalah penyebab terbanyak radang dikulit. pada anak yang lebih besar, infeksi kulit karena jamur, atau pada anak perempuan infeksi vulva dengan sariawan mungkin penyebabnya." + "<b>" +
                            "Tindakan " + "</b>" + "Lakukan langkah-langkah meredahkan ruam popok bila si anak belum bisa ke kamar kecil sendiri. Bila buang air kecil masih juga sakit setelah kulitnya sembuh atau bila anak sudah bisa ke kamar kecil sendiri,periksalah ke dokter.";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d3")) {
                    p43.setText("Adakah salah satu gejala berikut?" +
                            "1. berat badan susut tanpa sebab jelas " +
                            "2. lebih mudah haus " +
                            "3. letih berlebihan");
                    posisi = "dl3";
                }

                else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Diabetes melitus adalah penyebab gejala seperti ini. kndisi ini disebabkan oleh kurangnya produksi hormon insulin yang dibutuhkan tubuh untuk memperoleh energi dari zat gula dan karbohidrat dalam makanan.  " + "<b>" +
                            "Tindakan " + "</b>" + "Dokter akan meminta hasil tes darah, untuk memeriksa tingkat gula darah. bila diagnosa ini benar mungkin dokter akan menyarankan pola makanan dan gaya hidup yang sesuai untuk si anak. mungkin si anak juga memerlukan suntika insuli";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }
                else if (posisi.equals("d4")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab " + "</b> " + "Mungkin si anak menderita phimosis, yaitu lubang kulup terlalu sempit";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d5")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Beberapa jenis makanan misalnya bit serta beberapa jenis obat bisa merubah warna urin. walau jarang terjadi bisa juga perubahan warna urin juga menandakan adanya penyakit ginjal atau hati., atau karena adanya darah dalam urin. bila sulit membedakan kemungkinan penyebabnya, konsultasikanlah ke dokter dengan membawa contoh urin si anak. dokter akan memeriksanya terhadap adanya zat-zat yang tidak normal, termasuk darah.";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d6")) {
                    p43.setText("Apakah si anak masih mengompol di saat bangun maupun saat tidur?");
                    posisi = "dl6";
                }

                else if (posisi.equals("dl6")) {
                    String sourceString = "<b>" + "//diagram--------------------------------------------------------";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);


                }

                else if (posisi.equals("dll6")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Perih setempat atau sembelit parah, mungkin sekali penyebabnya. kadang-kadang suatu infeksi kemih bisa menimbulkan nyeri saat berkemih, membuat anak enggan. seorang anak yang merasa hendak berkemih namun tidak bisa melakukannya, memerlukan bantuan medis segera." + "<b>" +
                            "Tindakan " + "</b>" + "setelah memeriksa dan menetapkan penyebabnya. dokter bisa menyarankan pereda nyeri dan menyrankan anda untuk mendorong si anak untuk berkemih di saat mandi air hangat. Bila hal ini tidak berhasil, mungkin si anak memerlukan pengobatan di rumah sakit";
                    p43.setText(Html.fromHtml(sourceString));
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
                    p43.setText("adakah salah satu gejala beriku,dengan atau tanpa demam?" +
                            "1. sering buang air kecil dan urin selalu sedikit" +
                            "2. mengompol saat tidur atau di saat bangun walau sudah bisa menahan" +
                            "3. urin berbau menyengat atau berwarna keruh");
                    posisi="d2";
                }

                else if(posisi.equals("dl1")) {
                    p43.setText("adakah salah satu gejala beriku,dengan atau tanpa demam?" +
                            "1. sering buang air kecil dan urin selalu sedikit" +
                            "2. mengompol saat tidur atau di saat bangun walau sudah bisa menahan" +
                            "3. urin berbau menyengat atau berwarna keruh");
                    posisi="d2";
                }

                else if(posisi.equals("d2")) {
                    p43.setText("Apakah si anak berkemih lebih banyak dari biasa?");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p43.setText("Apakah dia anak laki-laki, dan kulupnya melembung ketika berkemih?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                    p43.setText("Apakah urinnya tampak berubah warna?");
                    posisi = "d5";
                }

                else if(posisi.equals("d5")) {
                    p43.setText("Apakah si anak tidak bisa mengontrol kandung kemihnya?");
                    posisi = "d6";
                }

                else if(posisi.equals("d6")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl6")) {
                    p43.setText("Apakah si anak enggan atau tidak bisa berkemih?");
                    posisi = "dll6";
                }

                else if(posisi.equals("dll6")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter";
                    p43.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}
            }
        });
    }


}
