package trieiterator;


import java.util.*;

/**
 *
 * @author Harshal
 */
public class Program {
    public static void main(String[] args)
    {
        Trie t= new Trie();
        char[] c=new char[50];
             System.out.println("Enter the word");
             Scanner userinput = new Scanner(System.in);
             String word=userinput.nextLine();
             t.add(word);
             System.out.println("Enter the word");
        
             word=userinput.nextLine();
             t.add(word);
             System.out.println("Enter the word");

             word=userinput.nextLine();
             t.add(word);
             System.out.println("Enter the word");

             word=userinput.nextLine();
             t.add(word);
             boolean b = false;
          
           String s3= t.toString();
             //        System.out.println(s3);
             //  String       s3= t.containsSubString("ck");

               //TrieIterator iter=(TrieIterator) t.iterator();
                     System.out.println(s3);


    
    }
        
    

  
}
