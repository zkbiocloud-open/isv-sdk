/*
 * Class Name: Demo
 * Project Name: api
 * Copyright © 1985-2019 ZKTeco Inc.All right reserved.
 */

import com.zkteco.open.api.BasicServiceClient;
import com.zkteco.open.common.Certificate;
import com.zkteco.open.model.business.basic.dto.DeviceDTO;
import com.zkteco.open.model.business.basic.request.QueryDeviceRequest;
import com.zkteco.open.model.business.basic.response.QueryDeviceResponse;

import java.util.List;

/**
 * listen-access consumer
 *
 * @author zkteco
 * @date 2021/01/20
 * @since 1.0.0
 */
public class Demo {


    public static void main(String[] args) {

        Certificate certificate = new Certificate();
        certificate.setAppKey("rad8yZF2vP");
        certificate.setAppSecret("5LtVWBDG2wLGM1lknaqW");
        certificate.setAppAESKey("458ddd64-72d2-4b19-8139-ebaa9a4496f5");
        BasicServiceClient basicServiceClient = new BasicServiceClient(certificate);

        QueryDeviceRequest request = new QueryDeviceRequest();
        request.setUnitId("11");
        request.setId("22");
        QueryDeviceResponse response = basicServiceClient.findDeviceList(request);
        List<DeviceDTO> deviceDTOList = response.getDeviceDTOList();
        System.out.println(deviceDTOList);
    }


}
