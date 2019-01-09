package example.roni.com.myapplication;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import example.roni.com.myapplication.fragmentlist.FifthPage;
import example.roni.com.myapplication.fragmentlist.FirstPage;
import example.roni.com.myapplication.fragmentlist.FourthPage;
import example.roni.com.myapplication.fragmentlist.SecondPage;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    FrameLayout fragmentContainer;
    public static String setName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragmentContainer =findViewById(R.id.fragment_container);
        //firstPage
        setFragment( new FirstPage());
        //wait 5sec
        waitFunction(new SecondPage());


    }

    public void setFragment(Fragment fragment){

        FragmentTransaction fragmentTransaction = MainActivity.this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();


    }

    void waitFunction(final Fragment fragment){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setFragment(fragment);
            }
        }, 5000);
    }
    public void nexttask(Fragment fragment){
        waitFunction(fragment);
    }



}
