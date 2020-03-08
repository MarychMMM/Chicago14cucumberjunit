Feature: Google feature verifications

  Agile Story : User stories, acceptance criteria
  Basically we can pass here any aditional information related to this feature file
  #comments are done using hashtag sign in feature file
@smokeTest
  Scenario: Google title verification

    When User is on google homepage
    Then User shpould see title contains Google

   @minismoke
    Scenario: Google title verification after searching a term
     When User is on google homepage
      And User types wooden spoon into the search box
      And User clicks to search button
      Then User should see wooden spoon in the title