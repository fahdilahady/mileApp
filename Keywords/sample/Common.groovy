
package sample

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

public class Common {

	public static JsonSlurper jsonSlurper = new JsonSlurper()

	@Keyword
	def RequestDemo(String fullName, String emailAddress, String phoneNb, String companyName) {
		def response = WS.sendRequestAndVerify(findTestObject("Object Repository/APITest/MileApp_requestDemo",
				["full_name": fullName, "email": emailAddress, "phone": phoneNb, "organization_name": companyName]))

		def jsonResponse = jsonSlurper.parseText(response.getResponseText())
	}
}
