import java.util.ArrayList;

public class SortInsertPosition {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    if(a.size()==0){
	        return -1;
	    }
	    if(a.get(a.size()-1)<b){
	        return a.size();
	    }
	    int low = 0;
	    int high = a.size()-1;
	    while(low<high){
	        int mid = (low+high)/2;
	        if(a.get(mid)<b){
	            low = mid+1;
	        }
	        else{
	            high = mid;
	        }
	    }
	    return high;
	}
}
