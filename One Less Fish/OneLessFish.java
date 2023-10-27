import java.util.*;

class OneLessFish {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int [] weight = new int[n];
		for(int i=0;i<n;i++){
			weight[i] = scanner.nextInt();
		}
		int bowlWeight = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(weight[i]<bowlWeight){
				bowlWeight= weight[i];
			}
		}
		System.out.println("Fish Weights :-");
		for(int i=0;i<n;i++){
			int fishWeight = weight[i]-bowlWeight;
			if(fishWeight!=0){
				System.out.print(fishWeight+" ");
			}
		}
	}
}