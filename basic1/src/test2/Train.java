package test2;

public class Train implements Vehicle {

	private String trainNumber;
    private String departureStation;
    private String arrivalStation;
    private boolean isStart;
	
	public Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.isStart = isStart;
	}

	
	protected String getTrainNumber() {
        return trainNumber;
    }

    protected String getDepartureStation() {
        return departureStation;
    }

    protected String getArrivalStation() {
        return arrivalStation;
    }

    protected boolean isStart() {
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
