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

public class p26 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p26);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p26 = findViewById(R.id.diagnosaMulai);
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

                p26.setText("Apakah masalah si anak di sekolah terutama hanya mencakup pelajaran?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p26.setText("apakah si anak memang selalu lebih lambat daripada anak lain seusianya?");
                    posisi = "dl1"; }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Beberapa kesulitan belajar mungkin hanya karena terlambatnya perkembangan anak, sehingga seorang anak baru bisa mengimbangi teman-temannya beberapa tahun kemudian. Anak-anak yang punya masalah emosional akan lebih lambat belajar, seperti jug anak yang mempunyai masalah fisik, misalnya pendengaran kurang." +
                            "Tindakan. Bicarakan perkembangan anak anda dengan para gurunya, yang akna bisa membuat anda tenang. Bila si anak tampak tidak bisa mengikuti pelajaran, konsultasikanlah ke dokter, yang bisa meneliti perkembangan atau psikologis. Kebanyakan anak yang lambat belajar bisa terbantu dengan pelajaran tambahan. Terapi bicara dan keterampilan juga bisa membantu. Kadang-kadang mungkin seorang anak perlu dimasukkan ke sebuah sekolah khusus";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    p26.setText("adakah sebuah perubahan di rumah, misalnya kelahiran adik bayi baru?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kekecewaan atas sebuah perubahan di lingkungan si anak, misalnya kelahiran adik baru atau perceraian orangtua, sering menimbulkan efek sementara pada prestasi sekolah anak." +
                            "Tindakan. Cobalah temukan dan atasi semua penyebab tersembunyi yang dialami si anak. Ada baiknya bila para gurunya diberitahu bila ada masalah di rumah. Bila prestasi si anak tidak membaik setelah beberapa lama serta memperoleh dukungan tambahan, periksakanlah ke dokter, yang akan menyarankan bantuan lebih lanjut bila perlu, misalnya merujuknya ke klinik bimbingan anak";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " +  "Seorang anak yang perkembangan umumnya normal untuk usianya namun punya masalah di satu bidang, disebut memiliki kesulitan belajar spesifik. Misalnya kesulitan membaca dan menulis dikenal sebagai disleksia. Bicarakan dulu masah ini dengan para gurunya, lalu periksakanlah ke dokter." +
                            "Tindakan. Dokter mungkin akan memeriksa anak anda untuk memastikan bahwa suatu masalah fisik (misalnya buruknya penglihatan atau penyakit yang tidak diketahui) tidak ikut menambah kesulitan si anak. Dokter anda mungkin bisa berhubungan dengan jasa kesehatan sekolah. Bekerjasamalah dengan sekolah untuk bisa mendorong anak anda sejauh mungkin. Pada beberapa kasus, mungkin diperlukan dukungan ekstra dari sekolah.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Membolos dan beberapa perilaku antisosial lain, misalnya mencuri, lebih banyak terjadi pada remaja. Pada beberapa kasus, hal ini akibat dari pelecehan atau akibat pengaruh teman. Bicarakan hal ini dengan para guru." +
                            "Tindakan. Bila masalahnya masih menetap walau sudah dilakukan tindakan di sekolah, mungkin anda perlu membawa anak anda ke klinik bimbingan anak. Masalah perilaku yang sudah berlangsung lama mungkin sulit diubah.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")){
                    p26.setText("adakah salah satu hal berikut:" +
                            "1. si anak sering pulang dengan memar atau luka tanpa jelas penyebabnya" +
                            "2. uang dan barang-barangnya sering hilang di sekolah" +
                            "3. ia pulang dengan barang miliknya pecah atau rusak");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Masalah seperti ini, mungkin akibat semena-menam, walau awalnya si anak mungkin enggan mengakuinya. " +
                            "Tindakan. Ajaklah si anak membahas keadaannya, dan bicarakan hal itu dengan para gurunya. Pelecehan maupun kekerasan lain di sekolah harus dicermati serius. Setiap sekolah harus menerapkan kebijakan mengatasi pelecehan, dan anda bisa membantu menumbuhkan kepercayaan diri anak anda.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Mogok sekolah bisa menandakan adanya masalah serius. Mungkin hal itu akibat tindak pelecehan atau sekolah tidak bisa memenuhi kebutuhan si anak. Kadang-kadang mogok sekolah disebabkan oleh kecemasan di rumah, atau pada anak kecil, karena takut berpisah dengan orangtuanya." +
                            "Tindakan. Carilah penyebab tersembunyi yamg membuat si anak mogok sekolah agar bisa di atasi, dan lakukan semua usaha untuk memastikan anak anda bersekolah. Sementara itu, bicarakanlah masalah itu dengan para gurunya. Bila situasinya tidak juga membaik, periksakanlah ke dokter. Dokter mungkin akan menyarankan bantuan klinik bimbingan anak.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p26.setText("apakah si anak mudah bosan, tidak bisa berkonsentrasi,selalu begerak,impulsif,dan/atau merusak?");
                    posisi="dl5";}

                else
                if(posisi.equals("dl5")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Walau perilaku seperti ini normal pada anak kecil, namun pada anak usia sekolah mungkin hal itu disebabkan oleh kelainan hiperaktif kekurangan perhatian. Periksakanlah ke dokter." +
                            "Tindakan. Dokter mungkin akan merujuk si anak ke spesialis untuk memastikan diagnosa ini. Anak-anak yang mengalami kelainan ini memerlukan perhatian ekstra di sekolah dan di rumah, dan ada yang memerlukan pengobatan.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl6")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Perilaku buruk yang hanya berlaku di sekolah bisa disebabkan oleh beberapa masalah. Pelajaran yang terlalu gampang bisa menimbulkan bosan, sedangkan bila terlalu sulit (mungkin karena kesulitan belajarnya), bisa menghilangkan minat belajar. Perilaku buruk mungkin juga disebabkan oleh penolakan terhadap otoritas. Pada beberapa kasus, perilaku yang buruk bisa disebabkan oleh tidak pelecahan." +
                            "Tindakan. Ajaklah si anak bicara agar terungkap penyebab masalahnya. Ada baiknya hal itu dibicarakan dengan para gurunya. Mungkin diperlukan beberapa penyesuaian tugas pelajaran agar bisa lebih mendekati kebutuhan si anak. Pada beberapa kasus, bantuan klinik bimbingan anak mungkin disarankan oleh dokter anak anda.";
                    p26.setText(Html.fromHtml(sourceString));
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
                    p26.setText("apakah anak anda suka membolos?");
                    posisi="d4"; }

                else if(posisi.equals("dl1")){
                    p26.setText("apakah kemampuan umum anak anda di sekolah menurun dalam beberapa minggu atau bulan terakhir?");
                    posisi="d2";}

                else if(posisi.equals("d2")){
                    p26.setText("apakah kesulitan si anak hanya di satu atau dua bidang tertentu, misalnya membaca, mengeja, atau matematika?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p26.setText("apakah anak anda suka membolos?");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p26.setText("apakah si anak menjadi enggan ke sekolah? ");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p26.setText("apakah para guru mengeluhkan perilaku anak anda di sekolah?");
                    posisi="d6";}

                else if(posisi.equals("d6")){
                    p26.setText("KESULITAN DI SEKOLAH YANG BELUM TERURAI DARI DIAGRAM INI HARUS DIBAHAS BERSAMA PARA GURU. PADA BEBERAPA KASUS, SARAN DOKTER JUGA BISA MEMBANTU.");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }


                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Penurunan tiba-tiba prestasi sekolah tanpa sebab jelas mungkin akibat masalah fisik, misalnya berkurangnya pendengaran atau penglihatan. Pengucilan sosial atau kecemasan, misalnya takut dipermainkan teman juga mungkin jadi penyebab. Bicarakanlah dengan para gurunya, lalu periksakanlah si anak ke dokter." +
                            "Tindakan. Dokter akan memeriksa dan menguji pendengaran dan penglihatannya. Mungkin diperlukan beberapa tes lanjutan. Bila tidak ditemukan kelainan fisik, dokter akan meminta anda menanyakan lebih lanjut ke guru sekolahnya sebelum menyiapkan bantuan spesialis.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl3")){
                    p26.setText("apakah anak anda menolak semua usaha untuk membawanya ke sekolah?");
                    posisi="dl4";}

                else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Tidak suka ke sekolah bisa disebabkan berbagai faktor.  Anak yang baru mau bersekolah mungkin akan cemas. Seorang anak bisa mengalami kesulitan dengan tugas sekolah atau takut pada guru atau murid tertentu. Bila tidak diatasi, tidak sika ke sekolah bisa berkembang menjadi mogok sekolah." +
                            "Tindakan. Carilah penyebab masalah dan bicarakan perasaan si anak dengan para guru agar bisa mengawasi semua bentuk pelecehan. Jangan biarkan anak anda diam di rumah. Tergantung pada penyebab masalahnya, mungkin si anak memerlukan pelajaran tambahan atau perlu diikutkan ke klinik bimbingan anak.";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl5")){
                    p26.setText("Apakah perilaku anak anda di rumah wajar saja?");
                    posisi="dl6";}

                else if(posisi.equals("dl3")){
                    p26.setText("apakah anak anda menolak semua usaha untuk membawanya ke sekolah?");
                    posisi="dl4";}

                else
                if(posisi.equals("dl6")){
                    String sourceString =  "lihat digram 25, MASALAH-MASALAH PERILAKU";
                    p26.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}













                }
        });
    }}