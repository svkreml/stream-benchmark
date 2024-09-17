package svkreml;

import java.io.IOException;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.runner.RunnerException;


public class MyBenchmark {

    private static final String TEST = ".*CheckLamdaPerformance.*";

    public static void main(String[] args) throws IOException, RunnerException {
        Main.main(getArguments(TEST, 100, 100, 1));
    }

    private static String[] getArguments(String className, int nRuns, int runForMilliseconds, int nThreads) {
        return new String[]{className,
            "-i", "" + nRuns,
            "-r", runForMilliseconds + "ms",
            "-t", "" + nThreads,
            "-w", "5000ms",
            "-wi", "1"
        };
    }

}
