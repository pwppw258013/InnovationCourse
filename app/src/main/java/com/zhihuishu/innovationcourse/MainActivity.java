package com.zhihuishu.innovationcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化一个Adapter
        TeacherAdapter teacherAdapter = new TeacherAdapter(this,R.layout.teacher_item,Teacher.getAllTeachers());

        //通过ID获取listView
        ListView listView = (ListView) findViewById(R.id.teacher_listView);

        //设置listView的Adapter
        listView.setAdapter(teacherAdapter);

    }
}
