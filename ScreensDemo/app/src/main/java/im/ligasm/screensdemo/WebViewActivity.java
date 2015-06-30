package im.ligasm.screensdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.liferay.mobile.screens.webcontentdisplay.WebContentDisplayScreenlet;

/**
 * Created by ligasm on 6/30/15.
 */
public class WebViewActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.web_view);

    }
}
