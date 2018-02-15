package json.serverless.modules.login.activities;

import android.os.Bundle;

import json.serverless.BaseActivity;
import json.serverless.R;
import json.serverless.modules.login.fragments.LogInFragment;

/**
 * Created by jeiso on 14/2/2018.
 */

public class LogInRegActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginreg_layout);
        replaceFragment(R.id.fragment_loginreg, new LogInFragment());
    }
}
