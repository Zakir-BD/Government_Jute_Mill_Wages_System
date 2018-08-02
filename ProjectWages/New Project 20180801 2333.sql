-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema wages
--

CREATE DATABASE IF NOT EXISTS wages;
USE wages;

--
-- Definition of table `labour_info`
--

DROP TABLE IF EXISTS `labour_info`;
CREATE TABLE `labour_info` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL default '0',
  `NID` varchar(45) NOT NULL default '0',
  `Department` varchar(45) NOT NULL default '0',
  `Basic` double NOT NULL default '0',
  `UnionF` double NOT NULL default '0',
  `RevenueS` double NOT NULL default '0',
  `MedicalA` double NOT NULL default '0',
  `TiffinA` double NOT NULL default '0',
  `TransportA` double NOT NULL default '0',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `labour_info`
--

/*!40000 ALTER TABLE `labour_info` DISABLE KEYS */;
INSERT INTO `labour_info` (`ID`,`Name`,`NID`,`Department`,`Basic`,`UnionF`,`RevenueS`,`MedicalA`,`TiffinA`,`TransportA`) VALUES 
 (22,'Zakir','1988','Jute',4150,10,10,700,150,150),
 (24,'Shajalal','1993','Jute',4150,10,10,700,150,150),
 (25,'Reazul','1993','Batching',4150,10,10,700,150,150),
 (26,'Rakib','1993','Batching',4150,10,10,700,150,150),
 (27,'Zakaria','1992','Batching',4150,10,10,700,150,150),
 (28,'Younus','1993','Jute',4150,10,10,750,150,150),
 (29,'Tanvir','1993','Preparing',4200,10,10,700,150,150),
 (30,'Juwel','1992','Batching',4150,10,10,700,150,150),
 (31,'hhh','111','hhh',10,10,10,10,0,0),
 (32,'hhh','111','hhh',10,10,10,10,10,10),
 (33,'Zakir','115','jkjj',500,50,50,50,50,50);
/*!40000 ALTER TABLE `labour_info` ENABLE KEYS */;


--
-- Definition of table `labourdata`
--

