package com.haribon.utiles;
 
import java.lang.reflect.Field;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

  
@Aspect
public class MonitoreandoAspect { 
//implements MethodBeforeAdvice { 
//	public void before(Method method, Object[] args, Object target) throws Throwable {  }

	private final Logger logger = Logger.getLogger(MonitoreandoAspect.class.getName());
	@Before("execution(* com.haribon.service.*Service.guarda*(..))")
	public void logBeforePrueba(JoinPoint joinPoint){
		System.out.println("Her plz xD!");
		Object obj = joinPoint.getArgs()[0];
		Class clas = obj.getClass();
		Field field1 = null;
		try {
			field1 = clas.getDeclaredField("usuario");
			if (!field1.isAccessible()) {
				field1.setAccessible(true);
				field1.set(obj, "Gusta!");
				field1.setAccessible(false);
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
//	@SuppressWarnings("rawtypes")
//	@Before("execution(* pe.com.pts.micgen.service.*Service.update*(..))")
//	public void logBeforeUpdate(JoinPoint joinPoint) {
// 
//		logger.info("Before execute: " + joinPoint.getSignature().getName());
//		
//		FacesContext facesInstance = FacesContext.getCurrentInstance();
//		ExternalContext context = facesInstance.getExternalContext();
//		HttpSession session=(HttpSession) context.getSession(false);
//		Usuario usuario = (Usuario)session.getAttribute("usuarioSession");
//		
//		logger.info("User: " + usuario.getIdUsuario());
//		
//		try {
//			Object obj = joinPoint.getArgs()[0];
//			Class clas = obj.getClass();
//												  idUsuarioActualiza
//			Field field1 = clas.getDeclaredField("idUsuarioActualiza");
//			if(!field1.isAccessible()){
//				field1.setAccessible(true);
//				field1.set(obj, usuario.getIdUsuario().toString());
//				field1.setAccessible(false);
//			}
//			Field field2 = clas.getDeclaredField("fechaActualizacion");
//			if(!field2.isAccessible()){
//				field2.setAccessible(true);
//				field2.set(obj, Calendar.getInstance().getTime());
//				field2.setAccessible(false);
//			}
//		} catch (SecurityException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		}
//	}	
// 
//	
//	@SuppressWarnings("rawtypes")
//	@Before("execution(* pe.com.pts.micgen.service.*Service.save*(..))")
//	public void logBeforeSave(JoinPoint joinPoint) {
// 
//		logger.info("Before execute: " + joinPoint.getSignature().getName());
//		
//		FacesContext facesInstance = FacesContext.getCurrentInstance();
//		ExternalContext context = facesInstance.getExternalContext();
//		HttpSession session=(HttpSession) context.getSession(false);
//		Usuario usuario = (Usuario)session.getAttribute("usuarioSession");
//		
//		logger.info("User: " + usuario.getIdUsuario());
//		
//		try {
//			Object obj = joinPoint.getArgs()[0];
//			Class clas = obj.getClass();
//			Field field1 = clas.getDeclaredField("idUsuarioCrea");
//			if(!field1.isAccessible()){
//				field1.setAccessible(true);
//				field1.set(obj, usuario.getIdUsuario().toString());
//				field1.setAccessible(false);
//			}
//			Field field2 = clas.getDeclaredField("fechaCreacion");
//			if(!field2.isAccessible()){
//				field2.setAccessible(true);
//				field2.set(obj, Calendar.getInstance().getTime());
//				field2.setAccessible(false);
//			}
//		} catch (SecurityException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//			logger.error("ERROR====>>>>",e);
//		}
//	}
	
	
}
