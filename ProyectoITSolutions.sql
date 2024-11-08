create schema ITSolutions;
use ITSolutions;

create user 'usuario_proyecto'@'%' identified by 'Usuar1o_Contrasena.';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on ITSolutions.* to 'usuario_proyecto'@'%';
flush privileges;

create table Usuario (
id int auto_increment primary key not null,
nombre varchar (50) not null,
primerapellido varchar (50) not null,
segundoapellido varchar (50) not null,
correo varchar (100) not null,
contraseña varchar (50) not null)

 ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*CREATE TABLE Consultor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    especialidad VARCHAR(100) NOT NULL,
    disponibilidad VARCHAR(100),
    tarifa DECIMAL(10, 2),
    experiencia TEXT
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE Administrador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;*/

INSERT INTO Usuario (nombre, primerapellido, segundoapellido, correo, contraseña)
VALUES ('Juan', 'Pérez', 'Gómez', 'juan.perez@ejemplo.com', SHA2('Contrasen@123', 256));

