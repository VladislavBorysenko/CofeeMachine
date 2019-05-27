package com.example.cofeemachine;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etUserName;
    private EditText etPassword;
    private Button btLogin;

    private static final String UserName = "Admin";
    private static final String Password = "Admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
// login form
      //  EditText etUserName = (EditText) findViewById(R.id.etUsername);
        etUserName = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btLogin = (Button) findViewById(R.id.btnLogin);

    }

    public void ClickButton(View view) {
        String userName = etUserName.getText().toString();
        String password = etPassword.getText().toString();
        Intent loginintent = new Intent(LoginActivity.this, MainActivity.class);

        if (userName.equals("Admin")&&password.equals("Admin")) {
            startActivity(loginintent);

        }else {
            boolean logic =true;
            String message = (logic) ? "ERROR" : "Message";
            int length = (logic) ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(this, message, length);
            toast.show();
        }

       // LoginActivity.this.finish();
    }
}

