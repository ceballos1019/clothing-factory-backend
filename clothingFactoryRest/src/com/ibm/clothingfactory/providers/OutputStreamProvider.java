package com.ibm.clothingfactory.providers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
public class OutputStreamProvider implements MessageBodyWriter<ByteArrayOutputStream> {

	@Override
	public long getSize(ByteArrayOutputStream outputStream, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType) {
		
		return ByteArrayOutputStream.class == type;
	}

	@Override
	public void writeTo(ByteArrayOutputStream outputStream, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException {
		
		outputStream.writeTo(entityStream);
	}

}
