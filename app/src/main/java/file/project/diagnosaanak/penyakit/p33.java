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

public class p33 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p33);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p33 = findViewById(R.id.diagnosaMulai);
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

                p33.setText("apakah batuknya timbul mendadak dalam beberapa menit atau jam yang lalu?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p33.setText("apakah si anak tampak tertekan dan/atau terus batuk?");
                    posisi = "dl1"; }

                else
                if(posisi.equals("dl1")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Kemungkinan penyebab. Mungkin anak ini tersedak atau tertelan benda asing." +
                            "Tindakan. Sambil menunggu bantuan medis, lakukan pertolongan pertama.  Begitu tiba di rumah sakit, si anak akn diperiksa dan benda asingnya dikeluarkan. Mungkin diperlukan pembiusan umum.";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d2")){
                    String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                            "Bronkhiolitis (infeksi virus di saluran napas halus di paru-paru) atau pneumonia (infeksi rongga udara di paru-paru) adalah kemungkinan yang terjadi." +
                            "Tindakan. Dokter akan memeriksa atau mungkin akan merujuk ke rumah sakit untuk menjalani beberapa tes, misalnya sinar-X, dan dipantau. Pengobatan bisa meliputi pemberian oksigen dan antibiotik.";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Nafas berbunyi atau terengah pada anak-anak bisa disebabkan oleh kelainan serius di paru-paru.";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Batuk-batuk pada kondisi seperti itu mungkin disebabkan oleh asma. Periksakanlah ke dokter.\n" +
                            "Tindakan. Dokter akan memeriksa si anak dan meneliti napasnya. Bila hasilnya menunjukkan asma, dokter akan meresepkan dulu obat bronkodilator, yang bisa diberikan melalui penyemprot bertekanan. Pada anak yang masih kecil, biasanya diberikan melalui masker untuk membantunya menghirup obat secara efektif.";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")){
                    p33.setText("apakah si anak sudah di imunisasi terhadap batuk rejan?");
                    posisi="dl2";}

                else
                if(posisi.equals("dl2")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Walau sudah diimunisasi, serangan ringan batuk rejan bisa terjadi. Penyakit infeksi ini menyebabkan batuk berkepanjangan. Infeksi ini jauh lebih ringan dibanding bila si anak belum diimunisasi. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan meresepkan antibiotik untuk mengurangi peluang penularan infeksinya ke anak lain. Batuk akan bertahan sampai beberapa minggu, namun gejalanya seringkali tidak terlalu parah sehingga si anak tidak perlu dirawat inap di rumah sakit.";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    p33.setText("adakah salah satu gejala berikut?" +
                            "1. sering terserang infeksi telinga" +
                            "2. suara sengau" +
                            "3. mengorok" +
                            "4. pendengaran berkurang");
                    posisi="dl3";}

                else
                if(posisi.equals("dl3")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Mungkin terjadi pembesaran tonsil atau adenoid, yang bisa menyumbat saluran napas. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan memeriksa si anak dan menguji pendengaran atau merujuk ke spesialis. Pada beberapa kasus, akan disarankan pengangkatan tongsuil dan/atau adenoid, walau gejalanya akan semakin berkurang dengan bertambahnya usia si anak. Adenoid jarang menimbulkan gangguan pada anak usia di atas 8 tahun.";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d7")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Pilek atau infeksi virus lain adalah suatu kemungkinan. Namjn bila timbul ruam di kulit, mungkin dia terserang campak. Hal ini semakin mungkin bila dia belum pernah diberi vaksin campak." +
                            "Tindakan. Bila timbul ruam di kulit atau belum membaik dalam 2 hari, periksakanlah ke dokter";
                    p33.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else
                if(posisi.equals("d8")){
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Lingkungan berasap dan merokok bisa mengiritasi tenggorokan dan paru-paru anak kecil, menyebabkan batuk menetap. Bila anak anda mulai merokok, bujuklah agar berhenti merokok. Semakin lama dia merokok, semakin sulit kelak menghentikan kebiasaan itu. Bila ada anggota keluarga yang masih merokok, mintalah dia merokok di luar rumah.";
                    p33.setText(Html.fromHtml(sourceString));
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
                    p33.setText("apakah usia si anak di bawah 1 tahun dan apakah dia tampak lesu?");
                    posisi="d2"; }

                else if(posisi.equals("d2")){
                    p33.setText("apakah nafasnya berbunyi atau terlalu cepat?");
                    posisi="d3";}

                else if(posisi.equals("d3")){
                    p33.setText("apakah batuknya ketika si anak sedang pada kondisi berikut?" +
                            "1. malam hari" +
                            "2. setelah berolahraga" +
                            "3. ketika berada di udara dingin di luar rumah");
                    posisi="d4";}

                else if(posisi.equals("d4")){
                    p33.setText("apakah batuknya tidak terkendali dan di susuli dengan nafas berbunyi dan/atau batuk di sertai muntah?");
                    posisi="d5";}

                else if(posisi.equals("d5")){
                    p33.setText("apakah hidungnya selalu berlendir?");
                    posisi="d6";}

                else if(posisi.equals("d6")){
                    p33.setText("apakah temperatur tubuhnya 38°C atau lebih dan/atau hidungnya berlendir?");
                    posisi="d7";}

                else if(posisi.equals("d7")){
                    p33.setText("adakah yang merokok di rumah anda, atau mungkinkah si anak merokok?");
                    posisi="d8";}

                else if(posisi.equals("d8")){
                    p33.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dl1")){
                        String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                                "Kemungkinan penyebab. Mungkin ia tersedak benda asing, misalnya manik-manik, yang mungkin tersangkut di saluran napas, dan menyebabkan iritasi parah." +
                                "Tindakan. Dokter akan memeriksa dan mungkin akan meminta pemeriksaan sinar- dada. Bila ada benda asing tersangkut di saluran napas, si anak perlu dibawa ke rumah sakit untuk mengeluarkannya dengan pembiusan umum.";
                        p33.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dl2")){
                        String sourceString = "<b>" + "Bawa ke Dokter Dalam 24 Jam" + "</b> " +
                                "Mungkin ia mengidap batuk rejan (pertussis), sebuah penyakit infeksi yang menyebabkan batuk-batuk parah tak terkendali." +
                                "Tindakan. Dokter akan meresepkan antibiotik untuk mengurangi peluang penularan infeksi ke anak lain. Bila kondisinya parah, si anak mungkin perlu di rawat di rumah sakit. Batuknya bisa berlangsung sampai beberapa bulan. Batuk rejan parah, yang lebih mungkin terjadi pada anak usia di bawak 1 tahun, bisa mengakibatkan kerusakan permanen paru-paru";
                        p33.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dl3")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Alergi rhinitis perennial mungkin penyebabnya. Kondisi ini adalah reaksi alergi terhadap bahan tertentu, misalnya debu rumah, bulu binatang, atau spora tanaman, sehingga bisa timbul kapan saja sepanjang tahun." +
                                "Tindakan. Bila bisa mengetahui pemicu alerginya, kurangilah kontak si anak dengan bahan tersebut. Antihistamin yang dijual bebas, akan bisa meredakan gejalanya. Bila hal itu tidak membantu, periksakanlah ke dokter, yang akan bisa memberikan obat pengganti.";
                        p33.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}





            }
        });
    }}