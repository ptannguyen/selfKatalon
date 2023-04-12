package customKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginHelper {

	@Keyword
	def openBrowserAndNavigateToUrl(String Url){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(Url)
	}

	@Keyword
	def loginWithUserAccount(String userName, String passWord){
		WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/lbl_CURAHealthcareService'), 'CURA Healthcare Service')
		WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/a_CURA Healthcare_menu-toggle'))
		WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/a_Login'))
		WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/input_Username_username'))
		WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/login_title'), 'Login')
		WebUI.setText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/input_Username_username'), userName )
		WebUI.click(findTestObject('Page_CURA_Healthcare_Service/input_Password_password'))
		WebUI.setText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/input_Password_password'), passWord)
		WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/button_Login'))
		WebUI.delay(3)
		WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/make_Appointment_title'), 'Make Appointment')
	}

	@Keyword
	def logoutAndCloseBrowser(){
		WebUI.closeBrowser()
	}
}
