class foo {
		public int value;
		public foo (int num) {
			value = num;
		}
		public void getValue(int num) {
			num = value;
		}
		public static void change(foo obj) {
			
			obj.value = 10;
			obj = new foo(-1);
		}
	}

public class code {

	public static void main(String[] args) {
		foo g = new foo(3);
		System.out.printf("%d\n\n", g.value);
		foo.change(g);
		int h;
		g.getValue(out h);
		System.out.printf("%d\n\n", h); 
		
	}
}