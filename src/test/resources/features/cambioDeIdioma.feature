#Author: juanpablomarquez7@gmail.com

Feature: Cambio de Idioma
  Yo como usuario de Booking
  quiero probar de forma Manual el cambio del idioma de la pagina
  con el fin de interactuar con pruebas funcionales en la pagina de Booking


	Background: 
	 Given "Juan" navega a la pagina de Booking

  @CambioDeIdiomaManualExitoso
  Scenario: Cambio de Idioma Booking
    Given Desea ver la pagina en ingles
    When Da click en Elegir cambio de Idioma y escoge el idioma "English (US)"
    Then se evidencia que se cambia el idioma de la pagina en su totalidad
    
    
    
  @CambioDeIdiomaManualFallido
  Scenario: Cambio de Idioma Booking
    Given Desea ver la pagina en ingles
    When Da click en Elegir cambio de Idioma y escoge el idioma "English (US)"
    Then se evidencia que No se cambia el idioma de la pagina