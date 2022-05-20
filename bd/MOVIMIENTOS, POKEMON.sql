--DATOS POKEMON.

INSERT INTO pokemon (NUM_POKEDEX, NOMBRE, TIPO1, TIPO2)
VALUES	(1, 'Bulbasaur', 'Planta', NULL),
		(2, 'Ivysaur', 'Planta', NULL),
		(3, 'Venusaur', 'Planta', NULL),
        (4, 'Charmander', 'Fuego', NULL),
        (5, 'Charmeleon', 'Fuego', NULL),
        (6, 'Charizard', 'Fuego', 'Volador'),
        (7, 'Squirtle', 'Agua', NULL),
        (8, 'Wartortle', 'Agua', NULL),
        (9, 'Blastoise', 'Agua', NULL),
        (10, 'Caterpie', 'Bicho', NULL),
        (11, 'Metapod', 'Bicho', NULL),
        (12, 'Butterfree', 'Bicho', 'Volador'),
        (13, 'Weedle', 'Bicho', 'Tierra'),
        (14, 'Kakuna', 'Bicho', 'Tierra'),
        (15, 'Beedrill', 'Bicho', 'Volador'),
        (16, 'Pidgey', 'Volador', NULL),
        (17, 'Pidgeotto', 'Volador', NULL),
        (18, 'Pidgeot', 'Volador', NULL),
        (19, 'Spearow', 'Volador', 'Tierra'),
        (20, 'Fearow', 'Volador', 'Tierra'),
        (21, 'Pikachu', 'Electrico', NULL),
        (22, 'Raichu', 'Electrico', NULL);
        
		
		
		
--DATOS MOVIMIENTOS.	
INSERT INTO movimientos (ID_MOVIMIENTO, TIPO, NOMBRE, NIVEL, ESTAMINA, POTENCIA, TIPO_ELEMENTO, ESTADO, MEJORA, CANT_MEJORA)
VALUES	(1, 'ATAQUE', 'Absorber', 3, 5, 20, 'Planta', NULL, NULL, NULL),
		(2, 'ATAQUE', 'Acoso', 6, 6, 25, 'Bicho', NULL, NULL, NULL),
        (3, 'ATAQUE', 'Aguijón letal', 9, 7, 17, 'Bicho', NULL, NULL, NULL),
        (4, 'ATAQUE', 'Balón ígneo', 12, 8, 20, 'Fuego', NULL, NULL, NULL),
        (5, 'ATAQUE', 'Batería asalto', 15, 9, 25, 'Planta', NULL, NULL, NULL),
        (6, 'ATAQUE', 'Calcinación', 18, 10, 22, 'Planta', NULL, NULL, NULL),
        (7, 'ATAQUE', 'Cascada', 21, 11, 23, 'Agua', NULL, NULL, NULL),
        (8, 'ATAQUE', 'Chorro de vapor', 24, 12, 21, 'Agua', NULL, NULL, NULL),
        (9, 'ATAQUE', 'Ciclón de hojas', 27, 13, 18, 'Planta', NULL, NULL, NULL),
        (10, 'ATAQUE', 'Electrotela', 9, 14, 22, 'Electrico', NULL, NULL, NULL),
        (11, 'ATAQUE', 'Electrojaula', 12, 15, 21, 'Electrico', NULL, NULL, NULL),
        (12, 'ATAQUE', 'Energibola', 15, 16, 24, 'Planta', NULL, NULL, NULL),
        (13, 'ATAQUE', 'Estallido', 9, 20, 21, 'Fuego', NULL, NULL, NULL),
        (14, 'ATAQUE', 'Fitoimpulso', 12, 25, 25, 'Planta', NULL, NULL, NULL),
        (15, 'ATAQUE', 'Fuerza equina', 6, 15, 20, 'Tierra', NULL, NULL, NULL),
        (16, 'ESTADO', 'Fuego Fatuo', 9, 20, 25, NULL, 'Quemado', NULL, NULL),
        (17, 'ESTADO', 'Gota vital', 12, 15, 30, NULL, 'Dormido', NULL, NULL),
        (18, 'ESTADO', 'Levitón', 15, 20, 30, NULL, 'Paralizado', NULL, NULL),
        (19, 'ESTADO', 'Onda anómala', 18, 25, 30,NULL, 'Paralizado', NULL, NULL),
        (20, 'ESTADO', 'Paralizador', 15, 20, 15, NULL, 'Paralizado', NULL, NULL),
        (21, 'ESTADO', 'Polvo explosivo', 12, 20, 30, NULL, 'Quemado', NULL, NULL),
        (22, 'ESTADO', 'Púas', 15, 20, 25, NULL, 'Paralizado', NULL, NULL),
        (23, 'ESTADO', 'Ráfaga', 20, 15, 30, NULL, 'Dormido', NULL, NULL),
        (24, 'ESTADO', 'Recogearena', 15, 20, 20, NULL, 'Paralizado', NULL, NULL),
        (25, 'ESTADO', 'Silbato', 20, 15, 15, NULL, 'Paralizado', NULL, NULL),
        (26, 'MEJORA', 'Telaraña', 15, 20, 25, NULL, NULL, 'MEJORA_ATAQUE', 5),
        (27, 'MEJORA', 'Auxilio', 12, 20, 20, NULL, NULL, 'MEJORA_VELOCIDAD', 10),
        (28, 'MEJORA', 'Barrera espinosa', 9, 15, 10, NULL, NULL, 'MEJORA_DEFENSA', 15),
        (29, 'MEJORA', 'Brecha negra', 12, 15, 20, NULL, NULL, 'MEJORA_ATAQUE', 10),
        (30, 'MEJORA', 'Campo electrico', 15, 20, 30, NULL, NULL, 'MEJORA_ATAQUE', 15),
        (31, 'MEJORA', 'Campo de hierba', 18, 15, 20, NULL, NULL, 'MEJORA_ATAQUE_ESPECIAL', 10),
        (32, 'MEJORA', 'Carga', 15, 20, 20, NULL, NULL, 'MEJORA_ATAQUE', 15),
        (33, 'MEJORA', 'Chapoteo', 18, 20, 25, NULL, NULL, 'MEJORA_DEFENSA', 10),
        (34, 'MEJORA', 'Clorofiláser', 9, 15, 10, NULL, NULL, 'MEJORA_DEFENSA_ESPECIAL', 10),
        (35, 'MEJORA', 'CONJURO', 12, 15, 20, NULL, NULL, 'MEJORA_VELOCIDAD', 15);
		
		

--Lista entrenadores
INSERT INTO entrenador (ID_ENTRENADOR, NOMBRE)
VALUES	(1, 'Álvaro'),
		(2, 'Antonio'),
        (3, 'Juan'),
        (4, 'Manolo'),
        (5, 'Jose'),
        (6, 'Luis'),
        (7, 'Paco'),
        (8, 'Damian'),
        (9, 'Diego'),
        (10, 'Dani');