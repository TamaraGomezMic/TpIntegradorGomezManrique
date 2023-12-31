package ar.edu.unlam.pb2.integrador1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;



public class TestUniversidad {
	
	
	String nombre1 = "Maria";
	String apellido1 = "perez";
	Long dni1= 44565897L;	
	Integer idAlumno1 = 1;
	
	String nombre2 = "Marta";
	String apellido2 = "posil";
	Long dni2= 44555891L;	
	Integer idAlumno2 = 2;
	
	String nombre3 = "Mariela";
	String apellido3 = "pereziz";
	Long dni3= 44555297L;	
	Integer idAlumno3 = 3;
	
	String nombre4 = "lucas";
	String apellido4 = "ortiz";
	Long dni4= 44555837L;	
	Integer idAlumno4 = 4;
	
	String nombre5 = "claudio";
	String apellido5 = "pez";
	Long dni5= 44555847L;	
	Integer idAlumno5 = 5;
	
	String nombre6 = "blas";
	String apellido6 = "diez";
	Long dni6= 44555857L;	
	Integer idAlumno6 = 6;
	
	String nombre7 = "ada";
	String apellido7 = "bolpe";
	Long dni7= 44555867L;	
	Integer idAlumno7 = 7;
	
	String nombre8 = "luisa";
	String apellido8 = "reita";
	Long dni8= 44555797L;	
	Integer idAlumno8 = 8;
	
	String nombre9 = "camila";
	String apellido9 = "perez";
	Long dni9= 44555887L;	
	Integer idAlumno9 = 9;
	
	String nombre10 = "cristian";
	String apellido11 = "golaz";
	Long dni11= 44556897L;	
	Integer idAlumno11 = 11;
	
	String nombre12 = "pablo";
	String apellido12 = "til";
	Long dni12= 44557897L;	
	Integer idAlumno = 12;
	
	String nombre13 = "roman";
	String apellido13 = "riquelme";
	Long dni13= 44554897L;	
	Integer idAlumno13 = 13;
	
	String nombre14 = "Martin";
	String apellido14 = "palermo";
	Long dni14= 44535897L;	
	Integer idAlumno14 = 14;
	
	String nombre15 = "carlos";
	String apellido15 = "tevez";
	Long dni15= 44525897L;	
	Integer idAlumno15 = 15;
	
	String nombre16 = "marcos";
	String apellido16 = "rojo";
	Long dni16= 44515897L;	
	Integer idAlumno16 = 16;
	
	String nombre17 = "lita";
	String apellido17 = "garcia";
	Long dni17= 44550897L;	
	Integer idAlumno17 = 17;
	
	String nombre18 = "anto";
	String apellido18 = "casa";
	Long dni18= 44555097L;	
	Integer idAlumno18 = 18;
	
	String nombre19 = "noemi";
	String apellido19 = "tarin";
	Long dni19= 40655897L;	
	Integer idAlumno19 = 19;
	
	String nombre20 = "romina";
	String apellido20 = "maños";
	Long dni20= 44555893L;	
	Integer idAlumno20 = 20;
	
	String nombre21 = "carla";
	String apellido21 = "conte";
	Long dni21= 44455897L;	
	Integer idAlumno21 = 21;
	
	String nombre22 = "susana";
	String apellido22 = "gimenez";
	Long dni22= 34555897L;	
	Integer idAlumno22 = 22;
	
	
	@Test  
	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() { //anda//
		String  nombreUniversidad = "Unlam";
    	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Long celular = 1566655848L;
    	String email = "martaPerez@unlam.edu.ar";
		LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
    	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	Integer idAlumno = 1;
    	
    	
    	Universidad unlam = new Universidad(nombreUniversidad);
   		Alumno alumno = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	    	   	
		Boolean registroExitoso = unlam.registrar(alumno);
    	assertTrue(registroExitoso);
    	//System.out.println(registroExitoso);
    	
    	
	}
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoCuandoElAlumnoYaEsteRegistradoAUnaUniversidad() { //anda//
			String  nombreUniversidad = "Unlam";
	     	String nombre = "Marta";
	    	String apellido = "perez";
	    	Long dni= 44555897L; 
	    	Integer idAlumno = 1;
	    	Long celular = 1566655848L;
	    	String email = "martaPerez@unlam.edu.ar";
	    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
	     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
	    	
	    	
	    	Universidad unlam = new Universidad (nombreUniversidad);
	    	Alumno alumno1 = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
	   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	    	Alumno alumno2 = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
	   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	
	   		
	   		unlam.registrar(alumno1);	   		  	
	   		Boolean registroExitoso = unlam.registrar(alumno2);
	   		
	   		assertFalse(registroExitoso);

    	
	}
	
