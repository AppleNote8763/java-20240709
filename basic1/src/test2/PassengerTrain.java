package test2;

public class PassengerTrain extends Train {

	private int passengerCount = 0;

	public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.passengerCount = passengerCount;
	}
	
	
	public int getPassengerCount() {
		return passengerCount;
	}


	@Override
	public void accelerate() {
		System.out.println("여객 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("여객 열차가 천천히 정차합니다!");
	}

	
}
