package thread.executor;

import static util.MyLogger.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class ExecutorUtils {

  public static void printState(ExecutorService executorService) {
    if (executorService instanceof ThreadPoolExecutor poolExecutor) {
      int pool = poolExecutor.getPoolSize();
      int active = poolExecutor.getPoolSize();
      int queuedTasks = poolExecutor.getQueue().size();
      long completedTask = poolExecutor.getCompletedTaskCount();
      log("[pool=" + pool + ", active=" + active + ", queuedTasks=" + queuedTasks
          + ", completedTask=" + completedTask + "]");
    } else {
      log(executorService);
    }
  }
}
