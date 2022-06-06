package com.example.ahmed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// test 2
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void m2(View view) {
        Intent intent = new Intent(Login.this, Home.class);
        startActivity(intent);
    }

    public void create(View view) {
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);
    }
}
//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//       xmlns:tools="http://schemas.android.com/tools"
//     android:layout_width="match_parent"
//   android:layout_height="match_parent"
//     android:background="@color/purple_custom"
//     android:orientation="vertical"
//     tools:context=".Login">
//
//<ImageView
//      android:layout_width="300dp"
//            android:layout_height="110dp"
//          android:layout_gravity="center_horizontal"
//        android:layout_marginTop="70dp"
//      android:src="@drawable/login_logo" />
//
//<LinearLayout
//      android:layout_width="wrap_content"
//            android:layout_height="wrap_content"
//          android:layout_gravity="center_horizontal"
//        android:layout_marginTop="80dp"
//      android:orientation="horizontal">
//
//<TextView
//          android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//              android:text="Email : "
//            android:textColor="#FFFFFF"
//          android:textSize="26dp" />
//
//<EditText
//          style="@android:style/Widget.Material.EditText"
//                android:layout_width="260dp"
//              android:layout_height="wrap_content"
//            android:background="@drawable/custom_white_bg"
//          android:hint="- Email Adress -"
//        android:inputType="textEmailAddress"
//      android:paddingLeft="15dp"
//    android:paddingTop="8dp"
//                    android:paddingBottom="8dp"
//                  android:textColor="#000000"
//                android:textSize="18dp" />
//
//</LinearLayout>
//
//<LinearLayout
//      android:layout_width="wrap_content"
//            android:layout_height="wrap_content"
//          android:layout_gravity="center_horizontal"
//        android:layout_marginTop="5dp"
//      android:orientation="horizontal">
//
//<TextView
//          android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//              android:layout_marginLeft="5dp"
//            android:text="Pass : "
//          android:textColor="#FFFFFF"
//        android:textSize="26dp" />
//
//<EditText
//          android:layout_width="260dp"
//                android:layout_height="wrap_content"
//              android:background="@drawable/custom_white_bg"
//            android:hint="- Password -"
//          android:inputType="numberPassword"
//        android:paddingLeft="15dp"
//      android:paddingTop="8dp"
//    android:paddingBottom="8dp"
//  android:textColor="#000000"
//android:textSize="18dp" />
//
//</LinearLayout>
//
//<LinearLayout
//      android:layout_width="match_parent"
//            android:layout_height="wrap_content"
//          android:layout_marginTop="75dp"
//        android:gravity="center">
//
//<Button
//          style="@android:style/Widget.Material.Light.Button"
//                android:layout_width="wrap_content"
//              android:layout_height="wrap_content"
//            android:layout_gravity="center_horizontal"
//          android:layout_marginLeft="75dp"
//        android:background="@drawable/custom_orang_bg"
//      android:fontFamily="sans-serif-light"
//    android:onClick="create"
//  android:paddingLeft="30dp"
//android:paddingTop="12dp"
//                   android:paddingRight="30dp"
//                 android:paddingBottom="12dp"
//               android:text="Sign Up"
//             android:textColor="#FFFFFF"
//           android:textSize="18dp" />
//
//<Button
//          style="@android:style/Widget.Material.Light.Button"
//                android:layout_width="wrap_content"
//              android:layout_height="wrap_content"
//            android:layout_gravity="center_horizontal"
//          android:layout_marginLeft="7dp"
//        android:background="@drawable/custom_yelow_bg"
//      android:fontFamily="sans-serif-light"
//    android:onClick="m2"
//  android:paddingLeft="30dp"
//android:paddingTop="12dp"
//                    android:paddingRight="30dp"
//                  android:paddingBottom="12dp"
//                android:text="Login"
//              android:textColor="#FFFFFF"
//            android:textSize="18dp" />
//
//
//</LinearLayout>
//
//
//</LinearLayout>