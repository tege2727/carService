package com.karadayi.kodstar.service;

import com.karadayi.kodstar.dto.MaintenanceRequest;
import com.karadayi.kodstar.entities.Maintenance;
import com.karadayi.kodstar.entities.MaintenanceUpdateRequest;

public interface MaintenanceService {
	
	public Maintenance saveMaintenace(MaintenanceRequest maintenanceRequest );
	
	public MaintenanceUpdateRequest updateMaintenance(MaintenanceRequest maintenance);

}
