import java.util.ArrayList;
import java.util.List;
public class makeAllWords{

  public static List<String> makeAllWords(int k,int maxLetter){
    List<String> ans = new ArrayList<String>();
    makeAllWords(k,"",ans);
    return ans;
  }


  public static void makeAllWords(int k,String partial,List<String> s, int maxLetter){
    // if(partial.length() == k){
    //   s.add(partial);
    // }else{
    //   makeAllWords(k,partial + "a",s);
    //   makeAllWords(k,partial + "b",s);
    //   makeAllWords(k,partial + "c",s);
    // }
    int letter = 'a' + 0;
    int max = 'a' + maxLetter;
    if(partial.length() == k){
      s.add(partial);
    }
    for(int i = letter; i < max; i++){
      makeAllwords(k,partial + (char)letter,s,maxLetter);
    }
  }


  public static void main(String[] args) {
    System.out.println(makeAllWords(3,3));
  }
}
