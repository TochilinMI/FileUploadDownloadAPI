package ru.tochilinmi.fileuploaddownloadapi.api.upload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FileUploadResponse {
    private String fileName;
    private String downloadUri;
    private Long size;


}
