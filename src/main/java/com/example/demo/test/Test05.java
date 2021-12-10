package com.example.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class Test05 {

    public static void main(String args[]) {
        callCmd("C:\\Insurance-ydwy-jiangxi\\同云医保本地服务启动.bat");
    }
    //RunTime 启动本地java程序
    public static void callCmd(String locationCmd) {
        try {
            Process child = Runtime.getRuntime().exec("cmd.exe /C start " + locationCmd);
//            Process child = Runtime.getRuntime().exec("java -jar C:\\Insurance-ydwy-jiangxi\\social-insurance-jiangxi-ydwy-0.0.1-SNAPSHOT.jar");
//            InputStream in = child.getInputStream();
//            int c;
//            while ((c = in.read()) != -1) {
//            }
//            in.close();
            try {
                child.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

