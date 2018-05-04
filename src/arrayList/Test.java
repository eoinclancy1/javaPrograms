package arrayList;

public class Test {

	public static void main(String[] args) {
		ResizeableArray arr = new ResizeableArray(3);
        System.out.println(arr.getSize());
        arr.append(4);
        arr.append(8);
        arr.append(12);
        System.out.println(arr.getSize());
        arr.append(12);
        System.out.println(arr.getSize());

	}

}
