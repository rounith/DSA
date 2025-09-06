package StringDatatype;

public class DeleteAfterAChar {
    public static void main(String[] args) {
        String str="rounithdharavath@gmail.com";
        String username="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '@'){
                break;
            }
            username+=str.charAt(i);
        }
        System.out.println(username);
    }
    
}
