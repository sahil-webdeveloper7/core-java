package Array;

public class Identity_matrix {

	public static void main(String[] args) {
		
		int [][] arr= new int[2][2];
		
		arr[0][0]=1;    // 1 0
		                // 0 1
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		
		boolean zero_check=true;
		boolean one_check=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i == j)
				{
					if(arr[i][j]!=1)
					{
						one_check=false;
						break;
					}
				}
				else
				{
					if(i != j)
					{
						if(arr[i][j]!=0)
						{
							zero_check=false;
							break;
						}
					}
					
				}
			}
			
		}
		if(zero_check && one_check)
		{
			System.out.println("Identity");
		}
		else
		{
			System.out.println("Normal");
		}

	}

}
