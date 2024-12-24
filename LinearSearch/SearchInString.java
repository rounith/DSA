package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name="Rounith";
        char target='z';
        int i;
        for(i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                System.out.println("Yes at"+" "+(i+1));
                break;
            }
        }
        if(i==name.length()){
            System.out.println("No");
        }
    }
}
