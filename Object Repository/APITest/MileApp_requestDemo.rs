<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>MileApp_requestDemo</name>
   <tag></tag>
   <elementGuidId>7aab8462-778b-4e33-b4a1-8a8e415c3223</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;full_name\&quot;: \&quot;${full_name}\&quot;,\n    \&quot;email\&quot;: \&quot;${email}\&quot;,\n    \&quot;phone\&quot;: \&quot;${phone}\&quot;,\n    \&quot;organization_name\&quot;: \&quot;${organization_name}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Host</name>
      <type>Main</type>
      <value>apidev.mile.app</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://apidev.mile.app/v1/request_demo</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Dummy FullName'</defaultValue>
      <description></description>
      <id>11b4d531-63fe-4ffc-865b-528a1b8b04fc</id>
      <masked>false</masked>
      <name>full_name</name>
   </variables>
   <variables>
      <defaultValue>'dummytest@yopmail.com'</defaultValue>
      <description></description>
      <id>37ff7428-e271-416a-b855-50fd60b509c3</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>'878899909045'</defaultValue>
      <description></description>
      <id>766c9569-b8d4-45c3-a24b-5af6bcb79971</id>
      <masked>false</masked>
      <name>phone</name>
   </variables>
   <variables>
      <defaultValue>'PT Maju terus pantang mundur'</defaultValue>
      <description></description>
      <id>34cafec4-1c56-4693-ac26-4ee92c34b2f9</id>
      <masked>false</masked>
      <name>organization_name</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


//WS.verifyElementPropertyValue(response, 'issues[0].fields.project.key', 'KTP')
WS.verifyElementPropertyValue(response, 'status', 'true')
WS.verifyElementPropertyValue(response, 'property.primary_key', '_id')

def variables = request.getVariables()
String name = variables.get('full_name')
String email = variables.get('email')
String phone = variables.get('phone')
String company = variables.get('organization_name')

WS.verifyElementPropertyValue(response, 'model.full_name', name)
WS.verifyElementPropertyValue(response, 'model.email', email)
WS.verifyElementPropertyValue(response, 'model.phone', phone)
WS.verifyElementPropertyValue(response, 'model.organization_name', company)



</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
