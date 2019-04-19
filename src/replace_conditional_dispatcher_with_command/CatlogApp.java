package replace_conditional_dispatcher_with_command;

import java.util.Map;

public class CatlogApp {
    WorkshopManager workshopManager=new WorkshopManager();
    public static final String NEW_WORKSHOP="new_workshop";
    public static final String ALL_WORKSHOPS="all_workshops";

    public String somework(){
        String actionName="";
        Map<String,String> parameters=null;
        if(actionName.equals(NEW_WORKSHOP)){
            String nextWorkshopId= workshopManager.getNextWorkshopID();
            StringBuffer newWorkshopContents= workshopManager.createNewFileFromTemplate(
                    nextWorkshopId,
                    workshopManager.getWorkshopDir(),
                    workshopManager.getWorkshopTemplate());
            workshopManager.addWorkshop(newWorkshopContents);
            parameters.put("id",nextWorkshopId);
            executeActionAndGetResponse(ALL_WORKSHOPS,parameters);
        }else if(actionName.equals(ALL_WORKSHOPS)){
            /**
             *
             * Some implementations
             * */
        }
        /*** many more if else**/
        return null;
    }
    private HandlerResponse executeActionAndGetResponse(String actionName, Map<String,String> parameters){
       return null;
    }
}
