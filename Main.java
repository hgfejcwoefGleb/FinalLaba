import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    String s1;
    System.out.println("Введите выражение");
    s1 = sc.nextLine();
    List digitlist = new ArrayList();
    List signList = new ArrayList();
    String[] fracchar = new String[s1.length()];
    for (int i = 0; i < s1.length(); i++){
        fracchar[i] = String.valueOf(s1.charAt(i));
    }
    //int[] digitarr = new int[s1.length()];
    for(int i =0; i< fracchar.length; i++){
        if(fracchar[i].equals("1")||fracchar[i].equals("2")||fracchar[i].equals("3")||fracchar[i].equals("4")||fracchar[i].equals("5")||fracchar[i].equals("6")||fracchar[i].equals("7")||fracchar[i].equals("8")||fracchar[i].equals("1")){
            digitlist.add(fracchar[i]);

        }
        if(fracchar[i].equals("+")||fracchar[i].equals("-")||fracchar[i].equals(":")||fracchar[i].equals("*")){
            signList.add(fracchar[i]);
        }
        else{System.out.println("1");}
    }
    System.out.println(digitlist);
    System.out.println(signList);
        System.out.println(fracchar.length);
        System.out.println(fracchar[0]);
     //System.out.println(s1);
     //tring[] arr = new String[1000000000];
//List<String> inputFrac = new ArrayList<>();
//while (!sc.hasNext("quit")){
   // String s2 = sc.nextLine();
   // inputFrac.add(s2);
//}
//for(int i = 0; i < inputFrac.size(); i++){
   //System.out.println(inputFrac.get(i));
//}
//System.out.println(inputFrac);
//System.out.println(inputFrac.size());
//if (inputFrac.contains("1")){
    //System.out.println("Ураа");
//}
//else {
  // System.out.println("Не ура");
//}
//inputFrac = sc.nextLine();
       // StringBuilder s3 = new StringBuilder();
//inputFrac.toString();
//Integer i = Integer.parseInt(s1);
//System.out.println(i);
    }
}