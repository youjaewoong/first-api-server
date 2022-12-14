package first.api.server.api.controller.v1;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import first.api.server.api.model.SampleRequest;
import first.api.server.api.model.SampleResponse;
import first.api.server.api.service.SampleService;
import first.api.server.model.ListResponse;
import first.api.server.model.PageResponse;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;
	
    @GetMapping("samples")
    public PageResponse<SampleResponse> selectSample(@Validated SampleRequest sampleRequest) {
		
        return sampleService.selectSample(sampleRequest);
    }
    
    
    @GetMapping("cache-samples")
    public ListResponse<SampleResponse> selectCacheSample() {
		
        return sampleService.selectSampleSample();
    }
	
}
