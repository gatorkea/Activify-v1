package activfy.activfy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BrainOnPorn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_on_porn);
        WebView myWebView = (WebView) findViewById(R.id.activity_brain_on_porn);
        myWebView.loadUrl("http://www.yourbrainonporn.com");
    }
}
