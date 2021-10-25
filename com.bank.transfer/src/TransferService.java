public class TransferService {
    private static int amount = 300;
    public static String a1 = "1";
    public static String a2 = "2";

    public static int loadAccount(String a) {
        int ba1;
        int ba2;

        if (a == "1") {
            ba1 = 1000;
            return ba1;
        }
        if (a == "2") {
            ba2 = 1000;
            return ba2;
        } else {
            System.out.println("Enter either account 1 or 2");
            return 0;
        }
    }
}
