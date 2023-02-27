Feature: Product Checkout

  @Product_checkout
  Scenario: Checkout the items added in the cart
    Given Check Cart contains any product
    When Click cart 
    And Proceed to Checkout
    And Give delivery address
    And click proceed 
    Then Verify the given address 
    And Place Order
    And Get the Order number
    

 
