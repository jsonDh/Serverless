package json.serverless.views;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

import json.serverless.BaseActivity;
import json.serverless.JsonApplication;
import json.serverless.R;

public class RegisterActivity extends BaseActivity {

    private EditText email, password;
    private Button register;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (firebaseAuth.getCurrentUser() != null) {
            launchActivity(UserActivity.class);
        } else {
            setContentView(R.layout.activity_register_layout);
            email = (EditText) findViewById(R.id.email);
            password = (EditText) findViewById(R.id.password);
            register = (Button) findViewById(R.id.register);

            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String user = email.getText().toString();
                    String pass = password.getText().toString();
                    firebaseAuth
                            .createUserWithEmailAndPassword(user, pass)
                            .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    Toast.makeText(getApplicationContext(), "User registered correctly!", Toast.LENGTH_SHORT).show();
                                    launchActivity(UserActivity.class);
                                }
                            });
                }
            });
        }*/
    }

}
