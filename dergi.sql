-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3306
-- Üretim Zamanı: 23 Ağu 2019, 14:19:18
-- Sunucu sürümü: 5.7.26
-- PHP Sürümü: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `dergi`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `dergiler`
--

DROP TABLE IF EXISTS `dergiler`;
CREATE TABLE IF NOT EXISTS `dergiler` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `dergiadi` varchar(40) COLLATE utf8_turkish_ci NOT NULL,
  `issn` varchar(40) COLLATE utf8_turkish_ci NOT NULL,
  `alan` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `editor` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `ilkyayın` date NOT NULL,
  `sonyayın` date NOT NULL,
  `kullaniciid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `dergiler`
--

INSERT INTO `dergiler` (`id`, `dergiadi`, `issn`, `alan`, `editor`, `ilkyayın`, `sonyayın`, `kullaniciid`) VALUES
(14, 'bulut', '12345', 'asdasd', 'asdasd', '1992-04-12', '2019-07-12', 1),
(15, 'asdasd', 'asdasd', 'asdas', 'asdas', '1992-04-12', '1995-04-12', 2),
(16, 'bulut', '123456', 'fen', 'Selahaddin Erdogan', '2019-08-02', '2019-08-23', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
CREATE TABLE IF NOT EXISTS `kullanici` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `kullaniciadi` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `isim` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `soyisim` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `mail` varchar(40) COLLATE utf8_turkish_ci NOT NULL,
  `dogumtarihi` date NOT NULL,
  `role` int(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kullaniciadi` (`kullaniciadi`),
  UNIQUE KEY `mail` (`mail`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanici`
--

INSERT INTO `kullanici` (`id`, `kullaniciadi`, `sifre`, `isim`, `soyisim`, `mail`, `dogumtarihi`, `role`) VALUES
(1, 'mustafa', 'uydas', 'mustafa', 'uydas', 'mustafauydas@gmail.com', '2019-04-04', 1),
(2, 'fatih', '1234', 'fatih', 'orhan', 'fatih@gmail.com', '2019-07-01', 0),
(3, 'ugur', 'ucar', 'ugur', 'ucar', 'ugurucar@gmail.com', '1992-10-17', 0),
(4, 'serdar', '5', 'serdar', 'tokgÃ¶z', 'serdar@gmail.com', '2001-05-05', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
