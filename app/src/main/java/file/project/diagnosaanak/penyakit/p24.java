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

public class p24 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p24);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p24 = findViewById(R.id.diagnosaMulai);
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

                p24.setText("apakah anda khawatir anak anda terlambat belajar bicara atau terlalu sedikit bicara untuk seusianya?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p24.setText("apakah si anak tampak bisa mengerti seperti anak lain seusianya?");
                    posisi = "dl1";
                }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Anak-anak di bawah usia 2 tahun yang terlambat bicara pendiam biasanya hanya karena perkembangan umumnya memang lambat. Anak yang lebuh tua bisa enggan bicara karena masalah emosional, misalnya kecemasan. Pada banyak anak, keterlambatan bicara adalah disebabkan oleh gangguan pendengaran atau kelainan pada pemroduksi suara, misalnya cerebral palsy. Perisakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa pendengaran dan perkembangan umum si anak. Pada beberapa kasus, dokter bisa merujuknya ke seorang terapis bicara untuk di periksa mendalam. ";
                    p24.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Usia ketika suara mulai bisa diproduksi sangat berbeda-beda. Kesulitan kecil dalam memproduksi suara ucapan tertentu adalah wajar pada anak sampai usia 7 tahun. Namun pengucapan yang tidak jelas kadang-kadang bisa disebabkan adanya masalah di mulut atau pendengaran. Konsultasikanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa pendengaran dan mulut si anak. Bila perlu, si anak akan dirujuk ke seorang terapis bicara untuk memperoleh penanganan dan saran-saran khusus.";
                    p24.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab dan tindakan. Pengucapan tertegun-tegun atau gagap adalah umum pada anak di usia 2-4 tahun dan biasanya tidak memerlukan penanganan. Kebanyakan anak akan bisa mengatasi kesulitan pengucapan bila memperoleh cukup dorongan dan dukungan. Namun anda tetap perlu menanyakannya ke dokter berapapun usia si anak. Dokter mungkin akan merujuk ke seorang terapis bicara yang bisa mengajarkan beberapa strategi untuk membantu memperbaiki pengucapannya.";
                    p24.setText(Html.fromHtml(sourceString));
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
                    p24.setText("apakah orang yang asing sulit mengerti pengucapan si anak dan/atau apakah cadel?");
                    posisi = "d2";
                }

                else if(posisi.equals("d2")){
                    p24.setText("apakah ucapan si anak tertegun-tegun atau apakah dia gagap?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p24.setText("Segera periksa ke dokter!");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "Kemungkinan penyebab. Kelambatan memahami pengucapan dan bahasa mungkin disebabkan oleg gangguan pendengaran atau keterlambatan perkembangan umum. Pada sebagian anak, kurangnya pemahaman bisa disebabkan oleh kelainan bahasa, yaitu tidak bisa memproses atau tidak memproduksi Informasi verbal secara normal. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa pendengaran dan perkembangan umum si anak, dan merujuknya ke seorang terapis bicara atau mengobatinya bila hal itu disebabkan oleh gangguan sistem pendengaran. Sementara itu, teruslah memberanikan si anak untuk berbicara";
                    p24.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}






            }
        });
    }}