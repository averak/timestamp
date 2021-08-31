CREATE TABLE IF NOT EXISTS `stamp_attachment` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `stamp_id` INT UNSIGNED NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `uuid` CHAR(36) NOT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  INDEX `fk_stamp_id_idx` (`stamp_id`),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_stamp_id`
    FOREIGN KEY (`stamp_id`)
    REFERENCES `stamp` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);
