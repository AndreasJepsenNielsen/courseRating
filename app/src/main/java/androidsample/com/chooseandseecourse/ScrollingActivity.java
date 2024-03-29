package androidsample.com.chooseandseecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {

    public static final String CLICKEDCOURSE = "";
    static final String TAG = "SCROLLINGACTIVITY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Log.d(TAG,"onCreate() called");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);





        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView8.getText()));
            }
        });

        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView7.getText()));
            }
        });

        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView6.getText()));
            }
        });

        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView5.getText()));
            }
        });

        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView4.getText()));
            }
        });

        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView3.getText()));
            }
        });

        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView2.getText()));
            }
        });

        final TextView textView = (TextView)findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, showSelectedCourseActivity.class).putExtra(CLICKEDCOURSE,textView.getText()));
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() called");

    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG,"onStop() called");

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d(TAG,"onDestroy() called");

    }



    @Override
    protected void onPause() {




        super.onPause();
        Log.d(TAG,"onPause() called");

    }

    @Override
    protected void onResume() {
        // Read the state of item position

        super.onResume();
        Log.d(TAG,"onResume() called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart() called");

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }


}
