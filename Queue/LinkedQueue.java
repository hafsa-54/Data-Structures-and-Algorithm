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
// public Object remove(){}
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
    // public void credit_queue(Object obj){
 
public void clone(Object obj){

}
    // }
    public String toString(){
        node current=head.next;
        
        StringBuffer temp=new StringBuffer(" ");
        for(current=head.next;current!=head;current=current.next) {
            temp.append(current.data);
            temp.append(" ");
        }
        return (temp+" ");
    }
public static void main(String[] args) {
    LinkedQueue credit=new LinkedQueue();
    System.out.println("the element in queue");
    credit.add(65);
    credit.add(80);
    credit.add(12);
    credit.add(02);
    credit.add(23);
    System.out.println(credit);
     LinkedQueue debit=new LinkedQueue();
    System.out.println("the element in queue");
    debit.add(65);
    debit.add(80);
  debit.add(12);
  debit.add(02);
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
