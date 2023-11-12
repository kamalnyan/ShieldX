package com.example.shieldx;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class operation extends AppCompatActivity {

    private long pressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        String[] ab={"kamal","nayan","singh"};
        EditText input = findViewById(R.id.input);
        Button check = findViewById(R.id.check);
        TextView text = findViewById(R.id.txt);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x =input.getEditableText().toString();
                for (int i = 0; i < ab.length; i++) {
                    if (x.equals(ab[i]))
                    {
                        text.setText("Transaction Successful ");
                        break;
                    }
                    else {
                       text.setText(" Wrong Transaction");
                    }
                }
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}