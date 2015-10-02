package com.vertipac.service.master.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertipac.dao.master.IStandardDAO;
import com.vertipac.dto.master.StandardDTO;
import com.vertipac.exception.ServiceException;
import com.vertipac.models.master.Standard;
import com.vertipac.service.GenericService;
import com.vertipac.service.master.IStandardService;

@Service
@Transactional
public class StandardService extends GenericService<StandardDTO, Integer>implements IStandardService {

	@Autowired
	IStandardDAO standardDao;

	@Override
	public StandardDTO findById(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StandardDTO> findAll() throws ServiceException {

		return convertPOJOsToDTOs(standardDao.findAll());
	}

	@Override
	public List<StandardDTO> findByCriteria(StandardDTO exampleInstance) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StandardDTO saveEntity(StandardDTO entity) throws ServiceException {
		return convertPOJOToDTO(standardDao.saveEntity(convertDTOToPojo(entity)));
	}

	@Override
	public StandardDTO updateEntity(StandardDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(StandardDTO entity) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public StandardDTO findObjectById(StandardDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	private List<StandardDTO> convertPOJOsToDTOs(List<Standard> entities) {
		if (entities != null) {
			List<StandardDTO> dtos = new ArrayList<StandardDTO>();
			for (Standard entity : entities) {
				dtos.add(convertPOJOToDTO(entity));
			}
			return dtos;
		}
		return new ArrayList<StandardDTO>();
	}

	private StandardDTO convertPOJOToDTO(Standard entity) {
		if (entity != null) {
			StandardDTO dto = new StandardDTO();
			dto.setComment(entity.getComment());
			dto.setDivision(entity.getDivision());
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setType(entity.getType());
			return dto;
		}
		return null;
	}
	
	private Standard convertDTOToPojo(StandardDTO dto){
		if(dto!=null){
			Standard entity = new Standard();
			entity.setComment(dto.getComment());
			entity.setDivision(dto.getDivision());
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			return entity;
		}
		return null;
	}

}
