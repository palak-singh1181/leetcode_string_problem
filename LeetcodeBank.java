
public class LeetcodeBank {

    public int totalMoney(int n) {
        int total = 0;
        int week = 0;

        while (n > 0) {
            for (int day = 0; day < 7 && n > 0; day++) {
                total += week + day + 1;
                n--;
            }
            week++;
        }

        return total;
    }

    public static void main(String[] args) {
        LeetcodeBank obj = new LeetcodeBank();

        System.out.println(obj.totalMoney(4));
        System.out.println(obj.totalMoney(10));
        System.out.println(obj.totalMoney(20));
    }
}