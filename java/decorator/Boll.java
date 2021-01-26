package decorator;

class Boll extends Decorator {
	public Boll(Tree tree) {
		super(tree);
	}

	public void showOrnaments() {
		super.showOrnaments();
		System.out.print("Boll, ");
	}
}
