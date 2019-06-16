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

public class P3 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p1 = findViewById(R.id.diagnosaMulai);
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

                p1.setText("Apakah Usia Si bayi kurang dari 4 bulan?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    p1.setText("apakah ia menangis berkepanjangan di sore hari dan anda sulit menenangkannya agar mau tidur?");
                    posisi="dl1";
                } else
                if(posisi.equals("dl1")){
                    p1.setText("hasil");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                } else if(posisi.equals("rev")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + " rasa lapar mungkin penyebab bangunnya si bayi. kebutuhan sering makan adalah wajar pada bayi di usia ini"+ "<b>" +
                            "tindakan "+ "</b>"+"usaha mencegah bayi terbangun karena lapar di malam hari, misalnya dengan memberinya minum tambahan di sore hari, biasanya kurang berhasil. jangan pernah menambah formula susu bayi. beristirahatlah di siang hari ketika si bayi sedang tidur. bila dia bayi ASI , cobalah perah dan wadahi dalam botol agar pasangan anda bisa sesekali membantu meminumkannya di mal" ;
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "sebagian bayi memang tidur lebih sedikit dari yang lain. buatlah si bayi tetap senang di saat bangun dengan memberinya banyak benda untuk dilihat dan mainan. ikuti juga saran tindakan untuk menidurkan bayi ";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "kemungkinan penyebab. rasa lapar mungkin penyebab bangunnya si bayi. kebutuhan sering makan adalah wajar pada bayi di usia ini.\n" +
                            "\n" + "<b>" +
                            "tindakan "+ "</b>"+"usaha mencegah bayi terbangun karena lapar di malam hari, misalnya dengan memberinya minum tambahan di sore hari, biasanya kurang berhasil. jangan pernah menambah formula susu bayi. " +
                            "beristirahatlah di siang hari ketika si bayi sedang tidur. bila dia bayi ASI , " +
                            "cobalah perah dan wadahi dalam botol agar pasangan anda bisa sesekali membantu meminumkannya di mal" ;
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }else
                if(posisi.equals("d3")){
                    p1.setText("apakah si bayi selalu mengikuti pola itu?");
                    posisi="dl3";
                }else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + " bayi muda bisa tidur setiap saat. setelah berusia 2-3 bulan ia bisa mulai di dorong untuk lebih banyak tidur di malam hari dengan memberikan perbedaan nyata antara siang dan malam hari, dengan membiarkan tirai tetap terbuka di siang hari dan meredupkan cahaya di kamarnya pada malam hari. ketika mengganti popok di malam hari, gunakan lamou temaram, dan jangan mengajaknya bicara dan bermain. ";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }else
                if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + " setelah semakin membesar, bayi anda akan membutuhkan tidur lebih sedikit. cobalah mengurangi tidur siangnya agar ia bisa tidur lebih nyenyak di malam hari ";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }
                else if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + " berbagi kamar dengan bayi memang bisa mengganggu suasana malam anda dan si bayi. " +
                            "penyebabnya bisa karena anda telah membuat suara yang mengganggu tidurnya. " +
                            "namun lebih besar lagi kemungkinan anda yang terlalu peka terhadap gerakan si bayi " +
                            "di saat tidur dan sedikit suara si bayi sudah anda duga sebagai tanda terbangun penuh. " +
                            "banyak bayi yang tidur lasak dan bila tidak di ganggu, akan terus tidur kembali\n" +
                            "\n" + "<b>" +
                            "tindakan "+ "</b>"+ "bila memungkinkan, pindahkan si bayi ke kamar lain. anda tentu akan tetap mendengar bila ia menangis, namun mungkin anda kurang suka terbangunkan secara mendadak ";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }
                else if(posisi.equals("d5")){
                    p1.setText("Apakah ia tampak kurang sehat?");
                    posisi="dl5";
                }else if(posisi.equals("dl5")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + " bila terlihat gejala spesifik, misalnya demam, diare, atau muntah periksalah ke dokter";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("dl6")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + " dengan semakin tumbuhnya bayi anda, ia akan memerlukan lebih banyak makanan. memperbanyak makan di siang hari akan membuat si bayi tak lagi bangun di malam hari pilihan lain mintalah saran dari dokter atau mantri kesehatan";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("dl7")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + " kedinginan atau kegerahan bisa membangunkan bayi di malam hari." + "<b>" +
                            "tindakan "+ "</b>"+ "jagalah temperatur kamar si bayi sekitar 18°C. bayi anda tidak memerlukan selimut lebih dari kebutuhan anda sendiri pada keadaan sama. membiarkan bayi kegerahan bisa meningkatkan resiko sindroma kematian bayi mendadak (kiri). bila ia kedinginan karena selimutnya tertendang,cobalah memakaikan pakaian tidur di malam hari.";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);

                }else if(posisi.equals("dl8")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + " bayi bisa merasakan kecemasan atau ketegangan orang tuanya, dan bisa terganggu oleh hal itu." + "<b>" +
                            "tindakan "+ "</b>"+ "mungkin perlu sedikit waktu agar bayi anda yakin kembali. kalau bisa, jagalah jadwal harian si bayi tetap stabil, walau kehidupan anda sedang kacau. ketika si bayi terbangun di malam hari, berilah minum dan belaian, namun pastikan bahwa si bayi tahu bahwa ia harus kembali ke tempat tidurnya sendiri, agar si bayi tidak terbiasa bangun di malam hari dan berharap di ajak bermain";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }



            }
        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("rev")){
                    p1.setText("Apakah bayi anda tidur lebih sedikit dari bayi lain seusianya?");
                    posisi="d2";
                }else
                if(posisi.equals("dl1")){
                    p1.setText("Apakah ia sering bangun di malam hari namum kembali tidur setelah disusui?");
                    posisi="rev";
                } else
                if(posisi.equals("d2")){
                    p1.setText("Apakah si bayi banyak tidur di siang hari dan sedikit di malam hari?");
                    posisi="d3";
                }else

                if(posisi.equals("dl3")){
                    p1.setText("Apakah si bayi terbiasa tidur siang?");
                    posisi="dl4";
                }else
                if(posisi.equals("d3")||posisi.equals("dl4")){
                    p1.setText("Apakah si bayi tidur sekamar dengan anda?");
                    posisi="d4";
                }else if(posisi.equals("d4")){
                    p1.setText("Apakah si bayi sering bangun di malam hari setelah sebelumnya nyenyak?");
                    posisi="d5";
                }
                else if(posisi.equals("d5")){
                    p1.setText("Segera periksa ke dokter!");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }else if(posisi.equals("dl5")){
                    p1.setText("mungkinkan bayi terbangun karena lapar?");
                    posisi="dl6";
                }else if(posisi.equals("dl6")){
                    p1.setText("mungkinkah ia kedinginan atau gerah di malam hari?");
                    posisi="dl7";
                }
                else if(posisi.equals("dl7")){
                    p1.setText("apakah baru terjadi masalah rumahtangga atau sesuatu yang bisa menyebabkan kecemasan?");
                    posisi="dl8";
                }else if(posisi.equals("dl8")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + " kebutuhan kehadiran anda adalah penyebab terbanyak bayi terbangun di malam hari setelah lepas dari masa menyusu di malam hari. tetaplah menepati jadwal tidurnya ";
                    p1.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }







            }
        });
    }


}
