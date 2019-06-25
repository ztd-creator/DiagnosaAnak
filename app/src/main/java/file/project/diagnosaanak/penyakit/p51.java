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

public class p51 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p51);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p51 = findViewById(R.id.diagnosaMulai);
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

                p51.setText("Apakah anda termasuk gemuk untuk usianya?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    String sourceString = "</b> " + "KEMUNGKINAN PENYEBAB Remaja yang gemuk akan menghadapi resiko obesitas di masa depan ";
                    p51.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d2")) {
                    p51.setText("Apakah si anak baru saja terserang sakit?");
                    posisi = "dl2";
                }

                else if (posisi.equals("dl2")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab dan Tindakan" + "</b> " + "Adalah wajar bila berat badan susut karena sakit. Namun bila anda mencemaskan berat badannya yang terus susut atau bila anda merasa si anak terlalu kurus, periksakanlah ke dokter.";
                    p51.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("dll2")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "</b> " + "Anak anda mungkin mengidap anorexia dan/atau bulimia.Diagnosa dini adalah kunci penting dalam penanganan kondisi yang berpotensi membahayakan jiwa ini. Konsultasikan ke dokter" + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter akan memeriksa dan mungkin merujuk ke psikiater, atau bila perlu, merujuk si anak untuk dirawat di rumah sakit untuk diawasi dan ditangani psikiater";
                    p51.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                 else if (posisi.equals("dlll2")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "</b> " + "Pertambahan tinggi bandan yang sangat cepat bisa tidak sebanding dengan penambahan berat badan. Hal Seperti ini tidak perlu dicemaskan. Dan penambahan berat badan si anak akan segera menyusul penambahan tingginya dalam beberapa bulan. Namun bila anak anda tampak lesu atau bila berat badannya masih membuat anda cemas, segera konsultasikan ke dokter." + "<b>";
                    p51.setText(Html.fromHtml(sourceString));
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
                    p51.setText("Apakah anak anda terlalu kurus untuk usianya ataukah beratnya baru susut banyak?");
                    posisi="d2";
                }

                else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "Berat Badan Anak Anda Masih Dalam Batas Wajar, Namun Periksakanlah Ke Dokter Bila Anda Masih Cemas" ;
                    p51.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl2")) {
                    p51.setText("Adakah salah satu gejala berikut?" +
                            "1. sangat ingin berat badannya turun dan berdiet" +
                            "2. terlalu kritis terhadap tubuhnya sendiri" +
                            "3. siklus haidnya terhenti\n" +
                            "4. menolak makan dan/atau menyisihkan makanan" +
                            "4. menyalahgunakan urus-urus, diuretika, atau");
                    posisi = "dll2";
                }

                else if(posisi.equals("dll2")) {
                    p51.setText("Apakah tinggi badannya sedang bertambah pesat?");
                    posisi = "dlll2";
                }

                else if (posisi.equals("dlll2")) {
                    String sourceString = "<b>" + "Periksalah Ke Dokter" ;
                    p51.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }
        });
    }


}
