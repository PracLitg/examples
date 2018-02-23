package examples.cocurrent;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DelegatingDemo {

    private final ConcurrentMap<String, String> locations;
    private final Map<String, String> unmodifiableMap;

    public DelegatingDemo(Map<String, String> temp) {
        locations = new ConcurrentHashMap<>(temp);
        unmodifiableMap = Collections.unmodifiableMap(locations);
    }

    public Map<String, String> getUnmodifiableMap() {
        return unmodifiableMap;
    }

    public String getLocation(String id) {
        return locations.get(id);
    }

    public void setLocation(String id, String value) {
        if (locations.replace(id, value) == null) {
            throw new IllegalArgumentException("invalid id " + id);
        }
    }
}
