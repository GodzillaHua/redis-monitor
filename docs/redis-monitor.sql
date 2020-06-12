use redismonitor;
CREATE TABLE IF NOT EXISTS t_environment
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(20) NOT NULL,
    create_time datetime default CURRENT_TIMESTAMP,
    update_time datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS t_redis_config
(
    id             INT PRIMARY KEY AUTO_INCREMENT,
    environment_id INT          NOT NULL,
    name           VARCHAR(20)  NOT NULL,
    type           CHAR(1)      NOT NULL,
    servers        VARCHAR(255) NOT NULL,
    create_time    datetime default CURRENT_TIMESTAMP,
    update_time    datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);