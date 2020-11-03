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
  if(size == data.length)
    {
      resize();
    }
data[size] = element;
size+= 1;
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
  size+= 10;
  String[]datatwo = new String[size];
  for(int i=0; i< data.length; i++){
    datatwo[i] = data[i];
  }
  data = datatwo;
}
}
