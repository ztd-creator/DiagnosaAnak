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

public class p35 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p35);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p35 = findViewById(R.id.diagnosaMulai);
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

                p35.setText("adakah lecet atau rekahan pada atau sekitar bibir si anak?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p35.setText("apakah lecetnya seperti lepuh kecil?");
                    posisi = "dl1"; }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Si anak mungkin mengalami 'cold-sore', yang disebabkan oleh infeksi virus herpes bisa 'tidur' selama beberapa bulan atau tahun, dan bisa aktif kembali bila terpicu oleh hawa dingin atau terpapar pada terik matahari." +
                            "Tindakan. 'Cold-sore' biasanya akan hilang sendiri. Namun, krim antivirus yang dijual bebas bisa mempercepat prosesnya dan bisa diberikan pada saat gejalanya baru muncul. Agar tidak menulari orang lain, ingatkan si anak agar tidak mencium anak lain pada saat lepuhnya masih ada.";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Impetigo, suatu infeksi bakteri di kulit yang biasa menyerang sekitar mulut, adalah sebuah kemungkinan." +
                            "Tindakan. Dokter akan menyarankan membersihkan kerak itu dengan kapas dibasahi air hangat. Dokter juga bisa meresepkan krim antibiotik untuk dioleskan di bagian yang terkena, atau tablet antibiotik. Sampai infeksinya hilang, si anak harus memakai handuk dan peralatan mandi terpisah untuk mencegah penularan infeksi. Jauhkan si anak dari anak lain karena impetigo bisa menular";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan Penyebab. Ini mungkin eksema mulut, ruam disekitar mulut dan bibir disebabkan oleh ludah karena keseringan menjilat bibir atau menghisap ibu jari.\n" +
                            "Tindakan. Dua kali sehari selama beberapa hari, oleskan tipis krim kortikosteroid ke kulit disekitar bibir untuk mengurangi peradangan. Kemudian gunakan jelli kosmetik pelindung kulit. Sebaiknya si anak diajari menghentikan kebiasaan yang menyebabkan kondisi ini,dengan lebih memperhatikan kebiasaan itu ketika sedang melakukannya. Namun memarahi si anak tentang kebiasaan itu bisa memperburuk keadaan.";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")){
                    p35.setText("apakah gusinya berdarah ketika si anak menggosok gigi?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Si anak mungkin terkena penyakit gusi gingivitis, yaitu kondisi di mana gusi menjadi merah membengkak. Gingivitis biasanya timbul akibat kesehatan mulut yang buruk. Periksakanlah ke dokter gigi." +
                            "Tindakan. Dokter gigi mungkin akan mengeruk dan memoles gigi si anak dan memberikan saran-saran pemeliharaan kesehatan mulut dan gigi anak. Bila sakitnya parah, dokter gigi mungkin akan meresepkan antibiotika.";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d5")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Jamur mulut, suatu infeksi jamur, adalah sebuah kemungkinan. Kondisi ini paling banyak terjadi pada bayi atau anak-anak yang kekebalan tubuhnya menurun oleh penyakit atau pemakaian obat tertentu." +
                            "Tindakan. Dokter akan meresepkan gel atau tablet sesap antijamur untuk mengatasi infeksinya. Untuk mencegah infeksinya lagi, sterilkan semua dot, karet gigitan, dan mainan yang biasa dipakai si anak.";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p35.setText("apakah juga ada lepuh di telapak tangan serta kaki si anak?");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Mungkin si anak terserang penyakit mulut-tangan-kaki, suatu infeksi ringan yang disebabkan virus. Lepuh di tangan dan kaki sering muncul sekitar 48 jam  setelah yang di mulut. Periksakan ke dokter." +
                            "Tindakan. Tak ada pengobatan khusus untuk kondisi ini. Bila lepuhnya pecah dan membentuk tukak, ajari si anak mencuci mulut dengan larutan soda bikarbonat.";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Kemungkinan besar penyebabnya adalah virus herpes simplex, yang menyebabkan 'cold-sore'. Ketika terkena infeksi ini untuk pertama kalinya, bayi atau anak-anak akan tampak lesu dan mulut terasa perih. Gejala yang sama bisa terjadi karena virus atau pada beberapa kasus, sebuah obat resep\n" +
                            "Tindakan. Bila mulut seorang anak sedemikian sakitnya sehingga dia tidak bisa minum, mungkin dokter akan menyarankan rawat inap di rumah sakit. Pada kasus yang lebih ringan, dokter akan menyarankan beberapa tindakan sendiri. Bila diduga karena obat resep, maka dokter akan menghentikan pemakaiannya.";
                    p35.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d7")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab dan tindakan. Gigi baru maupun gigi yang bergerigi, bisa menimbulkan sakit di pipi atau mulut. Lakukan sendiri tindakan meredakan sakitnya. Bila sakitnya menetap atau karena ada gigi yang bergerigi, bawalah ke dokter yang akan bisa memperhalus ujung yg tajam.";
                    p35.setText(Html.fromHtml(sourceString));
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
                    p35.setText("apakah usia si anak di bawah 1 tahun dan apakah dia tampak lesu?");
                    posisi="d2"; }







            }
        });
    }}