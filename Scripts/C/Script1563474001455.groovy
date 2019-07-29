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

WebUI.click(findTestObject('Page_B - Claims Debt Securities  Long-Term (Market Value)/a_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)'))

WebUI.selectOptionByValue(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/CounterParty C'), 
    'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/In Currency C'), 
    'US Dollar', false)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks (Related) C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks (Related) C'), 
    '32121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks (Unrelated) C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks (Unrelated) C'), 
    '12212', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks (Central) C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks (Central) C'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-financial C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-financial C'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-Bank C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-Bank C'), '212121', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/General Gov C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/General Gov C'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/House Holds C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/House Holds C'), 
    '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Unallocated C'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Unallocated C'), 
    '11111111111', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('D'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

