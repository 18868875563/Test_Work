//package com.heima.Test_1;

import java.lang.ref.SoftReference;
import java.util.*;

public class Test_1 {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //String b = sc.nextLine();
        String s1 = "Hello World";
        //List list = new ArrayList();
        /*把字符串转化为数组形式，并用正则表达式进行分割*/
        String[] str1 = s1.split("\\s+");
        String str2 = new String() ;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < str1.length; i++) {
            sb1.append(str1[i]).reverse();
            sb2.append(sb1);
            sb2.append(" ");
            sb1.delete(0,sb1.length());
        }
        str2 = sb2.toString();
        //System.out.println(str2);
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i <str2.length() ; i++) {
            char ch = str2.charAt(i);
            if(Character.isUpperCase(ch)){
                list1.add(String.valueOf(ch).toLowerCase());
            }
            else{
                list1.add(String.valueOf(ch).toUpperCase());
            }

        }
        // System.out.println(list1);
        for (String str3:list1
        ) {
            System.out.print(str3);
        }
    }
}
