package BinaryTreeModern;

public interface Node {

	// method to find tree's depth
	public Integer tDepth();

	// method that outputs the number of 7's in a BiTree
	public Integer sevenCount();
	//method that resets all entries in a tree to 2
	public void twoReset();
	//method to grow a tree by adding new 1-nodes to each leaf
	public void tGrow();
	
	//seven check
	public boolean numCheck(int num);
	
	public void ScreenPrint();
	


}
