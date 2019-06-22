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

public class p29 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p29);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p29 = findViewById(R.id.diagnosaMulai);
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

                p29.setText("apakah si anak mengeluh telinganya sakit atau menarik-narik telinganya?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    p29.setText("Apakah si anak tampak lesu atau demam?");
                    posisi="dl1"; }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "Bahaya! Bawa ke Rumah Sakit Sekarang Juga!" + "</b> "  +
                            "Kemungkinan penyebab. Suatu infeksi bakteri atau virus adalah sebuah kemungkinan. Infeksinya bisa tertular melalui saluran eustachian, yang akan menghubungkan tenggorokan dengan telinga bagkan tengah." +
                            "Tindakan. Dokter akan memeriksa si anak. Bila benar karena infeksi, dokter akan meresepkan rangkaian pengobatan antibiotik.";
                    p29.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Bisul di telinga bagian luar bisa menimbulkan nyeri telinga. Periksakanlah ke dokter." +
                            "Tindakan. Bila membenarkan diagnosa ini, dokter akan meresepkan antibiotik. Namun pada umumnya bisul itu akan pecah.";
                    p29.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Mungkin terjadi radang ringan pada gendang telinga. Namun pada beberapa kasus, sebuah masalah di tenggorokan bisa membuat nyerinya terasa di telinga." +
                            "Tindakan. Lakukanlah tindakan meredakan nyeri telinga. Bila nyeeinya semakin memburuk atau menetap, perikaakanlah ke dokter, yang akan memeriksa tanda-tanda adanya infeksi";
                    p29.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Barotrauma, kerusakan gendang telinga akibat perbedaan tekanan antara telinga bagian tengah dan luar, adalah sebuah kemungkinan. Nyerinya biasanya akan membaik dalam 24 jm. Bila nyerinya berlangsung lebih lama, periksakanlah ke dokter yang akan memeriksa telinga si anak.";
                    p29.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")){
                    p29.setText("Apakah sakitnya semakin bertambah bila cuping telinganya di tarik lembut?");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Infeksi di saluran telinga bagian luar bisa menyebabkan keluar cairan dan juga nyeri dan iritasi. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa telinga si anak. Bila ada infeksi di saluran telinga bagian luar, dokter KN meresepkan tetes telinga yang mengandung obat antijamur dan/atau kortikosteroid. Lakukan juga tindakan meredakan nyeri telinga.";
                    p29.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")){
                    p29.setText("Apakah kulit di sekitar telinga tampak merah meradang?");
                    posisi="d6";}

                else
                if(posisi.equals("d6")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Kelainan tertentu di kulit, misalnya eksim atau dermatitis seborrhoeik, mungkin menyerang kulit dinding dalam telinga. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa telinga dan kulit si anak. Bila terdiagnosa disebabkan oleh kelainan kulit, dokter akan meresepkan tetes telinga kortikosteroid. Cegahlah si anak agar tidak menggaruk telinga atau kulit disekitar telinga, agar tidak memperlama kondisi ini dan menyebabkan infeksi.";
                    p29.setText(Html.fromHtml(sourceString));
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
                    p29.setText("apakah si anak sedang pilek atau tenggorokan serak?");
                    posisi="d2"; }

                else if(posisi.equals("d2")){
                    p29.setText("apakah sakit telinganya tiba-tiba timbul di saat sedang atau segera setelah naik pesawat terbang?");
                    posisi="d3";}

                else if(posisi.equals("d2")){
                    p29.setText("apakah sakit telinganya tiba-tiba timbul di saat sedang atau segera setelah naik pesawat terbang?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p29.setText("adakah keluar cairan dari telinga yang sakit?");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p29.setText("apakah bagian dalam telinga si anak gatal atau teriritasi?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p29.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                     else
                         if(posisi.equals("dl1")){
                        p29.setText("adakah terlihat bintul merah di telinganya?");
                        posisi="dl2";}

                    else
                    if(posisi.equals("dl2")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Mungkin ini karena ada infeksi di kanal telinga bagian luar. Periksakanlah ke dokter." +
                                "Tindakan. Bila karena infeksi telinga luar, dokter bisa meresepkan tetes telinga yang mengandung kortikosteroid dan/atau antijamur.";
                        p29.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dl3")){
                        String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                                "Kemungkinan penyebab dan tindakan. Infeksi di telinga bagian tengah bisa merusakkan gendang telinga si anak. Hal itu akan meredakan tekanan yang terbentuk di dalam telinga. Dokter akan memeriksa si anak dan mungkin akan meresepkan antibiotik. Tindakan sendiri bisa meredakan nyeri di telinga si anaj. Gendang telinga akan sembuh dalam beberapa hari, dan tidak ada efek menetap pada pendengaran si anak.";
                        p29.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("d6")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Si anak mungkin sudah memasukkan benda kecil, misalnya manik-manik atau serpihan makanan ke telinganya. Kemungkinan lain, ada serangga masuk ke telinganya. Periksakanlah ke dokter." +
                                "Tindakan. Dokter akan memeriksa telinga si anak. Bila ada sedangga atau benda asing di saluran telinga, dokter akan bisa mengeluarkannya. Bila tidaj bisa melakukannya sendiri, dokter akan merujuk si anak ke rumah sakit untuk mengeluarkannya.";
                        p29.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}








            }
        });
    }}
