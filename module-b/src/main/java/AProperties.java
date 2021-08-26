import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * The AProperties
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Valid
@ConfigurationProperties(prefix = "prefix")
public class AProperties extends BProperties{

    /**
     * The username - picked up correctly
     */
    @Valid
    @NotNull
    private String user = "s030r433";

}
