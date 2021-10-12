
public class IterativeSearcher {

	public int doBinarySearch(IntegerArray arrayToSort, int i) {
		int low = 0;
		int high = arrayToSort.length() - 1;
		
		int result = -1;

		 while (low <= high) {
		        int mid = (low + high)/2;
		        int value = arrayToSort.read(mid);
		        if (value == i)
		        {
		            result = mid;
		            high = mid - 1;
		        }
		        else if (value < i) {
		            low = mid + 1;
		        }
		        else {
		            high = mid - 1;
		        }
		    }
		 
		    return result;
		}
}

