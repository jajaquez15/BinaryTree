package BinaryTreeModern;

public class Examples {
	Leaf l1 = new Leaf(1);
	Leaf l2 = new Leaf(2);
	Leaf l3 = new Leaf(3);

	BiTree b1 = new BiTree(1, l1, l2);
	BiTree b2 = new BiTree(2, l1, b1);
	BiTree b3 = new BiTree (3, b1, b2);
	BiTree b7 = new BiTree (7, b3, b3);
	BiTree b8 = new BiTree (8, b7, b7);


}
