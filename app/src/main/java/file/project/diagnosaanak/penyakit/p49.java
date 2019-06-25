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

public class p49 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p49);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p49 = findViewById(R.id.diagnosaMulai);
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

                p49.setText("apakah kaki si anak terasa nyeri atau meradang?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p49.setText("apakah kaki itu baru saja mengalami cedera?");
                    posisi = "dl1";
                }

                else if (posisi.equals("dl1")) {
                    p49.setText("Bisakah ia memakainya untuk melangkah?");
                    posisi = "dll1";
                }

                else if (posisi.equals("dll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin terjadi regangan atau terkilir ringan pada otot atau ligament di kaki." + "<b>" +
                            "Tindakan " + "</b>" + "Ikuti saran penanganan terkilir pada anak-anak, dan buatlah agar si anak beristirahat beberapa jam dengan kaki ditinggikan. Periksakan ke dokter dalam 24 jam bila nyerinya parah atau belum membaik esok harinya.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dlll1")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" + "Periksa sepatu si anak, adakah kerikil atau paku yang mencuat, yang bisa menjadi penyebabnya. Periksa juga bagian dalam kaus kakinya. Karena kaki seorang anak bisa tumbuh sangat cepat, pastikan bahwa sepatunya masih pas dan nyaman, walau masih baru.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dllll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak mengalami verucca (mata-ikan), kutil yang tumbuh ke dalam telapak kaki karena tekanan dari berat badan. Kondisi ini disebabkan oleh infeksi virus di kulit." + "<b>" +
                            "Tindakan " + "</b>" + "Kebanyakan verucca akan hilang sendiri namun hal itu bisa berlangsung beberapa bulan atau tahun. Banyak obat bebas yang bisa mengatasi verucca secara efektif. Bila verucca tetap ada walau sudah diobati, perisakanlah ke dokter, yang akan bisa menghilangkannya dengan pembekuan, pembakaran atau pengerukan";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dlllll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak tertusuk benda asing, misalnya serpih kayu dan tersusup di kulit." + "<b>" +
                            "Tindakan " + "</b>" + " Bila tampak ada benda tersusup di kulit, keluarkan dengan memakai pinset. Setelah penyusup itu bisa dikeluarkan, lukanya akan segera sembuh. Bila bendanya terbenam terlalu dalam, atau bila penyebabnya tidak ditemukan serta sakitnya belum berkurang sampai esok harinya, segera periksakan ke dokter dalam 24 jam.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dllllll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Kaki atlet, sebuah infeksi jamur adalah penyebab paling mungkin." + "<b>" +
                            "Tindakan " + "</b>" + "Biasakan membasuh dan mengeringkan kaki si anak secara teratur, terutama di sela-sela jari, lalu oleskan krim antijamur yang dijual bebas. Ketika berada di dalam ruangan biarkan si anak memakai sandal terbuka atau telanjang kaki. Bila gejalanya masih bertahan sampai 2 minggu, periksakanlah ke dokter. Bila timbul merah dan bengkak di jari-jari kakinya, bawalah ke dokter dalam 24 jam.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dlllllll1")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Kemungkinan besar ini akibat kuku jempol tumbuh ke dalam. Hal ini disebabkan oleh pemotongan kuku yang kurang benar atau mengenakan sepatu yang terlalu sesak. Konsultasikan ke dokter." + "<b>" +
                            "Tindakan " + "</b>" + "Dokter akan meresepkan antibiotika dan menguras nanahnya di bawah pembiusan lokal. Pembedahan kadang-kadang disarankan untuk menghilangkan sebagian atau seluruh kuku ibu jari. Untuk mencegah tumbuhnya kuku menusuk kulit, seorang anak harus selalu memakan sepatu yang pas atau bila memungkinkan, memakai sandal terbuka. Jagalah agar bagian tersebut tetap kering dan bersih, serta senantiasa guntinglah kukunya rata, bukannya melengkung.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("d2")) {
                    p49.setText("Apakah salah satu atau kedua kaki si anak terpelintir ke dalam?");
                    posisi = "dl2";
                }

                else if(posisi.equals("dl2")) {
                    p49.setText("Apakah seluruh kaki termasuk tumit terpuntir ke dalam, dan apakah sudah terjadi sejak lahir?");
                    posisi = "dll2";
                }

                else if (posisi.equals("dll2")) {
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " + "Bentuk kaki seperti itu mungkin akibat kelainan pada struktur tulang kaki atau akibat posisi kaki janin dalam Rahim. Hal ini biasanya sudah teramati oleh dokter sejak lahir. Konsultasikan ke dokter." + "<b>" +
                            "Tindakan " + "</b>" + "Bila bentuka kaki itu karena bawaan sejak dalam rahim, maka akan berubah sendiri dalam beberapa minggu setelah dilahirkan. Bila hal itu karena ketidaknormalan structural, penanganan akan meliputi manipulasi dan pemasangan pasak pembentuk. Bila dalam tiga tahun tidak terjadi perbaikan, mungkin diperlukan operasi.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if(posisi.equals("dlll2")) {
                    p49.setText("Apakah usia si anak di bawah 3 tahun?");
                    posisi = "dllll2";
                }

                else if (posisi.equals("dllll2")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" + "Anak berusia di bawah 3 tahun biasanya berkaki rata karena otot, ligament, dan tulang di kakinya belum tumbuh sepenuhnya. Bantalan lemak di kaki anak kecil juga akan membuatnya tampak gembung. Tak ada yang perlu dicemaskan pada usia ini, karena lengkungan normal telapak kaki akan timbul dengan bertambahnya usia si anak.";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }

                else if (posisi.equals("dllll2")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" + " Bila si anak terlahir dengan kaki menekuk, mungkin taka da yang perlu dicemaskan. Namun bila hal itu menimbulkan sakit atau malu, operasi untuk meluruskan jari kaki bisa disarankan setelah si anak lebih besar. Bila timbulnya baru-baru saja, hal itu mungkin disebabkan oleh sepatu atau kaus kaki yang kekecilan. Pastikan si anak memakai sepatu dan kaus kaki yang pas. ";
                    p49.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                }


            }
        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    if(posisi==null||posisi.equals("d1")){
                    p49.setText("apakah anda mencemaskan bentuk kaki anak anda?");
                    posisi = "d2";
                }
                            else if(posisi.equals("d2")){
                        String sourceString = "<b>" + "Periksalah Ke Dokter";
                        p49.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else if(posisi.equals("dll1")){
                        String sourceString ="<b>" + " Bahaya! Bawa Ke Rumah Sakit Sekarang Juga" + "<b>" +
                                "<b>" + "Kemungkinan Penyebab" + "</b> " + "Mungkin si anak mengalami fraktur (patah-ulang) atau cedera serius di otot atau ligamen di kaki." +
                                "<b>" + "Tindakan "+ "</b>"+ "Mungkin perlu pemeriksaan sinar-X untuk menentukan jenis dan lingkup kerusakan. Operasi mungkin perlu, untuk mengembalikan posisi tulang. Tergantung cederanya, si anak mungkin perlu di gips atau cukup dengan pembalut kencang saja.";
                        p49.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else if(posisi.equals("dl1")) {
                        p49.setText("Apakah Sakitnya hanya ketika ia memakai sepatu?");
                        posisi = "dlll1";
                    }

                    else if(posisi.equals("dlll1")) {
                        p49.setText("Adakah satu atau lebih benjolan nyeri kulit yang mengeras dan kasar di telapak kaki?");
                        posisi = "dllll1";
                    }

                    else if(posisi.equals("dllll1")) {
                        p49.setText("Adakah bagian yang merah meradang di telapak kaki si anak?");
                        posisi = "dlllll1";
                    }

                    else if(posisi.equals("dlllll1")) {
                        p49.setText("Adakah kulit di sekitar jari kaki yang mengelupas, gatal dan meradang?");
                        posisi = "dllllll1";
                    }

                    else if(posisi.equals("dllllll1")) {
                        p49.setText("Adakah bengkak merah meradang di sekitar ibu jari kaki si anak?");
                        posisi = "dlllllll1";
                    }

                    else if(posisi.equals("dlllllll1")){
                        String sourceString = "<b>" + "Periksalah Ke Dokter";
                        p49.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else if (posisi.equals("dll2")) {
                        String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" + "Mungkin si anak mengidap ‘intoeing’ yang biasanya mulai ketahuan saat anak belajar jalan. Hal ini sering disebabkan oleh rotasi ke dalam pada seluruh tungkai mulai batas pinggul, atau disebabkan oleh kaki pengkor, yang keduanya wajar pada sebagian anak. Periksakan ke dokter untuk memastikan diagnose ini. Kondisi ini jarangan memerluka perawatan. Kedua tungkai akan kembali sendiri pada usia 3 tahun, sedangkan rotasi pinggul biasanya akan kembali sempurna di usia 8 tahun. Pada kasus yang jarang, diperlukan operasi untuk memulihkan kondisi ini.";
                        p49.setText(Html.fromHtml(sourceString));
                        ya.startAnimation(animFadeOut);
                        tdk.startAnimation(animFadeOut);
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);
                    }

                    else if(posisi.equals("dl2")) {
                        p49.setText("Anda khawatir si anak akan mengidap kaki leper?");
                        posisi = "dlll2";
                    }

                    else if (posisi.equals("dllll2")) {
                        String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "<b>" +"Kaki leper seringkali merupakan bakat bawaan. Pada kondisi ini, ligamen di kaki agak kendur dan hanya membentuk lengkungan ketika si anak berdiri atau berjinjit. Kaki-leper jarang menimbulkan kekhawatiran dan tidak menghalangi anak berolahraga ataupun menimbulkan masalah di kemudian hari. Latiha-latihan khusus dan pengganjal sepatu hampir selalu tidak efektif dan tidak diperlukan. Bila kaki si anak terasa nyeri atau bila anda mencemaskannya, periksakanlah ke dokter.";
                        p49.setText(Html.fromHtml(sourceString));
                        ya.startAnimation(animFadeOut);
                        tdk.startAnimation(animFadeOut);
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);
                    }

                    else if(posisi.equals("dlll2")) {
                        p49.setText("Apakah jari - jari si anak bengkok atau melengkung?");
                        posisi = "dlllll2";
                    }

                    else if(posisi.equals("dlllll2")){
                        String sourceString = "<b>" + "Periksalah Ke Dokter";
                        p49.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}
            }
        });
    }


}
