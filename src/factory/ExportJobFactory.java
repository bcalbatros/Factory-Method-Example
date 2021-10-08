package factory;

import data.ExportTypeEnum;
import service.PictureExportJob;
import service.VideoExportJob;
import service.IExportJob;

public class ExportJobFactory {

    public static IExportJob ProduceExportJob(ExportTypeEnum exportType) {
        IExportJob exportJob = null;

        if (exportType == ExportTypeEnum.PICTURE_EXPORT) {
            exportJob = new PictureExportJob();
        } else if (exportType == ExportTypeEnum.VIDEO_EXPORT) {
            exportJob = new VideoExportJob();
        }

        return exportJob;
    }
}
