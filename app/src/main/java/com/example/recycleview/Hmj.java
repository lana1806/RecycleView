package com.example.recycleview;

import android.os.Parcel;
import android.os.Parcelable;

public class Hmj implements Parcelable{
    private String name;
    private String description;
    private String photo;

    public String getName(){

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription(){

        return description ;
    }

    public void setDescription(String description) {

        this.description = description;
    }
{

    }
    public String getPhoto(){

        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public int describeContents() {
        return 0;
    }
    public void writeToParcel(Parcel dest,int flags){
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.photo);
    }

    public static final Parcelable.Creator<Hmj>CREATOR=new Parcelable.Creator<Hmj>() {
        @Override
        public Hmj createFromParcel(Parcel source) {
            return new Hmj();
        }

        @Override
        public Hmj[] newArray(int size) {
            return new Hmj[size];
        }
    };
}
