package ossdev.undecided.decisionhelper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    private EditText et_id, et_pass;
    private Button btn_login, btn_register;

    String tag = "에러찾기";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_id = findViewById(R.id.et_id);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText 에 현재 입력되어있는 값을 가져온
                String userID = et_id.getText().toString();
                String userPass = et_pass.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            Log.v(tag,"여기는 왔냐?");
                            JSONObject jsonObject = new JSONObject(response);
                            Log.v("결과", String.valueOf(jsonObject));
                            boolean success = jsonObject.getBoolean("success");
                            Log.v("결과", String.valueOf(success));
                            if(success){
                                String userID = jsonObject.getString( "userID" );
                                String userPass = jsonObject.getString( "userPassword" );
                                String userName = jsonObject.getString( "userName" );
                                String userAge = jsonObject.getString( "userAge" );

                                Toast.makeText( getApplicationContext(), "로그인 성공", Toast.LENGTH_SHORT ).show();
                                Intent intent = new Intent( LoginActivity.this, MainActivity.class );

                                intent.putExtra( "userID", userID );
                                intent.putExtra( "userPass", userPass );
                                intent.putExtra( "userName", userName );
                                intent.putExtra( "userAge", userAge );

                                startActivity( intent );
                            } else{
                                Log.v(tag,"뜨지마라뜨지마라뜨지마라");
                                Toast.makeText(getApplicationContext(),"로그인에 실패하셨습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                LoginRequest loginRequest = new LoginRequest(userID, userPass,responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });
    }
}
