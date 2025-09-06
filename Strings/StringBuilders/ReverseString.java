package StringBuilders;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Hello");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}

[5,8,9,4,10] 
