public class LL_stobj {
 static class node{
   static class Student{
        String name;
        int id;
        double gpa;
        String dept;
        Student(){}
        Student(String name,int id,double gpa,String dept){
            this.name=name;
            this.id=id;
            this.dept=dept;
            this.gpa=gpa;
        }
        @Override 
        public String toString(){
            return id + name + dept + gpa;
        }
    }Student data;
    node next;
    node(){
        this.data=data;
    }
    node(Student data,node next){
        this.data=data;
        this.next=next;
    }
    static node insert(Student data,node start){
if(start==null){
     return new node(data,start);
 

}node p=start;
while(p.next!=null){
    p=p.next;

}p.next=new node(data,p.next);
    return start;}
    static node find(String x,node start){
        for(node i=start;i!=null;i=i.next){
            Student s=i.data;
            String str_id=String.valueOf(s.id);
  String str_gpa=String.valueOf(s.gpa);
  if (str_id.equals(x)||str_gpa.equals(x)||s.name.equals(x)||s.dept.equals(x)) {
  System.out.println("found : "+ s.id+" " +s.name+" " +s.dept+" "+s.gpa);
    
  }
        }return start;
    }

public static void main(String[] args) {
     node start=null;
   Student s1=new Student("hafsa",32,3.97,"AI");
 Student s2=new Student("huna",1019,3.07,"AI");
  Student s3=new Student("umaima",380,3.90,"AI");
   Student s4=new Student("amber",312,7.40,"AI");
    Student s5=new Student("muna",102,3.87,"AI");
     Student s6=new Student("Sana",980,3.97,"AI");
     start=insert(s1,start);
     start=insert(s2,start);
     start=insert(s3,start);
     start=insert(s4,start);
     start=insert(s5,start);
     start=insert(s6,start);
     for(node i=start;i!=null;i=i.next){
        System.out.println(i.data+" ");

     }start =find("3.97",start);




}

   
}
}