/*
 * Dataspace Connector
 * IDS Connector originally developed by the Fraunhofer ISST
 *
 * OpenAPI spec version: 6.2.0
 * Contact: info@dataspace-connector.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.catenax.semantics.framework.dsc.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * RequestedResourceView
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-08T16:15:16.333286600+02:00[Europe/Berlin]")
public class RequestedResourceView {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("modificationDate")
  private OffsetDateTime modificationDate = null;

  @JsonProperty("remoteId")
  private String remoteId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("keywords")
  private List<String> keywords = null;

  @JsonProperty("publisher")
  private String publisher = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("license")
  private String license = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("sovereign")
  private String sovereign = null;

  @JsonProperty("endpointDocumentation")
  private String endpointDocumentation = null;

  /**
   * Gets or Sets paymentModality
   */
  public enum PaymentModalityEnum {
    UNDEFINED("undefined"),
    FIXEDPRICE("fixedPrice"),
    FREE("free"),
    NEGOTIATIONBASIS("negotiationBasis");

    private String value;

    PaymentModalityEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PaymentModalityEnum fromValue(String text) {
      for (PaymentModalityEnum b : PaymentModalityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("paymentModality")
  private PaymentModalityEnum paymentModality = null;

  @JsonProperty("samples")
  private List<String> samples = null;

  @JsonProperty("additional")
  private Map<String, String> additional = null;

  @JsonProperty("_links")
  private Links _links = null;

  public RequestedResourceView creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public RequestedResourceView modificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public RequestedResourceView remoteId(String remoteId) {
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Get remoteId
   * @return remoteId
  **/
  @Schema(description = "")
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  public RequestedResourceView title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RequestedResourceView description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RequestedResourceView keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public RequestedResourceView addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @Schema(description = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public RequestedResourceView publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @Schema(description = "")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public RequestedResourceView language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public RequestedResourceView license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @Schema(description = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public RequestedResourceView version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public RequestedResourceView sovereign(String sovereign) {
    this.sovereign = sovereign;
    return this;
  }

   /**
   * Get sovereign
   * @return sovereign
  **/
  @Schema(description = "")
  public String getSovereign() {
    return sovereign;
  }

  public void setSovereign(String sovereign) {
    this.sovereign = sovereign;
  }

  public RequestedResourceView endpointDocumentation(String endpointDocumentation) {
    this.endpointDocumentation = endpointDocumentation;
    return this;
  }

   /**
   * Get endpointDocumentation
   * @return endpointDocumentation
  **/
  @Schema(description = "")
  public String getEndpointDocumentation() {
    return endpointDocumentation;
  }

  public void setEndpointDocumentation(String endpointDocumentation) {
    this.endpointDocumentation = endpointDocumentation;
  }

  public RequestedResourceView paymentModality(PaymentModalityEnum paymentModality) {
    this.paymentModality = paymentModality;
    return this;
  }

   /**
   * Get paymentModality
   * @return paymentModality
  **/
  @Schema(description = "")
  public PaymentModalityEnum getPaymentModality() {
    return paymentModality;
  }

  public void setPaymentModality(PaymentModalityEnum paymentModality) {
    this.paymentModality = paymentModality;
  }

  public RequestedResourceView samples(List<String> samples) {
    this.samples = samples;
    return this;
  }

  public RequestedResourceView addSamplesItem(String samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<String> getSamples() {
    return samples;
  }

  public void setSamples(List<String> samples) {
    this.samples = samples;
  }

  public RequestedResourceView additional(Map<String, String> additional) {
    this.additional = additional;
    return this;
  }

  public RequestedResourceView putAdditionalItem(String key, String additionalItem) {
    if (this.additional == null) {
      this.additional = new HashMap<>();
    }
    this.additional.put(key, additionalItem);
    return this;
  }

   /**
   * Get additional
   * @return additional
  **/
  @Schema(description = "")
  public Map<String, String> getAdditional() {
    return additional;
  }

  public void setAdditional(Map<String, String> additional) {
    this.additional = additional;
  }

  public RequestedResourceView _links(Links _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public Links getLinks() {
    return _links;
  }

  public void setLinks(Links _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedResourceView requestedResourceView = (RequestedResourceView) o;
    return Objects.equals(this.creationDate, requestedResourceView.creationDate) &&
        Objects.equals(this.modificationDate, requestedResourceView.modificationDate) &&
        Objects.equals(this.remoteId, requestedResourceView.remoteId) &&
        Objects.equals(this.title, requestedResourceView.title) &&
        Objects.equals(this.description, requestedResourceView.description) &&
        Objects.equals(this.keywords, requestedResourceView.keywords) &&
        Objects.equals(this.publisher, requestedResourceView.publisher) &&
        Objects.equals(this.language, requestedResourceView.language) &&
        Objects.equals(this.license, requestedResourceView.license) &&
        Objects.equals(this.version, requestedResourceView.version) &&
        Objects.equals(this.sovereign, requestedResourceView.sovereign) &&
        Objects.equals(this.endpointDocumentation, requestedResourceView.endpointDocumentation) &&
        Objects.equals(this.paymentModality, requestedResourceView.paymentModality) &&
        Objects.equals(this.samples, requestedResourceView.samples) &&
        Objects.equals(this.additional, requestedResourceView.additional) &&
        Objects.equals(this._links, requestedResourceView._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, modificationDate, remoteId, title, description, keywords, publisher, language, license, version, sovereign, endpointDocumentation, paymentModality, samples, additional, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedResourceView {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sovereign: ").append(toIndentedString(sovereign)).append("\n");
    sb.append("    endpointDocumentation: ").append(toIndentedString(endpointDocumentation)).append("\n");
    sb.append("    paymentModality: ").append(toIndentedString(paymentModality)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
