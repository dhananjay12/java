package mynotes.concurrency.counters;

/**
 *
* @author ben (https://github.com/kittylyst/optimizing-java)
 */
public final class VolatileCounter implements Counter {

    private volatile int value = 0;

    public int increment() {
        return value = value + 1;
    }

    public int get() {
        return value;
    }

}
