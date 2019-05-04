import java.util.Random;

public class CreateRandomArray {

	public int[] randomArray(int length) {

		int[] randomArray = new int[length];

		for (int i = 0; i < length; i++) {
			Random rand = new Random();
			int n = rand.nextInt(length);
			randomArray[i] = n;
		}

		return randomArray;

	}

}
