import java.util.Arrays;
public class Demo{
public static void removeDuplicates(SuperArray s){
for(int i=0; i< s.size() -1; i++){
  int j = i+1;
  while(j<s.size()){
  if(s.get(j).equals(s.get(i))){
    s.remove(j);
  }
  else{
    j+= 1;
}
}
}
}
public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }

public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray output = new SuperArray();
    for(int i=0; i< a.size(); i++){
    if(b.contains(a.get(i))){
      output.add(a.get(i));
    }
  }
  removeDuplicates(output);
  return output;
}
public static SuperArray zipped (SuperArray a, SuperArray b){
  SuperArray output = new SuperArray();
  int small = 0;
  SuperArray big = new SuperArray();
  if(a.size() <= b.size(){
    small = a.size();
    big= b;
  }
  else{
    small= b.size();
    big= a;
  }
for(int i= 0; i< small; i++){
  output.add(a.get(i));
  output.add(b.get(i));
}
for(int j= small; j< big.size(); j++){
  output.add(big.get(j));
}
return output;
}



}
