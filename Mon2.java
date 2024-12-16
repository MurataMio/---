import java.util.*;
public class Mon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] data = line.split(" ");
        ArrayList<Integer> goukaku=new ArrayList<Integer>();
        int[] kizyun={0,0};
        for (int i = 0; i < data.length; i++) {     //人数と合格点
            kizyun[i] = Integer.parseInt(data[i]);
            //System.out.println(kizyun[i]);
        }
        int ten;
        int[] seito={0,0};
        for (int i = 0; i < kizyun[0]; i++) {     //人数分繰り返し 
            line = sc.nextLine();
            data = line.split(" ");
            
            for (int j = 0; j < data.length; j++) {     //個々の点数と欠席数
                seito[j] = Integer.parseInt(data[j]);
               // System.out.println(seito[j]);
            }
           if((seito[0]-(seito[1]*5))<=0){
               ten=0;
           }else{
               ten=(seito[0]-(seito[1]*5));
           }
           
           if(ten>=kizyun[1]){
               
               goukaku.add(i+1);
           }//System.out.println(i +":"+ten);
        }
       
       for(int i:goukaku){
           System.out.println(i);
       }
    }
}