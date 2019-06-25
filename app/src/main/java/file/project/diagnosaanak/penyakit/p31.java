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

public class p31 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p31);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p31 = findViewById(R.id.diagnosaMulai);
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

                p31.setText("apakah tersumbat atau berlendirnya hidung si anak sudah lebih dari 1 bulan?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Mungkin terjadi pembesaran adenoid. Ini biasa terjadi pada anak-anak dan biasanya akibat sebuah infeksi atau alergi. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa si anak dan juga menguji pendengarannya karena pembesaran adenoid bisa menyebabkan gangguan pendengaran. Adenoid akan mengecil saat si anak membesar dan jarang menimbulkan masalah setelah usia 8 tahun. Pada beberapa kasus, obat antialergi akan bisa menolong. Bila gejalanya parah, dokter mungkin akan akan merujuk ke spesialis yang bisa menentukan apakah adenoidnya perlu diangkat.";
                    p31.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    p31.setText("gatalkah mata si anak?");
                    posisi="dl1";}

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan Penyebab, Alergi rhinitis musiman adalah sebuah kemungkinan. Kondisi ini disebabkan oleh alergi terhadap bunga rumput dan biasanya di musim rumput berbunga" +
                            "Tindakan, Bila mungkin, biarkan si anak di dalam rumah ketika bunga rumput beterbangan, dan jauhkan dia dari daerah yang berpadang rumput luas. Obat oral antihistamin akan bisa menolong dan di jual bebas. Bila langkah ini tidak menolong periksakanlah ke dokter.";
                    p31.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d3")){
                    p31.setText("apakah keluarnya hanya dari satu lubang hidung saja?");
                    posisi="d4";}

                else
                if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Benda asing, misalnya manik-manik atau kacang, mungkin tersangkut di hidung si ajak dan menyebabkan infeksi. Periksakanlah ke dokter.\n" +
                            "Tindakan. Jangan mencoba mengeluarkan sendiri benda asing apapun dari hidung seorang anak, karena bisa membuatnya semakin masuk. Dokter akan bisa mengeluarkannya. Namun bila benda asing itu sulit dijangkau, mungkin si anak perlu dibawa ke rumah sakit untuk dioperasi ringan di bawah pembiusan umum untuk mengeluarkannya. Infeksinya akan sembuh sendiri, namun pada beberapa kasus diperlukan antibiotik untuk mengobatinya.";
                    p31.setText(Html.fromHtml(sourceString));
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
                    p31.setText("adakah keluar cairan jernih dari kedua lubang hidungnya?");
                    posisi = "d2"; }

                else if(posisi.equals("d2")){
                    p31.setText("adakah keluar cairan kental kuning atau hijau dari hidung si anak?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p31.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("d4")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Pilek atau infeksi lain mungkin penyebabnya." +
                                "Tindakan. Lakukan penanganan sendiri atas pileknya. Bila si anak juga demam, redakanlah. Gejalanya akan mulai membaik dalam beberapa hari. Bila tidak membaik juga, atau timbuk gejala lain, periksakanlah ke dokter.";
                        p31.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dl1")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Pilek atau infeksi lain mungkin penyebabnya." +
                                "Tindakan. Lakukan penanganan sendiri atas pileknya  Gejalanya akan mulai membaik dalam beberapa hari. Bila tidak membaik juga, atau timbuk gejala lain, periksakanlah ke dokter.";
                        p31.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}




                }
        });
    }}