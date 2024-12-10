CREATE TABLE IF NOT EXISTS `db_account` (
                                            `id` INT NOT NULL AUTO_INCREMENT,
                                            `username` VARCHAR(255) NOT NULL UNIQUE,
                                            `password` VARCHAR(255) NOT NULL,
                                            `email` VARCHAR(255) NOT NULL UNIQUE,
                                            `role` VARCHAR(255) NOT NULL DEFAULT 'user',
                                            `register_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;