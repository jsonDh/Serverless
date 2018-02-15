package json.serverless;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by jeiso on 14/2/2018.
 */

public class JsonApplication extends Application {

    private static JsonApplication instance;
    private FirebaseAuth firebaseAuth;

    @Override
    public void onCreate() {
        super.onCreate();
        firebaseAuth = FirebaseAuth.getInstance();
        instance = this;
    }

    public static JsonApplication getInstance() {
        return instance;
    }

    public FirebaseAuth getFirebaseAuth() {
        return firebaseAuth;
    }
}
