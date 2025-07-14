package composite;

public class Client {

	public static void main(String[] args) {
		Composite root = new Composite("root");

		Composite dir1 = new Composite("dir1");
		root.add(dir1);
		root.add(new Leaf("file1"));
		root.add(new Leaf("file2"));

		dir1.add(new Leaf("file3"));
		dir1.add(new Leaf("file4"));
		
		root.ls();
	}
}
