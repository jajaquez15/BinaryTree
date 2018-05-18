package BinaryTreeModern;

public class BiTree implements Node {
	static final Boolean isleaf = false;
	Integer value;
	Node left;
	Node right;

	public BiTree(Integer root, Node left, Node right) {
		this.value = root;
		this.left = left;
		this.right = right;
	}

	// method to print tree
	public String toString() {
		return ""+Integer.toString(this.value) + "" + this.left.toString() + "" + this.right.toString()+"\n";

	}

	// method to find tree's depth
	public Integer tDepth() {

		return 1 + Math.max(this.left.tDepth(), this.right.tDepth());

	}

	// method that outputs the number of 7's in a BiTree
	public Integer sevenCount() {

		if (this.value.equals(7)) {
			return 1 + this.left.sevenCount() + this.right.sevenCount();
		} else {
			return this.left.sevenCount() + this.right.sevenCount();
		}

	}

	@Override
	public void twoReset() {
		// TODO Auto-generated method stub
		this.value = 2;
		if(this.value.equals(2)) {
			this.left.twoReset();
			this.right.twoReset();
			
		}
		else {
			this.left.twoReset();
			this.right.twoReset();
		}	
		
	}

	@Override
	public void tGrow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean numCheck(int num) {
		// TODO Auto-generated method stub
		
		if(this.value.equals(num)) {
			return true;
		}
		else {
			return this.left.numCheck(num) || this.right.numCheck(num);
		}
	}

	@Override
	public void ScreenPrint() {
		// TODO Auto-generated method stub
		 int [][] bfprint = new int[tDepth()+4][tDepth()+7];
	      
		  	
		 for(int i=0; bfprint.length > i; i++) {
			 for(int j=0; bfprint[i].length > j;j++) {
				 
				 bfprint[i][j] = 0;
				 
			 }
			 
		 }
		 
		 int x_pos = ((tDepth()+6)/2);
		 
		 bfprint[tDepth()][x_pos-2] = this.value;
		 
		 this.left.ScreenPrint();
		 this.right.ScreenPrint();
		 
		 for(int i=0; bfprint.length > i; i++) {
			 for(int j=0; bfprint[i].length > j;j++) {
				 
				 System.out.print(bfprint[i][j]);
				 
			 }
			 System.out.println();
			 
			 
		 }
		 
	}

	
	 	
}
