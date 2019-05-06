package com;

import java.util.*;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String,String> animal = new HashMap<String,String>();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (i<3){
            System.out.println("请输入key值");
            String key = sc.next();
            System.out.println("请输入value值");
            String value= sc.next();
            animal.put(key,value);
            i++;
        }
        System.out.println("===========================");
        Iterator<String>it = animal.values().iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"   ");
        }
        //通过entrySet 方法打印输出key value
        System.out.println("**********************");
        System.out.println("对应的键值对为：");
        Set<Map.Entry<String,String>> entrySet=animal.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.print(entry.getKey()+":");
            System.out.println(entry.getValue());
        }
        System.out.println("-----------------------------");
        System.out.println("请输入你要查找的key");
        String strSearch = sc.next();
        //取得keyset
        Set<String>keySet = animal.keySet();
        for (String key:keySet){
            if(strSearch.equals(key)){
                System.out.println("找到key了"+key+":"+animal.get(key));
                break;
            }else {
                System.out.println("no");
            }
        }

    }

}

