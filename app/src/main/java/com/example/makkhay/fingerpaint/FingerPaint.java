package com.example.makkhay.fingerpaint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class FingerPaint extends AppCompatActivity {

        private static final String TAG = "FingerPaint";
        DrawView drawView;

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // Set full screen view
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


            // lock screen orientation (stops screen clearing when rotating phone)
            setRequestedOrientation(getResources().getConfiguration().orientation);

            drawView = new DrawView(this);
            setContentView(drawView);
            drawView.setBackgroundColor(Color.BLACK);
            drawView.requestFocus();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.paint_menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle item selection
            switch (item.getItemId()) {
                case R.id.clear_id : {
                    drawView.clearPoints();
                    return true;
                }
                case R.id.p_white_id : {
                    drawView.changeColour(0);
                    return true;
                }
                case R.id.p_blue_id : {
                    drawView.changeColour(1);
                    return true;
                }
                case R.id.p_green_id : {
                    drawView.changeColour(3);
                    return true;
                }
                case R.id.p_yellow_id : {
                    drawView.changeColour(6);
                    return true;
                }

                case R.id.w_small : {
                    drawView.changeWidth(5);
                    return true;
                }
                case R.id.w_medium : {
                    drawView.changeWidth(10);
                    return true;
                }
                case R.id.w_large : {
                    drawView.changeWidth(15);
                    return true;
                }
                default : {
                    return true;
                }
            }
        }


    }

