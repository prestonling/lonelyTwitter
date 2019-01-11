package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public void Mood(){
        date = null;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date newDate){
        date = newDate;
    }

    public abstract String currentMood();
}
