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

public class p30 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p30);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p30 = findViewById(R.id.diagnosaMulai);
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

                p30.setText("belum lamakah hilangnya pendengaran?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (posisi == null) {
                    p30.setText("apakah saat ini telinga si anak sedang sakit?");
                    posisi = "dl1";
                } else if (posisi.equals("dl1")) {
                    p30.setText("Lihat diagram Telinga nyeri atau teriritasi");
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("dl2")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Infeksi saluran telinga bagian luar atau tengah bisa menyebabkan hilangnya pendengaran untuk sementara, yang bisa bertahan beberapa waktu setelah infeksinya hilang." +
                            "Tindakan. Pada kebanyakan kasus, pendengaran kembali normal dalam 2-3 minggu tanpa penanganan khusus. Periksakanlah ke dokter bila hilangnya pendengaran itu menetap atau memburuk. Mungkin timbul penumpukan cairan di telinga bagian tengah atau ada remah di saluran telinga.";
                    p30.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("dl3")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Barotrauma, gendang telinga rusak akibat perbedaan tekanan antara telinga bagian tengah dan luar, adalah sebuah kemungkinan dan bisa menyebabkan hilangnya pendengaran untuk sementara.\n" +
                            "Tindakan. Gejala  barotrauma biasanya hilang sendiri dalam beberapa jam tanpa diobati. Namun bila hal itu menetap segera periksakanlah ke dokter. Karena barotrauma lebih mudah terjadi bila hidung si anak sedang tersumbat, selalu sediakan tetes hidung dekongestan bila hendak bepergian dengan pesawat terbang di saat anak anda pilek. Bila si anak sehat, tindakan sederhana untuk mencegah barotrauma sudah cukup.";
                    p30.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("dl4")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab dan tindakan. Sumbatan di tuba eustachian (saluran penghubung telinga bagian tengah dengan belakang tenggorokan), karena pilek atau alergi, bisa membuat hilang pendengaran sementara. Periksakanlah ke dokter, yang bila mendiagnosa adanya infeksi, akan menyarankan menunggu beberapa waktu sampai sembuh sendiri. Bila disebabkan oleh alergi, dokter akan meresepkan obat antialergi, misalnya antihistamin.";
                    p30.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d2")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Si anak mungkin mengalami kelainan cairan telinga (chronic secretory otitis media), yaitu terbentuk penumpukan cairan di telinga bagian tengah, menyebabkan pendengaran terganggu. Kondisi ini bisa disebabkan oleh alergi atau adenoid selalu membesar dan menyumbat tuba eustachian, yaitu saluran penghubung telinga bagian tengah dengan belakang tenggorokan." +
                            "Tindakan. Dokter akan menguji pendengaran, yang mencakup juga timpanometri untuk mendiagnosa, dan juga menyarankan obat antialergi, mislanya antihistamin. Bila cairannya menetap, dokter mungkin akan menyarankan pengangkatan adenoid dan/atau pemasangan tabung halus melalui gendang telinga untuk mengalirkan cairan telinga. Pada kebanyakan kasus, pendengaran bisa dipulihkan.";
                    p30.setText(Html.fromHtml(sourceString));
                    ya.startAnimation(animFadeOut);
                    tdk.startAnimation(animFadeOut);
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);
                } else if (posisi.equals("d3")) {
                    p30.setText("selama hamil anak ini, pernahkah anda kontak dengan pengidap rubella atau terserang demam disertai ruam kulit?");
                    posisi = "dl5";
                } else if (posisi.equals("dl5")) {
                    String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab,Terpaparnya janin pada rubella dan jenis infeksi tertentu lain bisa merusak pendengaran. Periksakanlah ke dokter." +
                            "Tindakan. Dokter akan melakukan uji pendengaran dan mungkin merujuknya ke spesialis untuk diteliti lebih lanjut.";
                    p30.setText(Html.fromHtml(sourceString));
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
                if(posisi==null||posisi.equals("rev")){
                    p30.setText("Adakah salah satu gejala berikut?" +
                            "1. sering terserang infeksi telinga" +
                            "2. hidung selalu berlendir atau sering mampet" +
                            "3.mengorok ");
                    posisi="d2"; }

                else if(posisi.equals("d2")){
                    p30.setText("apakah anda khawatir si anak tidak akan pernah bisa mendengar dengan baik?");
                    posisi="d3";}

                    else if(posisi.equals("d3")){
                        p30.setText("PERIKSAKAN KE DOKTER BILA BELUM BISA TERDIAGNOSA DARI DIAGRAM INI");
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                        else if(posisi.equals("dl1")){
                            p30.setText("apakah telinganya sakit saat pendengarannya mulai hilang?");
                            posisi="dl2";}

                    else if(posisi.equals("dl2")){
                        p30.setText("apakah hilangnya pendengaran di saat atau sesudah perjalanan dengan pesawat terbang?");
                        posisi="dl3";}

                    else if(posisi.equals("dl3")){
                        p30.setText("apakah si anak sedang atau baru saja mengalami hidung mampet atau pilek, atau baru saja bersin?");
                        posisi="dl4";}

                    else
                    if(posisi.equals("dl4")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Sumbatan di telinga bagian liar oleh kerak telinga atau benda asing, mungkin penyebab hilangnya pendengaran anak muda. Periksakanlah ke dokter." +
                                "Tindakan. Dokter akan menyarankan melunakkan kerak telinga dengan tetes telinga yang di jual bebas atau minyak zaitun selama beberapa hari. Setelah itu anda bisa membasuhnya dengan air hangat. Bila benda asing penyebabnya, dokter mungkin akan merujuknya ke rumah sakit untuk mengeluarkannya.";
                        p30.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}

                    else
                    if(posisi.equals("dl5")){
                        String sourceString = "<b>" + "kemungkinan penyebab dan tindakan" + "</b> " + "Kemungkinan penyebab. Si anak mungkin mengidap kelainan pendengaran bawaan, bisa karena ketidaknormalan pertumbuhan telinga bagian dalam atau saraf pengantar sinyal suara ke otak. Jenis gangguan pendengaran seperti ini semakin mungkin bila ada anggota keluarga yang juga mengalaminya. Periksakanlah ke dokter." +
                                "Tindakan. Dokter akan melakukan uji pendengaran. Bila ditemukan gangguan pendengaran,si anak memerlukan waktu tambahan bantuan dengan pengembangan bahasa di sekolah dan di rumah.";
                        p30.setText(Html.fromHtml(sourceString));
                        ya.startAnimation( animFadeOut );
                        tdk.startAnimation( animFadeOut );
                        ya.setVisibility(View.GONE);
                        tdk.setVisibility(View.GONE);}
            }
        });
    }}