Feature:complete credit form
  As a web user
  Navigate to Banco de Occidente
  Complete credit form

  @smokeTest
  Scenario: complete form
    Given As a web user I navigate to Banco de Occidente
    When enter request parameters
    Then validate quota value