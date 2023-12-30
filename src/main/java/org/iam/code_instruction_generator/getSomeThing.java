package org.iam.code_instruction_generator;

import java.util.HashMap;

/**
 * 变量中转，让其他类可以访问其他类的私有或不易访问的变量
 * @author Iammm
 * @Time 2023/12/30 17:55
 */
public class getSomeThing {
    private static HashMap<String, Object> hashMap;
    static {
        hashMap=new HashMap<>();
    }

    public static void addSomething(String key, Object value) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(key, value);
    }
    public static Object getSomething(String key){
        return hashMap==null?null:hashMap.get(key);
    }
}