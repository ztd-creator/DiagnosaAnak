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

public class p44 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p44);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p44 = findViewById(R.id.diagnosaMulai);
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

                p44.setText("apakah usia si anak masih di bawah 2 tahun?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +  "pada usia ini sistem saraf seorang anak belum cukup matang untuk bisa mengontrol penuh kegiatan usus dan kandung kemih" + "<b>" +
                            "Tindakan "+ "</b>"+ "tak banyak yang bisa anada lakukakn bila si anak memang belum siap. tunggu sampai usianya cukup dan menunjukkan gejala bisa belajar cara mengontrol kerja usus dan kandung kemih. mungkin beberapa saran dibawah ini bisa membantu anda.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")) {
                    p44.setText("sudah pernahkah si anak bisa mengontrol desakan buang airnya?");
                    posisi = "dl2";
                }

                else if(posisi.equals("dl2")) {
                    p44.setText("Apakah si anak mencret sangat encer sehingga membasahi baju dalamnya?");
                    posisi = "dll2";
                }

                else if(posisi.equals("dll2")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +   "si anak mungkin terserang sembelit, berakibat tersumbatnya sebagian rektum. gejalanya itu terjadi karena ada cairan tinja yang merembes melalui sumbatan. periksakan ke dokter." +
                            "<b>" + "Tindakan "+ "</b>"+ "dokter mungkin akan meresepkan urus-urus untuk menyingkirkan sumbatan, serta mungkin menyarankan menambahkan buah dan sayuran dalam makanan si anak. bila menduga sembelitnya karena penyebab fisik atau perilaku yang tersembunyi, mungkin dokter akan merujuk ke spesialis.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dlll2")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +   "biasanya mengajari buang air tidak perlu selama itu. mungkin si anak membangkang terhadap usaha anda mengajarinya. walau jarang, kadang-kadang ada penyebab fisik yang membuat buruknya pengendalian ini. konsultasikan ke dokter anak." +
                            "<b>" + "Tindakan "+ "</b>"+ "bila anak tidak ada penyebab fisik, mungkin dokter akan menyarankan anda hentikan mengajari anak buang air. idealnya, tunggu sampai si anak mau bekerjasama sebelum memulainya lagi.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


                else if(posisi.equals("d3")) {
                    p44.setText("Apakah biasanya si anak sudah tidak mengompol dan kini mulai lagi?");
                    posisi = "dl3";
                }

                else if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "Bawa ke dokter dalam 24 jam" + "</b> " +
                            "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +   "Mungkin si anak mengalami infeksi saluran kemih. kemungkinan lain mungkin hal itu disebabkan sebuah masalah emosional." +
                            "<b>" + "Tindakan "+ "</b>"+ " dokter akan meminta contoh urin si anak untuk diperiksa. bila di duga ada infeksi, contoh urin akan di analisis  di laboratorium untuk memastikannya, dan sementara itu akan diberikan antibiotika. beberapa tes lanjutan misalnya scan-ultrasonografi mungkin diperlukan untuk mencari adanya masalah sertaan. bila tidak ditemukan bukti infeksi, dokter akan membicarakan kemungkinan masalah emosional bersama anda dan si anak.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dll3")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +   "Kontrol kemih sepenuhnya memang jarang sudah tercapai di usia 3 tahun. banyak anak yang masih memakai popok. tampaknya tak perlu dicemaskan." +
                            "<b>" + "Tindakan "+ "</b>"+ "Ikuti beberapa saran mengajari anak ke kamar kecil, dan usahakan agar si anak sering melihat orang ain menggunakan kamar kecil, terutama sesama anak kecil. kebanyakan anak lebih cepat belajar dengan meniru.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dlll3")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +   "Kurangnya kontrol kemih saat bangun jarang akibat alasan medis pada anak usia balita, namun pada usia lebih tua masalah emosional bisa menjadi penyebab." +
                            "<b>" + "Tindakan "+ "</b>"+ "dokter akan memeriksa dan meminta si anak menjalani beberapa tes, termasuk tes urin, untuk mencari penyebab tersembunyi. bila tidak ditemukan penyebab fisik, ikuti saran-saran pelatihan. anak di atas usia 5 tahun mungkin perlu ditunjuk ke spesialis.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dllll3")) {
                    p44.setText("Apakah usianya sudah di atas 5 tahun?");
                    posisi = "dlllll3";
                }

                else if(posisi.equals("dlllll3")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "<b>" +   "Sekitar 1 dari 6 anak masih mengompol pada usia 5 tahun. Dan 1 dari 20 anak masih mengompol pada usia 10 tahun. Kebiasaan mengompol jarang disebabkan oleh alasan fisik, juga pada anak yang lebih besar, dan paling banyak terjadi bila salah satu atau kedua orangtuanya dulu juga terlambat belajar menahan ompol." +
                            "<b>" + "Tindakan "+ "</b>"+ "Ikuti tips mengatasi mengompol. Bila hal itu tidak menolong, tanyakan ke dokter anak, yang akan bisa meresepkan serangkaian obat yang bisa digunakan untuk peristiwa seperti misalnya piknik sekolah yang menginap";
                    p44.setText(Html.fromHtml(sourceString));
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
                        p44.setText("apakah anda mencemaskan buruknya kontrol kemih anak anda?");
                        posisi = "d2";
                    }

                else if(posisi.equals("d2")) {
                    p44.setText("apakah anda cemas ketidakmampuan anak anda menahan kemih??");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl2")) {
                    p44.setText("apakah anda sudah mengajarinya selama lebih dari setahun?");
                    posisi = "dlll2";
                }

                else if(posisi.equals("dlll2")) {
                    p44.setText("apakah anda cemas ketidakmampuan anak anda menahan kemih??");
                    posisi = "d3";
                }

                else if(posisi.equals("dll2")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "hilangnya kontrol usus yang tadiya sudah dikuasai, biasanya karena masalah emosional, si anak mungkin cemas atau kecewa dan menuntut perhatian. hal ini mungkin karena adanya perubahan di rumah, misalnya kehadiran adik bayi baru atau orangtua berpisah." + "<b>" +
                            "Tindakan "+ "</b>"+ "pastikan bahwa si anak punya kebebasan untuk memakai kamar kecil atau pispotnya. ajaklah si anak mengungkapkan kekhawatirannya, dan berikan kasih sayang dan dukungan. bila masalahnya masih ada dalam beberapa minggu, periksakanlah ke dokter, yang mungkin akan merujuk ke seorang spesialis";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl3")) {
                    p44.setText("Apakah usia si anak di bawah 3 tahun?");
                    posisi = "dll3";
                }

                else if(posisi.equals("dll3")) {
                    p44.setText("Apakah si anak mengompol di saat tidak tidur?");
                    posisi = "dlll3";
                }

                else if(posisi.equals("dlll3")) {
                    p44.setText("Apakah si anak masih mengompol di saat tidur, walau tidak mengompol di siang hari?");
                    posisi = "dllll3";
                }

                else if(posisi.equals("dllll3")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dlllll3")){
                    String sourceString = "<b>" + "Kurangnya kontrol kemih pada anak usia balita adalah wajar dan jarang karena ada penyebab tersembunyi." + "<b>" +
                            "Tindakan "+ "</b>"+ "Bila anda masih memakaikan popok, lanjutkan hal itu sampai si anak semakin sering tidak mengompol di pagi hari. Ketika terjadi kecelakaan, cobalah tidak marah. Gantilah seprei sedamai mungkin dan tenangkan si anak. Selembar perlak atau seperai yang mudah dicuci dan dikeringkan akan memudahkan anda. Suatu saat si  anak akan bisa menahan ompolnya.";
                    p44.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }
        });
    }


}
