package ma.inwi.digital.userRolesandPermissions.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import ma.inwi.digital.userRolesandPermissions.model.UserRoleDeleteEventPayload;

import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The notification data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2021-01-22T22:36:55.115Z")
public class UserRoleDeleteEvent   {
  
  private String id = null;
  private String href = null;
  private String eventId = null;
  private Date eventTime = null;
  private String eventType = null;
  private String correlationId = null;
  private String domain = null;
  private String title = null;
  private String description = null;
  private String priority = null;
  private Date timeOcurred = null;
  private UserRoleDeleteEventPayload event = null;

  /**
   * Identifier of the Process flow
   **/
  
  @ApiModelProperty(value = "Identifier of the Process flow")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference of the ProcessFlow
   **/
  
  @ApiModelProperty(value = "Reference of the ProcessFlow")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * The identifier of the notification.
   **/
  
  @ApiModelProperty(value = "The identifier of the notification.")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Time of the event occurrence.
   **/
  
  @ApiModelProperty(value = "Time of the event occurrence.")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * The type of the notification.
   **/
  
  @ApiModelProperty(value = "The type of the notification.")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * The correlation id for this event.
   **/
  
  @ApiModelProperty(value = "The correlation id for this event.")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  /**
   * The domain of the event.
   **/
  
  @ApiModelProperty(value = "The domain of the event.")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * The title of the event.
   **/
  
  @ApiModelProperty(value = "The title of the event.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * An explnatory of the event.
   **/
  
  @ApiModelProperty(value = "An explnatory of the event.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A priority.
   **/
  
  @ApiModelProperty(value = "A priority.")
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }
  public void setPriority(String priority) {
    this.priority = priority;
  }

  /**
   * The time the event occured.
   **/
  
  @ApiModelProperty(value = "The time the event occured.")
  @JsonProperty("timeOcurred")
  public Date getTimeOcurred() {
    return timeOcurred;
  }
  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  /**
   * The event payload linked to the involved resource object
   **/
  
  @ApiModelProperty(value = "The event payload linked to the involved resource object")
  @JsonProperty("event")
  public UserRoleDeleteEventPayload getEvent() {
    return event;
  }
  public void setEvent(UserRoleDeleteEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoleDeleteEvent userRoleDeleteEvent = (UserRoleDeleteEvent) o;
    return Objects.equals(id, userRoleDeleteEvent.id) &&
        Objects.equals(href, userRoleDeleteEvent.href) &&
        Objects.equals(eventId, userRoleDeleteEvent.eventId) &&
        Objects.equals(eventTime, userRoleDeleteEvent.eventTime) &&
        Objects.equals(eventType, userRoleDeleteEvent.eventType) &&
        Objects.equals(correlationId, userRoleDeleteEvent.correlationId) &&
        Objects.equals(domain, userRoleDeleteEvent.domain) &&
        Objects.equals(title, userRoleDeleteEvent.title) &&
        Objects.equals(description, userRoleDeleteEvent.description) &&
        Objects.equals(priority, userRoleDeleteEvent.priority) &&
        Objects.equals(timeOcurred, userRoleDeleteEvent.timeOcurred) &&
        Objects.equals(event, userRoleDeleteEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleDeleteEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

