package homework1;

public class HomeWork {
    public static void main(String[] args) {
       boolean istrue = true;
       int j = 0;
       
       while(j < 100){
           j+=1;
           if(j%2 == 1){
               continue;
           }
           System.out.println(j);
       }
    }
}
