package com.mycompany.myapp.utils;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 *
 */
public class BeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    /**
     * Orika
     */
    public static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    public static MapperFacade mapper = mapperFactory.getMapperFacade();

    /**
     * 将非空属性赋值给另一个对象
     */
    public static <T> void copyBeanWithNotNullProperty(T origin, T destination) {
        if (origin == null || destination == null) {
            return;
        }
        if (!origin.getClass().equals(destination.getClass())) {
            return;
        }

        List<Field> fieldList = new ArrayList<>();

        Field[] fields = origin.getClass().getDeclaredFields();
        fieldList.addAll(Arrays.asList(fields));
        Field[] baseFields = origin.getClass().getSuperclass().getDeclaredFields();
        fieldList.addAll(Arrays.asList(baseFields));

        for (Field field : fieldList) {
            try {
                field.setAccessible(true);
                Object value = field.get(origin);
                if (null != value) {
                    field.set(destination, value);
                }
                field.setAccessible(false);
            } catch (Exception e) {
                logger.error("copy failed!", e);
            }
        }
    }

    /**
     * Map objects using the MapperFacade
     */
    public static <T> T mapObjects(Object source, Class<T> clazz) {
        T resultObject = mapper.map(source, clazz);
        return resultObject;
    }
}
