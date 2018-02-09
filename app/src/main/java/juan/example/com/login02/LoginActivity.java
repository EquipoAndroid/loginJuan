package juan.example.com.login02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */


    // UI references.

    private EditText mPasswordView, mUserName;
    private View mProgressView;
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        mUserName = (EditText) findViewById(R.id.txUserName);
        mPasswordView = (EditText) findViewById(R.id.txtPassword);



        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                /** attemptLogin(); **/
                String UserName= mUserName.getText().toString();
                String Pwd= mPasswordView.getText().toString();
                if(UserName.equalsIgnoreCase("juan") && Pwd.equals("star")){
                    Intent MainIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(MainIntent);
                    Toast.makeText(LoginActivity.this,"You are Sign in Successfully!" , Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this,"wrong buddy :( , intent again!" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
    }
}

