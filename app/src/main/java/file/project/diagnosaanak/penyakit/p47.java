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

public class p47 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p47);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p47= findViewById(R.id.diagnosaMulai);
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

                p47.setText("Apakah nyerinya setelah sebuah cedera atau jatuh?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p47.setText("Adakah anggota tubuh yang tak bisa di gerakkan?");
                    posisi = "dl1";
                }

                else if (posisi.equals("dl1")) {
                    String sourceString = "<b>" + "Bahaya! bawa ke rumah sakit sekarang juga" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Lepas-sendi atau patah-tulang mungkin penyebabnya." + "<b>" +
                            "Tindakan " + "</b>" + "Si anak perlu menjalani pemeriksaan sinar-X untuk menetapkan lingkungan kerusakannya. Sendi atau tulangnya mungkin perlu dikembalikan ke posisi semula di bawah pembiusan umum, lalu dikunci-diam dengan pembalut dan/atau balut-keras (gips) beberapa minggu agar ligament yang robek dan tulang yang patah pulih kembali.";
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "// Masih di kembangkan---------------------------------------------------------------";
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d3")) {
                    p47.setText("Apakah Semua Lengan Dan Kaki Terasa Sakit?");
                    posisi = "dl3";
                }

                else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Terasa sakit menyeluruh yang disertai demam biasanya disebabkan oleh infeksi virus, misalnya flu. Ikuti langkah-langkah menurunkan demam. Bilang nyerinya sangat atau tidak berkurang sampai esok harinya, bawalah ke dokter dalam 24 jam.";
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dll3")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Sekarang Juga" + "</b> " + "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin terjadi infeksi tulang atau jaringan di sekitarnya" + "<b>" +
                            "Tindakan " + "</b>" + "Setelah memeriksanya mungkin dokter akan merujuk menjalani tes darah dan sinar X. Infeksi tulang akan memerlukan pengobatan antinoitika jangka panjang, yang awalnya akan diberikan di rumah sakit.";
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d4")) {
                    String sourceString = "<b>" + "Bawa Ke Dokter Sekarang Juga" + "</b> " +
                            "<b>" + "Kemungkinan Penyebab dan TIndakan" + "</b> " + "Tulang di siku mungkin terlepas dan cincin ligament penopangnya. Dokter akan bisa mengembalikannya ke posisi semula dengan sedikit menggerakannya; bila tidak, ia akan merujuk si anak ke rumah sakit untuk penanganan yang lebih baik.";
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("d5")) {
                    String sourceString =  "//masih pengembangan --------------------------------------------------------------------------------------------";
                    p47.setText(Html.fromHtml(sourceString));
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
        p47.setText("Apakah sakitnya terpusat di sebuah sendi?");
        posisi = "d2";
        }

                else if(posisi.equals("d2")) {
                    p47.setText("apakah si anak juga demam?");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p47.setText("apakah nyerinya setelah dia diayun dengan dipegang tangannya?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                    p47.setText("apakah si anak mengalami lemas?");
                    posisi = "d5";
                }

                else if (posisi.equals("d5")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("dl1")) {
                    String sourceString =  "<b>" + "Kemungkinan Penyebab" + "</b> " + "erkilir ringan pada ligament atau otot anggota tubuh adalah kemungkinan terbesar penyebab nyerinya." + "<b>" +
                            "Tindakan " + "</b>" + "Ikuti langkah-langkah mengatasi terkilir pada anak-anak. Bila sakitnya parah atau tidak berkurang sampai esok harinya, periksakan ke dokter dalam 24 jam.";
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("dl3")) {
                    p47.setText("Adakah radang atau bengkak di satu daerah anggota tubuh?");
                    posisi = "dll3";
                }

                else if (posisi.equals("dll3")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p47.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

            }
        });
    }


}
