
package ac.il.haifa.cs.sweng.GarageRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "include_total",
    "resource_id",
    "fields",
    "records_format",
    "records",
    "limit",
    "_links"
})
public class Result {

    @JsonProperty("include_total")
    private boolean includeTotal;
    @JsonProperty("resource_id")
    private String resourceId;
    @JsonProperty("fields")
    private List<Field> fields = null;
    @JsonProperty("records_format")
    private String recordsFormat;
    @JsonProperty("records")
    private List<Record> records = null;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param includeTotal
     * @param recordsFormat
     * @param resourceId
     * @param records
     * @param limit
     * @param links
     * @param fields
     */
    public Result(boolean includeTotal, String resourceId, List<Field> fields, String recordsFormat, List<Record> records, int limit, Links links) {
        super();
        this.includeTotal = includeTotal;
        this.resourceId = resourceId;
        this.fields = fields;
        this.recordsFormat = recordsFormat;
        this.records = records;
        this.limit = limit;
        this.links = links;
    }

    @JsonProperty("include_total")
    public boolean isIncludeTotal() {
        return includeTotal;
    }

    @JsonProperty("include_total")
    public void setIncludeTotal(boolean includeTotal) {
        this.includeTotal = includeTotal;
    }

    @JsonProperty("resource_id")
    public String getResourceId() {
        return resourceId;
    }

    @JsonProperty("resource_id")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @JsonProperty("records_format")
    public String getRecordsFormat() {
        return recordsFormat;
    }

    @JsonProperty("records_format")
    public void setRecordsFormat(String recordsFormat) {
        this.recordsFormat = recordsFormat;
    }

    @JsonProperty("records")
    public List<Record> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
