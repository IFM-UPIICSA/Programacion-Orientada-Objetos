PROGRAM monolitico;   		(* Fernando Luque *)
USES CRT;
CONST
	LIMITE = 8;
TYPE
	t_alumno = RECORD
		nombre: STRING[30];
		calif: INTEGER;
		estatura, peso: REAL;
		boleta: STRING[10];
	END;
VAR								(* globales *)
	g_arch : FILE OF t_alumno;
	g_cont : INTEGER;

PROCEDURE inicio;
BEGIN
	ClrScr;
	ASSIGN(g_arch, 'alumno.txt');
	RESET(g_arch);				(* abrir archivo *)
	g_cont := 0;
END;

PROCEDURE fin;
BEGIN
	CLOSE(g_arch);
	WRITELN;
	WRITELN('Alumnos con mas de 8: ', g_cont );		(* 1.- interfase con usuario*)
END;

PROCEDURE decision;
VAR	l_registro: t_alumno;				(* local *)
BEGIN
	READ(g_arch, l_registro);			(* 3.- lectura y escritura a archivos o b.d. *)
	IF l_registro.calif >= LIMITE THEN	(* 2.- logica o reglas del negocio *)
	BEGIN
		WRITELN(l_registro.nombre, ' ', l_registro.calif);	(* 1.- interfase con usuario*)
		g_cont := g_cont +1;
	END;
END;

PROCEDURE proceso;
BEGIN
	WHILE NOT EOF(g_arch)			(* 3.- lectura y escritura a archivos o b.d. *)
		DO decision;
END;

BEGIN	(* main *)
	inicio;
	proceso;
	fin;
END.
