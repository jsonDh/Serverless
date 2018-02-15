package json.serverless.modules.login.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

import json.serverless.BaseFragment;
import json.serverless.JsonApplication;
import json.serverless.R;

/**
 * Created by jeiso on 14/2/2018.
 */

public class LogInFragment extends BaseFragment {

    private View rootView;
    private EditText email, password;
    private Button loginBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_login_layout, container, false);
        email = rootView.findViewById(R.id.email);
        password = rootView.findViewById(R.id.password);
        loginBtn = rootView.findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JsonApplication.getInstance().getFirebaseAuth()
                        .signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Toast.makeText(getActivity(), "User logged in correctly!", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        return rootView;
    }
}
