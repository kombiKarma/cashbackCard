public class Main {
    public static void main(String[] args) {
        int percent1 = 1;
        int percent2 = 3;
        int percent3 = 30;
        int limit = 3000;
        double expense1 = 24856.99;
        double expense2 = 15304.57;
        double expense3 = 2047.14;
        double cashback1 = (expense1 / 100) * percent1;
        double cashback2 = (expense2 / 100) * percent2;
        double cashback3 = (expense3 / 100) * percent3;
        System.out.println(cashback1);
        System.out.println(cashback2);
        System.out.println(cashback3);
        double cashbackFinal = cashback1 + cashback2 + cashback3;
        if (cashbackFinal > limit){
            cashbackFinal = limit;
        }
        System.out.println(cashbackFinal);
    }
}
