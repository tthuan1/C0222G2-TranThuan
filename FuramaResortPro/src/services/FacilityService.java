package services;

import model.facility.Facility;

public interface FacilityService extends Service{
    void displayFacilityMaintenance();
    void facilityMaintenanceCheck(Facility facility);
}
