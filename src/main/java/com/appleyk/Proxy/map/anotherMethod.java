package com.appleyk.Proxy.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 类之间的映射 即 k - 底层设备类 v - 运行时设备类


public class anotherMethod {
    public static Map<String, String> classMaps = new HashMap<>();
    // 方法之间的映射 即 k - 运行时api v - 底层设备api
    public static Map<String, List<String>> apiMaps = new HashMap<>();
    // 底层设备对象与运行时对象之间的映射 k - 运行时对象 v - 底层设备对象
    public static Map<Object, Object> objMaps = new HashMap<>();
    // 运行时对象标识与运行时对象的映射 k-运行时对象的hashcode v-运行时对象
    public static Map<String, Object> idObjmaps = new HashMap<>();
    // 底层设备id与运行时对象标识的映射 k-底层设备id v-运行时对象的hashcode A1:685325104
    public static Map<String, String> idmaps = new HashMap<>();
    // 底层设备id与运行时对象的映射 k-底层设备id v-运行时对象
    public static Map<String, Object> uidMaps = new HashMap<>();
    // 服务id与运行时设备id的映射 k-服务id v-运行时设备id S11:2101973421
    public static Map<String, String> SerDevMaps = new HashMap<>();
    //	存放服务id与服务对象的映射
    public static Map<String, Object> serMap = new HashMap<>();
    //	存放服务id与环境id的映射
    public static Map<String, String> serConMap = new HashMap<>();
    //	存放环境id与环境对象的映射
    public static Map<String, Object> contMap = new HashMap<>();
    //		存放位置id与位置对象的映射
    public static Map<String, Object> locationMap = new HashMap<>();

    //		存放位置id与位置名的映射
    public static Map<String, String> locIdNameMap = new HashMap<>();

    //		存放用戶id与用戶对象的映射
    public static Map<String, Object> userMap = new HashMap<>();

    //		存放用戶id与用戶名的映射
    public static Map<String, String> userIdNameMap = new HashMap<>();
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
//        TestCmd.testCmd(cmdMaps, services, SerDevMaps, idmaps, idObjmaps, objMaps, serMap, contMap);
    }
}