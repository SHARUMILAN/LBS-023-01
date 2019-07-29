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

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/a_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)'))

WebUI.selectOptionByValue(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Counter Party F'), 
    'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/In Currency F'), 
    'US Dollar', true)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Banks(Related) F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Banks(Related) F'), 
    '32121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Banks(Unrelated) F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Banks(Unrelated) F'), 
    '12212', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Banks(Central)F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Banks(Central)F'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Non-financial F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Non-financial F'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Non-Bnaks F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Non-Bnaks F'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/General Gov F'))

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Households nc F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/General Gov F'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Households nc F'), 
    '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Unallocated F'))

WebUI.setText(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/Unallocated F'), 
    '11111111111', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('G'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

