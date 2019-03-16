package androidsample.com.chooseandseecourse;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class showSelectedCourseActivity extends AppCompatActivity {


    static final String TAG = "SELECTEDCOURSEACTIVITY";
    ArrayList<Course> courses = new ArrayList<>();
    TextView textView;
    TextView textView1;
    static String COURSENAME = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_selected_course);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);



        courses.add(0, new Course(1,getResources().getString(R.string.software_construction),""));
        courses.add(1, new Course(2,getResources().getString(R.string.software_design),""));
        courses.add(2, new Course(3,getResources().getString(R.string.technology),""));
        courses.add(3, new Course(4,getResources().getString(R.string.it_in_organisation),""));
        courses.add(4, new Course(5,getResources().getString(R.string.angular),""));
        courses.add(5, new Course(6,getResources().getString(R.string.python),""));
        courses.add(6, new Course(7,getResources().getString(R.string.c_net),""));
        courses.add(7, new Course(8,getResources().getString(R.string.android_app),""));


        getSharedPreferences();





        Intent intent = getIntent();
        String courseName = intent.getStringExtra(ScrollingActivity.CLICKEDCOURSE);


        textView = (TextView)findViewById(R.id.textView13);
        COURSENAME = courseName;
        textView.setText(courseName);
        textView1 = (TextView)findViewById(R.id.textView14);
    try {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getName().equals(COURSENAME)) {

                textView1.setText(courses.get(i).getRating());
            }
        }
    }catch (RuntimeException rte){

    }
        Log.d(TAG,"onCreate() called");


    }

    public void getSharedPreferences(){
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        String tempRating0 = sharedPref.getString("0", "not yet rated");
        String tempRating1 = sharedPref.getString("1", "not yet rated");
        String tempRating2 = sharedPref.getString("2", "not yet rated");
        String tempRating3 = sharedPref.getString("3", "not yet rated");
        String tempRating4 = sharedPref.getString("4", "not yet rated");
        String tempRating5 = sharedPref.getString("5", "not yet rated");
        String tempRating6 = sharedPref.getString("6", "not yet rated");
        String tempRating7 = sharedPref.getString("7", "not yet rated");

        courses.get(0).setRating(tempRating0);
        courses.get(1).setRating(tempRating1);
        courses.get(2).setRating(tempRating2);
        courses.get(3).setRating(tempRating3);
        courses.get(4).setRating(tempRating4);
        courses.get(5).setRating(tempRating5);
        courses.get(6).setRating(tempRating6);
        courses.get(7).setRating(tempRating7);
    }

    public void createSharedPreferences(){
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPref.edit();


        Course tempCourse0 = courses.get(0);
        Course tempCourse1 = courses.get(1);
        Course tempCourse2 = courses.get(2);
        Course tempCourse3 = courses.get(3);
        Course tempCourse4 = courses.get(4);
        Course tempCourse5 = courses.get(5);
        Course tempCourse6 = courses.get(6);
        Course tempCourse7 = courses.get(7);

        editor.putString("0",tempCourse0.getRating());
        editor.putString("1",tempCourse1.getRating());
        editor.putString("2",tempCourse2.getRating());
        editor.putString("3",tempCourse3.getRating());
        editor.putString("4",tempCourse4.getRating());
        editor.putString("5",tempCourse5.getRating());
        editor.putString("6",tempCourse6.getRating());
        editor.putString("7",tempCourse7.getRating());


        editor.commit();
    }

    @Override
    public void onBackPressed(){
        Intent home = new Intent(getApplicationContext(),ScrollingActivity.class);
        startActivity(home);
    }




    @Override
    protected void onSaveInstanceState(final Bundle outState) {

        outState.putString("name", COURSENAME);
        outState.putString("rating", textView1.getText().toString());

        createSharedPreferences();

        super.onSaveInstanceState(outState);

        // Save the state of item position
        Log.d(TAG,"onSaveInstanceState() called");


    }



    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {

        textView.setText(Objects.requireNonNull(savedInstanceState.get("name")).toString());
        textView1.setText(Objects.requireNonNull(savedInstanceState.get("rating")).toString());


        getSharedPreferences();

        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState() called");




    }

    public void RateThisCourse(View v){
        Intent intent = new Intent(showSelectedCourseActivity.this.getApplicationContext(), rateACourse.class);
        Course currentCourse = new Course(20,"","");
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getName().equals(COURSENAME)) {

                currentCourse = courses.get(i);
            }
        }
        intent.putExtra("current", currentCourse);

        startActivityForResult(intent, 2404);
    }

    @Override
    protected void onActivityResult(int requestCode ,int resultCode, Intent data){
        if(resultCode == RESULT_OK && requestCode == 2404){
            if(data.hasExtra("Rating")){
                textView1 = (TextView)findViewById(R.id.textView14);
                String rating = data.getExtras().getString("Rating");
                String name = data.getExtras().getString("Name");




                textView1.setText(CalculateScore(rating));

                for (int i = 0; i < courses.size() ; i++) {
                    if(courses.get(i).getName().equals(name)){
                        courses.get(i).setRating(CalculateScore(rating));
                    }
                }

                createSharedPreferences();


            }
        }
    }



    public String CalculateScore(String rating){
        int rateInt = Integer.parseInt(rating) / 8;
        String ratingToReturn = "";

        if(rateInt <= 50){
            ratingToReturn = "F";
        }else if(rateInt > 50 && rateInt < 60){
            ratingToReturn = "E";
        }else if(rateInt > 60 && rateInt < 70){
            ratingToReturn = "D";
        }else if(rateInt > 70 && rateInt < 80){
            ratingToReturn = "C";
        }else if(rateInt > 80 && rateInt < 90){
            ratingToReturn = "B";
        }else if(rateInt > 90 && rateInt < 95){
            ratingToReturn = "A";

        }else if(rateInt > 95){
            ratingToReturn = "A+";
        }

        return ratingToReturn;
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
        getSharedPreferences();

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
        getSharedPreferences();

        super.onResume();
        Log.d(TAG,"onResume() called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart() called");

    }

}
