import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.SystemUtils as systemUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.click(findTestObject('Page_Mile.app  Request Demo/button_Request Demo'))

'verify all field empty is blocked'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/p_The organization name field is required'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Full name_name'), 'Dummy Name')

for (int i = 0; i < 10; i++) {
    WebUI.sendKeys(findTestObject('Page_Mile.app  Request Demo/input_Full name_name'), Keys.chord(Keys.BACK_SPACE))
}

WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/span_The name field is required'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 'dummy')

'verify valid error email is present'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/span_The email field must be a valid email'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 'dummy@yopmail.com')

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Phone number_phone'), '123345')

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Company name_organization_name'), 'MNCCOmpany')

WebUI.click(findTestObject('Page_Mile.app  Request Demo/button_Request Demo'))

'verify only name blank is blocked'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/p_The full name field is required'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Full name_name'), 'DummyName')

WebUI.click(findTestObject('Page_Mile.app  Request Demo/button_Request Demo'))

'verify phone number length not satisfied is blocked'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/p_The phone field may only contain numeric _5a075a'), 
    0)

WebUI.waitForElementClickable(findTestObject('Page_Mile.app  Request Demo/input_Phone number_phone'), 0)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Phone number_phone'), '123345678901')

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 'd')

WebUI.sendKeys(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), Keys.chord(Keys.BACK_SPACE))

'verify blank email blocked'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/p_The email field is required'), 0)

WebUI.click(findTestObject('Page_Mile.app  Request Demo/button_Request Demo'))

WebUI.waitForElementClickable(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 0)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 'dummy@yopmail.com')

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Company name_organization_name'), 'X')

WebUI.sendKeys(findTestObject('Page_Mile.app  Request Demo/input_Company name_organization_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page_Mile.app  Request Demo/button_Request Demo'))

'verify blank company name is blocked'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/p_The organization name field is required'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Mile.app  Request Demo/input_Company name_organization_name'), 0)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Company name_organization_name'), 'MNCCOmpany')

WebUI.click(findTestObject('Page_Mile.app  Request Demo/button_Request Demo'))

'verify success landing page reached'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Success/h1_Thank you for contacting us'), 0)

WebUI.closeBrowser()

