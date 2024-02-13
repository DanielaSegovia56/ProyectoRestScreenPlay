Feature: Review albums

  @Getalbums
  Scenario: Review album to manage them
    When I consume the albums endpoint
    Then I will be able to see the available albums