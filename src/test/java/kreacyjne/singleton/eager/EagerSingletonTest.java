package kreacyjne.singleton.eager;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class EagerSingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstance() {
        EagerSingleton firstCall = EagerSingleton.getInstance();
        EagerSingleton secondCall = EagerSingleton.getInstance();

        assertSame(firstCall, secondCall);
    }

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<EagerSingleton> result = IntStream.range(0, 3).parallel()
                .mapToObj(i -> EagerSingleton.getInstance())
                .collect(Collectors.toList());


        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}
