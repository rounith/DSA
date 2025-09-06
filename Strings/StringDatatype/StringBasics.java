package StringDatatype;

//Strings are immutable
//.equals() is used to compare the content of the string
// == is used to compare the reference of the string.
// we can use printf to format the string

public class StringBasics {
    public static void main(String[] args) {
        //1.concat (+)
        String first="Tony";
        String name="Stark";
        String full=first+" "+name;
        System.out.println(full);
        System.out.println();
        
        //2.length (.length())
        System.out.println(full.length());
        System.out.println();

        //3.charAt (.charAt(i))
        for(int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));
        }
        System.out.println();

        //4.compare (.compareTo(otherString)) give 0 if equal
        //gives +ve if str11>str2
        //gives -ve if str1<st2 
        System.out.println(full.compareTo(name));

        //5.SubString (.substring(start index,end index)) end index is not included
        String sub = full.substring(3,7);
        System.out.println(sub);
        System.out.println();

        //6.parseInt
        String strnum="12345";
        int num=Integer.parseInt(strnum);
        System.out.println(num);

        //7.toString
        int hello=12345;
        String hi=Integer.toString(hello);
        System.out.println(hi);

        //8. .replace(old Char,new char)
        //str.replace("e", "i")
    }
    
}
