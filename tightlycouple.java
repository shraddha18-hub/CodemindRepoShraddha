package oops;

public class tightlycouple {

	Vehicle v;
	public void Start(Vehicle v)
	{
		this.v = v;
	}
	void startjourney()
	{
		v.move();
	}
}
