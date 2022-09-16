Feature: Login
  @swag
  Scenario: Iniciar Sesión a SwagLabs y validar titulo
    Given que me encuentro en la página de login SwagLabs
    When inicio sesión con el usuario "standard_user" y contraseña "secret_sauce"
    Then valido debe estar el titutlo "PRODUCTS"
    And valido que exitan un item