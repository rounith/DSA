package StringBuilders;

public class Basic {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        //1. .append()
        str.append("s");
        System.out.println(str);

        //2. .setCharAt()
        str.setCharAt(1, 'e');
        System.out.println(str);

        // 3. .insert() this inserts whole string not just one character
        str.insert(1, "String");
        System.out.println(str);

        //4. .delete()
        str.delete(1, 7);
        System.out.println(str);
    }
}
