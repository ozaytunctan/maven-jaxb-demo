package tr.com.otunctan.utils;

public final class FactoryUtils {

    public static long tic() {
        return System.currentTimeMillis();
    }

    public static long toc(long startTimeInMillis) {
        long finishTimeInMillis = System.currentTimeMillis();
        long elapsedTime = (finishTimeInMillis - startTimeInMillis);
        return elapsedTime;
    }

    public static void tocString(long startTimeInMillis) {
        long elapsedTime = toc(startTimeInMillis);
        System.out.println(String.format("Elapsed Time: %d ", elapsedTime));
    }
}
