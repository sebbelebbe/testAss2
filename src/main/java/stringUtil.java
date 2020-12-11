import java.util.Hashtable;

public class stringUtil {

    String reverseString(String stringToRevert){
        StringBuilder reverstString = new StringBuilder();
        var charArray = stringToRevert.toCharArray();

        for (int i = charArray.length -1 ; i >= 0 ; i--){
            reverstString.append(charArray[i]);


        }

        return reverstString.toString();

    }

     String toCapitalize(String stringToCapitalize){
        var charArray = stringToCapitalize.toCharArray();
        StringBuilder sb = new StringBuilder();
        Hashtable<Character, Character> dict = new Hashtable<>();
        dict.put('a','A'); dict.put('b','B');dict.put('c','C'); dict.put('d','D');dict.put('e','E'); dict.put('f','F');dict.put('g','G'); dict.put('h','H');dict.put('i','I'); dict.put('j','J');dict.put('k','K'); dict.put('l','L');dict.put('m','M'); dict.put('n','N');dict.put('o','O'); dict.put('p','P');dict.put('q','Q'); dict.put('r','R');dict.put('s','S'); dict.put('t','T');dict.put('u','U'); dict.put('v','V');dict.put('W','W'); dict.put('x','X');dict.put('y','Y'); dict.put('z','Z');dict.put('æ','Æ'); dict.put('ø','Ø');dict.put('å','Å');

         for (int i = 0; i < charArray.length; i++) {
             if(dict.get(charArray[i]) != null) {
                 sb.append(dict.get(charArray[i]));
             }
             else{
                  sb.append(charArray[i]);
             }

         }

        return sb.toString();
     }
    String toLowerCase(String stringToLowercase){
        var charArray = stringToLowercase.toCharArray();
        StringBuilder sb = new StringBuilder();
        Hashtable<Character, Character> dict = new Hashtable<>();
        dict.put('A','a'); dict.put('B','b');dict.put('C','c'); dict.put('D','d');dict.put('E','e'); dict.put('F','f');dict.put('G','g'); dict.put('H','h');dict.put('I','i'); dict.put('J','j');dict.put('K','k'); dict.put('L','l');dict.put('M','m'); dict.put('N','n');dict.put('O','o'); dict.put('P','p');dict.put('Q','q'); dict.put('R','r');dict.put('S','s'); dict.put('T','t');dict.put('U','u'); dict.put('V','v');dict.put('W','w'); dict.put('X','x');dict.put('Y','y'); dict.put('Z','z');dict.put('Æ','æ'); dict.put('Ø','ø');dict.put('Å','å');

        for (int i = 0; i < charArray.length; i++) {
            if(dict.get(charArray[i]) != null) {
                sb.append(dict.get(charArray[i]));
            }
            else{
                sb.append(charArray[i]);
            }

        }

        return sb.toString();
    }


}
