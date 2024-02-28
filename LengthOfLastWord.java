public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println("Word length = " + lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        String lastWord;
        s = s.trim();

        String[] words = s.split(" ");
        lastWord = words[words.length - 1];
        lastWord = lastWord.trim();

        return lastWord.length();
    }
}
