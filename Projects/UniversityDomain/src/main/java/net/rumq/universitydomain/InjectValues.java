package net.rumq.universitydomain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InjectValues {

    @Value("Arts")
    private String names;

    @Override
    public String toString() {
        return String.format("The University has %s department",names);
    }
}
