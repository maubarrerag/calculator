CREATE TABLE IF NOT EXISTS `regions` (
  `nid` INT(11) NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(50) NOT NULL,
  `description` VARCHAR(150),
  PRIMARY KEY(`nid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `types` (
    `nid` INT(11) NOT NULL AUTO_INCREMENT,
    `code` VARCHAR(50) NOT NULL,
    `region` VARCHAR(50) NOT NULL,
    `vcpu` INT(11),
    `memory` DOUBLE,
    `ondemand` DOUBLE,
    `reserved` DOUBLE,
    `os` INT(11),
    PRIMARY KEY(`nid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS `os` (
    `nid` INT(11) NOT NULL AUTO_INCREMENT,
    `description` VARCHAR(50) NOT NULL,
    PRIMARY KEY(`nid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;


insert into regions (code,description) values('us-east-1','US East (N. Virginia)');
insert into regions (code,description) values('us-east-2','US East (Ohio)');
insert into regions (code,description) values('us-west-1','US West (N. California)');
insert into regions (code,description) values('us-west-2','US West (Oregon)');

insert into os (description) values('Windows');
insert into os (description) values('Linux');
insert into os (description) values('Red Hat Enterprise Linux');
insert into os (description) values('Linux with SQL Standard');
insert into os (description) values('Linux with SQL Web');