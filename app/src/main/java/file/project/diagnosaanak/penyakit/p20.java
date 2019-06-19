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

public class p20 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p20;
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p20 = findViewById(R.id.diagnosaMulai);
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

                p20.setText("Apakah si anak kehilangan kesadaran?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    p20.setText("apakah ia melakukan salah satu hal berikut?" +
                            "1. lengan atau kaki menyentak-nyentak" +
                            "2. buang air kecil" +
                            "3. lidahnya tergigit");
                    posisi="dl1";
                }
                else if(posisi.equals("dl1")) {
                    p20.setText("apakah usianya di bawah 5 tahun dan apakah ia demam sebelum hilang kesadaran?");
                    posisi = "dll1";
                }
                else if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Bawa ke Dokter Sekarang Juga.\n" +
                            "Kemungkinan penyebab. Mungkin si anak baru terserang kejang panas. Kejang seringkali timbul akibat infeksi yang menaikkan temperatur. Walaupun membuat cemas, kejang-kejang seperti ini biasanya tidak membahayakan " +
                             + "<b>" +
                            "tindakan "+ "</b>"+ "\"Sambil menunggu bantuan medis,lakukan tindakan menurunkan demam si anak, dokter akan memeriksa untuk mencari penyebab demamnya. Pasa beberapa kasus, mungkin si anak perlu di rawat-inap di rumah sakit.";
                    p20.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("d2")) {
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Bawa ke Dokter Sekarang Juga.\n" +
                            "Kemungkinan penyebab. Mungkin si anak baru terserang kejang panas. Kejang seringkali timbul akibat infeksi yang menaikkan temperatur. Walaupun membuat cemas, kejang-kejang seperti ini biasanya tidak membahayakan." + "<b>" +
                            "tindakan " + "</b>" + "Sambil menunggu bantuan medis, lakukanlah tindakan menurunkan demamnya. Dokter akan memeriksa untuk mencari penyebab demamnya.  Pada beberapa kasus, mungkin si anak perlu dirawat inap di rumah sakit.";
                    p20.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else
                    if(posisi.equals("d3")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Mungkin si anak mengalami serangan nafas tertahan. Serangan seperti itu seringkali timbul daei kesakitan, marah, atau kesal pada anak usia di bawah 3 tahun. Cara terbaik mengatasi serangan ini adalah mengabaikannya sedapat mungkin. Namun bila anda mencemaskan perilaku si anak, konsultasikanlah ke dokter atau mantri kesehatan setempat.";
                        p20.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);
                 }else
                    if(posisi.equals("d4")){
                String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Pingsannya si anak mungkin karena berkurangnya sementara jumlah darah ke otak. Pingsan paling banyak terjadi di awal pubertas namun bisa terjadi di usia berapapun, dan jarang membahayakan. Bila si anak merasa lemas lagi, cobalah lakukan tindakan menghadapi lemas. Seorang anak yang sering pingsan perlu diperiksa dokter, yang akan memeriksa apakah dia mengidap anemia.";
                p20.setText(Html.fromHtml(sourceString));
                ya.startAnimation( animFadeOut );
                tdk.startAnimation( animFadeOut );
                ya.setVisibility(View.GONE);
                tdk.setVisibility(View.GONE);

                    }else
                    if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Gejala ini mungkin merupakan efek samping dari obat. Mintalah saran dokter sebelum jadwal pemakaian obat berikutnya, apakah hal itu penyebabnya dan apakah pemakaiannya perlu dihentikan.";
                    p20.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                    }else if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Mungkin si anak menyalahgunakan obat atau pelarut kimia. Gangguan pada sistem saraf juga mungkin, walau sangat jarang. Konsultasikan ke dokter." + "<b>" +
                            "tindakan "+ "</b>"+ "Dokter mungkin akan meminta tes MRI untuk memastikan tidak ada masalah di sistem saraf. bila karena penyalahgunaan obat atau pelarut kimia, dokter akan menyarankan konseling atau merujuk ke lembaga yang bisa membantu.";
                    p20.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                    }else if(posisi.equals("d8")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Lemas pada pengidap diabetes bisa menandakan rendahnya tingkat gula darah, terutama bila lemasnya timbul mendadak  pada kasus yang lebih jarang, hal itu juga bisa disebabkan oleh tingkat gula darah terlalu tinggi." + "<b>" +
                            "tindakan "+ "</b>"+ "Bila si anak sadar penuh, berikan makanan atau minuman yang manis. Hal itu akan menaikkan tingkat gula darahnya dan tidak berbahaya bila karena tingkat gula darah terlalu tinggi. Bila si anak tidak bisa bekerjasama atau tidak membaik dalam 10 menit, segera hubungi dokter";
                    p20.setText(Html.fromHtml(sourceString));
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
                    p20.setText("apakah si anak sedang minum obat diabetes?");
                    posisi="d2";
                }else if(posisi.equals("d2")) {
                    p20.setText("apakah usianya di bawah 5 tahun dan apakah ia demam sebelum hilang kesadaran?");
                    posisi = "d3";
                }else if(posisi.equals("d3")) {
                    p20.setText("adakah salah satu hal berikut?" +
                            "1. Hawa sekitar panas atau kekurangan oksigen" +
                            "2. terlalu lama berdiri" +
                            "3. belum makan dalam beberapa jam" +
                            "4. tegang atau cemas");
                    posisi = "d4";
                }else if(posisi.equals("d4")) {
                    p20.setText("Segera periksa ke dokter!");
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("d1")) {
                    p20.setText("adakah keadaan di mana si anak sesaat tampak seperti tidak menyadari sekitarnya?");
                    posisi = "d5";
                }else if(posisi.equals("d5")) {
                    p20.setText("apakah si anak mengalami hal-hal berikut?" +
                            "1. merasa sekitarnya seperti berputar" +
                            "2. hilang keseimbangan" +
                            "3. mual atau muntah");
                    posisi = "d6";
                }else if(posisi.equals("d6")) {
                    p20.setText("apakah si anak merasa limbung atau lunglai?");
                    posisi = "d7";
                }else if(posisi.equals("d7")) {
                    p20.setText("Segera periksa ke dokter!");
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("d7")) {
                    p20.setText("Apakah si anak sedang diobati untuk diabetes?");
                    posisi = "d8";
                }else
                if(posisi.equals("d8")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Lunglai bukannya tidak biasa pada anak-anak, terutama di lingkungan yang pengap, ketika lapar, atau ketakutan. Hal ini biasanya tidak perlu dicemaskan. Ikuti tindakan mengatasi lemas. Periksakan ke dokter bila ia sering mengalaminya agar bisa diperiksa kemungkinan si anak mengidap anemia.";
                    p20.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("d6")) {
                    p20.setText("apakah si anak sedang memakai obat resep?");
                    posisi = "dl2";
                }else if(posisi.equals("dl2")) {
                    p20.setText("adakah perubahan perilaku si anak belakangan ini?");
                    posisi = "dl3";
                }
                else if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Bawa ke Dokter Sekarang Juga.\n" +
                            "Kemungkinan penyebab. Si anak baru terserang ayan. Mungkin ia mengidap epilepsi." +
                            + "<b>" +
                            "tindakan "+ "</b>"+ "\"Tindakan. Bila si anak belum pernah terserang ayan, dokter akan memeriksanya dan meminta si anak menjalani pemeriksaan EEG untuk merekam aktifitas listrik otak. Diagnosa ini hany bisa dipastikan setelag si anak mengalami dua kali serangan atau lebih.  Bila mengidap epilepsi, si anak mungkin aka  diobati dengan antikonvulsan untuk mencegah serangan lebih lanjut.";
                    p20.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }





            }
        });
    }


}
