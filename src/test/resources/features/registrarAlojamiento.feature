#Author: juanpablomarquez7@gmail.com

Feature: Registrar Alojamiento
  Yo como usuario de Booking
  quiero registrar un alojamiento
  para interactuar con la pagina de Booking

  Background: 
    Given "Juan" navega a la pagina de Booking



	@RegistrarAlojamientoAutomatic
  Scenario: Registrar Alojamiento Booking
    Given ingresa los datos de reservacion
      | destination | Medellin    |
      | checkIn     | 2022-03-05 |
      | checkOut    | 2022-04-10 |
    When escoge el hotel con menor precio
    Then deberia ver el mensaje de reserva confirmada

    
 	@RegistrarAlojamientoManualExitoso
  Scenario: Registrar Alojamiento Booking
    Given ingresa los datos de reservacion
      | destination | Medellin    |
      | checkIn     | 2022-03-05 |
      | checkOut    | 2022-04-10 |
    When escoge el hotel con menor precio
    Then deberia ver el mensaje de reserva confirmada
 
 
 @RegistrarAlojamientoManualFallido
  Scenario: Registrar Alojamiento Booking
    Given ingresa los datos de reservacion
      | destination | Medellin    |
      | checkIn     | 2022-03-05 |
      | checkOut    | 2022-04-10 |
    When escoge el hotel con menor precio
    Then Se evidencia que la reserva no quedo establecida