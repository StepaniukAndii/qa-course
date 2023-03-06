package patterns.threedLocal;

import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.currentThread;

public final class ThreadLocalDriverContainer {

    private final Map<Long, WebDriver> threadDriverMap = new ConcurrentHashMap<>(5);

    public WebDriver getDriver() {
        long threadId = currentThread().getId();
        if (!threadDriverMap.containsKey(threadId)) {
            throw new IllegalStateException("No driver is bound to current thread: " + threadId);
        }
        return threadDriverMap.get(threadId);
    }

    public void setDriver(WebDriver driver) {
        long threadId = currentThread().getId();
        threadDriverMap.put(threadId, driver);
    }

    public void quitDriver() {
        long threadId = currentThread().getId();
        WebDriver driver = threadDriverMap.get(threadId);
        driver.quit();
        threadDriverMap.remove(threadId);
    }
}
