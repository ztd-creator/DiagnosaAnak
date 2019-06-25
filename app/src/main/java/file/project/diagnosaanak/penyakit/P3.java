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

        final TextView p3 = findViewById(R.id.diagnosaMulai);
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

                p3.setText("Apakah usia bayi anda kurang dari 6 bulan?");
            }
        });
        //tombol YA
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posisi==null){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "BAWA KE DOKTER SEKARANG JUGA" +
                            "Kemungkinan Penyebab Mungkin bayi anda terserang infeksi virus atau bakteri. Selain itu, demam bisa timbul setelah menjalani imunisasi." + "<b>" + "tindakan "+ "</b>"+ "Tindakan Sebelum memeriksnya ke dokter, redahkanlah demamnya. Dokter akan memeriksa si bayi untuk mencari penyebabnya. Pada beberapa kasus, dokter akan meresepkan antibiotika. Mungkin dokter akan menyarankan rawat inap dirumahsakit bila si bayi tampak sangat tidak sehat atau bila penyebabnya tidak jelas";
                    p3 .setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d2")){
                   //Masih ada Pembaharuan ----------------------------------------------------------------------------------

                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d3")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "BAWA KE DOKTER DALAM 24 JAM" +
                            "Kemungkinan Penyebab Suatu infeksi virus atau bakteri di telinga bagian tengah adalah penyebab umun naiknya temperatur seorang bayi usia diatas 6 bulan. Infeksi telinga bagian tengah semakin mungkin bila ia baru saja sakit pilek." + "<b>" +
                            "tindakan "+ "</b>"+ "Tindakan Doktwr akan memeriksanya dan meresepkan antibiotika. Selain itu, lakukan sendiri tindakan meredakan nyeri telinga dan meredakan demam.";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


                else if(posisi.equals("d4")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "BAWA KE DOKTER SEKRANG JUGA" +
                            "Kemungkinan Penyebab Bronkhiolitis (Inveksi virus disaluran nafas paru-paru ) atau pneumonia  (inveksi virus atau bakteri ada gelumbung udara di paru-paru)" + "<b>" +
                            "tindakan "+ "</b>"+ "Tindakan Dokter atau memeriksa dan mungkin merujuk si bayi kerumah sakit untuk menjalani beberapa tes, misalnya sinar-X dan pengukuran tingkat oksigen darah. Pengobatan bisa mencakup antibiotika";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d5")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "KEMUNGKINAN PENYEBAB Demamnya mungkin karena inveksi virus, misalnya pilek.  Campak adalah kemungkinan yang agak tipis. Bila akibat campak, akan timbul ruam merah rata melebar dalam 2-3 hari." + "<b>" +
                            "tindakan "+ "</b>"+ "TINDAKAN Redaknlah demamnya . Sangat perlu juga mendorong si bayi agar banyak minum, namun jangan terlalu mencemaskan makanan padat. Bila timbul ruam atau bila kondisinya tidak membaik dalam 24 jam, perikslah ke dokter.";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d6")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "Bahaya! bawa ke rumah sakit sekarang juga" +

                            "KEMUNGKINAN PENYEBAB." +
                            "Meningitis, peradangan selaput pembungkus otak akibat infeksi, bisa menyebabkan gejala seperti ini. " + "<b>" +
                            "tindakan "+ "</b>"+  "TINDAKAN. \n" +
                            "Bila diduga meningitis, si bayi harus segera dibawa ke rumah sakit saat itu juga, untuk mendapatkan pertolongan segera dengan antibiotika,  dan mungkin memerlukan perawatan intensif. ";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d7")){
                    String sourceString = "<b>" + "Kemungkinan Penyebab" + "</b> " +
                            "Gastroenteritis, yaitu infeksi sistem pencernaan, adalah kemungkinan terbesar gejala seperti ini, terutama bila si bayi juga muntah. " + "<b>" +
                            "tindakan "+ "</b>"+ "TINDAKAN. \n" +
                            "Dokter akan memeriksa apakah si bayi mengalami dehidrasi.  Dokter juga akan memberikan beberapa saran pencegahan dehidrasi pada bayi dan langkah-langkah menangani gastroenteritis pada bayi.";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d8")){
                    String sourceString = "<b>" + "KEMUNGKINAN PENYEBAB. " +
                            "Sebagian bayi bisa merasa tidak nyaman atau demam ringan dalam seminggu setelah diimunisasi rutin. " + "<b>" +
                            "tindakan "+ "</b>"+  "TINDAKAN. " +
                            "Ikuti saran-saran menghadapi demam setelah imunisasi";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}

                else if(posisi.equals("d9")){
                    String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "KEMUNGKINAN PENYEBAB. " +
                            "Kegerahan, kerena pakaian yang terlalu tebal atau udara sekitar yang terlalu panas, nisa menyebabkan demam. " + "<b>" +
                            "tindakan "+ "</b>"+  "TINDAKAN." +
                            "Bayi tidak membutuhkan pakaian yang lebih tebal daripada orang dewasa pada suatu kondisi yang sama,  dan akan nyaman pada temperatur ruang 15-20 °C.  Tempat tidur bayi tidak boleh terletak di dekat alat pemanas ruangan. Lepaskan semua pakaian yang berlebihan dan pindahkan si bayi ke tempat yang lebih sejuk dan tidak dingin. Bila temperatur bayi tidak ";
                    p3.setText(Html.fromHtml(sourceString));
                    ya.startAnimation( animFadeOut );
                    tdk.startAnimation( animFadeOut );
                    ya.setVisibility(View.GONE);
                    tdk.setVisibility(View.GONE);}


            }
        });
        //tombol TIDAK
        tdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(posisi==null||posisi.equals("d1")){
                    p3.setText("adakah ruam di kulitnya?");
                    posisi="d2";
                }

                else if(posisi.equals("d2")) {
                    p3.setText("apakah ia terbangun di malam hari, menangis tanpa bisa diredakan,dan/atau menarik-narik salah satu telinganya?");
                    posisi = "d3";
                }


else if(posisi.equals("d3")) {
                    p3.setText("apakah nafasnya cepat dan tidak wajar?");
                    posisi = "d4";
                }

                else if(posisi.equals("d4")) {
                        p3.setText("adakah cairan bening dari hidung,dan/atau apakah dia bersin?");
                        posisi = "d5";
                    }

else if(posisi.equals("d5")) {
                    p3.setText("adakah salah satu gejala berikut?" +
                            "1. mengantuk tidak wajar" +
                            "2. gelisah" +
                            "3. menangis menjerit atau tidak wajar" +
                            "4. bintik rata merah gelap yang tidak memudar dengan tekanan");
                    posisi = "d6";
                }


        else if(posisi.equals("d6")) {
                    p3.setText("apakah si anak sedang diare?");
                    posisi = "d7";
                }


        else if(posisi.equals("d7")) {
                    p3.setText("apakah si bayi baru saja diimunisasi?");
                    posisi = "d8";
                }



        else if(posisi.equals("d8")) {
                    p3.setText("apakah pakaiannya sangat tebal dan/atau apakah ia di lingkungan berhawa hangat?");
                    posisi = "d9";
                }


        else if(posisi.equals("d9")){
            String sourceString = "<b>" + "kemungkinan penyebab" + "</b> " + "PERIKSA KE DOKTER "  ;
            p3.setText(Html.fromHtml(sourceString));
            ya.startAnimation( animFadeOut );
            tdk.startAnimation( animFadeOut );
            ya.setVisibility(View.GONE);
            tdk.setVisibility(View.GONE);}
            }
        });
    }


}
