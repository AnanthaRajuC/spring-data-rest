--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `street` varchar(255) NOT NULL,
  `suite` varchar(255),
  `city` varchar(255),
  `zipcode` varchar(255)
);

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255),
  `gender` varchar(255),
  `address_id` varchar(255)
);

