import lombok.Data;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Valid
@Validated
public class BProperties {

    /**
     * Ignored description - which is ok because property is nested
     */
    @Valid
    @NotNull
    @NestedConfigurationProperty
    private CProperties input;

    /**
     * The output - not picked up, but should have been
     */
    @Valid
    @NotNull
    private String output;

}

