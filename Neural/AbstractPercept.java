package Neural;

public abstract class AbstractPercept implements Percept {
	protected int bias;
	protected int weight1;
	protected int weight2;
	public int process(int i1, int i2){
		if(bias + (i1*weight1) + (i2*weight2) > 0){
			return 1;
		}
		return 0;
	}
}