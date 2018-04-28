package com.protobuf.util;

import java.io.IOException;

/**
 * Created by 元宝E家 on 2018/4/28.
 */
public class GenerateClass {
    public static void main(String[] args) {
        String protoFile = "person-entity.proto";//
        String strCmd = "D:/opensource/protobuf-demo/src/main/resources/protoc.exe -I=D:/opensource/protobuf-demo/src/main/java/com/protobuf/proto --java_out=D:/opensource/protobuf-demo/src/main/java/com/protobuf/proto/pojo/ D:/opensource/protobuf-demo/src/main/java/com/protobuf/proto/"+ protoFile;
        try {
            Runtime.getRuntime().exec(strCmd);
        } catch (IOException e) {
            e.printStackTrace();
        }//通过执行cmd命令调用protoc.exe程序
    }
}
