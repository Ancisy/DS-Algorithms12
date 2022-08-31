public class _844_BackspaceStringCompare {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        boolean status = backspaceCompare(S, T);
        System.out.println(status);
    }

    public static boolean backspaceCompare(String S, String T) {
        boolean x = BackspaceString(S).equals(BackspaceString(T));
        return x;
    }

    public static String BackspaceString(String s) {
        StringBuilder result = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c != '#')
                result.append(c);
            else if (result.length() != 0)
                result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}
