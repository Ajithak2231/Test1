Feature: This is to verify the Login page

@Main
  Scenario Outline: Login Page with valid credential
    Given Launch browser and launch the url "https://magento.softwaretestingboard.com/"
    When click SignIn 
    And Enter "<username>" , "<password>"
    And Click LogIn
    Then Validate the process
    

    Examples: 
      | 			username  			|	password | 
      | ajithrms001@gmail.com |Ajith@123 | 
      
      
 