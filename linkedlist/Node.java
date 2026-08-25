class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    Node(int data,Node next){
        this.data=data;
        this. next=next;
    }public static void main(String[] args) {
        int counter=0;
        int sum=0;
        Node start=new Node(1);
        Node p=start;
        // this loop is for add value in linkedlist
        for(int i=2;i<=10;i++){
          p.next=new Node(i);
         p=p.next;
        }  
        // this loop is for tranversing
        for (Node i=start;i!=null;i=i.next){
            counter++;
            sum+=i.data;
 System.out.print(i.data+"->");
 
             } 
                  System.out.println(" Counter : "+counter);
            System.out.println("Sum : "+sum);}
}
