$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/fazee/Selenium/techfiosBDDDIY/src/test/java/features/contact.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i want a customer service phone number so that i can",
  "description": "       get assistance if needed",
  "id": "as-a-user-i-want-a-customer-service-phone-number-so-that-i-can",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to view business contact information",
  "description": "",
  "id": "as-a-user-i-want-a-customer-service-phone-number-so-that-i-can;user-should-be-able-to-view-business-contact-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to dell website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "navigates to support",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enters contact us page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "contact information page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewContactSteps.a_user()"
});
formatter.result({
  "duration": 230817300,
  "status": "passed"
});
formatter.match({
  "location": "ViewContactSteps.user_goes_to_dell_website()"
});
formatter.result({
  "duration": 7787859700,
  "status": "passed"
});
formatter.match({
  "location": "ViewContactSteps.navigates_to_support()"
});
formatter.result({
  "duration": 1378286700,
  "status": "passed"
});
formatter.match({
  "location": "ViewContactSteps.enters_contact_us_page()"
});
formatter.result({
  "duration": 849272700,
  "status": "passed"
});
formatter.match({
  "location": "ViewContactSteps.contact_information_page_should_display()"
});
formatter.result({
  "duration": 18103500,
  "status": "passed"
});
});