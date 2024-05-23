
Feature: US0002 login testi

Scenario: TC02 US0002 Yanlis sirket ismi gecerli password ve sifre ile Negatif login testi

  Given Siteye "url" adresi ile giris yapilir.
  Then Sirket ismi olarak TurkBilisim (o.kacar) secilir.
  And Kullanici adi alanina gecerli kullanici "isim" girilir.
  Then Sifre alanina gecerli "sifre" girilir.
  And Sisteme dahil olmak icin giris butonuna tiklanir.
  And Mesaj uyarisi kontrolu yapilir. Mesaj uyarisi yazdilir.
