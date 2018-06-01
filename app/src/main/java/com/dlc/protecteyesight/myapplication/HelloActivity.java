package com.dlc.protecteyesight.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * app 启动欢迎页面
 */
public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Handler myHandler = new Handler();
        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toActivity();
            }
        },3000);
    }

    /**
     * 根据缓存中的配置文件，选择跳转页面
     */
    private void toActivity(){
        boolean hasLastReadHistory =  false;
        Intent intent = new Intent();
        //如果有历史记录，跳转到历史记录阅读页面和阅读位置
        if(hasLastReadHistory){
            int bookId =  0;//id
            String bookName =  "";
            int readChapter = 0;
            int readPage = 0;
            intent.putExtra("bookId",bookId);
        }else{
            //跳转到书架页面
            intent.setClass(this,MainActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
