public class CountNums {
    public static void main(String[] args) {
//        int n = 78183458;
//
//        int count = 0;
//        while (n>0) {
//            int rem = n%10;
//            if (rem==8 ){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);//    }
//}
     int n = 88629;
     int count=0;
     while (n>0){
         int rem = n % 10;
         if (rem==2){
             count++;
         }
         n = n/10;
     }
        System.out.println(count);
    }
}