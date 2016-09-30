CREATE TABLE `ClassMaster` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`class_id`)
);

CREATE TABLE `StudentDetails` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `classid` int(11) NOT NULL,
  PRIMARY KEY (`student_id`),
  KEY `fk_class` (`classid`),
  CONSTRAINT `fk_class` FOREIGN KEY (`classid`) REFERENCES `ClassMaster` (`class_id`)
);