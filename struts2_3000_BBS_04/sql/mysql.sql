DROP TABLE IF EXISTS `table_category`;
CREATE TABLE `_category` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(50) collate gbk_bin default NULL,
  `description` varchar(200) collate gbk_bin default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COLLATE=gbk_bin;
