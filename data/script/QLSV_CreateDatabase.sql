drop DATABASE `quanlysinhviendb`;
CREATE DATABASE `quanlysinhviendb`;

USE `quanlysinhviendb`;

CREATE TABLE `class` (
`class_id` varchar(30) NOT NULL,
`class_name` varchar(30) ,
PRIMARY KEY (`class_id`)
);


CREATE TABLE `student` (
  `student_id` varchar(30) NOT NULL,
  `class_id` varchar(16) NOT NULL,
  `full_name` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `idcard` varchar(12) NOT NULL,
  PRIMARY KEY (`student_id`),
   
   CONSTRAINT `student_class_fk` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`)
);

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `role` int(1) NOT NULL,
  `role_name` varchar(30) NOT NULL,


  PRIMARY KEY (`user_id`),
  CONSTRAINT subject_class__UNIQUE UNIQUE (`username`,  `password` )
) ;

CREATE TABLE `subject`(
  `subject_id` varchar(30) NOT NULL,
  `class_id` varchar(30) NOT NULL,
  `subject_name` varchar(30) NOT NULL,
  `room` varchar(30) NOT NULL,
  PRIMARY KEY (`subject_id`)
);


CREATE TABLE `class_with_subject` (
`class_id` varchar(30) NOT NULL,
`student_id` varchar(30) NOT NULL,
`mid_term_score` float ,
`end_term_score` float,
`other_score` float,
`final_score` float,
PRIMARY KEY (`class_id`,`student_id` ),
CONSTRAINT `class_detail_student_fk` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
);


CREATE TABLE `re_examination` (
  `index` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  PRIMARY KEY (`index`)
);

CREATE TABLE `student_request` (
  `request_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `subject_id` varchar(30) NOT NULL,
  `score_name` varchar(30) NOT NULL,
  `score` float NOT NULL,
  `reason` varchar(128) NOT NULL,
  `status` varchar(128) NOT NULL,
  PRIMARY KEY (`request_id`)

) ;

INSERT INTO `quanlysinhviendb`.`user` (`username`, `password`, `role`, `role_name`) VALUES ('1742001', '1742001', '1', 'Sinh Vien');
INSERT INTO `quanlysinhviendb`.`user` (`username`, `password`, `role`, `role_name`) VALUES ('giaovu', 'giaovu', '0', 'Giao Vu');






