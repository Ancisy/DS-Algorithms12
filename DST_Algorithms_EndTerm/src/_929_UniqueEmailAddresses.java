import java.util.HashSet;

public class _929_UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int x = numUniqueEmails(emails);
        System.out.println(x);
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> email = new HashSet<>();
        for (String s : emails) {
            String[] splitEmail = s.split("@");
            String[] splitLocal = splitEmail[0].split("\\+");
            String localName = splitLocal[0].replace(".", "");
            String result = localName + "@" + splitEmail[1];
            email.add(result);
        }
        return email.size();
    }

}
