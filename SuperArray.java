public class SuperArray {
//Instance Variables
private String[] data;
private int size; //the current size

public SuperArray(){
  size = 0;
  data= new String[10];
}

public int size(){
  return size;
}

public boolean add(String element){
  if(size == data.length)
    {
      resize();
    }
data[size] = element;
size= size + 1;
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
  String[]datatwo = new String[data.length + 10];
  for(int i=0; i< data.length; i++){
    datatwo[i] = data[i];
  }
  data = datatwo;
  }
}
