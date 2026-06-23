class lastlengthofword {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        lastlengthofword sol = new lastlengthofword();

        System.out.println(sol.lengthOfLastWord("Hello World"));           // 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // 6
    }
}