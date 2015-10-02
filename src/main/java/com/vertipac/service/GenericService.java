package com.vertipac.service;

import java.io.Serializable;

public abstract class GenericService<T extends Serializable, ID extends Serializable>
		implements IGenericService<T, ID> {

}
