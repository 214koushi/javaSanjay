package InterviewPrograms;

public class bbb {
    public static void main(String[] args) {
        String input = "koushik";
        String output = countCharacters(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String countCharacters(String input) {
        StringBuilder result = new StringBuilder();

        int length = input.length();
        int count = 1;

        for (int i = 0; i < length; i++) {
            if (i + 1 < length && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }
}