DROP TABLE IF EXISTS `labourdata`;
CREATE TABLE `labourdata` (
  `Month_S` varchar(45) NOT NULL default '0',
  `Year` varchar(45) NOT NULL default '0',
  `ID` int(10) unsigned NOT NULL default '0',
  `Name` varchar(45) NOT NULL default '0',
  `NID` varchar(45) NOT NULL default '0',
  `Department` varchar(15) NOT NULL default '0',
  `Basic` double NOT NULL default '0',
  `MedicalA` double NOT NULL default '0',
  `TiffinA` double unsigned NOT NULL default '0',
  `TransportA` double NOT NULL default '0',
  `WorkingH` double NOT NULL default '0',
  `Overtime` double NOT NULL default '0',
  `LeaveH` double NOT NULL default '0',
  `PFL` double NOT NULL default '0',
  `RevenueS` double NOT NULL default '0',
  `UnionF` double NOT NULL default '0',
  `ddBasic` double NOT NULL default '0',
  `ddHouseR` double NOT NULL default '0',
  `ddMedicalA` double NOT NULL default '0',
  `ddTiffinA` double NOT NULL default '0',
  `ddTransportA` double NOT NULL default '0',
  `ddOvertime` double NOT NULL default '0',
  `ddLeaveH` double NOT NULL default '0',
  `ddPF` double NOT NULL default '0',
  `ddPFL` double NOT NULL default '0',
  `ddRevenueS` double NOT NULL default '0',
  `ddUnionF` double NOT NULL default '0',
  `ddGrossS` double NOT NULL default '0',
  `ddTotalD` double NOT NULL default '0',
  `ddNetS` double NOT NULL default '0',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `labourdata`
--

/*!40000 ALTER TABLE `labourdata` DISABLE KEYS */;
INSERT INTO `labourdata` (`Month_S`,`Year`,`ID`,`Name`,`NID`,`Department`,`Basic`,`MedicalA`,`TiffinA`,`TransportA`,`WorkingH`,`Overtime`,`LeaveH`,`PFL`,`RevenueS`,`UnionF`,`ddBasic`,`ddHouseR`,`ddMedicalA`,`ddTiffinA`,`ddTransportA`,`ddOvertime`,`ddLeaveH`,`ddPF`,`ddPFL`,`ddRevenueS`,`ddUnionF`,`ddGrossS`,`ddTotalD`,`ddNetS`) VALUES 
 ('February','2018',22,'Zakir','1988','Jute',4150,700,150,150,101,101,101,101,10,10,2015.14,1007.57,679.81,72.84,72.84,4030.29,2015.14,403.03,101,10,10,9893.63,524.03,9369.6),
 ('February','2018',23,'Mostafa','1992','Jute',4150,700,150,150,20,201,201,201,10,10,399.04,199.52,743.75,14.42,14.42,8020.67,4010.34,440.94,201,10,10,13402.16,661.94,12740.22),
 ('February','2018',24,'Shajalal','1993','Jute',4150,700,150,150,301,301,301,301,10,10,6005.53,3002.76,2025.96,217.07,217.07,12011.06,6005.53,1201.11,301,10,10,29484.98,1522.11,27962.87),
 ('February','2018',25,'Reazul','1993','Batching',4150,700,150,150,101,101,101,101,10,10,2015.14,1007.57,679.81,72.84,72.84,4030.29,2015.14,403.03,101,10,10,9893.63,524.03,9369.6),
 ('February','2018',26,'Rakib','1993','Batching',4150,700,150,150,20,20,20,20,10,10,399.04,199.52,134.62,14.42,14.42,798.08,399.04,79.81,20,10,10,1959.14,119.81,1839.33);
/*!40000 ALTER TABLE `labourdata` ENABLE KEYS */;


--
-- Definition of table `payment_history`
--

DROP TABLE IF EXISTS `payment_history`;
CREATE TABLE `payment_history` (
  `Pay_id` int(10) unsigned NOT NULL auto_increment,
  `ID` int(10) unsigned NOT NULL default '0',
  `Month_S` varchar(45) default '0',
  `Year` varchar(45) NOT NULL default '0',
  `Name` varchar(45) NOT NULL default '0',
  `WorkingH` double NOT NULL default '0',
  `Overtime` double NOT NULL default '0',
  `LeaveH` double NOT NULL default '0',
  `PFL` double NOT NULL default '0',
  `ddGrossS` double NOT NULL default '0',
  `ddTotalD` double NOT NULL default '0',
  `ddNetS` double NOT NULL default '0',
  PRIMARY KEY  USING BTREE (`Pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_history`
--

/*!40000 ALTER TABLE `payment_history` DISABLE KEYS */;
INSERT INTO `payment_history` (`Pay_id`,`ID`,`Month_S`,`Year`,`Name`,`WorkingH`,`Overtime`,`LeaveH`,`PFL`,`ddGrossS`,`ddTotalD`,`ddNetS`) VALUES 
 (30,22,'January','2018','Zakir',10,10,10,10,979.57,69.9,909.67),
 (31,23,'January','2018','Mostafa',201,201,201,201,19689.3,1023.07,18666.23),
 (32,24,'January','2018','Shajalal',30,30,30,30,2938.7,169.71,2768.99),
 (33,22,'February','2018','Zakir',101,101,101,101,9893.63,524.03,9369.6),
 (34,23,'February','2018','Mostafa',20,201,201,201,13402.16,661.94,12740.22),
 (35,24,'February','2018','Shajalal',301,301,301,301,29484.98,1522.11,27962.87),
 (36,25,'February','2018','Reazul',101,101,101,101,9893.63,524.03,9369.6),
 (37,26,'February','2018','Rakib',20,20,20,20,1959.14,119.81,1839.33);
/*!40000 ALTER TABLE `payment_history` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
