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
    data.resize();
  for(int i=0; i<data.length; i++)
  {
    if(data[i]== null)
    {
      data[i] = element;
    }
  }
}
  else {
    data[a]= element;
    return true;
  }
  return true;
}

public String get(int index){
  return data[index];
}
public String set(int index, String element){
String val = data[index];
data[index] = element;
return val;
}
private void resize(){
  String[]datatwo = new String[size+ 10];
  for(int i=0; i< data.length; i++){
    datatwo[i] = data[i];
  }
  data = datatwo;
}




}
