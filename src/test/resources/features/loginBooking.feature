#Author: juanpablomarquez7@gmail.com

Feature: Login en Booking
  Como usuario de Booking
  Me quiero loguear
  Para interacturar con la pagina

  @LoginAutomaticoExitoso
  Scenario: Login exitoso
    Given "Juan" navega a la pagina de Booking
    When ingresa el username y password
      | email    | testPablo@gmail.com|
      | password | Ju2022*!23        |
    Then deberia estar logueado

  @LoginManualExitoso
  Scenario: Login manual exitoso
    Given "Juan" navega a la pagina de Booking
    And desea iniciar sesion
    When ingresa el email previamente registrado
      | email | juantest2@gmail.com |
    And ingresa el password previamnete registrado
      | password | JU2022pablo* |
    Then se evidencia que su logueo ha sido exitoso

    
  @LoginManualFallido
  Scenario: Login manual exitoso
    Given "Juan" navega a la pagina de Booking
    And desea iniciar sesion
    When ingresa el email previamente registrado
      | email | juantest2@gmail.com |
    And ingresa el password previamnete registrado
      | password | JU2022pablo* |
    Then se evidencia que su usuario o password estan erroneos 
 