Feature: N11 Web Sitesine Gitme

  Scenario: N11 web sitesine gitmek istiyorum
    Given Kullanıcı Anasayfaya  gider
    When Ana sayfanın yüklendiğini doğrular
    And Kullanıcı ana sayfa giriş butınunu bulur ve tıklar
    And Giriş sayfasının yüklendiği doğrulanır.
    And Kullanıcı giriş sayfasında geçerli bir kullanıcı adı  girer.
    And Kullanıcı giriş sayfasında geçerli bir şifre girer.
    And Kullanıcı "Giriş Yap" butonuna tıklar.
    And Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır.

