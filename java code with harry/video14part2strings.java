public class video14part2strings{
    public static void main(String[]args){
        String name = "Siddharth";
        System.out.println(name.startsWith("Sid"));
        System.out.println(name.charAt(3));
        System.out.println(name.endsWith("rth"));
        System.out.println(name.lastIndexOf("h",4));
        System.out.println(name.lastIndexOf("d"));
        System.out.println(name.replace("id","fu"));
        System.out.println(name.indexOf('d'));
        System.out.println(name.indexOf('t',5)); 
        System.out.println(name.equals("Siddharth"));
        System.out.println(name.equalsIgnoreCase("sidDharTH"));
        System.out.println(name.trim());
        System.out.println(name.substring(4));
        System.out.println(name.substring(3,7));
        System.out.println(name.replace('d','m'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        
    }
    
}
