import cse360assignment02.AddingMachine;

public class AddingMachineTester {
	public static void main(String[] args) {
		AddingMachine am = new AddingMachine();
		am.add(5);
		System.out.println(output(am.getTotal() == 5) + "am.getTotal() == 5");
		am.add(3);
		System.out.println(output(am.getTotal() == 8) + "am.getTotal() == 8");
		am.subtract(9);
		System.out.println(output(am.getTotal() == -1) + "am.getTotal() == -1");
		am.add(1);
		System.out.println(output(am.getTotal() == 0) + "am.getTotal() == 0");
		System.out.println(output(am.toString().equals("0 + 5 + 3 - 9 + 1")) + "am.toString().equals('0 + 5 + 3 - 9 + 1')");
		am.subtract(3);
		System.out.println(output(am.getTotal() == -3) + "am.getTotal() == 0");
		System.out.println(output(am.toString().equals("0 + 5 + 3 - 9 + 1 - 3")) + "am.toString().equals('0 + 5 + 3 - 9 + 1 - 3')");
		AddingMachine am2 = new AddingMachine();
		am2.add(99);
		System.out.println(output(am.getTotal() == -3) + "am.getTotal() == -3");
		System.out.println(output(am.toString().equals("0 + 5 + 3 - 9 + 1 - 3")) + "am.toString().equals('0 + 5 + 3 - 9 + 1 - 3')");
		System.out.println(output(am2.getTotal() == 99) + "am2.getTotal() == 99");
		System.out.println(output(am2.toString().equals("0 + 99")) + "am.toString().equals('0 + 99')");
		am.clear();
		System.out.println(output(am.getTotal() == -3) + "am.getTotal() == -3");
		System.out.println(output(am.toString().equals("-3")) + "am.toString().equals('-3')");
		am.add(7);
		System.out.println(output(am.getTotal() == 4) + "am.getTotal() == 4");
		System.out.println(output(am.toString().equals("-3 + 7")) + "am.toString().equals('-3 + 7')");
		am2.subtract(90);
		System.out.println(output(am2.getTotal() == 9) + "am2.getTotal() == 9");
		System.out.println(output(am2.toString().equals("0 + 99 - 90")) + "am.toString().equals('0 + 99 - 90')");
	}

	public static String output(boolean bool) {
		if (bool) {
			return "\u001B[1;32mPASSED\u001B[0m ";
		} else {
			return "\u001B[1;31mFAILED\u001B[0m ";
		}
	}
}
