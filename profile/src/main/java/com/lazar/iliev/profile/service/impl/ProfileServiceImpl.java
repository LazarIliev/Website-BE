package com.lazar.iliev.profile.service.impl;

import com.lazar.iliev.profile.dto.ProfileDto;
import com.lazar.iliev.profile.service.ProfileService;
import com.lazar.iliev.profile.service.client.WorkFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private WorkFeignClient workFeignClient;

    @Override
    public void createProfile(ProfileDto profileDto) {

    }

    @Override
    public String getProfileExperience() {
        String workExp = workFeignClient.getWork().getBody();

        return "This is from the profile service! " + workExp;
    }
}
