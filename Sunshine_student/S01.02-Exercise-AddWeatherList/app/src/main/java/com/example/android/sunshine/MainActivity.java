/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        mWeatherDisplay = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] dummyWeatherData = {
                "Today, January 28 - Rainy - 45°F / 36°F",
                "Tomorrow - Rainy - 45°F / 36°F",
                "Thursday - Rainy - 45°F / 36°F",
                "Friday - Thunderstorms - 45°F / 36°F",
                "Saturday - Rainy - 45°F / 36°F",
                "Sunday - Rainy - 45°F / 36°F",
                "Monday - Partly Cloudy - 45°F / 36°F",
                "Tue, February 4 - Rainy - 45°F / 36°F",
                "Wed, February 5 - Rainy - 45°F / 36°F",
                "Thu, February 6 - Stormy - 45°F / 36°F",
                "Fri, February 7 - Hurricane - 45°F / 36°F",
                "Sat, February 8 - Meteors - 45°F / 36°F",
                "Sun, February 9 - Raining UFO's - 45°F / 36°F",
                "Mon, February 10 - End of the World - 160°F / -280°F",
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String dummyWeatherDayData : dummyWeatherData) {
            mWeatherDisplay.append(dummyWeatherDayData + "\n\n\n");
        }
    }
}