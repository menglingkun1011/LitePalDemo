package com.example.mirsmeng.litepaldemo.table;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

import static android.R.attr.name;

/**
 * Created by MirsMeng on 2017/11/10.
 */

public class Student extends DataSupport {

    @Column(unique = true,nullable = false)
    private int mId;
    @Column(nullable = false)
    private String mName;
    @Column(nullable = false)
    private String mAge;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    public int getmId() {

        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mAge='" + mAge + '\'' +
                '}';
    }
}
