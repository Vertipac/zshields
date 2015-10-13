package com.vertipac.service.master.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertipac.dao.master.IEventDAO;
import com.vertipac.dto.master.EventDTO;
import com.vertipac.exception.ServiceException;
import com.vertipac.models.master.Event;
import com.vertipac.service.GenericService;
import com.vertipac.service.master.IEventService;

@Service
@Transactional
public class EventService extends GenericService<EventDTO,Integer> implements IEventService{
	
	@Autowired
	IEventDAO eventDao;

	@Override
	public EventDTO findById(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventDTO> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventDTO> findByCriteria(EventDTO exampleInstance)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventDTO saveEntity(EventDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventDTO updateEntity(EventDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntity(EventDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EventDTO findObjectById(EventDTO entity) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<EventDTO> convertPOJOsToDTOs(List<Event> entities){
		if (entities != null){
			List<EventDTO> dtos=new ArrayList<EventDTO>();
			for(Event entity:entities){
				dtos.add(convertPOJOToDTO(entity));
			}
			return dtos;
	}
		return new ArrayList<EventDTO>();

  }

	private EventDTO convertPOJOToDTO(Event entity) {
		if (entity != null) {
			EventDTO dto=new EventDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setPlace(entity.getPlace());
			dto.setTime(entity.getTime());
			dto.setComment(entity.getComment());
		}
		return null;
	}
	
	private Event convertDTOToPojo(EventDTO dto){
		if(dto!=null){
			Event entity=new Event();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setPlace(dto.getPlace());
			entity.setTime(dto.getTime());
			entity.setComment(dto.getComment());
		}
		return null;
	}
}
