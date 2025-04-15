Feature: Realizar la descargar el PDF Prohibiciones de Banistmo

  Yo como usuario de la pagina de Banistmo
  Quiero descargar el PDF de Prohibiciones
  Para validar que sea el correcto al momento de descargarlo

  Scenario: Descargar PDF correctamente
    Given el usuario ingresa a la pagina debe ir a Productos y Servicios
    And selecciona la opcion de Prestamos
    When selecciona la opcion de Prestamos de auto
    And selecciona la opcion de Tasas y Tarifas
    Then selecciona el pdf de Prohibiciones
    And valida que sea el pdf correcto