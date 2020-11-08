public class SuperArray {
//Instance Variables
private String[] data;
private int size; //the current size

public SuperArray(){
  size = 0;
  data= new String[10];
}

public SuperArray(int InitialCapacity){
  size =0;
  data= new String[InitialCapacity];
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
  String[]datatwo = new String[data.length * 2];
  for(int i=0; i< data.length; i++){
    datatwo[i] = data[i];
  }
  data = datatwo;
  }

  public boolean isEmpty(){
      if(size !=0){
        return false;
      }
      return true;
    }

  public String toString(){
    if(size == 0) return "[]";
    String ret = "[";
    for(int i=0; i< size() -1; i++){
      ret += data[i] + ", "; //Must be for Strings with values!!!!
    }
    return ret + data[size- 1] + "]";
}

public boolean contains(String s){
  boolean gotStr = false;
  for(int i=0; i< size; i++)
  {
    if(data[i] == null){
      return false;
    }
    if(data[i].equals(s)){
      gotStr = true;
    }
  }
  return gotStr;
}

public void clear(){
  String[] datathree = new String[data.length];
  data= datathree;
  size = 0;
}

public void add(int index, String element){
if(size >= data.length){
  resize();
}
for(int i= size -1; i>= index; i--){
  data[i+1]= data[i];
}
size++;
data[index]= element;
}

public String remove(int index){
String removed = data[index];
if(size >= data.length){
  resize();
}
for(int i= index; i < size -1; i++){
  data[i] = data[i+1];
}
size--;
data[size]= null;
return removed;
}

public int indexOf(String s){
for(int i=0; i< size(); i++){
  if(s != null && data[i] != null){
    if(data[i].equals(s)){
    return i;
    }
  }
  }
  return -1;
}
public String[] toArray(){
String[] output = new String[size];
for(int i=0; i< size; i++){
  output[i] = data[i];
}
return output;
}

// public static void removeDuplicates(SuperArray s){
//   String[] output = new String[size];
//
// }

}
