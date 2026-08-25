

 class Stringsublist {
     String data;
   Stringsublist   next;
   public Stringsublist(String data){
        this.data=data;
    }
     Stringsublist(String data,Stringsublist next){
        this.data=data;
        this.next=next;
    }
   public static Stringsublist insert(String x,Stringsublist start){
        if(start==null||start.data.compareTo(x)>0){
            start=new Stringsublist(x,start);
            return start;
        }
        Stringsublist p=start;
        while(p.next!=null ){
            if(p.next.data.compareTo(x)>0){
                break;
                }    p=p.next;      
              }p.next=new Stringsublist(x,p.next);
         return start; 

    }
     static Stringsublist sublist(Stringsublist start,int p,int q){
        if(start==null||p<0||p>q){
            return null;
        }
        Stringsublist newstart=null;
             Stringsublist current=start;
             int counter=0;
             while(current!=null&&counter<=q){
                if(counter>=p){
                      newstart=insert(current.data,newstart);
                }
              current=current.next;
              counter++;
             }
return newstart;
     }
     static  Stringsublist[] splitinhalf( Stringsublist start){
if(start==null){
    return new  Stringsublist[]{null,null};
}
int count=0;
 Stringsublist temp=start;
 while(temp!=null){
    count++;
    temp=temp.next;
 }int mid=(count+1)/2;
  Stringsublist current =start;
 for(int i=1;i<mid;i++){
current=current.next;
 }
  Stringsublist secondhalf=current.next;
  current.next=null;
  return new Stringsublist []{start,secondhalf};
     }

    public static void main(String[] args) {
         Stringsublist a=null;
a=insert("hafsa",a);
a=insert("hania",a);
a=insert("hamza",a);
a=insert("hoorain",a);
a=insert("hana",a);
a=insert("hira",a);
 Stringsublist newstart=sublist(a,2,4);
 for(Stringsublist b=newstart;b!=null;b=b.next){
    System.out.println(b.data);
 }


    }
}
