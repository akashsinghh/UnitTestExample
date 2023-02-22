package com.lcwd.tes.service;

import com.lcwd.tes.services.GstProvider;
import com.lcwd.tes.services.GstService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;
@ExtendWith(MockitoExtension.class)

public class GStServiceTest {
    @Mock
    private GstProvider mockProvider;
    @InjectMocks
    private GstService gstService;
//    @BeforeEach
//    public  void init(){
//        MockitoAnnotations.initMocks(this);
//    }
    @Test
   public void gstCalculateTest(){
      //  GstProvider provider = new GSTProviderImpl();
//        GstProvider mockProvider = Mockito.mock(GstProvider.class);
//        GstService gstService = new GstService(mockProvider);
        //important line
        Mockito.when(mockProvider.getGSTDetails()).thenReturn(18);
       int actualResult=gstService.calculateGST();
       Assertions.assertEquals(18,actualResult);
   }
}
//class GSTProviderImpl implements GstProvider {
//
//    @Override
//    public int getGSTDetails() {
//        return 18;
//    }

