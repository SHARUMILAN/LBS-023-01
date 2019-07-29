import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/a_B - Claims Debt Securities  Long-Term (Market Value)'))

WebUI.selectOptionByValue(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Counterparty for part B'), 
    'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency Part B'), 
    'US Dollar', true)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Banks(related)B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Banks(related)B'), '32121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Banks(Unrelated)B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Banks(Unrelated)B'), '12212', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Banks(Central)B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Banks(Central)B'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Non-financial B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Non-financial B'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/NonBank B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/NonBank B'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/General B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/General B'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Households B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Households B'), '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Unallocated B'))

WebUI.setText(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/Unallocated B'), '11111111111', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('C'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

