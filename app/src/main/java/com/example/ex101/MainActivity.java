package com.example.ex101;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Random;
import android.graphics.Color;
/**
 * @author Liad Peretz
 * @version 1.0
 * @since 19 /11/20
 * Short description- Practice for alert dialog.
 */
public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    LinearLayout color;
    Random rnd;
    int rndNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color= (LinearLayout) findViewById(R.id.color);

    }

    /**
     * One
     * Short description- Alert dialog with a message.
     * <p>
     *     View view
     * @param view the view
     */
    public void one(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hello");
        adb.setMessage("Thank you Albert so much for this assignment");

        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Two
     * Short description- Alert dialog with a message and an icon.
     * <p>
     *     View view
     * @param view the view
     */
    public void two(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hello");
        adb.setMessage("Is it good so far?");
        adb.setIcon(R.drawable.poop);

        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Three
     * Short description- Alert dialog with a message, an icon and a button to close the message.
     * <p>
     *     View view
     * @param view the view
     */
    public void three(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hello");
        adb.setMessage("Would you like to sleep?");
        adb.setIcon(R.drawable.poop);
        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Four
     * Short description- Alert dialog with a message and two buttons.
     * <p>
     *     View view
     * @param view the view
     */
    public void four(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hello");
        adb.setMessage("Would you like to change the background's color?");
        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd= new Random();
                rndNum= Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                color.setBackgroundColor(rndNum);
            }
        });
        adb.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });


        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Five
     * Short description- Alert dialog with a message and three buttons.
     * <p>
     *     View view
     * @param view the view
     */
    public void five(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hello");
        adb.setMessage("Would you like to change the background's color?");
        adb.setPositiveButton("Random", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd= new Random();
                rndNum= Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                color.setBackgroundColor(rndNum);
            }
        });
        adb.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNeutralButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                color.setBackgroundColor(Color.WHITE);
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * OnCreateOptionsMenu
     * Short descriptions- Creates an options menu.
     * <p>
     *    Menu menu
     * @param menu the menu
     * @return true if it worked.
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 100, "Credits");
        return true;
    }

    /**
     * OnOptionsItemSelected
     * Short description- Starts the credits activity.
     * @param item the selected item
     * @return true if it worked.
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent si = new Intent(this, Credits.class);
        startActivity(si);
        return true;
    }

}




