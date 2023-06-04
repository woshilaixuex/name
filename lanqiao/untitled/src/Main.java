import java.util.*;
public class Main {
    static int n;
    static int d;
    static int[] t = new int[100010];
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        n = sca.nextInt();
        while(n-- > 0){
            String x = sca.next();
            if(x.equals("H")) {
                Integer a = sca.nextInt();
                t[d++] = 0;
                list.add(0,a);
            }else if(x.equals("D")){
                int a = sca.nextInt();
                list.remove(t[a]);
            }else{
                int a = sca.nextInt();
                Integer b = sca.nextInt();
                t[d++] = t[a]+1;
                list.add(t[a],b);
            }
        }
        for(Integer k:list){
            System.out.print(k+" ");
        }
    }
}