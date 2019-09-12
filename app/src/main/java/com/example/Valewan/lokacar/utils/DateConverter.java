package com.example.Valewan.lokacar.utils;

import java.util.Date;


/**
 * Class util de convertion de date et de timestamp
 */
public abstract class DateConverter {

    /**
     * Un long vers une date
     * @param timestamp long
     * @return Date
     */
    public static Date timeStampToDate(long timestamp){
        return new Date(timestamp);
    }

    /**
     * Une date vers un long
     * @param date Date
     * @return long
     */
    public static Long dateToTimestamp(Date date){

        if(date != null){
            return date.getTime();
        }else{
            return null;
        }

    }

}