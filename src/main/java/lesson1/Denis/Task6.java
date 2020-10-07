package lesson1.Denis;

public class Task6 {
    public static void main(String[] args) {
        String A ="PHP Exercises and ";
        String B ="Python Exercises";
        String C =A+B;
        C=C.replaceAll("P", "");
        C=C.replaceAll("p", "");
        char[] cr=C.toCharArray();

        /*for (int i=0; i<cr.length; i++){
            if(cr[i]==('p'&'P')){
                cr[i]='';
            }
        }
         */

        System.out.println("The concatenated string with replacements: "+C);

    }
}
