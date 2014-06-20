package com.example.crybaby.firstcry;

import android.text.format.Time;
import android.util.Log;

import java.util.Random;

/**
 * Created by bianrh on 6/20/14.
 */
public class TimeReporter {

    private String[] timesIntros;
    private String nowStr;
    private String speechStr;

    public String getTimeReportSpeechStr() {
        Time now = new Time();
        now.setToNow();
        nowStr = String.valueOf(now.hour) + "O'clock and" + String.valueOf(now.minute);
        speechStr = greetWords[new Random().nextInt(greetWords.length)] +
                nickNames[new Random().nextInt(nickNames.length)] +
                timesIntros[new Random().nextInt(timesIntros.length)];

        Log.d(TAG, speechStr);
        return speechStr;
    }

}
