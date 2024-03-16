@smoke
Feature: N11 Web Sitesine Gitme

  @anasayfayagit

  Scenario: N11 web sitesine gitmek istiyorum
    Given Kullanıcı Anasayfaya  gider
    When Ana sayfanın yüklendiğini doğrular
    And Kullanıcı ana sayfa giriş butınunu bulur ve tıklar
    And Giriş sayfasının yüklendiği doğrulanır.
    And Kullanıcı giriş sayfasında geçerli bir kullanıcı adı  girer.
    And Kullanıcı giriş sayfasında geçerli bir şifre girer.
    And Kullanıcı "Giriş Yap" butonuna tıklar.
    And Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır.

  @ürünekleme
  Scenario: Ürün ekleme
    Given Kullanıcı Anasayfaya  gider
    When Kullanıcı arama kutusuna "Kablosuz Kulaklık" yazar
    And kullanıcı yazılan ifadeyi arama yapar
    And Açılan sayfada 4 yıldız üzeri olan ürünleri seçer
    And Kullanıcı arama sonuçları arasından istediği bir kablosuz kulaklığı seçer.
    And Kullanıcı ürün detay sayfasında "Sepete Ekle" butonuna tıklar.
    And  Kullanıcı sepetteki ürünleri kontrol eder.
    And  Kullanıcı satın al butonuna tıklar.
    And Ödeme sayfasının açıldığını kontrol eder
  And Kullanıcı ödeme sayfasından sepetim kısmına geri döner
    And Kullanıcı sepetteki ürünü siler
    And sepetin boş olduğu doğrulanır
    And kullanıcı hesaptan çıkış yapar.

