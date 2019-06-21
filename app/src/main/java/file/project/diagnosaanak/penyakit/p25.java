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

public class p25 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p25);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p25 = findViewById(R.id.diagnosaMulai);
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

                p25.setText("apakah usia si anak lebih dari 12 tahun?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "Lihat diagram Masalah Perilaku Remaja";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    p25.setText("Lihat diagram Kesulitan Di Sekolah");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }

                else if(posisi.equals("d3")){
                    p25.setText("apakah baru terjadi perubahan di rumah,misalnya lahirnya seorang adik?");
                    posisi="dl1";}

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kecemasan terhadap suatu peristiwa baru, misalnya kehadiran bayi baru atau perceraian orangtua, sering menimbulkan efek sementara pada perilaku anak." +
                            "Tindakan. Cobalah temukan dan atasi semua penyebab kekhawatiran si anak. Bila si anak sudah bersekolah, ada baiknya memberitahu gurunya bahwa ada masalah di rumah. Bila perilaku si anak tidak membaik setelah beberapa lama dan mendapatkan dukungan ekstra, konsultasikan ke dokter yang akan bisa memberikan beberapa saran, misalnya dengan merujuk ke klinik bimbingan anak, bila di perlukan";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Bila anak anda tampak termasuk dalam kategori ini dan jiga sulit bergaul dengan orang lain, mungkin ia menderita sejenis autisme. Kondisi ini lebih umum pada laki-laki dan biasanya mulai terlihat di usia 3 tahun. Periksakanlah ke dokter \n" +
                            "Tindakan. Dokter mungkin akan merujuk si anak untuk diperiksa seorang spesialis. Tingkat keparahan autisme sangat bervariasi. Walau pada beberapa anak bisa dibantu dengan terapi bahasa dan pengucapan, banyak anak lain yang perlu diikutkan di sebuah sekolah khusus";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Penyalahgunaan obat dan pelarut kimia sering menimbulkan masalah perilaku." +
                            "Tindakan. Ajaklah si anak bicara untuk mencari adanya penyebab tersembunyi. Berusahalah tidak marah atau agresif, namim siramilah dia dengan kasih sayang. Pemberian dukungan bisa memberinya kepercayaan diri untuk mengehentikan kebiasaannya. Bila anda menduga dia sudah kecanduan obat, mintalah saran dokter. Saran dan dukungan juga bisa diperoleh dari berbagai lembaga swadaya masyarakat.";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d5")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Depresi dan cemas bisa menyebabkan gejala seperti ini." +
                            "Tindakan. Ajaklah si anak bicara agar terungkap penyebab perilakunya itu. Berikan dukungan dan dorongan dan cobalah menghilangkan atau mengurangi semua hal yang bisa menimbulkan stresnya. Bila perilaku si anak belum membaik atau memburuk dalam 2 minggu, periksakanlah ke dokter.";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p25.setText("apakah usia si anak di bawah 4 tahun?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Adalah biasa bila seorang anak kecil menguji tatakrama dan membantah orangtuanya. Banyak anak yang memasuki fase berperilaku sulit seperti ini, yang sering disebut kerewelan usia 2 tahun." +
                            "Tindakan. Semua anak akan keluar dari fase perilaku seperti ini. Sementara itu ikuti saran tindakan menghadapi kerewelan ini. Bila, pada tingkat tertentu, anda tidak tahan menghadapinya, periksakanlah ke dokter atau mantri kesehatan setempat.";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Anak-anak memang suka melawan. Namun bila si anak terus bersikap antisosial, perusak, atau kejam, mungkin ia menderita kelainan perilaku. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan merujuk si anak ke seorang spesialis untuk diteliti. Bimbingan anak atau terapi keluarga mungkin akan diperlukan. Namun masalah perilaku yang sudah berlangsung lama mungkin sudah sulit diubah.";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Walau perilaku seperti ini wajar pada anak kecil, anak usia sekolah terutama anak laki-laki selalu aktif dan suka merusak mungkin menderita kelainan hiperaktif karena kekurangan perhatian. Periksakanlah ke dokter." +
                            "Tindakan. Dokter mungkin akan merujuk si ak ke spesialis untuk memastikan diagnosa ini. Anak dengan kondisi inu memerlukan tambahan dukungan dan bantuan di rumah maupun di sekolah, dan sebagain ada yang memerlukan pengobatan.";
                    p25.setText(Html.fromHtml(sourceString));
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
                    p25.setText("apakah perilakunya terutama berkaitan dengan tugas sekolah atau perilaku di sekolah?");
                    posisi="d2"; }

                else if(posisi.equals("d2")){
                    p25.setText("apakah masalahnya baru timbul belakangan ini?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p25.setText("adakah salah satu gejala berikut?" +
                            "1. menghindari tatapan mata\n" +
                            "2. mengulang-ulang suatu kelakuan" +
                            "3. berbahasa sangat buruk");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p25.setText("apakah si anak menjadi menarik diri dan tidak berminat pada kegiatan yang biasa disukainya?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p25.setText("apakah si anak tidak sopan, berisik, dan membangkang?");
                    posisi="d6";}

                else if(posisi.equals("d6")){
                    p25.setText("PERIKSAKAN KE DOKTER BILA MASALAH PERILAKU ANAK ANDA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI DAN KELAKUAN SI ANAK MEMBUAT ANDA CEMAS");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("dl1")){
                    p25.setText("mungkinkah si anak menyalahgunakan obat atau bahan pelarut?");
                    posisi="dll1";}

                else
                if(posisi.equals("dll1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Anak-anak seringkali memasuki fase menjengkelkan.  Hal seperti itu wajar dan biasanya tindak berlangsung lama." +
                            "Tindakan. Berilah si anak kasih sayang serta dukungan, dan tanyakanlah ke sekolah apakah si anak juga membuat masalah. Bila perilaku si anak tidak membaik dalam beberapa minggu, konsuktasikanlah ke dokter.";
                    p25.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl2")){
                    p25.setText("apakah si anak mencuri, berbohong, atau berlaku kejam atau agresif?");
                    posisi="dl3";}

                else if(posisi.equals("dl3")){
                    p25.setText("apakah si anak mudah bosan, tidak bisa berkonsentrasi, gelisah, impulsif, dan/atau suka merusak?");
                    posisi="dl4";}

                else if(posisi.equals("dl4")){
                    p25.setText("PERIKSAKAN KE DOKTER BILA MASALAH PERILAKU ANAK ANDA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI DAN KELAKUAN SI ANAK MEMBUAT ANDA CEMAS");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }






                }
        });
    }}