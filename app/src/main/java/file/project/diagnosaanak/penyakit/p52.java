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

public class p52 extends AppCompatActivity {

    Animation animShow, animHide,animFadeOut;
    Button mulai,ya,tdk;
    String posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p52);
        posisi=null;
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.textout);
        animShow = AnimationUtils.loadAnimation( this, R.anim.show);
        animHide = AnimationUtils.loadAnimation( this, R.anim.hide);

        final TextView p52 = findViewById(R.id.diagnosaMulai);
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

                p52.setText("Apakah perilaku si anak di sekolah menimbulkan masalah, atau apakah ia membolos?");
            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "Masalah masalah Sekolah.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                    String sourceString = "<b>" + "Masalah Berat Badan Pada Remaja.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d3")){
                    String sourceString = "<b>" + "Bawa ke dokter dalam 24 jam" + "</b> " +
                            "</b> " + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "</b>" + "Si anak mungkin mengidap masalah kesehatan mental serius yang memerlukan penanganan segera untuk mencegah timbulnya masalah yang berkaitan dengan keterampilan sosial dan pendidikan. Dokter mungkin akan merujuknya ke rumah sakit untuk diperiksa. Pada si anak bisa diberikan obat untuk mengontrol gejalanya, dan diikutkan konseling untuk mengatasi penyebab tersembunyi dari masalahnya.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d4")) {
                    p52.setText("Apakah gejala tersebut berlangsung kurang dari 2 minggu?");
                    posisi = "dl4";
                }

                else if(posisi.equals("dl4")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN " + "</b> " + " Masa remaja penuh dengan gejolak emosional. Selama murungnya berlangsung tidak terlalu lama atau tidak terlalu mendalam, tak perlu dicemaskan. Cobalah tidak terlalu mempersoalkan perilakunya. Doronglah agar si anak bisa mengungkapkan isi hatinya pada anda atau pada temannya. Konsultasikan ke dokter bila gejalanya masih terus mencemaskan.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dll4")){
                    String sourceString = "<b>" + "Bawa ke dokter dalam 24 jam" + "</b> " +
                            "KEMUNGKINAN PENYEBAB DAN TINDAKAN  Si anak mungkin mengalami depresi parah dan menuntut pemeriksaan medis segera. Ancaman bunuh diri harus senantiasa dicermati, walau sudah sering dilakukan. Bila tidak ada dokter, hubungi layanan pendukung segera. Usaha bunuh diri remaja seringkali bersifat dadakan menyusuli sebuah pertengkaran keluaraga atau putus-pacaran. Hal seperti itu jarang menunjukkan kesungguhan keinginan untuk mati, namun si anak mungkin perlu dirawat inap di rumah sakit untuk mencegahnya mencelakai diri sendiri dan memulai penanganan depresinya";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")) {
                    p52.setText("Apakah ia sedang mencemaskan sesuatu, misalnya ujian, masalah pertemanan, atau perceraian orangtua?");
                    posisi = "dl5";
                }

                else if (posisi.equals("dl5")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "</b> " + "Banyak remaja yang mengalami perioda cemas. Hal ini perlu dicemaskan hanya bila cukup parah sampai mempengaruhi kegiatan kesehariannya." + "<b>" +
                            "Tindakan "+ "</b>"+ "Ajaklah dia bicara untuk mencoba menemukan penyebab kecemasannya. Tunjukkan dukungan dan pengertian anda. Mungkin ada baiknya menanyakan juga pada gurunya. Bila kecemasan si anak tidak mereda setelah beberapa waktu walau sudah mendapat dukungan anda, konsultasikanlah ke dokter. Mungkin dokter akan menyarankan konseling atau terapi ";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


                else if (posisi.equals("d6")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "</b> " + "Penyalahgunaan obat atau pelarut kimia (bawah) bisa menjadi penyebab masalah perilaku anak" + "<b>" +
                            "Tindakan "+ "</b>"+ " Ajaklah di bicara, untuk mencari tahu apakah dia menggunakan obat atau pelarut kimia. Jelaskan bahaya penggunaan obat, dan cobalah beri dia dukungan moril. Bila si anak tidak mau atau tidak bisa menghentikan kebiasaannya atau menyangkal menggunakan obat berbahaya, konsultasikanlah ke dokter atau hubungi layanan jasa yang sesuai.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if (posisi.equals("d7")) {
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB" + "</b> " + "Bila si anak tetap saja bersikap antisosial atau mengacau, mungkin ia mengidap kelainan perilaku. Konsultasikan ke dokter." + "<b>" +
                            "Tindakan "+ "</b>"+ "Dokter mungkin akan merujuknya ke spesialis untuk diperiksa. Konseling atau terapi keluarga bisa disarankan. Namun masalah perilaku yang sudah berlangsung lama mungkin sudah sulit diubah.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d8")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN " + "</b> " +
                            " Bila memungkinkan, cobalah si anak memahami kecemasan anda. Apapun penilaian anda terhadap kegiatannya, pastikanlah bahwa dia menyadari resiko kehamilan tanpa sengaja atau infeksi tularan seksual. Anak ini berhak atas kerahasiaan perawatan medis dari dokter walau usianya masih dibawah 16 tahun.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d9")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN " + "</b> " +
                            "Keengganan meneruskan pengobatan untuk penahun, misalnya diabetes mellitus atau asma, adalah umum dikalangan remaja, walau sebelumnya mereka mau patuh. Hal ini biasanya disebabkan oleh kekecewaannya yang harus berbeda dari orang lain atau kebutuhan untuk merasakan bisa mengatur kehidupan sendiri. Ajaklah ia bicara, namun jangan memaksa ataua marah. Jelaskan bahayanya bila tidak menjalankan pengobatan seperti yang dianjurkan. Anda juga perlu menanyakan ke dokter, yang akan bisa membantu dengan juga menasehati si anak. Mungkin dokter juga menyarankan konseling";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }


        });
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null||posisi.equals("d1")) {
                    p52.setText("Apakah anda mencemaskan berat badan atau kebiasaan makannya?");
                    posisi = "d2";

                }



                else if(posisi.equals("d2")) {
                    p52.setText("Adakah salah satu gejala berikut?" +
                            "1. memiliki gagasan yang sangat kacau " +
                            "2. berbicara meracau" +
                            "3. mendengar atau melihat sesuatu yang sebenarnya tidak ada" +
                            "4. merasa di kendalikan oleh kekuatan asing");
                    posisi = "d3";
                }

                else if(posisi.equals("d3")) {
                    p52.setText("Adakah dua atau lebih gejala berikut?" +
                            "1. hilang semangat" +
                            "2. selalu tampak letih" +
                            "3. sulit tidur" +
                            "4. hilang nafsu makan" +
                            "5. sulit berkonsentrasi" +
                            "6. nilai sekolahnya merosot");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                    p52.setText("Apakah si anak tampak sering gelisah atau tegang?");
                    posisi = "d5";
                }

                else if(posisi.equals("d5")) {
                    p52.setText("Adakah perilakunya yang menunjukkan gejala penyalahgunaan obat tau pelarut kimia, atau konsumsi alkohol berlebihan?");
                    posisi = "d6";
                }

                else if(posisi.equals("d6")) {
                    p52.setText("Apakah si anak bersikap agresif atau kejam, atau melanggar hukum?");
                    posisi = "d7";
                }

                else if(posisi.equals("d7")) {
                    p52.setText("Apakah anda cemas anak anda terlalu aktif secara seksual?");
                    posisi = "d8";
                }

                else if(posisi.equals("d8")) {
                    p52.setText("Apakah si anak menghentikan sendiri pengobatan jangka panjang yang sedang dijalaninya?");
                    posisi = "d9";
                }

                else if(posisi.equals("d9")){
                    String sourceString = "<b>" + "Periksalah Ke Dokter";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl4")) {
                    p52.setText("Apakah si anak membicarakan tentang atau terancam bunuh diri?");
                    posisi = "dll4";
                }

                else if(posisi.equals("dll4")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "</b> " +
                            " Si anak mungkin mengalami depresi. Ajaklah dia bicara untuk mencari adanya masalah tersembunyi. Tawarkan dukungan dan dorongan dan cobalah mengurangi atau menghilangkan semua sumber stress yang bisa memperburuk keadaan. Bila si anak belum pulih dalam seminggu atau lebih, konsultasikanlah ke dokter, yang akan bisa menyarankan konseling atau terapi keluarga, pada beberapa kasus, penanganan dengan obat antidepresan bisa disarankan.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("dl5")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB DAN TINDAKAN" + "</b> " +
                            " Kecemasan bisa merupakan gejala depresi. Ajaklah dia mengungkapkan isi hatinya serta tunjukkan dukungan dan pengertian anda. Bila gejalanya tidak mereda dalam 2 minggu dan tanpa sebab jelas, periksakanlah ke dokter, yang bisa menyarankan konseling atau terapi keluarga.";
                    p52.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }
        });
    }


}
