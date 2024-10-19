import java.awt.desktop.PreferencesEvent;

public class TenthProblem {
    public static int conversion(String input) {
        String s = input.trim();

        if (s.isEmpty()) {
            return -1;
        }

        boolean numStarted = false;
        boolean isNegative = false;

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                if (numStarted) {
                    break;
                }
                isNegative = true;
                continue;
            }
            if (c == '+') {
                if (numStarted) {
                    break;

                }
                isNegative = false;
                continue;
            }
            if (c >= '0' && c <= '9') {
                sb.append(c);
                numStarted = true;
            } else {
                if (numStarted) {
                    return -1;
                }
            }
        }
        if (sb.length() == 0) {
            return -1;
        }

        int result = Integer.parseInt(sb.toString());
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String input1="1211";
        int result1=conversion(input1);
        System.out.println(result1);
        String input2="-1211";
        int result2=conversion(input2);
        System.out.println(result2);
        String input3="1q11";
        int result3=conversion(input3);
        System.out.println(result3);


    }
}