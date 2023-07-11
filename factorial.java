import java.util.*;
class factorial{
    public static int factorialn(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;    
    }
    public static int bincofficient(int n,int r){
        int fact_n=factorialn(n);
        int fact_r=factorialn(r);
        int fact_nmr=factorialn(n-r);

        int bincofficient=fact_n/(fact_r*fact_nmr);
        return bincofficient;

    }
    
        
    public static void main(String []args){
        System.out.println(factorialn(5));
        
        System.out.println(bincofficient(5,2));


        }
}
