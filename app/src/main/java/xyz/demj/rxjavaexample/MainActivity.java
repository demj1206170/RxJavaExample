package xyz.demj.rxjavaexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import rx.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new View(this).setOnClickListener(View::getId);
        new View(this).setOnClickListener(View::getId);
    }
    private Observable<AppInfo> getApps(){

        return Observable.create(subscriber -> {


        });
    }
}
