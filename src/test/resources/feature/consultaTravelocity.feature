Feature: TraveloCity Consulta
  Como Usuario
  Quiero ingresar a www.travelocity.com
  A consulta informacion de reservas

  Background:
    Given Cristian visita la pagina travelocity

  @ScenarioConsultaReservaAutos
  Scenario Outline: consulta reservas de autos
    When ingresa los campos de consulta del auto
      |<origen>|<destino>|
    Then debe mostrar el auto Standard SUV
    Examples:
    |origen|destino|
    |Medellin|Bogota|

  @ScenarioConsultaReservaPaquetes
  Scenario Outline: consulta reservas de paquetes
    When ingresa los campos de consulta del paquete
      |<origen>|<destino>|
    Then debe mostrar el paquete con Free Cancellation Property
    Examples:
      |origen|destino|
      |Medellin|Bogota|
