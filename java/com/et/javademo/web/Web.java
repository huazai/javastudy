package com.et.javademo.web;

import java.io.*;
import java.net.URL;

public class Web {

    public static void main(String[] args) {
        try {
            int itemId = 100;

            for(int i=0; i<1000000; i++) {
                //URL url = new URL("http://www.cjwsc.com/item/" + itemId + ".html");
//                URL url = new URL("http://www.cjwsc.com/item/150499.html");
                URL url = new URL("http://www.cjwsc.com/captcha?id=yutu879875f1b7a54&rand=0.5648780087");


                long startTime1 = System.currentTimeMillis();

                try {
                    InputStream inputStream = url.openStream();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }


                long endTime1 = System.currentTimeMillis();
                long useTime1 = endTime1 - startTime1;
                System.out.println("useTime1: " + useTime1);

                itemId = itemId + i;
                Thread.sleep(2000);
            }

//            long startTime2 = System.currentTimeMillis();
//
//            InputStreamReader streamReader = new InputStreamReader(inputStream);
//            BufferedReader bufferedReader = new BufferedReader(streamReader);
//            String str;
////            while ((str = bufferedReader.readLine()) != null) {
////                //System.out.println(str);
////            }
//
//            long endTime2 = System.currentTimeMillis();
//            long useTime2 = endTime2 - startTime2;
//            System.out.println("useTime2: " + useTime2);
//
//            streamReader.close();
//            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
