package ossdev.undecided.decisionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_name, tv_mention;
    private Button btn_ladder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name = findViewById(R.id.tv_name);
        tv_mention = findViewById(R.id.tv_mention);
        btn_ladder = findViewById(R.id.btn_ladder);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");


        tv_name.setText("Welcome " + userName);
        tv_mention.setText("We will help your decision by ladder game");
        btn_ladder.setText("Start Ladder Game");


        btn_ladder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Ladder_activity();
            }
        });
    }

    public void Ladder_activity(){
        Intent intent = new Intent(this, LadderGameMain.class);
        startActivity(intent);
    }
}
