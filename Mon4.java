import java.util.*;
import java.util.Collections;

class Mon4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n=Integer.parseInt(line);
        int[][] tizu=new int[n][n];
        ArrayList<Integer> height=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] data = line.split(" ");
            for(int j=0;j<n;j++){
                tizu[i][j]=Integer.parseInt(data[j]);
            }
        }



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               
                if(n==1){
                    height.add(tizu[0][0]);
                }else if(i==0 && j==0){
                    if(tizu[i][j]>tizu[i+1][j] && tizu[i][j]>tizu[i][j+1] ){    //下と右を確認
                        height.add(tizu[i][j]);
                    }
                }else if(i==0 && j!=n-1){
                    if(tizu[i][j]>tizu[i+1][j] && tizu[i][j]>tizu[i][j+1] && tizu[i][j]>tizu[i][j-1]){//下と右と左を確認
                      height.add(tizu[i][j]);
                    }
                }else if(i==0 && j==n-1){
                    if(tizu[i][j]>tizu[i+1][j]  && tizu[i][j]>tizu[i][j-1]){//下と左を確認
                      height.add(tizu[i][j]);
                    }
                }else if(j==0 && i!=n-1){
                    if(tizu[i][j]>tizu[i+1][j] && tizu[i][j]>tizu[i][j+1] && tizu[i][j]>tizu[i-1][j]){//下と右と上を確認
                      height.add(tizu[i][j]);
                    }
                }else if(j==0 && i==n-1){
                    if(tizu[i][j]>tizu[i][j+1] && tizu[i][j]>tizu[i-1][j]){//右と上を確認
                      height.add(tizu[i][j]);
                    }
                }else if(i==n-1 && j!=n-1){
                    if(tizu[i][j]>tizu[i-1][j]  && tizu[i][j]>tizu[i][j+1] && tizu[i][j]>tizu[i][j-1]){//上と右と左を確認
                      height.add(tizu[i][j]);
                    }
                }else if(i==n-1 && j==n-1){
                    if(tizu[i][j]>tizu[i-1][j]  &&  tizu[i][j]>tizu[i][j-1] ){//上と左を確認
                        height.add(tizu[i][j]);
                    }
                }else if(i!=n-1 && j==n-1){
                    if(tizu[i][j]>tizu[i+1][j]  && tizu[i][j]>tizu[i][j-1] && tizu[i][j]>tizu[i-1][j]){//下と左と上を確認
                      height.add(tizu[i][j]);
                    }
                }else{
                   if(tizu[i][j]>tizu[i-1][j]  && tizu[i][j]>tizu[i][j+1] && tizu[i][j]>tizu[i][j-1] && tizu[i][j]>tizu[i+1][j] ){//上と右と左と下を確認 
                        height.add(tizu[i][j]);
                    }
                }
               
            }
        }
        Collections.sort(height, Collections.reverseOrder());

        for(int hei:height){
            System.out.println(hei);
        }


    }
}