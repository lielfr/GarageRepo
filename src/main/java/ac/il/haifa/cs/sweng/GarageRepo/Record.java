
package ac.il.haifa.cs.sweng.GarageRepo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "mispar_mosah",
    "shem_mosah",
    "cod_sug_mosah",
    "sug_mosah",
    "ktovet",
    "yishuv",
    "telephone",
    "mikud",
    "cod_miktzoa",
    "miktzoa",
    "menahel_miktzoa"
})
public class Record {

    @JsonProperty("_id")
    private int id;
    @JsonProperty("mispar_mosah")
    private String misparMosah;
    @JsonProperty("shem_mosah")
    private String shemMosah;
    @JsonProperty("cod_sug_mosah")
    private String codSugMosah;
    @JsonProperty("sug_mosah")
    private String sugMosah;
    @JsonProperty("ktovet")
    private String ktovet;
    @JsonProperty("yishuv")
    private String yishuv;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("mikud")
    private int mikud;
    @JsonProperty("cod_miktzoa")
    private String codMiktzoa;
    @JsonProperty("miktzoa")
    private String miktzoa;
    @JsonProperty("menahel_miktzoa")
    private String menahelMiktzoa;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param codMiktzoa
     * @param yishuv
     * @param ktovet
     * @param shemMosah
     * @param sugMosah
     * @param codSugMosah
     * @param misparMosah
     * @param miktzoa
     * @param telephone
     * @param id
     * @param menahelMiktzoa
     * @param mikud
     */
    public Record(int id, String misparMosah, String shemMosah, String codSugMosah, String sugMosah, String ktovet, String yishuv, String telephone, int mikud, String codMiktzoa, String miktzoa, String menahelMiktzoa) {
        super();
        this.id = id;
        this.misparMosah = misparMosah;
        this.shemMosah = shemMosah;
        this.codSugMosah = codSugMosah;
        this.sugMosah = sugMosah;
        this.ktovet = ktovet;
        this.yishuv = yishuv;
        this.telephone = telephone;
        this.mikud = mikud;
        this.codMiktzoa = codMiktzoa;
        this.miktzoa = miktzoa;
        this.menahelMiktzoa = menahelMiktzoa;
    }

    @JsonProperty("_id")
    public int getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("mispar_mosah")
    public String getMisparMosah() {
        return misparMosah;
    }

    @JsonProperty("mispar_mosah")
    public void setMisparMosah(String misparMosah) {
        this.misparMosah = misparMosah;
    }

    @JsonProperty("shem_mosah")
    public String getShemMosah() {
        return shemMosah;
    }

    @JsonProperty("shem_mosah")
    public void setShemMosah(String shemMosah) {
        this.shemMosah = shemMosah;
    }

    @JsonProperty("cod_sug_mosah")
    public String getCodSugMosah() {
        return codSugMosah;
    }

    @JsonProperty("cod_sug_mosah")
    public void setCodSugMosah(String codSugMosah) {
        this.codSugMosah = codSugMosah;
    }

    @JsonProperty("sug_mosah")
    public String getSugMosah() {
        return sugMosah;
    }

    @JsonProperty("sug_mosah")
    public void setSugMosah(String sugMosah) {
        this.sugMosah = sugMosah;
    }

    @JsonProperty("ktovet")
    public String getKtovet() {
        return ktovet;
    }

    @JsonProperty("ktovet")
    public void setKtovet(String ktovet) {
        this.ktovet = ktovet;
    }

    @JsonProperty("yishuv")
    public String getYishuv() {
        return yishuv;
    }

    @JsonProperty("yishuv")
    public void setYishuv(String yishuv) {
        this.yishuv = yishuv;
    }

    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("mikud")
    public int getMikud() {
        return mikud;
    }

    @JsonProperty("mikud")
    public void setMikud(int mikud) {
        this.mikud = mikud;
    }

    @JsonProperty("cod_miktzoa")
    public String getCodMiktzoa() {
        return codMiktzoa;
    }

    @JsonProperty("cod_miktzoa")
    public void setCodMiktzoa(String codMiktzoa) {
        this.codMiktzoa = codMiktzoa;
    }

    @JsonProperty("miktzoa")
    public String getMiktzoa() {
        return miktzoa;
    }

    @JsonProperty("miktzoa")
    public void setMiktzoa(String miktzoa) {
        this.miktzoa = miktzoa;
    }

    @JsonProperty("menahel_miktzoa")
    public String getMenahelMiktzoa() {
        return menahelMiktzoa;
    }

    @JsonProperty("menahel_miktzoa")
    public void setMenahelMiktzoa(String menahelMiktzoa) {
        this.menahelMiktzoa = menahelMiktzoa;
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
