package ch17;

public class Car {
    private static int serialNum = 10000; //정적 변수로 프로그램 실행시 메모리에 올려져있다.
    private int carNum; // 멤버 변수

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
