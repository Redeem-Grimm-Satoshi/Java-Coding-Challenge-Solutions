```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3{

    public static List<String> findSubString(List<String> origStrs, List<String> substrs) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < origStrs.size(); i++) {
            int startPos = origStrs.get(i).indexOf(substrs.get(i));


            List<Integer> match_indices = new ArrayList<>();
            while (startPos != -1) {
                match_indices.add(startPos);
                startPos = origStrs.get(i).indexOf(substrs.get(i), startPos + substrs.get(i).length());
            }
            if (!match_indices.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("The substring '").append(substrs.get(i)).append("' was found in the original string'")
                        .append(origStrs.get(i)).append("' at position(s) ");
                for (int indx : match_indices)
                    sb.append(indx).append(", ");
                sb.setLength(sb.length() - 2);
                sb.append(".");
                result.add(sb.toString());


            }
        }
        return result;
    }

    
    public static void main(String[] args) {
        List<String> result = findSubString(
                Arrays.asList("HelloWorld", "LearningJava", "GoForBroke", "BackToBasics"),
                Arrays.asList("loW", "ear", "o", "Ba")
        );
        for (String res : result) {
            System.out.println(res);
        }

    }
}
