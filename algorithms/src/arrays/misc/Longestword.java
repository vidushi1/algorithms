package arrays.misc;

public class Longestword {

    public static void main(String args[]){

        String str = "The is sun way up in the sky.Its afternoon .";
        System.out.println(longestWord(str));
    }
    private static String longestWord(String str) {
        String[] strArray = str.split(" ");
        String answer ="";
        Integer length = Integer.MIN_VALUE;
        int i = 0;
        while(i < strArray.length){
            if(length < strArray[i].length()){
                answer = strArray[i];
                length = strArray[i].length();
            }
            i++;
        }
        return answer;
    }
}
