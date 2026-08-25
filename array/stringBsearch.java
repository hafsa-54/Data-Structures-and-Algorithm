public class stringBsearch {
    public static String binarysearch(String[] arr,String target){
        int start=0;
        int end=arr.length;
       
        while(start<=end){
             int mid=(start+end)/2;
            if(arr[mid].equals(target)){
                return arr[mid];
            }
         if(arr[mid].compareTo(target)<mid){
            end=mid-1;

         }else{  start=mid+1;}
        
          
         }
         return null;
        }

        public static void main(String[] args){
            String[] arr={"honda","kiwi","civic","alto"};
            String target="honda";
            String res=binarysearch(arr,target);
            if(res==null){
                System.out.println("not found");
            }else{
                 System.out.println(" found"+res);
            }

            

        }
    

    }
    

