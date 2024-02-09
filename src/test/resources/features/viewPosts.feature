Feature: Review posts

  @Getposts
  Scenario: Review posts to manage them
    When I consume the publications endpoint
    Then I will be able to see the available posts
