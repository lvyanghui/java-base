package com.lv.factory;

/**
 * Created by lvyanghui on 2018/4/30.
 */
public class SenderFactory {

    //简单工厂
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            return null;
        }
    }
    //多个工厂方法
    /*public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }*/

    //静态工厂方法
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
