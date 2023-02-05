public class QSRService {
    public int quantityService(int min, int max) {
        int amount = 0;
        if (max < 100) {
            return amount;
        }
        if (min > 9801) {
            return amount;
        }
        for (int i = 10; i <= 99; i++) {
            if (i * i > min & i * i < max) {
                amount++;
            }

        }
        System.out.println(amount);
        return amount;
    }
}




