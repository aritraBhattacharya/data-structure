package JavaConcepts;

import java.util.concurrent.*;

public class MultThreading {
    ExecutorService es = Executors.newSingleThreadExecutor();
    Callable<Integer> integerCallable = new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            return 2;
        }
    };

    Future res = es.submit(integerCallable);
    Integer actualRes;

    {
        try {
            actualRes = (Integer) res.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
