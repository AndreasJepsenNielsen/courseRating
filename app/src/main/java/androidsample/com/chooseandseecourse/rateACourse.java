package androidsample.com.chooseandseecourse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class rateACourse extends AppCompatActivity {
    TextView seekBar1Progress;
    TextView seekBar2Progress;
    TextView seekBar3Progress;
    TextView seekBar4Progress;
    TextView seekBar5Progress;
    TextView seekBar6Progress;
    TextView seekBar7Progress;
    TextView seekBar8Progress;
    TextView courseName;
    Course course;


    static final String TAG = "RATEACOURSE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_acourse);
        Log.d(TAG,"onCreate() called");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(null);


        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        course = (Course) data.getParcelable("current");




        courseName = findViewById(R.id.textView30);
        try {
            courseName.setText("Course: " + course.getName());
        }catch (RuntimeException RTE){

        }



        SeekBar seekBar1 = (SeekBar)findViewById(R.id.seekBar);
        seekBar1.setOnSeekBarChangeListener(seekBar1ChangeListener);
        seekBar1Progress = (TextView)findViewById(R.id.textView9);
        seekBar1Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar2 = (SeekBar)findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(seekBar2ChangeListener);
        seekBar2Progress = (TextView)findViewById(R.id.textView21);
        seekBar2Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar3 = (SeekBar)findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(seekBar3ChangeListener);
        seekBar3Progress = (TextView)findViewById(R.id.textView22);
        seekBar3Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar4 = (SeekBar)findViewById(R.id.seekBar4);
        seekBar4.setOnSeekBarChangeListener(seekBar4ChangeListener);
        seekBar4Progress = (TextView)findViewById(R.id.textView23);
        seekBar4Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar5 = (SeekBar)findViewById(R.id.seekBar5);
        seekBar5.setOnSeekBarChangeListener(seekBar5ChangeListener);
        seekBar5Progress = (TextView)findViewById(R.id.textView24);
        seekBar5Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar6 = (SeekBar)findViewById(R.id.seekBar6);
        seekBar6.setOnSeekBarChangeListener(seekBar6ChangeListener);
        seekBar6Progress = (TextView)findViewById(R.id.textView25);
        seekBar6Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar7 = (SeekBar)findViewById(R.id.seekBar7);
        seekBar7.setOnSeekBarChangeListener(seekBar7ChangeListener);
        seekBar7Progress = (TextView)findViewById(R.id.textView26);
        seekBar7Progress.setText(getResources().getString(R.string.fifty));

        SeekBar seekBar8 = (SeekBar)findViewById(R.id.seekBar8);
        seekBar8.setOnSeekBarChangeListener(seekBar8ChangeListener);
        seekBar8Progress = (TextView)findViewById(R.id.textView20);
        seekBar8Progress.setText(getResources().getString(R.string.fifty));

    }

    SeekBar.OnSeekBarChangeListener seekBar1ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar1Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar2ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar2Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar3ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar3Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar4ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar4Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar5ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar5Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar6ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar6Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar7ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar7Progress.setText((Integer.toString(progress)));
            setTotal();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    SeekBar.OnSeekBarChangeListener seekBar8ChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


            seekBar8Progress.setText((Integer.toString(progress)));
            setTotal();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };


    public void setTotal(){
        int rating = getRating();

        TextView total = (TextView)findViewById(R.id.textView27);

        total.setText("Total: " + rating);
    }

    public void rateCourse(View v){
        Intent data = new Intent();

        int rating = Integer.parseInt(seekBar1Progress.getText().toString()) + Integer.parseInt(seekBar2Progress.getText().toString()) +
                Integer.parseInt(seekBar3Progress.getText().toString()) +Integer.parseInt(seekBar4Progress.getText().toString()) +
                Integer.parseInt(seekBar5Progress.getText().toString()) +Integer.parseInt(seekBar6Progress.getText().toString()) +
                Integer.parseInt(seekBar7Progress.getText().toString()) +Integer.parseInt(seekBar8Progress.getText().toString());

        data.putExtra("Rating",Integer.toString(rating));
        data.putExtra("Name", courseName.getText().toString());

        setResult(RESULT_OK,data);
        sendEmail();
        finish();
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

    public int getRating(){
       return (Integer.parseInt(seekBar1Progress.getText().toString()) + Integer.parseInt(seekBar2Progress.getText().toString()) +
                Integer.parseInt(seekBar3Progress.getText().toString()) +Integer.parseInt(seekBar4Progress.getText().toString()) +
                Integer.parseInt(seekBar5Progress.getText().toString()) +Integer.parseInt(seekBar6Progress.getText().toString()) +
                Integer.parseInt(seekBar7Progress.getText().toString()) +Integer.parseInt(seekBar8Progress.getText().toString())) / 8;
    }


    public void sendEmail() {








        String[] TO = {"andr921c@stud.kea.dk"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "I rated your course");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Your course was given a rating of: "
                + "\nSubject Relevance: " + seekBar1Progress.getText().toString()
                + "\nTeacher Overall Perfomance: " + seekBar2Progress.getText().toString()
                + "\nTeacher Preparation: " + seekBar3Progress.getText().toString()
                + "\nAmount Of Feedback: "+ seekBar4Progress.getText().toString()
                + "\nQuality Of Examples; " + seekBar5Progress.getText().toString()
                + "\nJob Opportunities: " + seekBar6Progress.getText().toString()
                + "\nTeacher Expertise: " + seekBar7Progress.getText().toString()
                + "\nExam Difficulty: " + seekBar8Progress.getText().toString()
                +"\n\n Total score of: " + Integer.toString(getRating()));

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            Log.i(TAG,"Mail send");
            finish();
        }catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
