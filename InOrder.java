
public class InOrder {

	public static void main(String[] args) {
		new InOrder().run();

	}
	class Node{
	Node left;
	Node right;
	int value;
	
	public Node(int value) {
	this.value=value;
	}
	}
	public void run() {
		Node donor= new Node(20);
		System.out.println("Given : 20, 12, 18, 31, 9, 25, 41, 15, 60 , 35,40");
		System.out.println("==================================================");
		insert(donor,20);
		insert(donor,12);
		insert(donor,18);
		insert(donor,31);
		insert(donor,9);
		insert(donor,25);
		insert(donor,41);
		insert(donor,15);
		insert(donor,60);
		insert(donor,35);
		insert(donor,40);		
		System.out.println("==================================================");
		printinOrder(donor);	
		
	}
	
		
	
	public void insert(Node node, int value) {
		if(value<node.value) {
		if(node.left!=null) {
		insert(node.left, value);
		}
		 else {
		System.out.println("Inserted "+value+" to left of node "+node.value);
		node.left=new Node (value);
		}
			
	}else if(value>node.value) {
		if(node.right!=null) {
		insert(node.right,value);
		}
		else {
			System.out.println("Inserted "+value+" to right of node "+node.value);
			node.right=new Node(value);
		}
	}	
}
	public void printinOrder(Node node) {
		if(node!=null) {
			printinOrder(node.left);
			System.out.println(" Traversed InOrder "+node.value);
			printinOrder(node.right);
		}
	}
}


