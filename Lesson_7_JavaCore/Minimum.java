
package Lesson_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
@JsonIgnoreProperties(ignoreUnknown = true)

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Value",
    "Unit",
    "UnitType"
})
@Generated("jsonschema2pojo")
public class Minimum {

    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private Integer unitType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Minimum() {
    }

    /**
     * 
     * @param unitType
     * @param unit
     * @param value
     */
    public Minimum(Double value, String unit, Integer unitType) {
        super();
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    public Minimum withValue(Double value) {
        this.value = value;
        return this;
    }

    @JsonProperty("Unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("Unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Minimum withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("UnitType")
    public Integer getUnitType() {
        return unitType;
    }

    @JsonProperty("UnitType")
    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public Minimum withUnitType(Integer unitType) {
        this.unitType = unitType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("значение ");
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("единица измерения ");
        sb.append(((this.unit == null)?"<null>":this.unit));
        return sb.toString();
    }

}
