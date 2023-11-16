CSCI4320 IOT Group Project

Hi everyone,
This is the android studio version of the java code.
This is the conversion of the java code we made to the functions/visuals of android.

```
Brainstorm Idea: 
~~Client Side: Register -> Login -> Add/Edit/Delete/View IOTs -> Enter IOT -> Configure IOT
Developer Side: Register -> Input database -> Login -> Validate from database 
-> Check database for IOTs where each use has seperate ones -> Add/Edit/Delete/View IOTs ->
Configure IOT -> Save settings to database~~
-Database idea scrapped because of time.
-Seperate IOTs and multiple IOTs per user was also scrapped because of time.
``` 

**Current Progress**
```
v1 updates: Finished
Login and register buttons working. MainIOT page currently has no functions.
```
```
v2 updates: Finished
MainIOT Page has some buttons working and functioning. 
Add/new/delete buttons work and their functions too.
Has been tested for no errors.
```
```
v3 updates: Finished
Functional list IOTs button and to its pages, exit button was not implemented
because we have a back button on the androids already.
Also fixed the register system so user cannot enter only username or only password.
```
```
v4 updates: Finished
Added a back page and back buttons to each page except the Login page.
```
```
v5 updates: Finished
Camera button functional with the IOT
Moved back button to top left of list iot page
Camera IOT can record and playback videos
Camera IOT can also switch between camera 1 and 2
Camera IOT now has two images
```
```
v6 updates and beyond: 
Main Goal: 
Each member has their own functional IOT page (1/4 Completed)


Sub Goals:
Enable/disable switches does something for notifications/IOTs
~~Database implementation for user/pass?~~
List IOTs either has a drag drop down or cards
Enter IOT button and make it functional
Finish Each member's IOT page
Fix coding style and remove extra copies/templates for next pages/classes
~~Each user has their own IOTs and stored array lists to list the IOTs~~
```

** How to run the .apk file**
```
Note: You need the ALL of the files from this android studio branch for the .apk to work on nox player.
To reach the .apk file: YourCurrentPath\app\build\outputs\apk\debug 
Now you should be able to drag that .apk file into nox player and run it. 
Remember to rotate your screen on nox player.
```

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
```xml
manifests file -> AndroidManifest.xml
   Go to the end of activity
        </activity>

        <!-- Add more pages here-->
        <activity android:name=".MainIOTPage"></activity> //Change .MainIOTPage to .YourPageName
```		
Create a new java file: MainIOTPage.java
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
```java
            public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Register.class);
                        //Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
            }

        });
```

**Basic skeleton of a button**    
```java
private Button nameOfButton; //Under public class declaration


	nameOfButton = findViewById(R.id.backLogin); //Under setContentView(R.layout.layoutname); layoutname is in res/layout/layoutName.xml
	nameOfButton.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Intent intent = new Intent(currentClassName.this, nextClassName.class);
			startActivity(intent);
		}
	}); //Do not forget it to end it exactly like this!
```