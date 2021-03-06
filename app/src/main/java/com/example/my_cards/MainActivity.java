package com.example.my_cards;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Setting:
                Toast.makeText(this,"你点击了设置（设置未完成）",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.More:
                Toast.makeText(this,"了解更多",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://47.102.139.96/"));
                startActivity(intent);
                break;
            case  R.id.Exit:
                Toast.makeText(this,"退出",Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "你已经单抽", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 =findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你已经十连",Toast.LENGTH_SHORT).show();
                TextView textView1 = findViewById(R.id.textView);
                textView1.setText("十连");
            }
        });





    }
}
