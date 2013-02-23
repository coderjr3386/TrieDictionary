
package doordie;


public class Main {

   
    public static void main(String[] args) {

      
 Trie t= new Trie();
 
 String str1 = "chu chucking chucking";
 //String st=str1.substring(1, str1.length());
 // st = st.substring(0, st.indexOf(' '));
 //String st=str1.substring(0, str1.indexOf('u'));
  //int i = str1.indexOf(' ');
  //System.out.println(st);
 //String aa = "abc def";
 //String[] dd=str1.split("\\s+");
 //System.out.println(dd[0]+" n "+dd[1]+" n "+dd[2]);
  //t.add("lucki");
  t.add("chuckti");
  t.add("chuckthing");
  t.add("chuckth");
  t.add("chu");
  String str;
  
  str=t.toString();
  System.out.println("Whole trie using Visitor 1 is "+str);
 // str=t.printTrie("ck");
  System.out.println("CK content using Visitor 2 is "+str);
  VowelWords t1 = new VowelWords();
  SubStringWords t2 = new SubStringWords();
 //str=t.vowels(t1);
 System.out.println("Strategy for Type 1-vowels is "+str);
 //str=t.vowels(t2);
 System.out.println("Strategy for Type 2-th is "+str);
  //String[] result = "The man is very happy.".split("\\s");
  //for (int x=0; x<result.length; x++)
  //System.out.println(result[x]);
 
 str=t.toString();
 System.out.println("Whole trie using Visitor 1 is "+str);	 
  


    }


}
