package org.jboss.weld.extensions.util.annotated;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

import javax.enterprise.inject.spi.AnnotatedField;
import javax.enterprise.inject.spi.AnnotatedType;

/**
 * 
 * @author Stuart Douglas
 *
 */
class NewAnnotatedField<X> extends AbstractNewAnnotatedMember<X, Field> implements AnnotatedField<X>
{

   NewAnnotatedField(AnnotatedType<X> declaringType, Field field, AnnotationStore annotations, Type overridenType)
   {
      super(declaringType, field, field.getType(), annotations, field.getGenericType(), overridenType);
   }

}
