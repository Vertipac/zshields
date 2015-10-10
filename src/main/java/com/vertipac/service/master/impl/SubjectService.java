package com.vertipac.service.master.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertipac.dao.master.ISubjectDAO;
import com.vertipac.dto.master.SubjectDTO;
import com.vertipac.exception.ServiceException;
import com.vertipac.models.master.Subject;
import com.vertipac.service.GenericService;
import com.vertipac.service.master.ISubjectService;



@Service
@Transactional
public class SubjectService extends GenericService<SubjectDTO,Integer> implements ISubjectService{
	
	@Autowired
	ISubjectDAO subjectdao;

	@Override
	public SubjectDTO findById(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectDTO> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectDTO> findByCriteria(SubjectDTO exampleInstance)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectDTO saveEntity(SubjectDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectDTO updateEntity(SubjectDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(SubjectDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SubjectDTO findObjectById(SubjectDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<SubjectDTO> convertPOJOsToDTOs(List<Subject> entities){
		if (entities != null){
			List<SubjectDTO> dtos=new ArrayList<SubjectDTO>();
			for(Subject entity:entities){
				
				dtos.add(convertPOJOToDTO(entity));
			}
			return dtos;
		}
		return new ArrayList<SubjectDTO>();
	}

	private SubjectDTO convertPOJOToDTO(Subject entity) {
		// TODO Auto-generated method stub
		if (entity != null) {
			SubjectDTO dto=new SubjectDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setType(entity.getType());
			dto.setComment(entity.getComment());
		}
		return null;
	}
	
	private Subject  convertDTOToPojo(SubjectDTO dto){
		if(dto!=null){
			Subject entity=new Subject();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			entity.setComment(dto.getComment());
		}
		return null;
	}
	

}
