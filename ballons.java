
class ballons {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        return Math.min(b, Math.min(a, Math.min(l / 2, Math.min(o / 2, n))));
    }

    public static void main(String[] args) {
        ballons sol = new ballons();

        System.out.println(sol.maxNumberOfBalloons("nlaebolko"));        // 1
        System.out.println(sol.maxNumberOfBalloons("loonbalxballpoon")); // 2
    }
}