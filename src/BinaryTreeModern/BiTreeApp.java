package BinaryTreeModern;

public class BiTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examples e1 = new Examples();

		Leaf l1 = new Leaf(1);
		Leaf l2 = new Leaf(2);
		Leaf l3 = new Leaf(3);

		BiTree b1 = new BiTree(1, l1, l2);
		BiTree b2 = new BiTree(2, l1, b1);
		BiTree bx = new BiTree(2, b1, b1);
		
		BiTree b3 = new BiTree (3, b1, b2);
		BiTree b7 = new BiTree (7, b3, b3);
		BiTree b8 = new BiTree (8, b7, b7);
		/*System.out.println(e1.b2.toString());
		System.out.println(e1.b3.tDepth());
		System.out.println(e1.b8.toString());
		System.out.println(e1.b8.sevenCount());*/
		
		System.out.println(e1.b2.toString());
		e1.b2.twoReset();
		System.out.println(e1.b2.toString());
		
	}

}
