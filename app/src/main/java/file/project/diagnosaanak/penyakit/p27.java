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

public class p27 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p27);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p27 = findViewById(R.id.diagnosaMulai);
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

                p27.setText("apakah si anak baru terkena cedera yang menimbulkan kerusakan nyata di mata?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "BAHAYA!  BAWA KE RUMAH SAKIT SEKARANG JUGA!" + "</b> " +
                            "Kemungkinan penyebab dam tindakan. Semua cedera di mata harus segera mendapat pemeriksaan medis karena ada resiko kerusakan permanen. Sambil menunggu bantuan medis, lakukan pertolongan pertama. Begitu tiba di rumah sakit, cederanya akam segera diteliti. Pada beberapa kasus, diperlukan pembedahan.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Benda asing di mata, misalnya butiran tanah, bisa menyebabkan mata nyeri, merah, dan berair. Cegahlah si anak mengucek mata dan lakukan pertolongan pertama untuk cedera mata. Bila tindakan itu tidak mungkin, atau tidak berhasil, atau mayanua tetap perih sampai lebih dari 1 jam setelah benda asingnya dikeluarkan dari mata, carilah bantuan medis selekas mungkin.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d3")){
                    p27.setText("adakah cairan kental lengket seperti nanah dari mata?");
                    posisi="dl1";}

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Konjungtivitis karena bakteri sangat mungkin, yaitu radang selaput pembungkus putih mata serta bagian dalam kelopak mata yang disebabkan oleh infeksi bakteri." +
                            "Tindakan. Dokter akan meresepkan antibiotik berbentuk salep atau tetes mata. Dokter juga akan mengajarkan cara menghadapi konjungtivitis. Untuk mencegah penularannya, jauhkan si anak dari anak lain dan pisahkan handuk dan peralatan wajahnya dari milik anak lain, sampai gejalanya hilang.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Konjungtivitis nonbakteril adalah sangat mungkin, yaitu radang selaput pembungkus putih mata serta bagian dalam kelopak mata yang disebabkan oleh alergi, iritasi kimia, atau infeksi virus." +
                            "Tindakan. Radangnya akan sembuh sendiri tanpa perawatan. Namun bila anda tidak yakin disebabkan konjungtivitis atau bila gejalanya bertahan sampai lebih dari 48 jam, periksakanlah ke dokter.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Blepharitis, yaitu radang tepian kelopak mata, bisa menyebabkan kelopak mata gatal dan mengelupas. Kondisi ini sering berkaitan dengan ketombe. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan meresepkan salep untuk dioleskan ke kelopak mata. Merawat kulit kepala dengan shampo antiketombe juga akan bisa memperbaiki gejala di kelopak matanya.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d5")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Stye, yaitu sejenis infeksi mirip bisul di akar bulu mata, adalah sebuah kemungkinan." +
                            "Tindakan. Sebuah stye biasanya akan hilang sendiri dalam seminggu tanpa perawatan khusus. Bintilnya akan pecah dan mengeluarkan nanah, atau menghilang secara berangsur. Bila keluar nanah, gunakan kapas bersih dibasahi air hangat untuk menghapusnya, dengan gerakan ke arah sisi terluar mata. Untuk mencegah penularan, cegahlah si anak menyentuh tangannya ke bagian mata yang sakit. Periksakanlah ke dokter bila gejalanya belum hilang dalam seminggu atau bila sering timbul.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p27.setText("apakah usianya di bawah 1 tahun?");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Saluran airmata tersumbat mungkin penyebab gejala ini. Kondisi ini umum pada bayi dan biasanya akan membaik sendiri tanpa dirawat, pada ujung tahun pertama usia anak." +
                            "Tindakan. Anda bisa membantu membuka sumbatan dengan pijatan lembut. Pada kasus yang jarang, saluran air mata tidak membuka dan memerlukan operasi.";
                    p27.setText(Html.fromHtml(sourceString));
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
                    p27.setText("adakah benda asing misalnya butiran tanah atau pasir?");
                    posisi = "d2"; }

                else if(posisi.equals("d2")){
                    p27.setText("adakah gurat darah di bagian putih matanya?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p27.setText("apakah kelopak matanya merah dan gatal?");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p27.setText("adakah bintil merah meradamg di salah satu kelopak mata?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p27.setText("apakah salah satu atau kedua mata selalu berair?");
                    posisi="d6";}

                else if(posisi.equals("d6")){
                    p27.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }

                else if(posisi.equals("dl3")){
                    p27.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }

                else if(posisi.equals("dl1")){
                    p27.setText("apakah penglihatan di bagian yang terkena sebaik biasanya?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Iritis, radang di bagian berwarna mata, adalah sebuah kemungkinan." +
                            "Tindakan. Dokter akan merujuk ke spesialis untuk menjalani pemeriksaan lengkap serta beberapa tes untuk memeriksa gejala lain yang biasanya menyertai iritis, misalnya arthritis. Iritis menuntut penanganan segera dengan obat tablet atau tetes mata kortikosteroid untuk mencegah kerusakan permanen di mata.";
                    p27.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}







            }
        });
    }}