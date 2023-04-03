package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ButtonsActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        Button button1 = findViewById(R.id.Button1);
        Button button2 = findViewById(R.id.Button2);
        Button button3 = findViewById(R.id.Button3);
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        String msg;
        int buttonId = view.getId();
        switch (buttonId) {
            case R.id.Button1: msg = "첫 번째 버튼이 클릭 되었습니다."; break;
            case R.id.Button2: msg = "두 번째 버튼이 클릭 되었습니다."; break;
            case R.id.Button3: msg = "세 번째 버튼이 클릭 되었습니다."; break;
            case R.id.imageButton1: msg = "첫 번째 버튼이 클릭 되었습니다."; break;
            case R.id.imageButton2: msg = "두 번째 버튼이 클릭 되었습니다."; break;
            case R.id.imageButton3: msg = "세 번째 버튼이 클릭 되었습니다."; break;
            case R.id.imageButton4: msg = "네 번째 버튼이 클릭 되었습니다."; break;
            default: msg = "알 수 없는 버튼이 클릭 되었습니다."; break;
        }
        Toast.makeText(ButtonsActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}