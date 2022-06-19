package arrays.misc;

public class ReverseString {

    public static void main(String args[]) {
        reverseString();
    }

    private static void reverseString() {
        String str = "Its a beautiful day out there !";
        char[] strArray = str.toCharArray();
        int length = strArray.length - 1;
        StringBuffer buff = new StringBuffer();
        while (length >= 0) {
            buff.append(strArray[length]);
            length--;
        }
        System.out.println(buff);
    }


}
