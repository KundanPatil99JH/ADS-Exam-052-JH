import java.util.Scanner;
class Array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array index :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int ch;
		int j;
		int key;
		
		System.out.println("\n0.Exit \n1.Insert \n2.Search \n3.Display \n4.Delete");
		lp:while(true){
			System.out.println("Make Your Choice");
			ch = sc.nextInt();
			switch(ch){
				case 1: for(int i=0;i<n;i++){
						   arr[i] = sc.nextInt();
					   }
					   System.out.println();
					   for(int i=0;i<n;i++){
						   System.out.print(arr[i]+" ");
					   }
					   System.out.println();
					   break;
				
				case 2: System.out.println("Enter Array Elements :");
				        for(int i=0;i<n;i++){
					    arr[i] = sc.nextInt();
				       }
				        System.out.println("Enter Search Key :");
        				key = sc.nextInt();
				       for(j=0;j<n;j++){
						   if(arr[j] == key)
							   break;
					   }
					   if(arr[j] == n)
						   System.out.println("not found");
					   else
						   System.out.println("found");
					   break;
					   
				case 3: System.out.println("Enter Array Element :");
				        for(int i=0;i<n;i++){
							arr[i] = sc.nextInt();
							
						}
				        for(int i=0;i<n;i++){
					        System.out.print(arr[i]+" "); 
				        }
						System.out.println();
						break;
				
				case 4: System.out.println("Enter Array element :");
				        for(int i=0;i<n;i++){
							arr[i] = sc.nextInt();
						}
				        key = 3;
				        for(j=0;j<n;j++)
							if(arr[j] == key)
								break;
						
				        for(int k=j;k<n;k++){
							arr[k] = arr[k+1];
                        n--;								
				      }
					  for(int i=0;i<n;i++){
						  System.out.print(arr[i]+" ");
					  }
					  System.out.println();
					  break;
				case 0:break lp;
				default : System.out.println("Invalid Input");
			}
		}
	}
}
