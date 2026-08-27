 public class LinkedQueue   implements queue{
  private static class node{
        Object data;
        node previous=this,next=this;
        node(Object data){
            this.data=data;
        }
        node(Object data,node previous,node next){
            this.data=data;
            this.next=next;
            this.previous=previous;
        }
 }
public Object remove(){
    if(size==0){
        throw(new IllegalStateException("Queue is Empty"));
    }
    --size;
    // head---><---node A---><---node B
    // temp stores data of node A
    Object temp=head.next.data;
    // head now breaks their connection with node A and directly connect with node B
    head.next=head.next.next;
    // now node B also disconnects their  reverse connection with node A
    // and node A completely vanished out
    head.next.previous=head;
    return temp;
}
    private int size;
    private node head=new node(null);
    public int size(){
        return size;
    }
    public Object first(){
        if(size==0){
            throw(new IllegalStateException("queue is empty"));
            
        }return head.next.data;
    }
    public void add(Object obj ){
++size;
head.previous.next=new node(obj,head.previous,head);
head.previous=head.previous.next;
    }
  public Object[] toarray(){
    Object[] a=new Object[size];
    int index=0;
    for(node i=this.head.next;i!=head;i=i.next){
    a[index++]=i.data;
    }
    return a;
}
public Object[] nrearele(int n){
    if(n>size||n<1){
        return new Object[]
        {null};
    }
    Object[] a =new Object[size];
    node temp=head.next.previous;
    for(int i=0;i<n;i++){
a[i]=temp.data;
   temp=temp.previous; }
    return a;
}
 
public void clone(Object obj){

}
    // }
    public String toString(){
        
        
        StringBuffer temp=new StringBuffer(" ");
        for(node i=this.head.next;i!=head;i=i.next) {
            temp.append(i.data);
            temp.append(" ");
        }
        return (temp+" ");
    }
public static void main(String[] args) {
    LinkedQueue credit=new LinkedQueue();
    System.out.println("the element in queue");
    credit.add(75);
    credit.add(80);
    credit.add(12);
    credit.add(02);
    credit.add(53);
    System.out.println(credit);
     LinkedQueue debit=new LinkedQueue();
    System.out.println("the element in queue");
    debit.add(65);
    debit.add(90);
  debit.add(12);
  debit.add(12);
    debit.add(23);
    System.out.println(debit);
    int size=credit.size();
    int sum_deb=0,sum_cred=0;
    while(size!=0){
        int cred=(int) credit.remove();
        sum_cred+=cred;
        size--;
    }
    size=debit.size();
    while(size!=0){
        int deb=(int)debit.remove();
        sum_deb+=deb;
        size--;
    }
    int Balance=sum_cred-sum_deb;
    System.out.println("total amount : "+sum_cred);
    System.out.println("total amount spent : "+sum_deb);
    System.out.println("Balance : "+Balance);

}
}
