/**
 * RESTful PTV
 * Restful way to use Palvelutietovaranto.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.otavanopisto.restfulptv.client;

import fi.otavanopisto.restfulptv.client.model.*;

import fi.otavanopisto.restfulptv.client.model.BadRequest;
import fi.otavanopisto.restfulptv.client.model.Forbidden;
import fi.otavanopisto.restfulptv.client.model.PrintableFormChannel;
import fi.otavanopisto.restfulptv.client.model.InternalServerError;
import fi.otavanopisto.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-29T08:41:12.415+02:00")
public class PrintableFormChannelsApi {

  private ApiClient client;
  private String baseUrl;

  public PrintableFormChannelsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * creates PrintableFormChannel
   * creates PrintableFormChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PrintableFormChannel> createServicePrintableFormChannel(String serviceId, PrintableFormChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<PrintableFormChannel> resultType = new ResultType<PrintableFormChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds PrintableFormChannel by printableFormChannelId
   * finds PrintableFormChannels by printableFormChannelId
   * @param serviceId Service id (required)
   * @param printableFormChannelId printableFormChannel id (required)
   */
  public ApiResponse<PrintableFormChannel> findServicePrintableFormChannel(String serviceId, String printableFormChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels/{printableFormChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "printableFormChannelId" + "\\}", String.valueOf(printableFormChannelId)), baseUrl);
      
    ResultType<PrintableFormChannel> resultType = new ResultType<PrintableFormChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists PrintableFormChannels by serviceId
   * Lists PrintableFormChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<PrintableFormChannel>> listServicePrintableFormChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<PrintableFormChannel>> resultType = new ResultType<List<PrintableFormChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates PrintableFormChannel
   * Updates PrintableFormChannel
   * @param serviceId service id (required)
   * @param printableFormChannelId printableFormChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PrintableFormChannel> updatePrintableFormChannel(String serviceId, String printableFormChannelId, PrintableFormChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels/{printableFormChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "printableFormChannelId" + "\\}", String.valueOf(printableFormChannelId)), baseUrl);
      
    ResultType<PrintableFormChannel> resultType = new ResultType<PrintableFormChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
}
