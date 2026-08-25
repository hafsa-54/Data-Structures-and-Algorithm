// implementation of stack using array
public  class arrstack implements stack{
    private static boolean value;
    private int size;
    private   Object[] a;
    // capacity fuction
public arrstack(int capacity){
    // gives  memory to a which we initialize before 
    a=new Object[capacity];
}
 public arrstack() {
        a = new Object[2]; // Starts with a capacity of 2 to easily test resize
    }

//    function to check whether size is null or not
public boolean isempty(){
    return(size==0);
}
public int size(){
    return size;
}
// peak function
public Object peak(){
    if (size==0){
        throw(new IllegalStateException("stack is empty"));
        
    }return a[size-1];
}
// push function
public void push(Object obj){
     if (size +1 == a.length) {
            resize();
        }
        a[size++] = obj;
   
    }
    // pop function

public Object pop(){
    if(size==0){
        throw(new IllegalStateException("stack is empty"));
       
    }Object temp=a[--size];
    a[size]=null;
    return temp;
}
// function to fetch bottom element
public Object bottom(){
    
 if(size>0){
   return a[0] ;
 }return -1;
}
// resize function to inc up the size
public   void resize(){
Object[] newarr=a;
a=new Object[2*newarr.length];
System.arraycopy(newarr,0 , a, 0, size);

}
// function to fetch the middle element
public Object middle(){
     if(size==0){
        throw(new IllegalStateException("stack is empty"));
       
    }
Object temp=a[size/2];
return temp;
}
// This function makes a new copy of a stack.
public stackll toLinkedlist(){
    stackll ls=new stackll();
    for(int i=0;i<size;i++){
ls.push(a[i]);

    }return ls;
}
// function to reverse the array stack
public void reverse(){
  
    Object we[]=new Object[size];
    for(int i=0;i<size;i++){
        we[i]=a[i];
    }
    int index=0;
  for(int i=size-1;i>=0;i--){
   a[index]=we[i];
   index++;
  }}
//   function to make the copy of stack
  public arrstack clone(){
    arrstack l=new arrstack();
    int size=size();
    for(int i=0;i<size;i++){
        l.push(a[i]);
    } return l; }
// display function
public void display(){
    for(int i=size-1;i>=0;i--){
        System.out.println(a[i]+" ");
    }
}
// function to print elements in string format
public String toString(){
    StringBuffer temp=new StringBuffer("");
    for(int i=0;i<size;i++){
        temp.append(a[i]);
    }return temp +" ";
}
// function to slices one stack into two
public  arrstack[] slices(arrstack l){
    int size=l.size();
    int mid=size/2;
   arrstack part1=new arrstack(size);
   
    arrstack part2=new arrstack(size);
    for(int i=0;i<mid;i++){
        part1.push(l.pop());
    }
     for(int i=mid;i<size;i++){
        part2.push(l.pop());
    }
    return  new arrstack[]{part1,part2};
}
// function to merge the slices of stack
public arrstack merge(arrstack part1,arrstack part2){
    // beacuse we want to run loop as timees the values in part2 stack
    int size=part2.size();

    for(int i=0;i<size;i++){
        part1.push(part2.pop());
    }
    return part1;
}
public boolean equals(arrstack as){
    if(this.size!=as.size){
        return false;
    }
    for(int i=0;i<size;i++){
        if(!this.a[i].equals(as.a[i])){
            return false;
        }
 }
    return true;
}



public static void main(String[] args){
    arrstack as=new arrstack();
    as.push(39);
    as.push(42);
    as.push(12);
    as.push(99);
    as.push(15);
    as.push(0);
    as.push(54);
    // copy.equals(as);
    System.out.println("middle element : "+  as.middle());
    arrstack copy=as.clone();
   arrstack[] result=copy.slices(copy);
   System.out.println("1 half slice");
   result[0].display();
    System.out.println("2 half slice");
   result[1].display();
   arrstack merged= copy.merge(result[0],result[1]);
   System.out.println("after merged");
   merged.display();
    //  as.reverse() ;
     stackll ar=as.toLinkedlist();
// ar.display();
System.out.println(ar);

  
//     while( !as.isempty() )     // until it’s empty,
// {                             // delete item from stack
// Object value = as.pop();
// System.out.print(value+" ");      // display it
// System.out.print("");
// }  // end while"
// System.out.println("");

}  }

