package tr.com.otunctan;

import tr.com.otunctan.utils.FactoryUtils;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        long tic = FactoryUtils.tic();
        Thread.sleep(1_000);
        System.out.println("================================ Application started . Elapsed time :" + FactoryUtils.toc(tic));
    }
}
