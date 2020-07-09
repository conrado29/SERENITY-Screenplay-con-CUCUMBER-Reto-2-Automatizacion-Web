# lenguaje:en
# autor: Conrado Iglesias G

@stories
Feature: Create employee
  As a user, I want to be able to register a new employee and validate their registration
  @scenario1
  Scenario: Create new employee
    Given that Juan needs to create an employee at the OrageHR
    When  he enters the registry in the application
      |   fieldName  |   lastName | middleName | idNumber | userName | status |   password  | confirmPassword |   essRole   |   supervisorRole   |  adminRole | allRegions | selectRegion |
      |   Nombre-29  | Apellido-29| Nombre2-29 |    123   | Nombre29 | Enable | Contra12345 |   Contra12345   | Default ESS | Default Supervisor | All Region |     no     |     China    |
    Then he displays the new employee in the application