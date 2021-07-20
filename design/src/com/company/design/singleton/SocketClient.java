package com.company.design.singleton;

public class SocketClient {

    //싱글톤은 자기 자신을 객체로 가지고 있어야 함.
    private static SocketClient socketClient = null;
    //생성자를 private으로 선언하는 것이 싱글톤, 객체는 하나만 존재하여야 함.
    private SocketClient(){

    }

    public static SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }


}
