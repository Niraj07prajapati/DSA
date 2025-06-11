public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        s = s.toLowerCase(); // convert to lower case
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "avrajprajapati";
        System.out.println(firstUniqChar(s)); 
    }
}
