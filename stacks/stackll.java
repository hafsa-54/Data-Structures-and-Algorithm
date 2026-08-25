public   class stackll implements stack{
    private int size;
    private node top;
    class node{
        node next;
       
        Object data;
        
         node(node next,Object obj){
            this.data=obj;
            this.next=next;} 
    }
public boolean isempty(){
    return(size==0);
}
public int size(){
    return size;
}
public Object peak(){
    if (size==0){
        throw(new IllegalStateException("stack is empty"));
        
    }return top.data;
}
public Object bottomele(){
     
    if(top==null){
        throw(new IllegalStateException("stack is empty")); 
    }
node current=top;
while(current.next!=null){
    current=current.next;
}return current.data;

}public void push(Object obj){
    top=new node(top,obj);
    ++size;
}
public Object pop(){
    Object temp =top.data;
    top=top.next;
    --size;
    return temp;
}
public Object medium(){
    int midindex=size()/2;
   node temp=top;
   for(int i=0;i<midindex;i++){
    temp=temp.next;
   }return temp.data;

}
public void display(){
  for(node i = this.top ; i!= null ; i = i.next){
            System.out.println(i.data);
    }
}
public arrstack toArrayStack(){
    arrstack s=new arrstack(this.size);
    for(node i=this.top;i!=null;i=i.next){
    s.push(i.data);
    }
    // make new stack to reverse out linkedlist so we can easily fetch out last element
      arrstack is=new arrstack(s.size());
      for(int j=0;j<=s.size();j++){
        is.push(s.pop());
      }return is;

}
 public void reverse(){
       Object list[] = new Object[size];
       node temp = top;
       for(int i = 0 ; i< size ; i++){
           list[i] = temp.data;
           temp = temp.next;
       } top = null;
       for(int i = 0 ; i< size ; i++){
           top = new node(top, list[i]);
       }for(node i = top ; i!= null ; i = i.next){
            System.out.println(i.data);
        }}
 
    public stackll merge(stackll m,stackll mi){
    for(int i=0;i<size;i++){
            m.push(mi.pop());
        }
        return m;
    }

public static void main(String[] args){
   stackll l=new stackll();
   l.push(1);
   l.push(2);
   l.push(3);
   l.push(16);
   l.push(23);
   l.push(34);
   l.size();
   int size=l.size();
   int mid=size/2;
   stackll m=new stackll();
    stackll mi=new stackll();
     System.out.println("1 half slice");
   for(int i=0;i<mid;i++){
   
    m.push(l.pop());}
    m.display();
        System.out.println("2 half slice");
     for(int i=mid;i<size;i++){
        
    mi.push(l.pop());}
    mi.display();
//  arrstack is=l.toArrayStack();
System.out.println("after merged");
stackll merged=l.merge(m, mi);
merged.display();

// is.display();

  
}}
//    l.pop();
//    l.size();
//    System.out.println("size: "+l.size());
//    System.out.println("bottom element : "+ l.bottomele());
//    System.out.println("medium eleement :"+ l.medium());
//    System.out.println("the reverse order of stack: ");
//    l.reverse(); }}