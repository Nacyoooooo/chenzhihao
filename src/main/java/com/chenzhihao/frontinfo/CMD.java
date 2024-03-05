package com.chenzhihao.frontinfo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class CMD {
    private InputStream inputStream;
    private Consumer<String>consumer;
    public void cmdTest(){
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        System.out.println(isWindows);
        new BufferedReader(new InputStreamReader(inputStream)).lines().forEach(consumer);

        String homeDirectory=System.getProperty("user.home");
        Process process;
        if(isWindows){
            process=Runtime.getRuntime().exec(String.format("cmd.exe /c dir %s",homeDirectory));
        }else {
            process=Runtime.getRuntime().exec(String.format("sh -c"));
        }
    }
}
