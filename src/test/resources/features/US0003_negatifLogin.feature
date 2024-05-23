
Feature: US0003 login testi

Scenario: TC03 US0003 geçeriz kullanıcı ismi ile Negatif login testi

  Given Siteye "url" adresi ile giris yapilir.
  Then Sirket adi BİMSER ACADEMY secilir.
  And Kullanici adi alanina gecersiz kullanici "ismi" girilir.
  Then Sifre alanina gecerli "sifre" girilir.
  And Sisteme dahil olmak icin giris butonuna tiklanir.
  And Mesaj uyarisi kontrolu yapilir. Mesaj uyarisi yazdilir.