package android.example.dahlia.dahlia_1202150260_m1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Judul;
    TextView Judul2;
    EditText Menu;
    EditText Porsi;
    Button btn_eatbus;
    Button btn_abnormal;
    int UangOsas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Judul = (TextView) findViewById(R.id.Judul);
        Judul2 = (TextView) findViewById(R.id.Judul2);
        Menu = (EditText) findViewById(R.id.Menu);
        Porsi = (EditText) findViewById(R.id.Porsi);
        btn_abnormal = (Button) findViewById(R.id.btn_abnormal);
        btn_eatbus = (Button) findViewById(R.id.btn_eatbus);
    }

    public String getMenu() {
        return Menu.getText().toString();
    }
    public String getPorsi() {
        return Porsi.getText().toString();
    }
    public int getUangOsas() {
        return UangOsas.getText();
    }

    public void btn_eatboss (View view) {
        Intent btn_eatbus  = new Intent(this, Activity2);
        btn_eatbus.putExtra("Judul2","Eatbus");
        btn_eatbus.putExtra("Menu",getMenu());
        btn_eatbus.putExtra("Porsi",getPorsi());
        btn_eatbus.putExtra("UangOsas",getUangOsas());

        startActivity(btn_eatbus);
    }
    public void btn_abnormal (View view) {
        Intent btn_abnormal  = new Intent(this, activity_main2);
        btn_abnormal.putExtra("Judul2","Abnormal");
        btn_abnormal.putExtra("Menu",getMenu());
        btn_abnormal.putExtra("Porsi",getPorsi());
        btn_abnormal.putExtra("UangOsas",getUangOsas());

        startActivity(btn_abnormal);
    }

}
