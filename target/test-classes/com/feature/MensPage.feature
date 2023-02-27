
Feature: This is to Check Men Shopping Page


  @Tops
  Scenario: Ordering a Men Top
    Given Click on the Mens 
    And Choose Tops
    When Filter by price low to high
    And Click the first top & Choose size as S & Choose Blue
    Then Click Add to Cart
    And Validate the Process

  @Bottom  
  	Scenario: Ordering a Men Bottom
    Given Choose Bottoms
    When Filter by product name
    And Click any product
    Then Choose any Size & Choose any color
    And Click add to cart
    And Validate the Process

   
