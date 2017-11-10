package com.example.mirsmeng.litepaldemo;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.mirsmeng.litepaldemo.table.Student;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

//集成litepal数据库框架 ：https://github.com/LitePalFramework/LitePal
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //生成数据库
        SQLiteDatabase db = Connector.getDatabase();
        Student s = new Student();
        s.setmName("乾坤");
        s.setmAge("24");
        s.save();

        Student student = DataSupport.find(Student.class, 1);
        Log.d(TAG, "onCreate: "+student);
    }
}
