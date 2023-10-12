 class longCommonPrefix{
 public static String longestCommonPrefix1String(String[] strs){
    if (strs == null || strs.length == 0) {
        return "";
    }

    String prefix = strs[0]; // Initialize with the first string
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }

    return prefix;
}
public static void main(String[] args) {
    String[] strs1 = {"flower", "flow", "flight"};
    String[] strs2 = {"dog", "racecar", "car"};

    String result1 = longestCommonPrefix1String(strs1);
    String result2 = longestCommonPrefix1String(strs2);

    System.out.println("Longest Common Prefix for strs1: " + result1); // Output: "fl"
    System.out.println("Longest Common Prefix for strs2: " + result2); // Output: ""
}
 }