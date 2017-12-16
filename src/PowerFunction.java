import java.math.BigInteger;

public class PowerFunction {
	public int pow(int x, int n, int d) {
	    return BigInteger.valueOf(x).modPow(BigInteger.valueOf(n),BigInteger.valueOf(d)).intValue();
	    
	    /*
	    if(x==0){
	        return 0;
	    }
	    if(n==0){
	        return 1;
	    }
	    if(n==1){
	        if(x<0){
	            return (x+d)%d;
	        }
	        else{
	            return x%d;
	        }
	    }
	    int pn = 0;
	    if(n>0){
	        pn = n;
	    }
	    else{
	      pn = (-1)*n;  
	    }
	    int p = pn;
	    int px = 0;
	    if(x>0){
	       px = x; 
	    }
	    else{
	        px = -x;
	    }
	    int result = px;
	    int i = 1;
	    while(pn/2>0){
	        result = result*result;
	        pn = pn/2;
	        i = i*2;
	    }
	    result = result*pow(px,p-i,d);
	    if(x<0 && n%2==1){
	        result = -result;
	    }
	    if(n<0){
	        result = 1/result;
	    }
	    result = result%d;
	    if(result<0){
	        return (result+d)%d;
	    }
	    return result;
	    */
	}
}
