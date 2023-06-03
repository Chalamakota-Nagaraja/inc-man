package com.RideSharingPlatform.Incident.management.service;

import java.util.List;

import com.RideSharingPlatform.Incident.management.entities.Incidents;
import com.RideSharingPlatform.Incident.management.service.impl.CannotReportIncidentException;


public interface IncidentsService {
	
	void insertIncident(Incidents incidents) throws CannotReportIncidentException ;
	List<Incidents> getIncidents();
	Incidents getIncidentsById(String id);
	Incidents updateIncidentById(Incidents incidents);
	
	String generateIncidentId();
	void calculateETA(Incidents incidents);
}
