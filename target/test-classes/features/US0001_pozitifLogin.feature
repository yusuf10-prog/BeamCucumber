
  Feature: US0001 login testi

    Scenario:  TC01 pozitif login testi

      Given Siteye "url" adresi ile giris yapilir.
      And Sirket adi BİMSER ACADEMY secilir.
      And Kullanici adi alanina gecerli kullanici "isim" girilir.
      Then Sifre alanina gecerli "sifre" girilir.
      And Sisteme dahil olmak icin giris butonuna tiklanir.
      And Devam tusuna basilir.
      Then Beam Dashboard sayfasinda oldugu test edilir.










