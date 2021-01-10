package com.collegebranch.app.mentee;

import com.codename1.ui.events.ActionEvent;

public class MenteePortalLayout extends com.codename1.ui.Form {
    public MenteePortalLayout() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MenteePortalLayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }
    public void oncollegeSchoolsActionEvent(ActionEvent ev) {

    }
    public void onmentorChatActionEvent(ActionEvent ev) {
    }
    public void onappointmentsActionEvent(ActionEvent ev) {
    }
    public void onBackActionEvent(ActionEvent ev) {
        
    }
    
//-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Button gui_collegeSchools = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_mentorChat = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_appointments = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("MenteePortalLayout");
        setName("MenteePortalLayout");
        gui_collegeSchools.setText("Schools I'm thinking About");
                gui_collegeSchools.setInlineStylesTheme(resourceObjectInstance);
        gui_collegeSchools.setName("collegeSchools");
        gui_mentorChat.setText("Mentor Chat");
                gui_mentorChat.setInlineStylesTheme(resourceObjectInstance);
        gui_mentorChat.setName("mentorChat");
        gui_appointments.setText("Essay Appointments");
                gui_appointments.setInlineStylesTheme(resourceObjectInstance);
        gui_appointments.setName("appointments");
        addComponent(gui_collegeSchools);
        addComponent(gui_mentorChat);
        addComponent(gui_appointments);
        ((com.codename1.ui.layouts.LayeredLayout)gui_collegeSchools.getParent().getLayout()).setInsets(gui_collegeSchools, "7.1220927% auto auto 7.161125%").setReferenceComponents(gui_collegeSchools, "-1 -1 -1 -1").setReferencePositions(gui_collegeSchools, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_mentorChat.getParent().getLayout()).setInsets(gui_mentorChat, "14.389535% auto auto 0.0mm").setReferenceComponents(gui_mentorChat, "-1 -1 -1 0 ").setReferencePositions(gui_mentorChat, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_appointments.getParent().getLayout()).setInsets(gui_appointments, "21.36628% auto auto 0.0mm").setReferenceComponents(gui_appointments, "-1 -1 -1 0 ").setReferencePositions(gui_appointments, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
