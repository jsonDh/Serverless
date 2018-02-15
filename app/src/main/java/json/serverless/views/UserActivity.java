package json.serverless.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import json.serverless.BaseActivity;
import json.serverless.R;

/**
 * Created by jeiso on 28/1/2018.
 */

public class UserActivity extends BaseActivity {

    private TextView userInfo;
    private Button logout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_user_layout);
        userInfo = (TextView)findViewById(R.id.userInfo);
        logout = (Button)findViewById(R.id.logout);
        userInfo.setText(firebaseAuth.getCurrentUser().getEmail());

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                launchActivity(LoginActivity.class);
            }
        });*/
    }
}
