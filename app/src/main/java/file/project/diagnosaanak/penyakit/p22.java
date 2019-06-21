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

public class p22 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p22);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p22 = findViewById(R.id.diagnosaMulai);
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

                p22.setText("apakah si anak baru terbentur di kepala dalam beberapa hari terakhir?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("rev")){
                    p22.setText("apakah temperatur si anak 38°C atau lebih?");
                    posisi="d2"; }
            }

        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("rev")){
                    p22.setText("apakah temperatur si anak 38°C atau lebih?");
                    posisi="d2"; }

                else if(posisi.equals("d2")){
                    p22.setText("mungkinkah ia menelan salah satu hal berikut?" +
                            "1. obat resep untuk orang dewasa " +
                            "2. tanaman atau jamur beracun" +
                            "3. larutan kimia pembersih rumah tangga");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p22.setText("adakah salah satu gejala berikut?\n" +
                            "1. berat badan merosot tanpa sebab jelas\n" +
                            "2. semakin mudah haus\n" +
                            "3. urin lebih banyak dari biasanya ");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p22.setText("apakah si anak sedang di rawat karena diabetes?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p22.setText("adakah bukti bahwa si anak baru terserang kejang-kejang, misalnya salah satu hal berikut:\n" +
                            "1. lidahnya tergigit\n" +
                            "2. mengompol");
                    posisi="d6";}

                else if(posisi.equals("d6")){
                    p22.setText("apakah si anak baru mengalami diare, dengan atau tanpa muntah, dalam 24 jam terakhir?");
                    posisi="dl2";}

                else if(posisi.equals("dl2")){
                    p22.setText("apakah si anak baru terjemur terik matahari atau di tempat berhawa sangat panas?");
                    posisi="d7";}

                else if(posisi.equals("d7")){
                    p22.setText("apakah si anak sedang minum obat resep atau obat bebas?");
                    posisi="d8";}

                else if(posisi.equals("d8")){
                    p22.setText("mungkinkah si anak baru minum alkohol?");
                    posisi="d9";}

                else if(posisi.equals("d9")){
                    p22.setText("mungkinkah si anak menyalahgunakan alkohol atau pelarut kimia?");
                    posisi="d10";}

                else if(posisi.equals("d10")){
                    p22.setText("PERIKSAKAN KE DOKTER BILA ANAK ANDA TAMPAK SELALU MENGANTUK DAN BINGUNG DAN BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                  else
                    if(posisi.equals("dl1")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Bawa ke Dokter Sekarang Juga" +
                                "Kemungkinan penyebab. Kebingungan si anak mungkin akibat infeksi parah, misalnya pneumonia atau infeksi saluran kemih." +
                                "Tindakan. Turunkan demamnya dan pastikan si anak banyak minum. Bila setelah memeriksa dokter menemukan ada tempat yang jelas terkana infeksi, mungkin akan diberikan antibiotik. Bila tidak, mungkin perlu dirujuk ke rumah sakit guna menjalani beberapa tes untuk mencari penyebab dan menetapkan pengobatan yang tepat.";
                        p22.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}








            }
        });
    }


}