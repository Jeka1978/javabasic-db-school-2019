package my_spring;

/**
 * @author Evgeny Borisov
 */
public class WorkerImpl {




    public void work() {
        System.out.println("Working");
    }

    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is good");
    }
}
