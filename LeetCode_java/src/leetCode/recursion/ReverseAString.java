package leetCode.recursion;

public class ReverseAString {

    public static String reverse(String str, int start, int end){
        if(start>=end){
            return str;
        }
        char startChar = str.charAt(start);
        char endChar = str.charAt(end);
        str = str.substring(0, start)+endChar + str.substring(start+1);
        str = str.substring(0, end) + startChar+str.substring(end+1);;
        return reverse(str, start+1, end-1);

    }
    public static void main(String[] args) {
        String str = "narendra";
        String reversedStr = reverse(str, 0, str.length()-1);
        System.out.println(reversedStr);
    }
}
