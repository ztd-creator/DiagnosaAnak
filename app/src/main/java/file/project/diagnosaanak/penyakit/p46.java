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

public class p46 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p46);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p46 = findViewById(R.id.diagnosaMulai);
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

                p46.setText("Adakah ketidaknyamanan atau gatal di kemaluan anak anda?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p46.setText("adakah keluar cairan putih kental berbintik dari vagina?");
                    posisi = "dl1";
                }

                else if (posisi.equals("dl1")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Dalam 24 Jam" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin ia mengidap sariawan vagina, yaitu suatu infeksi jamur. Hal ini semakin mungkin bila si anak baru diobati dengan antibioka untuk merawat keluhan lain." + "<b>" +
                            "Tindakan " + "</b>" + "Dokter mungkin akan mengambil contoh cairan untuk memastikan diagnose ini dan meresepkan krim atau tablet antijamur. Untuk mencegah hal itu terulang, lakukan langkah pencegahan masalah kelamin pada anak perempuan.";
                    p46.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Peningkatan aktifitas hormon ketika seorang gadis mendekati pubertas sering menimbulkan cairan seperti ini. Selama tidak ada iritasi, ini hal wajar dan tidak perlu dicemaskan. Tenangkan si anak dan pastikan bahwa dia memahami perubahan yang sedang terjadi dalam dirinya.";
                    p46.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("dll1")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Dalam 24 Jam" + "</b> " +
                            "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Mungkin ini adalah suatu infeksi bakteri di vagina. Kadang-kadang hal ini terjadi tanpa sebab, namun pada gadis yang lebih besar hal ini bisa disebabkan oleh tampon yang tertinggal. Dokter akan mengambil contoh cairan untuk memastikan diagnose ini dan mungkin akan meresepkan antibiotika. Bila menduga ada benda asing di dalam vagina, dokter akan merujuk ke spesialis untuk pemeriksaan lebih cermat.";
                    p46.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dlll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak mengidap cacinng gelang. Cacing putih halus sepanjang sekitar 1 cm ini menginfeksi usus dan meletakkan telur di sekitar anus di malam hari. Menimbulkan iritasi di anus dan daerah kemaluan. Walau tidak berbahaya, cacing ini bisa menulari orang lain atau tercampur dalam makanan. Periksakan ke dokter." + "<b>" +
                            "Tindakan " + "</b>" + "Setelah memeriksa dan bila menduga ini akibat cacing gelang, dokter akan meresepkan obat pemusnah cacing ini. Semua anggota keluarga juga perlu diobati untuk mencegah pengulangan infeksi. Pastikan si anak lebih cermat membasuh tangan setiap selesai dari kamar kecil dan sebelum makan.";
                    p46.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dllll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Si anak mungkin sensitif terhadap produk mandi atau sabun yang dipakainya. Ajarkan dia untuk membasuh kemaluan hanya dengan air saja. Setelah gejalanya hilang, dia bisa memakai sabun lagi, mulai dengan yang rinngan dan tanpa pewangi. Namun bila iritasinya menetap, periksakan ke dokter.";
                    p46.setText(Html.fromHtml(sourceString));
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
                    p46.setText("Apakah usia si anak lebih dari 9 tahun, dan adakah keluar cairan encer putih atau kuning dari vaginanya?");
                    posisi = "d2";
                }

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p46.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl1")) {
                    p46.setText("Adakah keluar cairan kuning kelabu atau kehijauan dari vagina?");
                    posisi = "dll1";
                }

                else if(posisi.equals("dll1")) {
                    p46.setText("Apakah si anak tampak sangat gatal di sekitar kemaluan dan anus, yang semakin parah di malam hari?");
                    posisi = "dlll1";
                }

                else if(posisi.equals("dlll1")) {
                    p46.setText("Apakah Si Anak sering mandi busa atau membasuh kemaluan dengan sabun?");
                    posisi = "dllll1";
                }

                else if (posisi.equals("dlllll")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p46.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

         }
        });
    }


}
