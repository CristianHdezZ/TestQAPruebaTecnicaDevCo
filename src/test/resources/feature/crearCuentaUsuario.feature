Feature: TraveloCity Crear Cuenta User
  Como Usuario
  Quiero ingresar a www.travelocity.com
  A registrar una cuenta de Usiario

  @ScenarioCreacionUsuarioExitoso
  Scenario Outline: Creacion de cuenta de usuario
    Given Cristian ingresa a travelocity
    When Dilidenciar formulario de cuenta de user
      |nombre|apellido|email|password|
      |<nombre>|<apellido>|<email>|<password>|
    Then debe mostrar el mensaje Or, Create an account with your Email
    Examples:
    |nombre|apellido|email|password|
    |Cristian|Hernandez Zabala|ingcristianhernandez@hotmail.com|prueba2021|
