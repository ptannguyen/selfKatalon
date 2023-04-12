package createAppointment

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

public class createNewAppointment {

	@Keyword
	def createNewAppointmentWithDataTest(String facility, String day, String comment) {

		WebUI.click(findTestObject('Page_CURA_Healthcare_Service/combo_facility'))

		WebUI.click(findTestObject('Page_CURA_Healthcare_Service/combot_facility_hongkong'))

		WebUI.click(findTestObject('Page_CURA_Healthcare_Service/visit_day'))

		WebUI.setText(findTestObject('Page_CURA_Healthcare_Service/visit_day'), day)

		WebUI.click(findTestObject('Page_CURA_Healthcare_Service/comment_book'))

		WebUI.setText(findTestObject('Page_CURA_Healthcare_Service/comment_book'), comment)

		WebUI.click(findTestObject('Page_CURA_Healthcare_Service/bnt_book_appointment'))

		WebUI.delay(3)

		WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/faclity_book'), facility)

		WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/visitday_book'), day)

		WebUI.verifyElementText(findTestObject('Page_CURA_Healthcare_Service/comment_book_confirm'), comment)
	}
}
