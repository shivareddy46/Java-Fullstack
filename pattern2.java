public class pattern2{
    public static void main(String ar[]){
        int n=10;
        int temp=10;
        for(int i=1;i<n;i++){
            System.out.println(i*((temp-1)/9));
            temp*=10;
        }
    }
}
