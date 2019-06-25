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

public class p42 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p42);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p42 = findViewById(R.id.diagnosaMulai);
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

                p42.setText("Apakah tinja si anak mirip jeli merah, dan apakah ia tapak lesu?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    String sourceString = "<b>" + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga!" + "</b> " + "Kemungkinan penyebab. Intussusepsi, suatu kelainan yang jarang yaitu usus halus terlipat masuk ke dirinya sendiri, adalah sebuah kemungkinan. Hal ini lebih mungkin lagi bila usia si anak di bawah dua tahun dan ia terus menerus menangis." + "<b>" +
                            "Tindakan " + "</b>" + "Tindakan. Sambil menunggu bantuan medis, jangan berikan makanan atau minuman apapun. Di rumah sakit si anak perlu menjalani beberapa tes serta menjalani enema yang bisa memperbaiki dirinya. Bila tidak, akan diperluka";
                    p42.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                 else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Tinja hijau adalah wajar pada bayi ASI dan tidak perlu dicemaskan. Namun pada bayi susu botol, tinja hijau bisa menandakan adanya gastroenteritis, terutama bila encer periksakanlah ke dokter. ";
                    p42.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }


                else if(posisi.equals("d3")) {
                    p42.setText("Adakah bersit kecil darah di tinja si anak?");
                    posisi = "dl3";
                }

                else if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Bersifat kecil darah di tinja mungkin karena ada rekahan di anus, Periksalah ke dokter" + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter mungkin akan menyarankan anda membeli banyak minum dan makanan berserat";
                    p42.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                    else if(posisi.equals("d4")){
                        String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + " Obat tertentu bisa menyebabkan perubahan pada bentuk tinja." + "<b>" +
                                "Tindakan "+ "</b>"+ "Hentikan pemakaian obat bebas dan periksakan ke dokter. Sementara itu jangan hentikan pemakaian semua obat resep.";
                        p42.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")) {
                    p42.setText("Apakah si anak baru saja lepas dari diare atau muntah-muntah?");
                    posisi = "dl5";
                }
                else if(posisi.equals("dl5")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Setelah perioda serangan diare dan muntah,tinja bisa tampak pucat selamat beberapa hari." + "<b>" +
                            "Tindakan "+ "</b>"+ "Bila si anak tampak sehat, tak ada yang perlu dicemaskan.Periksakan si anak ke dokter bila tinjanya belum normal setelah seminggu,atau segera bila si anak tampak tidak sehat";
                    p42.setText(Html.fromHtml(sourceString));
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
                    p42.setText("apakah usia si anak di bawah 1 tahun, dan apakah tinjanya tampak hijau?");
                    posisi="d2";
                }

                else if(posisi.equals("d2")) {
                    p42.setText("adakah darah di tinjanya?");
                    posisi = "d3";
                }

                else if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Darah di tinja bisa menandakan adanya infeksi serius di saluranb perncernaan atau radang di dinding usus.Kedua kelainan tersebut memerlukan penanganan segera" + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter Akan memeriksa si anak dan meminta contoh tinja untuk diperiksa.Bila penyebabnya adalah infeksi,pengobatan akan mencakup antibiotika";
                    p42.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d3")) {
                    p42.setText("apakah si anak sedang minum suatu obat?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                    p42.setText("apakah tinjanya tampak sangat pucat?");
                    posisi = "d5";
                }

                else if(posisi.equals("dl5")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + " Pucatnya tinja mungkin karena kegagalan menyerap lemak,akibat suatu kelainan tersembunyi" + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter akan memeriksa si anak. Mungkin diperlukan contoh tinjanya untuk memastikan diagnosa ini. Beberapa tes lain akan diperlukan untuk menentukan penyebab dan cara penanganan yang tepat";
                    p42.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


                else
                if(posisi.equals("d6")){
                    String sourceString = "<b>" + "PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI.";
                    p42.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}





            }
        });
    }


}
