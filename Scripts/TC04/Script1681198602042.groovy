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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/lbl_CURAHealthcareService'), 'CURA Healthcare Service')

WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/input_Username_username'))

WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/login_title'), 'Login')

WebUI.setText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/input_Username_username'), 'John Doe')

WebUI.click(findTestObject('Page_CURA_Healthcare_Service/input_Password_password'))

WebUI.setText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/button_Login'))

WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/make_Appointment_title'), 'Make Appointment')

WebUI.click(findTestObject('Page_CURA_Healthcare_Service/combo_facility'))

WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/combot_facility_tokyo'), 'Tokyo CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/combot_facility_hongkong'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/combot_facility_seoul'), 'Seoul CURA Healthcare Center')

WebUI.closeBrowser()

