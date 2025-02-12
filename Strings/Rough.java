import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        String s= "rounithr";
        char[] c = new char[s.length() + 1];
        c = s.toCharArray();
        Arrays.sort(c);
        int i=0;
        int j=1;
        while(j < c.length){
            if(c[i] == c[j]){
                System.out.println("Duplicate found: " + c[i]);
                break;
            }
            i++;
            j++;
        }
    }
    
}
