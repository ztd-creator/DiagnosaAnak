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

public class p55 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p55);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p55 = findViewById(R.id.diagnosaMulai);
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

                p55.setText("adakah salah satu gejala berikut?" +
                        "1. bintik merah meradang dengan putih di tengahnya" +
                        "2. bintik hitam");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    p55.setText("adakah salah satu gejala berikut?" +
                            "1. bintik atau benjolan merah dibawah kulit " +
                            "2. bintik yang meninggalkan parut di kulit" +
                            "3. timbul ruam meluas di wajah,dada, atau punggung");
                    posisi="dl1";
                }
                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + " KEMUNGKINAN PENYEBAB DAN TINDAKAN Ada beberapa jerawat parah yang harus ditangani oleh dokter. Konsultasikan ke dokter, yang akan memeriksa si anak dan meresepkan penanganan jerawat atau merujuk si anak ke seorang spesialis kulit. Si anak juga harus bertindak sendiri. ";
                    p55.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "KEMUNGKINAN PENYEBAB Kulit berminyak adalah normal di usia ini. Secara kesehatan, tidak ada yang perlu dicemaskan, namun bisa membuat anak anda malu." + "<b>" +
                            "tindakan "+ "</b>"+ "TINDAKAN Membasuh wajah secara teratur dengan sabun lembut dan air sudah cukup untuk mengendalikan kulit berminyak. Terlalu sering membasuh malah bisa lebih merangsang produksi sebum di kulit. Semua make-up yang dipakai harus bebas minyak dan dibersihkan baik-baik di malam hari.\n";
                    p55.setText(Html.fromHtml(sourceString));
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
                    p55.setText("apakah anak anda mencemaskan kulitnyayang semakin berminyak?");
                    posisi="d2";
                }
                else if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "KEMUNGKINAN PENYEBAB Mungkin si anak mengalami jerawat ringan. Walau tidak parah, hal itu bisa membuatnya tertekan." + "<b>" +
                            "tindakan "+ "</b>"+ "TINDAKAN Pastikan si anak tahu cara menangani jerawat. Krim atau losyen anti-jerawat yang dijual bebas juga bisa menolong. Bila tidak ada perbaikan atau bila sampai membuat si anak tertekan, periksakanlah ke dokter, yang bisa meresepkan ramuan lain atau obat untuk menangani jerawat.\n";
                    p55.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}
                else if(posisi.equals("d2")){
                    p55.setText("Segera periksa ke dokter!");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }
                else if(posisi.equals("d2")){
                    p55.setText("Segera periksa ke dokter!");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }






            }
        });
    }


}
