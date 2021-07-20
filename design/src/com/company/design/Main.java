package com.company.design;

import com.company.design.Proxy.Browser;
import com.company.design.Proxy.BrowserProxy;
import com.company.design.Proxy.IBrowser;
import com.company.design.adapter.*;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        /*
        싱글톤
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));*/

        /*
        어댑터
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);

        connect(adapter);

        Airconditioner airconditioner = new Airconditioner();
        Electronic110V airAdapter = new SocketAdapter(airconditioner);
        connect(airAdapter);*/

        //Proxy

        /*Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();*/

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();




    }

    //콘센트 (어댑터 디자인)
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
