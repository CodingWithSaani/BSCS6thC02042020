package com.ekorydes.bscs6thc02042020;

import android.os.Parcel;
import android.os.Parcelable;

public class HumanClass implements Parcelable {

    private String humanName;

    public HumanClass() {
    }

    protected HumanClass(Parcel in) {
        humanName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(humanName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<HumanClass> CREATOR = new Creator<HumanClass>() {
        @Override
        public HumanClass createFromParcel(Parcel in) {
            return new HumanClass(in);
        }

        @Override
        public HumanClass[] newArray(int size) {
            return new HumanClass[size];
        }
    };

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }
}
