class LinkedList
{
	static Node head;
	static class Node{
	int data;
	Node next;
	Node(int d);
	{
		data=d;
		next=null;
	}
	}
	public void insertNode(int new_node)
	{
		Node node=new Node(new_node);
		if(head==null){
			head=new_node;
			return head;
	}
	new_node.next=null;
	Node curr=head;
	}
	new_Node.next=null;
	Node curr=head;
	while(curr.next!=null){
		curr=curr.next;
	}
	curr.next=new_nodw;
	return head;
	}
	staic display(){
		Node curr=head;
		while(curr!=null){
			System.out.println(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("Null");
	}
}
	
public static void main(String args[])
{
	LinkedList l1=new linkedList();
	insertNode(1);
	insertNode(2);
	insertNode(3);
	reverse(head);
}
}
	
	
	
	
		
	