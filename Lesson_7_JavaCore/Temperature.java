
package Lesson_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
@JsonIgnoreProperties(ignoreUnknown = true)

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Minimum",
    "Maximum"
})
@Generated("jsonschema2pojo")
public class Temperature {

    @JsonProperty("Minimum")
    private Minimum minimum;
    @JsonProperty("Maximum")
    private Maximum maximum;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Temperature() {
    }

    /**
     * 
     * @param maximum
     * @param minimum
     */
    public Temperature(Minimum minimum, Maximum maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @JsonProperty("Minimum")
    public Minimum getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public Temperature withMinimum(Minimum minimum) {
        this.minimum = minimum;
        return this;
    }

    @JsonProperty("Maximum")
    public Maximum getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public Temperature withMaximum(Maximum maximum) {
        this.maximum = maximum;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("минимальное ");
        sb.append(((this.minimum == null)?"<null>":this.minimum));
        sb.append(',');
        sb.append("максимальное ");
        sb.append(((this.maximum == null)?"<null>":this.maximum));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
