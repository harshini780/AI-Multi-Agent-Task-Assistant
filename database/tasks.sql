CREATE DATABASE ai_agents;

USE ai_agents;

CREATE TABLE tasks(
    id INT PRIMARY KEY AUTO_INCREMENT,
    task_name VARCHAR(200),
    status VARCHAR(50)
);

INSERT INTO tasks(task_name,status)
VALUES('Complete Dashboard','Assigned');

SELECT * FROM tasks;