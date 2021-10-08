import data.ExportTypeEnum;
import factory.ExportJobFactory;
import service.PictureExportJob;
import service.VideoExportJob;

public class Export {

    static void main(String args[]) {
        PictureExportJob pictureExportJob = (PictureExportJob) ExportJobFactory.ProduceExportJob(ExportTypeEnum.PICTURE_EXPORT);
        VideoExportJob videoExportJob = (VideoExportJob) ExportJobFactory.ProduceExportJob(ExportTypeEnum.VIDEO_EXPORT);

        pictureExportJob.startExport();
        videoExportJob.startExport();
    }

}
