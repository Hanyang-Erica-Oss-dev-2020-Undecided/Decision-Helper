package ossdev.undecided.decisionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_id, tv_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_id = findViewById(R.id.tv_id);
        tv_pass = findViewById(R.id.tv_pass);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");

        tv_id.setText(userID);
        tv_pass.setText(userPass);


        Button Ladder = (Button) findViewById(R.id.Ladder);
        Ladder.setOnClickListener(new View.OnClickListener(){
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
