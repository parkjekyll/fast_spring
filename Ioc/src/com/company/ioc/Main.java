package com.company.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com";

        //1.요구사항: base64로 encoding
//        Base64Encoder encoder = new Base64Encoder();
//        String result = encoder.encode(url);
//        System.out.println(result);
        //Mad3d3Lm5hdmVyLmNvbS9ib29rcy9pdD9wYWdlPTEwJnNpemU9MjAmbmFtZT1zcHJpbmctYm9vdA==

        //2.url인코딩
//        UrlEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);
//        System.out.println(urlResult);
        //www.naver.com%2Fbooks%2Fit%3Fpage%3D10%26size%3D20%26name%3Dspring-boot

        //3.분리를 시켜볼까
//        Encoder encoder=new Encoder();
//        String result=encoder.encode(url);
//        System.out.println("result = " + result);
//        //result = d3d3Lm5hdmVyLmNvbS9ib29rcy9pdD9wYWdlPTEwJnNpemU9MjAmbmFtZT1zcHJpbmctYm9vdA==
//
//        IEncoder urlEncoder =new UrlEncoder();
//        String urlResult =urlEncoder.encode(url);
//        System.out.println("urlResult = " + urlResult);

        //4.만들때마다 new해야돼? 이것이 DI
        Encoder encoder=new Encoder(new Base64Encoder()); //내가 원하는 객체로 주입
        String result =encoder.encode(url);
        System.out.println("result = " + result);


    }
}