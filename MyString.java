public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String low = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64&&str.charAt(i)<91){low +=(char) (str.charAt(i)+32);}
            else{low +=str.charAt(i);}
        }
        return low;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        int len=str2.length();
        int count = 0;
        if(len>str1.length()){return false;}
        for(int i=0;i<(str1.length()-len+1);i++){
            for(int j=0;j<len;j++){
                if(str2.charAt(j)==str1.charAt(i+j)){count++;}
                else{count = 0;
                break;}
            }
            if(count==len){return true;}
        }

        return false;
    }
}
