package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {

    String message;

    String message2;

    Date date;

    public void Tweet(){
        message = "";
        date = null;
    }
    public void setMessage(String tweetmessage){
        message = tweetmessage;
    }

    public String getMessage(){
        return message;
    }

    public void setMesssage(String tweetmessage, String message2 ){
        message = tweetmessage;
        this.message2 = message2;
    }

    /*when you make something abstract, you need to make the class abstract*/
    public abstract String getSomething();

}

