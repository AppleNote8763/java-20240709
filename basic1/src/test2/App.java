package test2;

public class App {

	public static void main(String[] args) {
		
		ManualCar manualCar = new ManualCar("10가1234", "blue", false, 0);
		AutomaticCar automaticCar = new AutomaticCar("10가1234", "blue", false);
		PassengerTrain passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		FreightTrain freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
	
		// 수동 변속기 자동차(가속, 정차)
		manualCar.accelerate();
		manualCar.stop();
		// 시동 테스트
		System.out.println(manualCar.isStart());
		manualCar.setStart();
		System.out.println(manualCar.isStart());
		// 기어변속
		System.out.println(manualCar.getGear());
		manualCar.setGear(-1);
		System.out.println(manualCar.getGear());
		manualCar.setGear(6);
		System.out.println(manualCar.getGear());
		
		// 자동 변속기 자동차(가속, 정차)
		automaticCar.accelerate();
		automaticCar.stop();
		// 시동 테스트
		System.out.println(automaticCar.isStart());
		automaticCar.setStart();
		System.out.println(automaticCar.isStart());
		
		// 여객 열차(가속, 정차)
		passengerTrain.accelerate();
		passengerTrain.stop();
		// 시동 테스트
		System.out.println(passengerTrain.isStart());
		passengerTrain.setStart();
		System.out.println(passengerTrain.isStart());
		
		// 화물 열차(가속, 정차)
		freightTrain.accelerate();
		freightTrain.stop();
		// 시동 테스트
		System.out.println(freightTrain.isStart());
		freightTrain.setStart();
		System.out.println(freightTrain.isStart());
		
		
	}
	
}
