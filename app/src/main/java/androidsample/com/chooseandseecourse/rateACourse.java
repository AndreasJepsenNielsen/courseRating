package androidsample.com.chooseandseecourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class rateACourse extends AppCompatActivity {
    TextView seekBar1Progress;
    TextView seekBar2Progress;
    TextView seekBar3Progress;
    TextView seekBar4Progress;
    TextView seekBar5Progress;
    TextView seekBar6Progress;
    TextView seekBar7Progress;
    TextView seekBar8Progress;

    String courseName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_acourse);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        courseName = intent.getStringExtra(showSelectedCourseActivity.COURSENAME);



        SeekBar seekBar1 = (SeekBar)findViewById(R.id.seekBar);
        seekBar1.setOnSeekBarChangeListener(seekBar1ChangeListener);
        seekBar1Progress = (TextView)findViewById(R.id.textView9);
        seekBar1Progress.setText("1");

        SeekBar seekBar2 = (SeekBar)findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(seekBar2ChangeListener);
        seekBar2Progress = (TextView)findViewById(R.id.textView21);
        seekBar2Progress.setText("1");

        SeekBar seekBar3 = (SeekBar)findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(seekBar3ChangeListener);
        seekBar3Progress = (TextView)findViewById(R.id.textView22);
        seekBar3Progress.setText("1");

        SeekBar seekBar4 = (SeekBar)findViewById(R.id.seekBar4);
        seekBar4.setOnSeekBarChangeListener(seekBar4ChangeListener);
        seekBar4Progress = (TextView)findViewById(R.id.textView23);
        seekBar4Progress.setText("1");

        SeekBar seekBar5 = (SeekBar)findViewById(R.id.seekBar5);
        seekBar5.setOnSeekBarChangeListener(seekBar5ChangeListener);
        seekBar5Progress = (TextView)findViewById(R.id.textView24);
        seekBar5Progress.setText("1");

        SeekBar seekBar6 = (SeekBar)findViewById(R.id.seekBar6);
        seekBar6.setOnSeekBarChangeListener(seekBar6ChangeListener);
        seekBar6Progress = (TextView)findViewById(R.id.textView25);
        seekBar6Progress.setText("1");

        SeekBar seekBar7 = (SeekBar)findViewById(R.id.seekBar7);
        seekBar7.setOnSeekBarChangeListener(seekBar7ChangeListener);
        seekBar7Progress = (TextView)findViewById(R.id.textView26);
        seekBar7Progress.setText("1");

        SeekBar seekBar8 = (SeekBar)findViewById(R.id.seekBar8);
        seekBar8.setOnSeekBarChangeListener(seekBar8ChangeListener);
        seekBar8Progress = (TextView)findViewById(R.id.textView20);
        seekBar8Progress.setText("1");

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
        int rating = (Integer.parseInt(seekBar1Progress.getText().toString()) + Integer.parseInt(seekBar2Progress.getText().toString()) +
                Integer.parseInt(seekBar3Progress.getText().toString()) +Integer.parseInt(seekBar4Progress.getText().toString()) +
                Integer.parseInt(seekBar5Progress.getText().toString()) +Integer.parseInt(seekBar6Progress.getText().toString()) +
                Integer.parseInt(seekBar7Progress.getText().toString()) +Integer.parseInt(seekBar8Progress.getText().toString())) / 8;

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
        data.putExtra("Name", courseName);

        setResult(RESULT_OK,data);
        finish();
    }
}