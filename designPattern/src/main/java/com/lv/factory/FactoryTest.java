package com.lv.factory;

import java.util.List;

/** https://www.cnblogs.com/wangzhongqiu/p/6245820.html
 *  https://blog.csdn.net/anxpp/article/details/51224293
 * Created by lvyanghui on 2018/4/30.
 */
public class FactoryTest {

    public static void main(String[] args){
        SenderFactory factory = new SenderFactory();
        //Sender sender = factory.produce("sms");

        //Sender sender = factory.produceMail();

        Sender sender = SenderFactory.produceMail();
        sender.send();



        Provider provider = new SmsFactory();
        Sender sender1 = provider.produce();
        sender1.send();


        Builder builder = new Builder();
        List<Sender> list = builder.produceMailSender(5);
    }
}
