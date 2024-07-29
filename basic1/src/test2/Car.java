package test2;

public class Car implements Vehicle {

	private String vin;
    private String color;
    private boolean isStart;
	
	public Car(String vin, String color, boolean isStart) {
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
	}

	
	protected String getVin() {
        return vin;
    }

    protected String getColor() {
        return color;
    }
	
	public boolean isStart() {
		return isStart;
	}

	
	@Override
	public void accelerate() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void setStart() {
		this.isStart = !this.isStart;
	}

	
}
