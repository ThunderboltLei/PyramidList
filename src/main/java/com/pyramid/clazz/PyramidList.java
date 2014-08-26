package com.pyramid.clazz;

import java.util.ArrayList;

import com.pyramid.annotations.PyramidListAnnotation;

/**
 * 封装JAVA的工具类
 */

@PyramidListAnnotation
public class PyramidList {

	private PyramidList() {

	}

	@PyramidListAnnotation(serializable = true)
	public static <E> ArrayList<E> pyramidArrayList() {
		return new ArrayList<E>();
	}

}
