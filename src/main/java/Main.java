public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();


        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        System.out.println(expected + "== ? ==" + actual);

         amount = 1_000_000;
         expected = 500;
         actual = service.calculate(amount, registered);
        System.out.println(expected + "== ? ==" + actual);

           }

    }
