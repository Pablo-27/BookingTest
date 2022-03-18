#Author: juanpablomarquez7@gmail.com

Feature: Alquiler de coches
  Yo como usuario de Booking
  quiero probar de forma Manual las funciones de alquiler de coches
  con el fin de interactuar con pruebas funcionales en la pagina de Booking

  @AlquilerCocheManualExitoso
  Scenario: Alquiler de coches Booking
    Given "Juan" navega a la pagina de Booking
    When ingresa a alquiler de coches y ingresa los datos
      | lugarRecogida | El Poblado Antioquia Colombia |
      | fechaRecogida | 2022-03-31                    |
      | fechaDevuelta | 2022-04-21                    |
    Then se evidencian los coches disponibles para su alquiler

    
  @AlquilerCocheManualFallido
  Scenario: Alquiler de coches Booking
    Given "Juan" navega a la pagina de Booking
    When ingresa a alquiler de coches y ingresa los datos
      | lugarRecogida | El Poblado Antioquia Colombia |
      | fechaRecogida | 2022-03-31                    |
      | fechaDevuelta | 2022-04-21                    |
    Then No se muestran los coches disponibles para su alquiler
    
