public class MenoMaleducati {
    public static void main(String[] args){
        System.out.println("Facciamoli parlare");
        Person1 p1=new Person1("Mario");
        Person2 p2=new Person2("Luigi");
        p1.start();
        try
        {
            p1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        p2.start();
    }
}
