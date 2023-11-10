CSCI4320 IOT Group Project

Hi everyone,
This is the android studio version of the java code.
I am currently converting the java code to work with functions of android.

**How to add files to Android Studio**
```
1. Save the files in this current branch (Allen-Nguyen-AndroidStudio) into one of your folders
2. Open Android Studio and open a new project and pick that new folder from above
```


**Android Studio use app**
```
You don't need to download an APK, you just need to run the emulator and press play
Settings -> Live Edit -> Push Edits Automatically = Live edits 
```

**Device to use**
```
Device: Pixel 7 pro
OS: Android 7 
```

**How to add new pages**
manifests file -> AndroidManifest.xml
   Go to the end of activity
        </activity>

        <!-- Add more pages here-->
        <activity android:name=".MainIOTPage"></activity> //Change .MainIOTPage to .YourPageName
        
--New java file: MainIOTPage.java
   java -> yourpackagename -> new -> java
   ```java
package com.example.csci4320proj;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainIOTPage extends AppCompatActivity { //change MainIOTPage to yourfilename
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_iot_page); // Set the layout for this activity, and main_iot_page is what you change
        // Additional setup for the new activity
    }
}
```
**Layout folder -> New layout resource file -> It can be anything, for me, it is main_iot_page**
   Note: do not capitalize file names because it will not show 
   This is just the default layout
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</androidx.constraintlayout.widget.ConstraintLayout>
```

**To make icons, buttons, switches, etc in the layouts folder not be on the top left even if you already dragged them.**
XML:
To make sure the buttons are in the correct positions:
```xml
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
```
**Example Skeleton of a button**
```java
  public void onClickButton(View view) {
    //Enter code here
  }
```

**How to make feedback messages**
```java
        Toast.makeText(this, "Feedback Here", Toast.LENGTH_SHORT).show();
```

**Higher level example of button**
```java
public class MainActivity extends AppCompatActivity { //Always extend an activity to AppCompatActivity

    //Constructors for button and the input
    private Button loginButton;
    private EditText passwordEditText;
    private EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); //Instance of the app (Which page it is on)
        setContentView(R.layout.activity_main); //Display which page

        // Initialize the login button, username, and password EditText
        //In the xml file, it is android:id="@+id/buttonLogin" and the same button for the listener
        loginButton = findViewById(R.id.buttonLogin);
        usernameEditText = findViewById(R.id.editTextUsername); //find id in XML file
        passwordEditText = findViewById(R.id.editTextPassword); //find id in XML file

        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() { //Waits for user to tap on button
            //What happens once the button is clicked
            @Override
            public void onClick(View view) {
              //Implement code here
            }
```

**The XML file of that button above**
```xml
    <Button
        android:id="@+id/buttonLogin" //This is the id of the button 
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|start"
        android:layout_margin="20dp"
        android:text="Login" //Edit the text of the button here
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.473"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.584" />
    <EditText
        android:id="@+id/editTextUsername" //This is the id of the text
        android:layout_width="104dp"
        android:layout_height="49dp"
        android:layout_margin="20dp"
        android:hint="Username" //Edit what the line says
        android:inputType="text" 
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.475"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.46" />
    <EditText
        android:id="@+id/editTextPassword" //This is the id of the text
        android:layout_width="105dp"
        android:layout_height="46dp"
        android:layout_gravity="center_vertical"
        android:layout_margin="20dp"
        android:hint="Password" //Edit what the line says
        android:inputType="textPassword"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.477"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.518" />
```

**Skeleton example of the login button working**

```java
package com.example.csci4320proj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText passwordEditText;
    private EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the login button, username, and password EditText
        //In the xml file, it is android:id="@+id/buttonLogin" and the same button for the listener
        loginButton = findViewById(R.id.buttonLogin);
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);

        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            //What happens when the button is clicked
            @Override
            public void onClick(View view) {
                String validPassword = "pass";
                String enteredPassword = passwordEditText.getText().toString();

                String validUsername = "user";
                String enteredUsername = usernameEditText.getText().toString();

                if (enteredPassword.equals(validPassword) && enteredUsername.equals(validUsername)) {
                    // If password and username are correct, navigate to the next java file
                    Intent intent = new Intent(MainActivity.this, MainIOTPage.class);
                    startActivity(intent); //Go to next page
                } else {
                    // If password or username is incorrect, show an error message
                    //Object toast is the feedback message
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
```

**onClick important notes**
```
Make sure that you have the }); at the end of onClick methods because it will have an error if you do not
```
``java
            public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Register.class);
                        //Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
            }

        });
```