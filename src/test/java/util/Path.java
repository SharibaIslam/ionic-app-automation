package util;

public class Path {
    public static final String xPathForLanguageChange = "/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/div/div[2]/span";
    public static final String xPathForLoginWallet = "//*[@id='login-form']/ion-item[1]/div[1]/div/ion-input/input";
    public static final String xPathForLoginPIN= "//*[@id='login-form']/ion-item[2]/div[1]/div/ion-input/input";
    public static final String xPathForLoginButton= "//*[@id='login-form']/button/span";
    public static final String getxPathForLoginTest1ShowingDRPopUp="//button/span[@class='button-inner' and contains(.,'Yes')]";
    public static final String getxPathForLoginTest=".//span[@class='button-inner']";
    public static final String xPathForDeviceRegErrormsg1="//div[@class='subheader' and contains(.,'Activity')]";;
    public static final String xPathForDeviceRegErrormsg3="//*[@id='alert-subhdr-4']";
    public static final String xPathForDeviceRegSuccessmsg="//div/h3[@class='alert-sub-title' and contains(.,'Device has been registered successfully')]";
    public static final String xPathForDeviceRegSuccessmsgOkButtonClick="//button/span[@class='button-inner' and contains(.,'OK')]";
    public static final String xPathForDeviceRegSubMenuClick="/html/body/ion-app/ng-component/ion-nav/page-settings/ion-header/ion-toolbar/button";
    public static final String xPathForDeviceRegYes1="//button[@class='item-cover disable-hover item-cover-md item-cover-default item-cover-default-md' and contains(@id,'rb-48-0')]";
    public static final String xPathForDeviceReg1="//android.widget.Button[@index='3']";
    public static final String xPathForDeviceReg2="/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/ion-grid/ion-row/ion-col[1]/img";
    public static final String xPathForSendMoney="//img[@src='assets/img/sendmoney_en.png']";
    public static final String xPathForSendMoneyWallet="//*[@id='sendMoneyWallet']/div[1]/div/ion-input/input";
    public static final String xPathForSendMoneyAmount="//*[@id='sendMoneyAmount']/div[1]/div/ion-input/input";
    public static final String xPathForSendMoneyPurpose="//*[@id=\"sendMoneyPurpose\"]/div[1]/div/ion-input/input";
    public static final String xPathForSendMoneyNext="//button/span[@class='button-inner' and contains(.,'Next')]";
    //public static final String xPathForSendMoneyNext="//*[@id='sendMoneyButton']/button/span";
    public static final String xPathForSendMoneyConfirm="/html/body/ion-app/ng-component/ion-nav/page-send-money-confirm/ion-content/div[2]/ion-grid/ion-row[4]/ion-col[1]/button";
    public static final String xPathForSendMoneyTestCase="/html/body/ion-app/ng-component/ion-nav/page-send-money-success/ion-content/div[2]/ion-grid/ion-row[1]/ion-col";
    public static final String xPathForSendMoneyShowWallet="/html/body/ion-app/ng-component/ion-nav/page-send-money-success/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]";
    public static final String xPathForSendMoneyShowAmount="/html/body/ion-app/ng-component/ion-nav/page-send-money-success/ion-content/div[2]/ion-grid/ion-row[3]/ion-col[2]";
    public static final String xPathForSendMoneyTXNID="/html/body/ion-app/ng-component/ion-nav/page-send-money-success/ion-content/div[2]/ion-grid/ion-row[4]/ion-col[2]";
    public static final String xPathForSendMoneyOkbutton="//button/span[@class='button-inner' and contains(.,'OK')]";
    //public static final String xPathForSendMoneyOkbutton="/html/body/ion-app/ng-component/ion-nav/page-send-money-success/ion-content/div[2]/ion-grid/ion-row[6]/button";
    public static final String xPathForSendMoneyHomeButton="/html/body/ion-app/ng-component/ion-nav/page-send-money-confirm/ion-header/ion-toolbar/button";
    public static final String xPathForPaymentMenuHit="//img[@src='assets/img/payment_en.png']";
    public static final String xPathForPaymentPayee="//*[@id='payee']/div[1]/div/ion-input/input";
    public static final String xPathForPaymentNext="//button/span[@class='button-inner' and contains(.,'Next')]";
    //public static final String xPathForPaymentNext=" //*[@id='payment-form']/div/div/ion-grid/ion-row[2]/ion-col";
    public static final String xPathForPaymentAmount="//*[@id='amount']/div[1]/div/ion-input/input";
    public static final String xPathForNextButton="//button/span[@class='button-inner' and contains(.,'Next')]";
    //public static final String xPathForNextButton="//*[@id='payment-form']/div/div/ion-grid/ion-row[3]/ion-col";
    public static final String xPathForPaymentConfirmButton="/html/body/ion-app/ng-component/ion-nav/page-payment-confirm/ion-content/div[2]/ion-grid/ion-row[4]/ion-col[1]/button";
    public static final String xPathForSuccessMessage="//*[@id='payment-success-page']/div/div/ion-row[1]";
    public static final String xPathForSuccessPayee="//*[@id='payee']/ion-col[2]";
    public static final String xPathForSuccessMerchantWallet="//*[@id='merchantWallet']/ion-col[2]";
    public static final String xPathForSuccessMerchantAmount="//*[@id='amount']/ion-col[2]";
    public static final String xPathForSuccessTXNID="//*[@id='payment-success-page']/div/div/ion-row[5]/ion-col[2]";
    public static final String xPathForOKButtonAfterAddedPayee="//*[@id=\"payment-success-page\"]/div/div/ion-row[8]/button";
    public static final String xPathForOKButtonClick="//*[@id=\"payment-success-page\"]/div/div/ion-row[7]/button";
    public static final String xPathForPaymentHomeButton="/html/body/ion-app/ng-component/ion-nav/page-payment-confirm/ion-header/ion-toolbar/button";
    public static final String xPathForEnterStdID="//*[@id='customerId']/div[1]/div/ion-input/input";
    public static final String xPathForSchoolNext="//button/span[@class='button-inner' and contains(.,'Next')]";
    //public static final String xPathForSchoolNext="//*[@id='payment-form']/div/div/ion-grid/ion-row[3]/ion-col";
    public static final String xPathForSchoolConfirm="/html/body/ion-app/ng-component/ion-nav/page-payment-confirm/ion-content/div[2]/ion-grid/ion-row[5]/ion-col[1]/button";
    public static final String xPathForSchoolOkButton="//button/span[@class='button-inner' and contains(.,'OK')]";
    //public static final String xPathForSchoolOkButton="//*[@id=\"payment-success-page\"]/div/div/ion-row[7]/button";
    public static final String xPathForSchoolSTDNumber="//*[@id=\"studentId\"]/ion-col[2]";
    public static final String xPathForSchoolSTDName="//*[@id=\"accountName\"]/ion-col[2]";
    public static final String xPathForCashOutMenuHit="//img[@src='assets/img/cash_out_en_2.png']";
    public static final String xPathForCashOutAgentWallet="/html/body/ion-app/ng-component/ion-nav/page-withdraw-start/ion-content/div[2]/ion-list/form/ion-item[1]/div[1]/div/ion-input/input";
    public static final String xPathForCashOutAmount="/html/body/ion-app/ng-component/ion-nav/page-withdraw-start/ion-content/div[2]/ion-list/form/ion-item[2]/div[1]/div/ion-input/input";
    public static final String xPathForCashOutNext="//button/span[@class='button-inner' and contains(.,'Next')]";
    //public static final String xPathForCashOutNext="/html/body/ion-app/ng-component/ion-nav/page-withdraw-start/ion-content/div[2]/ion-list/form/div/button";
    public static final String xPathForCashOutConfirm="/html/body/ion-app/ng-component/ion-nav/page-withdraw-confirm/ion-content/div[2]/ion-grid/ion-row[3]/ion-col[1]/button";
    public static final String xPathForCashOutGetAgentWallet="/html/body/ion-app/ng-component/ion-nav/page-withdraw-success/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]";
    public static final String xPathForCashOutGetAmount="/html/body/ion-app/ng-component/ion-nav/page-withdraw-success/ion-content/div[2]/ion-grid/ion-row[3]/ion-col[2]";
    public static final String xPathForCashOutGetTxnID="/html/body/ion-app/ng-component/ion-nav/page-withdraw-success/ion-content/div[2]/ion-grid/ion-row[4]/ion-col[2]";
    public static final String xPathForCashOutOkButton="//button/span[@class='button-inner' and contains(.,'OK')]";
    //public static final String xPathForCashOutOkButton="/html/body/ion-app/ng-component/ion-nav/page-withdraw-success/ion-content/div[2]/ion-grid/ion-row[5]/button";
    public static final String xPathForCashOutSuccessPage="/html/body/ion-app/ng-component/ion-nav/page-withdraw-success/ion-content/div[2]/ion-grid/ion-row[1]/ion-col";
    public static final String xPathForCashOutHome="/html/body/ion-app/ng-component/ion-nav/page-withdraw-confirm/ion-header/ion-toolbar/button";
    public static final String xPathForRechargeMenuHit="//img[@src='assets/img/recharge_en.png']";
    public static final String xPathForRechargeMobile="//*[@id=\"rechargeForm\"]/div/div/form/ion-item[1]/div[1]/div/ion-input/input";
    //public static final String xPathForRechargeOperator="//*[@id=\"rechargeForm\"]/div/div/form/ion-item[2]/div[1]/div/ion-select";
    public static final String xPathForRechargeOperator1="//button[@class='item-cover disable-hover item-cover-md item-cover-default item-cover-default-md']";
    //*[@id="rechargeForm"]/div/div/form/ion-item[2]/div[1]/div/ion-select/div[2]
    //public static final String xPathForRechargeOperatorSelect="//*[@id=\"alert-input-0-2\"]";
    public static final String xPathForRechargeOperatorSelect1="//button[@class='alert-tappable alert-radio disable-hover alert-radio-button alert-radio-button-md alert-radio-button-default alert-radio-button-default-md']";
    public static final String xPathForRechargeOperatorOkButton="/html/body/ion-app/ion-alert/div/div[4]/button[2]/span";
    public static final String xPathForRechargeAmount="//*[@id=\"rechargeForm\"]/div/div/form/ion-item[3]/div[1]/div/ion-input/input";
    public static final String xPathForRechargeNext="//button/span[@class='button-inner' and contains(.,'Next')]";
    //public static final String xPathForRechargeNext="//*[@id=\"rechargeForm\"]/div/div/form/div/button/span";
    public static final String xPathForRechargeConfirm="/html/body/ion-app/ng-component/ion-nav/page-recharge-confirm/ion-content/div[2]/ion-grid/ion-row[5]/ion-col[1]";
    public static final String xPathForRechargeSuccessMsg="/html/body/ion-app/ng-component/ion-nav/page-recharge-success/ion-content/div[2]/ion-grid/ion-row[1]/ion-col";
    public static final String xPathForRechargemobshow="/html/body/ion-app/ng-component/ion-nav/page-recharge-success/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]";
    public static final String xPathForRechargeOperatorshow="/html/body/ion-app/ng-component/ion-nav/page-recharge-success/ion-content/div[2]/ion-grid/ion-row[3]/ion-col[2]";
    public static final String xPathForRechargeAmountshow="/html/body/ion-app/ng-component/ion-nav/page-recharge-success/ion-content/div[2]/ion-grid/ion-row[4]/ion-col[2]";
    public static final String xPathForRechargeTypeShow="/html/body/ion-app/ng-component/ion-nav/page-recharge-success/ion-content/div[2]/ion-grid/ion-row[5]/ion-col[2]";
    public static final String xPathForRechargeOkbutton="//button/span[@class='button-inner' and contains(.,'OK')]";
    //public static final String xPathForRechargeOkbutton="/html/body/ion-app/ng-component/ion-nav/page-recharge-success/ion-content/div[2]/ion-grid/ion-row[6]/button";
    public static final String xPathForHomeButtonClick="/html/body/ion-app/ng-component/ion-nav/page-recharge-confirm/ion-header/ion-toolbar/button";
    public static final String xPathForeEnterHome="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[1]";
    public static final String xPathForeEnterDashboardHome="/html/body/ion-app/ng-component/ion-nav/page-home/ion-header/ion-navbar/button[2]";
    public static final String xPathForTxnHistoryMenu="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[2]";
    public static final String xPathForTxnHistoryDetails="/html/body/ion-app/ng-component/ion-nav/page-transaction-history/ion-content/div[2]/ion-list";
    public static final String xPathForTxnHistoryHomeButton="/html/body/ion-app/ng-component/ion-nav/page-transaction-history/ion-header/ion-toolbar/button";
    public static final String xPathForChangePINMenu="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[3]";
    public static final String xPathForChangePINCurrentPIN="/html/body/ion-app/ng-component/ion-nav/page-change-pin/ion-content/div[2]/ion-list/form/ion-item[1]/div[1]/div/ion-input/input";
    public static final String xPathForChangePINNewPIN="/html/body/ion-app/ng-component/ion-nav/page-change-pin/ion-content/div[2]/ion-list/form/ion-item[2]/div[1]/div/ion-input/input";
    public static final String xPathForChangePINNewPINRetyped="/html/body/ion-app/ng-component/ion-nav/page-change-pin/ion-content/div[2]/ion-list/form/ion-item[3]/div[1]/div/ion-input/input";
    public static final String xPathForChangePINNextButton="/html/body/ion-app/ng-component/ion-nav/page-change-pin/ion-content/div[2]/ion-list/form/div/button";
    public static final String xPathForChangePINSuccessMsg="/html/body/ion-app/ng-component/ion-nav/page-change-pin-success/ion-content/div[2]/ion-grid/ion-row[1]";
    public static final String xPathForChangePINOkButton="//button/span[@class='button-inner' and contains(.,'OK')]";
    //public static final String xPathForChangePINOkButton="/html/body/ion-app/ng-component/ion-nav/page-change-pin-success/ion-content/div[2]/ion-grid/ion-row[2]/button";
    public static final String xPathForChangePINHomeButton="/html/body/ion-app/ng-component/ion-nav/page-change-pin-success/ion-header/ion-toolbar/button";
    public static final String xPathForLimitMenu="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[4]";
    public static final String xPathForLimitMenuTab1Click="//*[@id=\"tab-t0-1\"]";
    public static final String xPathForLimitMenuTab2Click="//*[@id=\"tab-t0-2\"]";
    public static final String xPathForLimitMenuTestCase="//*[@id=\"tabpanel-t0-0\"]/page-limit-rule/ion-content/div[2]/ion-grid/div/ion-row[1]/ion-col[2]";
    public static final String xPathForLimitMenuHomeButton="/html/body/ion-app/ng-component/ion-nav/page-limit/ion-header/ion-toolbar/button";
    public static final String xPathForLimitMenuEnter="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[1]";
    public static final String xPathForHelpMenu="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[6]";
    public static final String xPathForHelpMenuEnter="/html/body/ion-app/ng-component/ion-nav/page-help-content/ion-content/div[2]/p[1]";
    public static final String xPathForHelpMenuHome="/html/body/ion-app/ng-component/ion-nav/page-help-content/ion-header/ion-toolbar/button";
    public static final String xPathForLogOut="//*[@id=\"customer\"]/div/ion-content/div[2]/ion-list/button[7]";
    public static final String xPathForTap="/html/body/ion-app/ng-component/ion-nav/page-home/ion-content/div[2]/ion-grid/ion-scroll/div/div/ion-list/ion-item[1]";
    public static final String xPathPaymentCheckAddFavPayee="//*[@id=\"undefined\"]";
    public static final String xPathPaymentAddFavPayeeName="//*[@id=\"payment-success-page\"]/div/div/ion-row[7]/ion-item/div[1]/div/ion-input/input";

    public static final String xPathForFavPaymentMenuAdd="/html/body/ion-app/ng-component/ion-nav/page-payment/ion-content/div[2]/ion-scroll[2]/div/div/ion-list/ion-item-sliding[1]";
    public static final String xPathForFavPaymentDeleteButton="//button[@class='disable-hover button button-md button-default button-default-md button-md-danger']";
    public static final String xPathForSchoolPaymentDueMsg=" /html/body/ion-app/ng-component/ion-nav/page-payment-confirm/ion-content/div[2]/ion-grid/ion-row[6]/ion-col";











































































































}
