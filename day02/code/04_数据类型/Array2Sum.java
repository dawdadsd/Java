/*
	ÐèÇó£º
*/

class Array2Sum {
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {//用于迭代访问 arr 的每一个子数组
			for (int j=0; j<arr[i].length; j++) {//用于迭代访问当前子数组中的每个整数元素
				sum +=arr[i][j];//最后sum变量将包含arr数组中所有元素的总和
			}
		}
		System.out.println("×ÜÊýÎª£º" +sum);//乱码部分为数组的总和为，+sum为输出值
	}
}
