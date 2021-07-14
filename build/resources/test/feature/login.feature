Feature: TraveloCity login
  Como Usuario
  Quiero ingresar a www.travelocity.com
  A iniciar sesion con mi cuenta

  @ScenarioLoginExitoso
  Scenario Outline: Iniciar sesion
    Given Cristian ingresa a la pagina de travelocity
    When ingresa las credenciales
      |<email>|<password>|
    Then debe mostrar el siguiente mensaje Cristian
    Examples:
      |email|password|
      |mariasierra19@hotmail.com|prueba2021|

  @ScenarioLoginFallido
  Scenario Outline: Iniciar sesion fallida
    Given Cristian ingresa a la pagina de travelocity
    When ingresa las credenciales
      |<email>|<password>|
    Then debe mostrar el siguiente error You may have entered an unknown email address or an incorrect password. Click here to jump to the first invalid field.
    Examples:
      |email|password|
      |mariasierra19@hotmail.comhhh|prueba2021|