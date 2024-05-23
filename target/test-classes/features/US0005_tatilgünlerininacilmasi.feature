@bimser
Feature: US0005 Tati günlerinin acilmasi ekrani testi

  Scenario:  TC01 tatil gunlerine giris testi

    Given Siteye "url" adresi ile giris yapilir.
    And Sirket adi BİMSER ACADEMY secilir.
    And Kullanici adi alanina gecerli kullanici "isim" girilir.
    Then Sifre alanina gecerli "sifre" girilir.
    And Sisteme dahil olmak icin giris butonuna tiklanir.
    And Devam tusuna basilir.
    Then Beam Dashboard sayfasinda oldugu test edilir.
    And Menu alanina tiklanir.
    And Sistem alanina tiklanir.
    And Ortak tanimlar alanina tiklanir.
    And Tatil gunleri alanina tiklanir.
    And Tatil gunleri ekraninda oldugun dogrulanir.