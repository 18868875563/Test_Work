public class Test_2 {
    public static void main(String[] args) {
       int m = 128;
       int n = 64;
       for (int i = (m>n?m:n); i >= 1 ; i--) {
            if (m % i ==0 && n % i ==0){
                System.out.println(i);
                break;
            }
        }
        }
}


       /* List<Integer> list1 = new ArrayList();
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
    }*/

