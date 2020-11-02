public class SuperArray {
//Instance Variables
private String[] data;
private int size; //the current size
public SuperArray(){
  size = 10;
  String[] data= new String[size];
}
public int size(){
  return size;
}
public boolean add(String element){
  int a= -1;
  for(int i=0; i<data.length; i++)
  {
    if(data[i]== null)
    {
      a= i;
    }
  }
  if(a == -1){
    return false;
  }
  else {
    data[a]= element;
    return true;
  }
}






}
