package file.project.diagnosaanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diagnosaanak.R;


public class halamanutama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanutama);

        Button btn = (Button) findViewById(R.id.btn_loginadmin);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent il = new Intent(getApplicationContext(), login.class);
                        startActivity(il);
            }
        });
        Button btndp = (Button) findViewById(R.id.btn_halamandiagnosa);
        btndp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent il = new Intent(getApplicationContext(), halamanDiagnosa.class);
                startActivity(il);
            }
        });
    }
}