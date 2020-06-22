package ossdev.undecided.decisionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
