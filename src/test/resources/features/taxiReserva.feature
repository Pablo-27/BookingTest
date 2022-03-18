#Author: juanpablomarquez7@gmail.com

Feature: Reverva taxi
  Yo como usuario de Booking
  quiero reservar un taxi 
  para interactuar con dicha funcionalidad en la pagina

  @ReservaTaxiAutomatico
  Scenario: Reserva taxi en Booking
    Given "Juan" navega a la pagina de Booking
    When Reserva un taxi
      | origen    | Aeropuerto Olaya Herrera |
      | destino   | Parque Lleras            |
      | fecha     | 18, Marzo 2022           |
      | hora      |                       11 |
      | pasajeros |                        3 |
    Then se videncian los taxis disponibles

  @ReservaTaxiManualExitoso
  Scenario: Reserva taxi en Booking
    Given "Juan" navega a la pagina de Booking
    When Reserva un taxi con los datos
      | origen    | Aeropuerto Olaya Herrera |
      | destino   | Parque Lleras            |
      | fecha     | 18, Marzo 2022           |
      | hora      |                       11 |
      | pasajeros |                        3 |
    Then se videncian los taxis disponibles

  @ReservaTaxiManualFallido
  Scenario: Reserva taxi en Booking
    Given "Juan" navega a la pagina de Booking
    When Reserva un taxi con los datos
      | origen    | Aeropuerto Olaya Herrera |
      | destino   | Parque Lleras            |
      | fecha     | 18, Marzo 2022           |
      | hora      |                       11 |
      | pasajeros |                        3 |
    Then se videncia que no hay taxis disponibles
