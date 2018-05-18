package BinaryTreeModern;

public class Leaf implements Node {
	static final Boolean isleaf = true;

	Integer value;
	int [][] bfprint;


	public Leaf(Integer value) {
		this.value = value;
	}

	public String toString() {
		return Integer.toString(this.value);
	}

	// method to find tree's depth
	public Integer tDepth() {
		return 0;
	}

	// method that outputs the number of 7's in a BiTree
	public Integer sevenCount() {
		if (this.value.equals(7)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public void twoReset() {
		// TODO Auto-generated method stub
		this.value = 2;
		
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
		return false;
		}
	}

	@Override
	public void ScreenPrint() {
		// TODO Auto-generated method stub
		 int [][] bfprint = new int[tDepth()+2][tDepth()+5];
	      
	  	
		 for(int i=0; bfprint.length > i; i++) {
			 for(int j=0; bfprint[i].length > j;j++) {
				 
				 bfprint[i][j] = 0;
				 
			 }
			 
		 }
		 int x_pos = ((tDepth()+6)/2);
		 
		 bfprint[tDepth()+1][x_pos ] = this.value;
		 
		 for(int i=0; bfprint.length > i; i++) {
			 for(int j=0; bfprint[i].length > j;j++) {
				 
				 System.out.print(bfprint[i][j]);
				 
			 }
			 System.out.println();
			 
		 }
		 
		 
		 
	
	}


}
