public class lastlengthofword {

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
        lastlengthofword obj = new lastlengthofword();

        System.out.println(obj.lengthOfLastWord("Hello World"));
        System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(obj.lengthOfLastWord("luffy is still joyboy"));
    }
}