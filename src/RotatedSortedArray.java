import java.util.List;

public class RotatedSortedArray {
	public int search(final List<Integer> a, int b) {
	    if(a.size()==0){
	        return -1;
	    }
	    int low = 0;
	    int high = a.size()-1;
	    while(low<high){
	        int mid = (low+high)/2;
	        if(a.get(mid)<=a.get(high)){
	            if(a.get(mid)<b && a.get(high)>=b){
	                low = mid+1;
	            }
	            else{
	                high = mid;
	            }
	        }
	        else{
	            if(a.get(mid)>=b && a.get(low)<=b){
	                high = mid;
	            }
	            else{
	                low = mid+1;
	            }
	        }
	    }
	    if(a.get(low)==b){
	        return low;
	    }
	    return -1;
	}
}
