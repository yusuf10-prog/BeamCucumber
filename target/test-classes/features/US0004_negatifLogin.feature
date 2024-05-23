
Feature: US0004 login testi

Scenario: TC04 US0004 Yanlıs sifre ile Negatif login testi

  Given Siteye "url" adresi ile giris yapilir.
  Then Sirket adi BİMSER ACADEMY secilir.
  And Kullanici adi alanina gecerli kullanici "isim" girilir.
  And Sifre alanina gecersiz "yanlisSifre" girilir.
  And Sisteme dahil olmak icin giris butonuna tiklanir.
  And Mesaj uyarisi kontrolu yapilir. Mesaj uyarisi yazdilir.