package airport;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane("Boing 347", 200, 400);

        a1.setModel("modelo 1");
        a1.setSeats(100);
        
        System.out.println(a1.getModel());
        System.out.println(a2.toString());
    }

}
