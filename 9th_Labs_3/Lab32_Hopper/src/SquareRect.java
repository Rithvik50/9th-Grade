
public class SquareRect extends AbstractDance {
	private static DanceStep[] steps = { 
			new DanceStep(0, -50, 0, 0, 	0, -50, 0, 0),
			new DanceStep(0, 0, -50, 0, 	0, 0, 50, 0), 
			new DanceStep(0, 50, 0, 0, 		0, 50, 00, 0),
			new DanceStep(0, 0, 50, 0, 		0, 0, -50, 0),
			new DanceStep(0, 100, 0, 0,		0, 100, 0, 0),
			new DanceStep(0, -50, 0, 0, 	0, -50, 0, 0),
			new DanceStep(0, 0, -50, 0, 	0, 0, 50, 0), 
			new DanceStep(0, 50, 0, 0, 		0, 50, 00, 0),
			new DanceStep(0, 0, 50, 0, 		0, 0, -50, 0),
			new DanceStep(0, -100, 0, 0, 	0, -100, 0, 0)
	};

	private static int[] rhythm = { 1, 2, 1, 2, 1, 2 };

	public SquareRect() {
		super(steps, rhythm);
	}

	public String getName() {
		return "SquareRect";
	}

	public int getTempo() {
		return 500;
	}
}
