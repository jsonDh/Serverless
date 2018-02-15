package json.serverless;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by jeiso on 14/2/2018.
 */

public class BaseFragment extends Fragment {

    public FirebaseAuth firebaseAuth;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();
    }
}
