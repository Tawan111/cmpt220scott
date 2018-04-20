import java.util.ArrayList;

public class Problem13_3 {

	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<>();
		list.add(6);
		list.add(4.5);
		list.add(7.2);
		list.add(9.3);
		list.add(3.5);
		list.add(4.24);
		list.add(8.543);
		list.add(4.44);
		list.add(4.98);
		list.add(5.55);

		System.out.println(list.toString());

		sort(list);
		System.out.println(list.toString());
	}

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}
}