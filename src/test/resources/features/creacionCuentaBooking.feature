#Author:juanpablomarquez7@gamil.com
Feature: Creacion de cuenta en Booking
  Yo como automatizador
  Quiero vavegar a la pagina de Booking
  Para crear una cuenta y validar su creacion


@CrearCuentaAutomatic
  Scenario: Crear una cuenta en la pagina de Booking
    Given "Juan" navega a la pagina de Booking
    When Ingresa al apartado crear cuenta Y introduce un email para la creacion de la cuenta "14TestDevco@gamil.com" y password "1HappyTest134"
    Then Valida el correo ingresado para la creacion de la cuenta "14TestDevco@gamil.com"
    
@CrearCuentaManualExitoso  
 Scenario: Crear una cuenta en la pagina de Booking
    Given "Juan" navega a la pagina de Booking
    When Ingresa al apartado crear cuenta Y introduce un email para la creacion de la cuenta "14TestDevco@gamil.com" y password "1HappyTest134"
    Then Valida el correo ingresado para la creacion de la cuenta "14TestDevco@gamil.com"
    
@CrearCuentaManualFallido   
Scenario: Crear una cuenta en la pagina de Booking
    Given "Juan" navega a la pagina de Booking
    When Ingresa al apartado crear cuenta Y introduce un email para la creacion de la cuenta "1TestDevco@gamil.com" y password "1HappyTest134"
    Then Se evidencia que el email o password estan erroneos
    And Se evidencia la No creacion de la cuenta 