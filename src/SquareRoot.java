
public class SquareRoot {
	public int sqrt(int a) {
	    if(a==0){
	        return 0;
	    }
	    if(a==1){
	        return 1;
	    }
	    int start = 1;
	    int end = a;
	    int result = 0;
	    while(start<end){
	        int mid = start+(end-start)/2;
	        if(mid==(a/mid)){
	            return mid;
	        }
	        else if(mid<(a/mid)){
	            result = mid;
	            start = mid+1;
	        }
	        else{
	            end = mid;
	        }
	    }
	    return result;
	}
}