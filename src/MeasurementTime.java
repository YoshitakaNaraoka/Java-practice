public class MeasurementTime {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 1000000; i++) {
    }

    long endTime = System.currentTimeMillis();

    System.out.println("開始時刻：" + startTime + " ms");
    System.out.println("終了時刻：" + endTime + " ms");
    System.out.println("処理時間：" + (endTime - startTime) + " ms");
  }
}