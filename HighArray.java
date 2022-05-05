class HighArray{
			static int key;
			static int a[]=new int[11];
			static int l=10;
public HighArray(){

for(int i=0;i<l;i++)
	a[i]=i+10;
}
public boolean find(int key){
	for(int i=0;i<l;i++){
		if(key==a[i])
			return true;
	}return false;
}
public void insert(int value){
				a[l]=value;
}
public boolean delete(long d){
for(int i=0;i<a.length;i++){
	if(d==a[i]){
		int f=(a.length-1);
		for(int k=i;k<f;k++){
			a[k]=a[k+1];
		}return true;
	}
}return false;
}
public void display(){

for(int i=0;i<l;i++)
System.out.println(a[i]+" ");
}
public static void main(String args[]){
	HighArray hg= new HighArray();
	System.out.println(hg.find(11));
	hg.delete(12);
	hg.insert(100);
	hg.display();
	System.out.println();
	hg.delete(11);
	hg.insert(100);
	hg.display();
}
}
		