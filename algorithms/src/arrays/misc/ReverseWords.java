package arrays.misc;

public class ReverseWords {

    public static void main(String args[]) {
        reverseStringWords();
    }

    private static void reverseStringWords() {
        String str = "Its a beautiful day out there";
        String[] strArray = str.split(" ");
        int length = strArray.length - 1;
        StringBuffer buff = new StringBuffer();
        while (length >= 0) {
            buff.append(strArray[length]).append(" ");
            length--;
        }
        System.out.println(buff);
    }
}
