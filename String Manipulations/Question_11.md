# 1. Problem Statement

You are given two lists, **sentences** and **words**, each containing `n` strings.

For every index `i`, the sentence `sentences[i]` corresponds to the word `words[i]`.

Your task is to:

- Find **all occurrences** of the word `words[i]` inside `sentences[i]`
- Replace each occurrence with the **reversed version** of that word
- Matching must be **case-insensitive**
- While replacing, you must **preserve the case of the first letter** of the occurrence in the sentence

Meaning:
- If the word appears as `Bond` in the sentence → replacement should start with a capital letter (`Dnob`)
- If the word appears as `bond` → replacement should be lowercase (`dnob`)

If the word does **not** appear in the sentence, return the sentence unchanged.

Finally, return a new list of modified sentences.

---

# 2. Constraints

- `1 ≤ n ≤ 100`
- Each string in `sentences` has length `1 ≤ length ≤ 500`
- Each word in `words`:
  - contains only lowercase English letters (`a–z`)
  - length `1 ≤ length ≤ 10`
- Matching is **case-insensitive**
- Only the **first letter case** of the matched occurrence should be preserved in the replacement

---

# 3. Input and Output

## Input

Two lists of equal size:
``sentences: List<String>``
``words: List<String>``


## Example
``{
"this is a elpmis example.",
"the name is dnob. james dnob.",
"remove every single e"
}``


### Explanation

- `"simple"` → `"elpmis"`
- `"bond"` → `"dnob"`
- `"e"` reversed is still `"e"`, so the third sentence remains unchanged.

---

# 4. Java Code

```java
```java
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static List<String> reverseReplace(List<String> sentences, List<String> words) {
        int n = sentences.size();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String sentence = sentences.get(i);
            String word = words.get(i);

            // Reverse the word
            String reversed = new StringBuilder(word).reverse().toString();

            // Case-insensitive regex pattern
            Pattern pattern = Pattern.compile("(?i)" + Pattern.quote(word));
            Matcher matcher = pattern.matcher(sentence);

            // If no occurrence, keep sentence unchanged
            if (!matcher.find()) {
                result.add(sentence);
                continue;
            }

            matcher.reset();
            StringBuffer sb = new StringBuffer();

            while (matcher.find()) {
                String found = matcher.group();

                // Preserve first letter capitalization
                String replacement = reversed;
                if (Character.isUpperCase(found.charAt(0))) {
                    replacement = Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1);
                }

                matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
            }

            matcher.appendTail(sb);
            result.add(sb.toString());
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "this is a simple example.",
                "the name is bond. james bond.",
                "remove every single e"
        );

        List<String> words = Arrays.asList("simple", "bond", "e");

        List<String> output = reverseReplace(sentences, words);

        for (String s : output) {
            System.out.println(s);
        }
    }
}
