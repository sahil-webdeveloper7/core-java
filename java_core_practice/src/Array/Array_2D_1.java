package Array;

public class Array_2D_1 {

	public static void main(String[] args) {
		
		int [][] arr= new int[3][3];
		
		System.out.println("--------------------------------");
		System.out.println(arr.length);
		System.out.println("--------------------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=10;
			}
		}
		System.out.print(arr[2][2]+" ");

	}

}
