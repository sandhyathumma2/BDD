$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "GitHub Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is trying to signin in GitHub account with Invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on GitHub Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.github.SteDefs.LoginStepDef.user_is_on_GitHub_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Invalid Credentials and click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.github.SteDefs.LoginStepDef.user_Enter_Invalid_Credentials_and_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Incorrect username or password.\" message should dispaly",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.github.SteDefs.LoginStepDef.message_should_dispaly(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User is trying to signin in GitHub account with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on GitHub Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cg.github.SteDefs.LoginStepDef.user_is_on_GitHub_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid Credentials and click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cg.github.SteDefs.LoginStepDef.user_Enter_Valid_Credentials_and_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully sign on his GitHub account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cg.github.SteDefs.LoginStepDef.user_successfully_sign_on_his_GitHub_account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});