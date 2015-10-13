package com.vertipac.service.master.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertipac.dao.master.IStudentDAO;
import com.vertipac.dto.master.StudentDTO;
import com.vertipac.exception.ServiceException;
import com.vertipac.models.master.Student;
import com.vertipac.service.GenericService;
import com.vertipac.service.master.IStudentService;

@Service
@Transactional
public class StudentService extends GenericService<StudentDTO,Integer> implements IStudentService{
	@Autowired
	IStudentDAO studentDao;

	@Override
	public StudentDTO findById(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> findByCriteria(StudentDTO exampleInstance)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO saveEntity(StudentDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO updateEntity(StudentDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(StudentDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudentDTO findObjectById(StudentDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<StudentDTO> convertPOJOsToDTOs(List<Student> entities){
		if (entities != null) {
			List<StudentDTO> dtos=new ArrayList<StudentDTO>();
			for(Student entity:entities){
				dtos.add(convertPOJOToDTO(entity));
			}
			return dtos;
		}
		return new ArrayList<StudentDTO>();
	}

	private StudentDTO convertPOJOToDTO(Student entity) {
		if (entity != null) {
			StudentDTO dto=new StudentDTO();
			dto.setId(entity.getId());
			dto.setType(entity.getType());
		}
		return null;
	}
	
	private Student convertDTOToPojo(StudentDTO dto){
		if(dto!=null){
			Student entity=new Student();
			entity.setId(dto.getId());
			entity.setType(dto.getType());
		}
		return null;
	}

}
