package androidsample.com.chooseandseecourse;

import android.os.Parcel;
import android.os.Parcelable;

public class Course implements Parcelable {

    private int id;

    private String name;

    private String rating;


    public Course(int id, String name, String rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    protected Course(Parcel in) {
        id = in.readInt();
        name = in.readString();
        rating = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}

