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

'verify fullname input field present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Full name_name'), 0)

'verify email input field present'
WebUI.verifyElementPresent(findTestObject('Page_Mile.app  Request Demo/input_Email_email'), 0)

'verify phone number field present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Phone number_phone'), 0)

'verify company name field present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/input_Company name_organization_name'), 
    0)

'verify title element present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/p_Fill your detail information'), 
    0)

'verify back button present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/a_Back to Mile'), 0)

'verify logo present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/img'), 0)

'verivy submit button present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Mile.app  Request Demo/button_Request Demo'), 0)

WebUI.closeBrowser()

