package com.example.dtodemo.service;

import com.example.dtodemo.dto.UserLocationDTO;
import com.example.dtodemo.models.Location;
import com.example.dtodemo.models.User;
import com.example.dtodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by shivam.si on 27/04/22 9:33 am
 */

@Service
public class MappingService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation() {
        return ((List<User>) userRepository
                .findAll())
                .stream()
                .map(this::convertDataIntoDTO)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertDataIntoDTO(User userData) {
        UserLocationDTO dto = new UserLocationDTO();
        dto.setUserId(userData.getId());
        dto.setUsername(userData.getUsername());
        Location loc = userData.getLoc();
        dto.setLatitude(loc.getLatitude());
        dto.setLongitude(loc.getLongitude());
        dto.setPlace(loc.getPlaceName());
        return dto;
    }
}
