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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.setText(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Full name_name'), 'Demo User FullName  @#$Ç◊ÎÏ', 
    FailureHandling.CONTINUE_ON_FAILURE)

'verify fullName is alphabetic'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Full name_name'), 'Demo User FullName ', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 'wrongformat')

'verify email adress format'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/span_The email field must be a valid email'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Phone number_phone'), 'nonNumericInput')

'verify phone number is numeric only'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/span_The phone field may only contain numer_cdd354'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Company name_organization_name'), 'CompanyName3435≈∂∑£')

'verify company name is alphabetic'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Full name_name'), 'CompanyName', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

