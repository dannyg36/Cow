
public class Cow implements Comparable<Cow>{

	private String name;
	private double weight;

	public Cow(double weight, String name) {
		this.name = name;
		this.weight = weight;
	}
	
	public Cow() {
		this.name = "anonymous cow";
		this.weight = 1800;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
    public int compareTo(Cow otherCow) {
        // Has the positive/negative/zero consistency required of the compareTo method
        return (int) (weight - otherCow.getWeight());
    }
}
