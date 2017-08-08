package Neural;

public class SummingPerceptron {
	Percept pNAND;
	
	public SummingPerceptron(Percept p1){
		pNAND = p1;
	}

	public int[] sum(int i, int j) {
		int[] r = new int[2];
		r[0] = pNAND.process(pNAND.process(i, pNAND.process(i, j)), pNAND.process(pNAND.process(i, j), j));
		r[1] = pNAND.process(pNAND.process(i,j), pNAND.process(i, j));
		return r;
	}
}