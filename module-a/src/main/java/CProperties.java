import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CProperties {

    /**
     * The filename pattern - not picked up, but should have been
     */
    @NotNull
    @NotBlank
    private String filenamePattern;

}
