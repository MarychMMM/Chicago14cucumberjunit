Feature: Dzone header comparision
  @dzone
  Scenario: Header comparison
    Given User on the goggle search enter url "https://dzone.com/articles/gradle-vs-maven"
    And  User gets the title
    And User on the goggle search enter url "https://dzone.com/articles/api-security-weekly-issue-71"
    Then User compares 2 header