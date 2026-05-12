class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        // Memoization map
        HashMap<String, List<String>> memo = new HashMap<>();

        return dfs(s, set, memo);
    }

    private List<String> dfs(String s, Set<String> set,
                             HashMap<String, List<String>> memo) {

        // If already computed
        if (memo.containsKey(s))
            return memo.get(s);

        List<String> result = new ArrayList<>();

        // Base case
        if (s.length() == 0) {
            result.add("");
            return result;
        }

        for (String word : set) {

            // Check if string starts with current word
            if (s.startsWith(word)) {

                String remaining = s.substring(word.length());

                List<String> subList = dfs(remaining, set, memo);

                for (String sub : subList) {

                    // Avoid extra space at end
                    String sentence = word +
                            (sub.isEmpty() ? "" : " " + sub);

                    result.add(sentence);
                }
            }
        }

        // Store result
        memo.put(s, result);

        return result;
    }
}