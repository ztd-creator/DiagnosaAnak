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

public class p23 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p23);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p23 = findViewById(R.id.diagnosaMulai);
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

                p23.setText("apakah usia si anak di bawah 3 tahun?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kebanyakan si anak usia 3 tahun masih mengembangkan koordinasi fisik. Sebagian anak lebih lambat mengembangkan kemampuan ini daripada anak yang lain." +
                            "Tindakan. Sediakan sebanyak mungkin peluang agar anak bisa senang mengembangkan kemampuan fisiknya. Cegahlah siapapun mencerca secara terbuka kecanggungannya.";
                    p23.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kecanggungan parah bisa disebabkan oleh dispraksia, yaitu suatu kelainan perkembangan koordinasi, atau oleh suatu kelainan tersembunyi pada sistem otot arau sistem saraf. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan merujuk si anak ke terapis keterampilan atau spesialis lain. Anda dan si anak akan diajari latihan-latihan khusus yang perlu dilakukan bersama untuk memperbaiki koordinasi dan deksteritas si anak, yang akan bisa menghasilkan perbaikan besar.";
                    p23.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    p23.setText("apakah kecanggungan sangat mempengaruhi kegiatan si anak di sekolah ataupun kesehariannya?");
                    posisi="dl1";}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab dan tindakan. Obat tertentu, terutama yang untuk mengatasi ayan, bisa menyebabkan kecanggungan. Tanyakanlah hal itu ke dokter. Sementara itu jangan hentikan pemakaian obat resepnya. Kecanggungan juga bisa timbul dari penyalahgunaan obat atau pelarut kimia. Bila menduga hal itu terjadi, ajaklah si anak bicara untum mengetahui kebenarannya. Jelaskan bahayanya dan bantulah dia. Bila si anak tidak mau atau tidak bisa menghentikan ketagihannya, konsultasikanlah ke dokter atau ke lembaga  swadaya masyarakat yang bisa membantu";
                    p23.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Bawa ke Dokter Sekarang Juga" +
                            "Kemungkinan penyebab dan tindakan. Suatu kelainan sistem saraf yang berpotensi serius adalah sebuah kemungkinan. Dokter mungkin akan meminta si anak menjalani beberapa tes di rumah sakit untuk menetapkan diagnosa dan penanganan yang tepat.";
                    p23.setText(Html.fromHtml(sourceString));
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
                    p23.setText("apakah si anak memang selalu canggung?");
                    posisi = "d2";
                }

                else if(posisi.equals("d5")){
                    p23.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE); }


                        else if(posisi.equals("d2")){
                        p23.setText("apakah si anak sedang minum obat resep, atau mungkinkah si anak menyalahgunakan obat atau pelarut kimia?");
                        posisi="d3";}

                         else if(posisi.equals("d3")) {
                    p23.setText("apakah si anak merasa sakit kepala atau muntah tanpa penyebab jelas sejak munculnya kecanggungan itu?");
                    posisi = "d4";}

                    else if(posisi.equals("d4")){
                        p23.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE); }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kecenderungan alami untuk kecanggungan ringan adalah ciri bawaan lahir seorang anak dan bisa jelas terlihat saat dia sedang ketakutan. Hal seperti ini tidak terlalu perlu dirisaukan." +
                            "Tindakan. Jangan mengolok si anak karena kecanggungannya karena bisa memperburuk kondisinya. Bantulah dia dengan mendorongnya untuk mengikuti olahraga atau kegemaran yang meningkatkan kemampuan fisiknya.";
                    p23.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}




            }
    });
}}