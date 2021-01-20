public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");

        System.out.println("Potok odin zapushen: " + ob1.t.isAlive());
        System.out.println("Potok dva zapushen: " + ob2.t.isAlive());
        System.out.println("Potok tri zapushen: " + ob3.t.isAlive() );

        try{
            System.out.println("ozhidanie zavershenie potokov: ");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("glavniy potok prervan");
        }
        System.out.println("potok odin zapushen: " + ob1.t.isAlive());
        System.out.println("potok dva zapushen: " + ob2.t.isAlive());
        System.out.println("potok tri zapushen: " + ob3.t.isAlive());
        System.out.println("Glavniy potok zavershen");

    }
}