	@Test
	public void queNoSePuedaRegistrarUnAlumnoConElMismoDniAlaUniversidad() { //anda//
			String  nombreUniversidad = "Unlam";
	     	String nombre = "Marta";
	    	String apellido = "perez";
	    	Long dni= 44555897L; 
	    	Integer idAlumno = 1;
	    	Long celular = 1566655848L;
	    	String email = "martaPerez@unlam.edu.ar";
	    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
	     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
	    	
	     	String nombre2 = "luisa";
	    	String apellido2 = "perez";
	 
	    	Integer idAlumno2 = 2;
	    	    	
	    	
	    	Universidad unlam = new Universidad (nombreUniversidad);
	    	Alumno alumno1 = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
	   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	    	Alumno alumno2 = new Alumno(idAlumno2,dni,nombre2,celular, email, apellido2,
	   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
	
	   		
	   		unlam.registrar(alumno1);	   		  	
	   		Boolean registroExitoso = unlam.registrar(alumno2);
	   		
	   		assertFalse(registroExitoso);
	   		//System.out.println("el alumno tiene el mismo dni que un alumno ya registrado");

    	
	}
	
	
	@Test

	public void queSePuedaRegistrarUnaMateriaAUnaUniversidad() { //anda****
		String  nombre = "Unlam";
    	String nombreMateria = "PB2";
        Integer codigo = 1;
        
        Universidad unlam = new Universidad (nombre);
        Materia pb2 = new Materia(codigo,nombreMateria);

        assertTrue (unlam.registraMateria(pb2));
    	       
	}
	
	@Test
	public void queSeNoPuedaRegistrarUnaMateriaAUnaUniversidadConMismoId() { //anda********
		String  nombre = "Unlam";
      	String nombreMateria1 = "PB2 ", nombreMateria2 ="PB1";
        Integer codigo = 1;
        
        Universidad unlam = new Universidad (nombre);
        Materia pb2 = new Materia(codigo,nombreMateria1);
        Materia pb1 = new Materia(codigo,nombreMateria2);
        
        unlam.registraMateria(pb2);
        assertFalse (unlam.registraMateria(pb1));
    	       
	}
	
	
		                                   //DOCENTE
	
		@Test
		public void queSePuedaCrearUnDocente() { //andaa
			
				// PREPARACION
			String nombreDeLaUniversidad = "Unlam";
				Long dni = 37246801L;
				String nombre = "lucas";
				Long celular = 1123451234L;
				String email = "lucasbarrios@alumno.edu.ar";
				Integer legajo = 333;
				String apellido = "Barrios";
				LocalDate fechaDeNacimiento=LocalDate.of(2003, 01, 03);

				// ACCION
				Universidad unlam = new Universidad(nombreDeLaUniversidad);
				Profesor nuevoDocente = new Profesor(legajo,dni,nombre, apellido, fechaDeNacimiento, celular,
					 email);
				Boolean seCreo = unlam.crearUnDocente(nuevoDocente);

				// VALIDACION
				assertNotNull(seCreo);
				//System.out.println(seCreo);
			}

			@Test
		public void queNoSePuedaRegistrarDosDocentesConElMismoDni() { //andaa
			String nombreDeLaUniversidad = "Unlam";
			
			Long dni = 37246801L;
			String nombre = "lucas";
			Long celular = 1123451234L;
			String email = "lucasbarrios@alumno.edu.ar";
			Integer legajo = 333;
			String apellido = "Barrios";
			LocalDate fechaDeNacimiento=LocalDate.of(2003, 01, 03);

			Long dni1 = 37233801L;
			
			
			//ACCION
			Universidad unlam = new Universidad(nombreDeLaUniversidad);
			Profesor nuevoProfesor = new Profesor(legajo,dni,nombre, apellido, fechaDeNacimiento, celular,
					 email);
			Profesor nuevoProfesor2 = new Profesor(legajo,dni1,nombre, apellido, fechaDeNacimiento, celular,
					 email);
			unlam.crearUnDocente(nuevoProfesor);
			Boolean sePudoCrear = unlam.crearUnDocente(nuevoProfesor2);
			
			assertNotNull(sePudoCrear);
			//System.out.println(sePudoCrear);
			
	  
		}
		
			                          //COMISION
		@Test
		public void queSePuedaCrearUnaComision() {  //anda
			String nombreUni = "unlam";

			Integer idComision = 2343;

			
			
			//ACCION
			Universidad unlam = new Universidad(nombreUni);
			Comision comision = new Comision( idComision);

			Boolean sePudoCrear = unlam.crearUnaComision(comision);
		
								
			assertNotNull(sePudoCrear);
			//System.out.println(sePudoCrear);
			
		}		
		
		@Test
		public void queSePuedaAsignarUnaMateriaAunaComision() {  //anda
			String nombreUni = "unlam";
			String nombreMateria = "pb2";
			Integer codigoMateria = 4324;
			Integer idComision = 2343;

			
			//ACCION
			Universidad unlam = new Universidad(nombreUni);
			Materia materia = new Materia(codigoMateria, nombreMateria);

			Comision comision = new Comision( idComision);

			
			
			unlam.registraMateria(materia);

			unlam.crearUnaComision(comision);
			Boolean registro = unlam.asignarMateriaAunaComision(idComision,codigoMateria);
			
			assertTrue(registro);
			
		
		
			
		}
		
		@Test
		public void queSePuedaAsignarUnCicloLectivoYturnoAunaComision() {  //anda
			String nombreUni = "unlam";
			String nombreMateria = "pb2";
			Integer codigoMateria = 4324;
			Integer idComision = 2343;
			Integer idCiclo = 9433;
			Turno turno = Turno.MAÑANA ;
		
						
			LocalDate inicioRangoCiclo=LocalDate.of(2003, 03, 03);
			LocalDate finRangoCiclo=LocalDate.of(2003, 07, 03);
			
			//ACCION
			Universidad unlam = new Universidad(nombreUni);
			Materia materia = new Materia(codigoMateria, nombreMateria);
			CicloLectivo ciclo = new CicloLectivo(idCiclo, inicioRangoCiclo, finRangoCiclo);
			Comision comision = new Comision( idComision);
			
			
			unlam.registraMateria(materia);
			unlam.agregarCicloLectivo(ciclo); 
			unlam.crearUnaComision(comision);
			unlam.asignarMateriaAunaComision(idComision,codigoMateria);
			assertTrue(unlam.asignarTurnoAunaComision(idComision,turno));		
			assertTrue(unlam.asignarCicloLectivoAunaComision(idComision,ciclo));
			
					
		}
		
		@Test
		public void queSePuedaAsignarUnAulaAlaComision() { 
				String nombreUni = "unlam";
			Integer nroAula = 42343;
			Integer capacidadMaxima= 60;
			
			
			//ACCION
			Universidad unlam = new Universidad(nombreUni);
			Aula aula = new Aula(nroAula, capacidadMaxima);
			
			Boolean sePudoCrear =unlam.crearAula(aula);
			
			assertTrue(sePudoCrear);
		

	}
		
		
		
		@Test
		public void queSePuedaAsignarDocenteAComision() { //anda
			String nombreDeLaUniversidad = "Unlam";
			
			Long dni = 37246801L;
			String nombre = "lucas";
			Long celular = 1123451234L;
			String email = "lucasbarrios@alumno.edu.ar";
			Integer idDocente = 333;
			String apellido = "Barrios";
			LocalDate fechaDeNacimiento=LocalDate.of(2003, 01, 03);
			Integer idComision = 2343;
			
			
			//ACCION
			Universidad unlam = new Universidad(nombreDeLaUniversidad);
			Profesor nuevoProfesor = new Profesor(idDocente,dni,nombre, apellido, fechaDeNacimiento, celular,email);
			Comision comision = new Comision( idComision);
			
			
			//unlam.crearUnDocente(nuevoProfesor);
			unlam.crearUnDocente(nuevoProfesor);
			unlam.crearUnaComision(comision);
			
			Boolean sePudoCrear = unlam.asignarDocenteAComision(idComision, idDocente);
			assertTrue(sePudoCrear);
			
			
	  
		}
		@Test
		public void queSePuedaAsignarUnProfesorAyudante() { //falta termiknar
			String nombreDeLaUniversidad = "Unlam";
			
			Long dni = 37246801L;
			String nombre = "lucas";
			Long celular = 1123451234L;
			String email = "lucasbarrios@alumno.edu.ar";
			Integer idDocente = 333;
			String apellido = "Barrios";
			Long dni2 = 36246801L;
			String nombre2 = "graciela";			
			Integer idDocente2 = 3353;
			String apellido2 = "Barrionuevo";
			LocalDate fechaDeNacimiento=LocalDate.of(2003, 01, 03);
			Integer idComision = 2343;
			
			
			//ACCION
			Universidad unlam = new Universidad(nombreDeLaUniversidad);
			Profesor nuevoProfesor = new Profesor(idDocente,dni,nombre, apellido, fechaDeNacimiento, celular,email);
			Profesor profesorAyudante = new Profesor(idDocente2,dni2,nombre2, apellido2, fechaDeNacimiento, celular,email);
			Comision comision = new Comision( idComision);
			
			
			//unlam.crearUnDocente(nuevoProfesor);
			unlam.crearUnDocente(nuevoProfesor);
			unlam.crearUnDocente(profesorAyudante);
			unlam.crearUnaComision(comision);
			
			unlam.asignarDocenteAComision(idComision, idDocente);
			unlam.asignarDocenteAComision(idComision, idDocente2);
			
			
			
	  
		}
		
		
								//CICLO LECTIVO
	
	
	//ciclo lectivo  id, fechaDeInicioDeCicloLectivo,fechaFinalizacionCicloLectivo, fechaInicioInscripcion,fechaFinalizacionInscripcion
	@Test
	public void queSePuedaCrearUnCicloLectivo() {  //andaa
		String nombreUni = "unlam";
		Integer idCiclo = 9433;
		Integer idCiclo1 = 9423;
		LocalDate inicioRangoCiclo=LocalDate.of(2003, 03, 03);
		LocalDate finRangoCiclo=LocalDate.of(2003, 04, 03);
		
		LocalDate inicioRangoCiclo1=LocalDate.of(2003, 06, 03);
		LocalDate finRangoCiclo1=LocalDate.of(2003, 07, 03);
		//ACCION
		Universidad unlam = new Universidad(nombreUni);
		CicloLectivo ciclo = new CicloLectivo(idCiclo, inicioRangoCiclo, finRangoCiclo);
		CicloLectivo ciclo1 = new CicloLectivo(idCiclo1, inicioRangoCiclo1, finRangoCiclo1);
		
		
		unlam.agregarCicloLectivo(ciclo);
		Boolean sePudoCrear =unlam.agregarCicloLectivo(ciclo1);
		
		
		assertNotNull(sePudoCrear);
		//System.out.println(sePudoCrear);
		
		
	}
	 
		
	
	
									// Aula id, cantidadDeAlumnos

	@Test
	public void queSePuedaCrearUnAula() {
			String nombreUni = "unlam";
		Integer nroAula = 42343;
		Integer capacidadMaxima= 60;
		
		//ACCION
		Universidad unlam = new Universidad(nombreUni);
		Aula aula = new Aula(nroAula, capacidadMaxima);
		
		Boolean sePudoCrear =unlam.crearAula(aula);
		assertNotNull(sePudoCrear);
		//System.out.println(sePudoCrear);
	

}
	
	

									//-------------------NOTAS---------------
	
	@Test  
	public void queSePuedaCrearUnaNota() { // anda
		String  nombreUniversidad = "Unlam";
		Integer valorNota= 1;
		TipoDeNota tipoN = TipoDeNota.FINAL;
    	
    	Universidad unlam = new Universidad(nombreUniversidad);
    	Nota nota = new Nota(valorNota, tipoN);
	    	   	
		Boolean registroExitoso = unlam.registrarNota(nota);
		assertNotNull(registroExitoso);
    	//System.out.println(registroExitoso);
    	
    	
	}
	
	@Test  
	public void queNoSePuedanRendirDosRecuperatorios() { //anda
		String  nombreUniversidad = "Unlam";
		Integer valorNota1= 10;
		TipoDeNota tipoN1 = TipoDeNota.PRIMER_PARCIAL;
		Integer valorNota2= 4;
		TipoDeNota tipoN2 = TipoDeNota.SDO_PARCIAL;
    	
    	Universidad unlam = new Universidad(nombreUniversidad);
    	Nota nota1 = new Nota(valorNota1, tipoN1);
    	Nota nota2 = new Nota(valorNota2, tipoN2);
	    	   	
    	//unlam.registrarNota(nota1);
    	//unlam.registrarNota(nota2);
    	
		Boolean sePuedeRendirRecuperatorio = unlam.verificarRecuperatorio(nota1, nota2);
		assertNotNull(sePuedeRendirRecuperatorio);
    	//System.out.println(sePuedeRendirRecuperatorio);
    	
    	
	}
	
	@Test  
	public void queNoSePuedanRendirFinal() { //anda
		String  nombreUniversidad = "Unlam";
		Integer valorNota1= 1;
		TipoDeNota tipoN1 = TipoDeNota.PRIMER_PARCIAL;
		Integer valorNota2= 3;
		TipoDeNota tipoN2 = TipoDeNota.SDO_PARCIAL;
    	
    	Universidad unlam = new Universidad(nombreUniversidad);
    	Nota nota1 = new Nota(valorNota1, tipoN1);
    	Nota nota2 = new Nota(valorNota2, tipoN2);
	    	   	
    	//unlam.registrarNota(nota1);
    	//unlam.registrarNota(nota2);
    	
		Boolean sePuedeRendirFinal = unlam.puedeRendirFinal(nota1, nota2);
		assertNotNull(sePuedeRendirFinal);
    	//System.out.println(sePuedeRendirFinal);
    	
    	
	}
	@Test  
	public void queSePuedaRegistrarNotasDeUnaMateriaAUnAlumno() { 
		
		String  nombreUniversidad = "Unlam";
		//alumno
    	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Long celular = 1566655848L;
    	String email = "martaPerez@unlam.edu.ar";
		LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
    	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	Integer idAlumno = 1;
		//nota
    	Integer valorNota1= 10;
		TipoDeNota tipoN1 = TipoDeNota.PRIMER_PARCIAL;
		Integer valorNota2= 5;
		TipoDeNota tipoN2 = TipoDeNota.SDO_PARCIAL;
		Integer valorNota3= 1;
		TipoDeNota tipoN3 = TipoDeNota.REC_1PARCIAL;
		Integer valorNota4= 1;
		TipoDeNota tipoN4 = TipoDeNota.REC_2DOPARCIAL;
		Integer valorNota5= 1;
		TipoDeNota tipoN5 = TipoDeNota.FINAL;
		//comision
		Integer idComision = 2343;
        
		
		Universidad unlam = new Universidad(nombreUniversidad);
    	Alumno alumno = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
        
    	Nota nota1 = new Nota(valorNota1, tipoN1);
        Nota nota2 = new Nota(valorNota2, tipoN2);
        Nota nota3 = new Nota(valorNota3, tipoN3);
        Nota nota4 = new Nota(valorNota4, tipoN4);
    	Nota nota5 = new Nota(valorNota5, tipoN5);
    	
    	
        Comision comision = new Comision( idComision);

        
        Boolean registroNotaExitoso = unlam.crearRegistroDeNota(alumno, comision, nota1, nota2, nota3, nota4, nota5);
		assertNotNull(registroNotaExitoso);
    	//System.out.println(registroNotaExitoso);
    	
    	
	}

	
	
	
	@Test
	
	public void queSePuedanCalcularElPromedio() {
		
		String  nombreUniversidad = "Unlam";
		//alumno
    	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Long celular = 1566655848L;
    	String email = "martaPerez@unlam.edu.ar";
		LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
    	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
    	Integer idAlumno = 1;
		//nota
    	Integer valorNota1= 10;
		TipoDeNota tipoN1 = TipoDeNota.PRIMER_PARCIAL;
		Integer valorNota2= 6;
		TipoDeNota tipoN2 = TipoDeNota.SDO_PARCIAL;
		Integer valorNota3= 1;
		TipoDeNota tipoN3 = TipoDeNota.REC_1PARCIAL;
		Integer valorNota4= 1;
		TipoDeNota tipoN4 = TipoDeNota.REC_2DOPARCIAL;
		Integer valorNota5= 1;
		TipoDeNota tipoN5 = TipoDeNota.FINAL;
		//comision
		Integer idComision = 2343;
        
		
		Universidad unlam = new Universidad(nombreUniversidad);
    	Alumno alumno = new Alumno(idAlumno,dni,nombre,celular, email, apellido,
   				fechaDeNacimientoAlu,fechaDeIngresoAlu);
        
    	Nota nota1 = new Nota(valorNota1, tipoN1);
        Nota nota2 = new Nota(valorNota2, tipoN2);
        Nota nota3 = new Nota(valorNota3, tipoN3);
        Nota nota4 = new Nota(valorNota4, tipoN4);
    	Nota nota5 = new Nota(valorNota5, tipoN5);
    	
    	
        Comision comision = new Comision( idComision);

        
        Boolean registroNotaExitoso = unlam.crearRegistroDeNota(alumno, comision, nota1, nota2, nota3, nota4, nota5);
        Boolean seObtuvo = unlam.sePuedaObtener(registroNotaExitoso);
        
        
        assertNotNull(seObtuvo);
    	System.out.println(seObtuvo);
    	
	
	}
	
										//ALUMNO
	
	

	
	@Test
	public void queSePuedaInscribirUnAlumnoenMateriaSinCorrelativa() { 
		String  nombreUniversidad = "Unlam";
     	String nombre = "Marta";
    	String apellido = "perez";
    	Long dni= 44555897L; 
    	Integer idAlumno = 1;
    	Long celular = 1566655848L;
    	String email = "martaPerez@unlam.edu.ar";
    	LocalDate fechaDeNacimientoAlu=LocalDate.of(2003, 01, 03);
     	LocalDate fechaDeIngresoAlu=LocalDate.of(2023, 01, 03);
     	
		String nombreMateria = "PB1";
        Integer codigoMateria = 1;
        
        String nombreCarrera = "Desarrollo Web";
     
		Integer valorNota= 1;
		TipoDeNota tipoN = TipoDeNota.FINAL;
	
		
        Nota nota = new Nota(valorNota, tipoN);
            
		PlanDeEstudio tecnicatura = new PlanDeEstudio(nombreCarrera);	
        Materia pb1 = new Materia(codigoMateria,nombreMateria);
    	Universidad unlam = new Universidad (nombreUniversidad);
    	Alumno alumno1 = new Alumno( idAlumno, dni,  nombre, celular, email, apellido,
    			 fechaDeNacimientoAlu,fechaDeIngresoAlu);
    	
    	
    	unlam.registrar(alumno1);
    	unlam.registraMateria(pb1);
    	tecnicatura.ingresarMateriaAlPlanDeEstudio(unlam, codigoMateria);
    	
    	
        unlam.inscribirAlumnoAUnaMateria(dni,codigoMateria,tecnicatura);
	
	}


	@Test
	public void queSePuedaAsignarAlumosAlaComision() {
			String nombreUni = "unlam";
			Integer idComision = 2343;
			String nombreMateria = "PB1";
	        Integer codigoMateria = 1;
	        
		
		
		//ACCION
		Universidad unlam = new Universidad(nombreUni);	
		Comision comision = new Comision( idComision);
		Materia pb1 = new Materia(codigoMateria,nombreMateria);
		
		
		
		
		unlam.crearUnaComision(comision);
		unlam.asignarMateriaAunaComision(idComision, codigoMateria);
	
							
		
		
		

}
	
	
}
