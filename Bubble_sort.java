public class Main
{
	public static void main(String[] args) {
		//bubble sort
		int arr[]={2,1,9,-1,4},temp;
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]<arr[i]){
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
