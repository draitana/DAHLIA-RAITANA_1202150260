package android.example.dahlia.dahlia_1202150260_m1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    TextView Text1;
    TextView Text2;
    TextView Harga;
    TextView DaftarMakanan;
    TextView Jumlah;
    TextView PilihanMenu;
    TextView JmlPorsi;
    TextView TotalHarga;
    int Hargaeatbus = 50000;
    int Hargaabnormal = 30000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        Text1 = (TextView) findViewById(R.id.Text1);
        Text2 = (TextView) findViewById(R.id.Text2);
        Harga = (TextView) findViewById(R.id.Harga);
        DaftarMakanan = (TextView) findViewById(R.id.DaftarMakanan);
       Jumlah = (TextView) findViewById(R.id.Jumlah);
       PilihanMenu = (TextView) findViewById(R.id.PilihanMenu);
        JmlPorsi = (TextView) findViewById(R.id.JmlPorsi);
        TotalHarga = (TextView) findViewById(R.id.TotalHarga);



        String DaftarMakanan = Intent.getStringExtra ("DaftarMakanan");
        String JumlahPorsi = Intent.getStringExtra ("JumlahPorsi");
        int UangOsas = Intent.getIntExtra("UangOsas",0);
        int Jumlah = Intent.parseIntent(JumlahPorsi);


        DaftarMakanan.setDaftarMakanan(DaftarMakanan);
        JumlahPorsi.setJumlahPorsi(JumlahPorsi);

        int TotalAbnormal = Hargaabnormal*Jumlah;
        int TotalEatbus = Hargaeatbus*Jumlah;

        switch (Text2){
            case "Abnormal":
                Harga.setText(String.valueOf(TotalAbnormal));
                if (TotalAbnormal > UangOsas){
                    Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak akan cukup", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
                }
                break;
            case "Eatbus":
                Harga.setText(String.valueOf(TotalEatbus));
                if (TotalEatbus > UangOsas){
                    Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
                }
                break;
        }

    }
}
