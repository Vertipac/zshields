package com.vertipac.service.master.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertipac.dao.master.IExamDAO;
import com.vertipac.dto.master.ExamDTO;
import com.vertipac.exception.ServiceException;
import com.vertipac.models.master.Exam;
import com.vertipac.service.GenericService;
import com.vertipac.service.master.IExam;




@Service
@Transactional
public class ExamService extends GenericService<ExamDTO,Integer> implements IExam{
	
	@Autowired
	IExamDAO examdao;

	@Override
	public ExamDTO findById(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamDTO> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamDTO> findByCriteria(ExamDTO exampleInstance)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamDTO saveEntity(ExamDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamDTO updateEntity(ExamDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(ExamDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExamDTO findObjectById(ExamDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<ExamDTO> convertPOJOsToDTOs(List<Exam> entities){
		if (entities != null){
			List<ExamDTO> dtos= new ArrayList<ExamDTO>();
			for(Exam entity:entities){
				dtos.add(convertPOJOToDTO(entity));
			}
			return dtos;
		}
		return new ArrayList<ExamDTO>();
	}

	private ExamDTO convertPOJOToDTO(Exam entity) {
		if (entity != null){
			ExamDTO dto=new ExamDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setComment(entity.getComment());
		}
		return null;
	}
	
	private Exam convertDTOToPojo(ExamDTO dto){
		if(dto!=null){
			Exam entity=new Exam();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setComment(dto.getComment());
			return entity;
		}
		return null;
	}

}
