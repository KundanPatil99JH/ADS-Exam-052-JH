class Sorting
{
	static void insertionsort(int arr[],int n)
	{
		int r=arr[4];
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i-1]<r)
			{
				arr[i]=r;
				System.out.println();
				for(int x:arr)
				{
				System.out.print(x+" ");
				}
				return;
			}
			else
			{
				arr[i]=arr[i-1];
				System.out.println();
				for(int x:arr)
				{
					System.out.print(x+" ");
				}
		}
	}
}
	public static void main(String args[]){
	int[]arr={1,4,6,8,3};
	int n=arr.length;
	insertionsort(arr,n);
	}
}

				