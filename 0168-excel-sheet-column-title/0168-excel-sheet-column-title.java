class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            // Adjust because Excel columns are 1-based
            columnNumber--;

            char ch = (char) ('A' + (columnNumber % 26));

            result.append(ch);

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}