  class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    Node(int data ,Node next){
        this.next=next;
        this.data=data;
    }
    //                 value  ,  next to connected
  static Node insert(int x,Node start){
        if(start==null||start.data>x){
            start=new Node(x,start);
            return start;
}Node p=start;
while(p.next!=null&&p.next.data<x){
   p=p.next;
    }p.next=new Node(x,p.next);

return start;    }
static Node replace(int x,Node start,int y){
    if(start==null||start.data>x){
        return start;}
        if(start.data==x){
            start.data=y;
            return start;
        }
        for(Node p=start;p!=null;p=p.next){
            if(p.next.data>x){
                break;
            }
            if(p.next.data==x){
                p.next.data=y;
                break;
            }
  }return start;
}
static Node delete(int x,Node start){
    if (start==null||start.data>x){
        return start;
    }
    if(start.data==x){
            return start.next;
    }
    for(Node p=start;p!=null;p=p.next){
        if(p.next.data>x){
            break;
        }
        if(p.next.data==x){
            p.next=p.next.next;
            break;
        }

    }return start;

}
// merge in sorted way
static Node merge(Node n1,Node n2){
  
   Node n3=null;
  
   for(Node i=n1;i!=null;i=i.next){
    n3= Node.insert(i.data,n3);

   }
    for(Node i=n2;i!=null;i=i.next){
    n3= Node.insert(i.data,n3);
}
for(Node i=n3;i!=null;i=i.next){
System.out.println(i.data);
}return n3;
}
static int get_max(Node start){
    int max=start.data;
    for(Node i=start;i!=null;i=i.next){
        if(i.data>max){
            max=i.data;
}
    }return max;
}
// slices
static Node[] slices(Node parentnode){
    Node slice_1=null;
    Node slice_2=null;
    Node current=parentnode;
    while(current!=null){
        if(current.data<=500){
            slice_1=Node.insert(current.data,slice_1);
        }else{
            slice_2=Node.insert(current.data,slice_2);}
   current=current.next; }

return new Node[]{slice_1,slice_2};

}



// method for printing no in linked list
static void print_all(Node s){
    for(Node i=s;i!=null;i=i.next){
        System.out.print(i.data+" ");
    }
    System.out.println("-> null");
} }

public class ll_methods {
    public static void main(String[] args) {
        
//         Node n1=null;
//         Node n2=null;
//          for(int i=5;i<=30;i++){
//     n1=Node.insert(i,n1);
//    }
//     for(int i1=1;i1<=21;i1++){
//     n2=Node.insert(i1,n2);
//    }
        Node start=null;
        Node mstart=null;
        Node nstart=null;

        start=Node.insert(100,start);
         start=Node.insert(181,start);
        start=Node.insert(534,start);
        start=Node.insert(698,start);
         start=Node.insert(911,start);
        start= Node.delete(81,start);
          start=Node.insert(600,start);
         start=Node.insert(111,start);
        start= Node.delete(381,start);
   
        System.out.println(start.get_max(start));
//         System.out.println("parent node");
//               Node.print_all(start);
//        Node result[]=Node.slices(start);
//        Node list_1=result[0];
//         Node list_2=result[1];
//  System.out.println("Sliced List 1 (<= 500):");
//     Node.print_all(list_1); 

//     System.out.println("Sliced List 2 (> 500):");
//     Node.print_all(list_2);

    //    Node.merge(n1,n2);

    }
}
