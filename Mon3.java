import java.util.*;


public class Mon3 {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] data = line.split(" ");
        ArrayList<Integer> kekka=new ArrayList<Integer>();
        int[] kizyun={0,0};
        for (int i = 0; i < data.length; i++) {     //定数と個数
            kizyun[i] = Integer.parseInt(data[i]);
            //System.out.println(kizyun[i]);
        }
        
        for (int i = 0; i < kizyun[1]; i++) {     //個数分繰り返し 
            String s = sc.nextLine();
            int omosa=Integer.parseInt(s);
            
           if(omosa<=kizyun[0]){
               kekka.add(kizyun[0]);
           }else{
               int num=omosa/kizyun[0];
               if(omosa%kizyun[0]<(double)kizyun[0]/2){
                   kekka.add(kizyun[0]*num);
               }else{
                   kekka.add(kizyun[0]*(num+1));
               }
           }
           
        }
         for(int i:kekka){
           System.out.println(i);
       }
        

    }
}