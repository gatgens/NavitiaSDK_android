/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.80.2
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kisio.navitia.sdk.expert.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.kisio.navitia.sdk.expert.models.Header;
import com.kisio.navitia.sdk.expert.models.Row;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Table
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2019-06-13T13:20:14.367+02:00")
public class Table implements Parcelable {
  @SerializedName("headers")
  private List<Header> headers = new ArrayList<Header>();

  @SerializedName("rows")
  private List<Row> rows = new ArrayList<Row>();

  public Table headers(List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public Table addHeadersItem(Header headersItem) {
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Header> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }

  public Table rows(List<Row> rows) {
    this.rows = rows;
    return this;
  }

  public Table addRowsItem(Row rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Row> getRows() {
    return rows;
  }

  public void setRows(List<Row> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.headers, table.headers) &&
        Objects.equals(this.rows, table.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(headers);

    out.writeValue(rows);
  }

  public Table() {
    super();
  }

  Table(Parcel in) {
    
    headers = (List<Header>)in.readValue(Header.class.getClassLoader());
    rows = (List<Row>)in.readValue(Row.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Table> CREATOR = new Parcelable.Creator<Table>() {
    public Table createFromParcel(Parcel in) {
      return new Table(in);
    }
    public Table[] newArray(int size) {
      return new Table[size];
    }
  };
}

