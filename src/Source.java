public class Source {
    public static void main(String[] args) {
        String str = "String";
        System.out.println(doubleChar(str).equals("SSttrriinngg"));
    }
    public static String doubleChar(String s){
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
                temp.append(s.charAt(i)).append(s.charAt(i));
        }
        return String.valueOf(temp);
    }
}
