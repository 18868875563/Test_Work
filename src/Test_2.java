import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.*;

public class Test_2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Integer> list3 = new ArrayList();
        Test_2 t1 =new Test_2();
        t1.getGRD(68,list1);
        t1.getGRD(136,list2);
        for (Integer inte:list1) {
            if(list2.contains(inte)){
                list3.add(inte);
            }
        }
        System.out.println(Collections.max(list3));
    }
    public static void getGRD(int m,List list){
        for (int i = 1; i <=m; i++) {
            if(m % i == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}


/*    public static int PrineGCD(int m,int n){
        int result =1;
        Set<Integer> set1 = getFactor(m);
        Set<Integer> set2 = getFactor(n);
        // 取交集
        set1.retainAll(set2);
        // 取最大
        return result;
    }*/

