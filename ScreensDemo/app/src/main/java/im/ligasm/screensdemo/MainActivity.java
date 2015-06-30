package im.ligasm.screensdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;


public class MainActivity extends ActionBarActivity implements LoginListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate screenlet
        LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login_screenlet);
        loginScreenlet.setListener(this);
    }


    @Override
    public void onLoginSuccess(User user) {
        TextView t=(TextView)findViewById(R.id.textView);
        t.setText("Logged in as: " + user.getId());
    }

    @Override
    public void onLoginFailure(Exception e) {
        TextView t=(TextView)findViewById(R.id.textView);
        t.setText("Login unsuccessful: " + e.getMessage());
    }
}
