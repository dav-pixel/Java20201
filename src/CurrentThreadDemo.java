public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("tekushiy potok ispolneniya " + t);
        t.setName("My thread");
        System.out.println("posle izmeneniye imeni potoka " + t);
        try{
            for (int n = 5; n > 0 ; n--) {
                System.out.println(n);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println("glavniy potok ispolnenie prervan");
        }
    }
}
