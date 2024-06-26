package com.coolweather.yezidong.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class TEmperature{

        public String max;
        public String min;
    }
    public class More{

        @SerializedName("txt_d")
        public String info;
    }
    public class  Temperature{

        public int max;
        public int min;
    }

}
