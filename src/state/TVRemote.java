package state;

import state.controller.TVContext;
import state.respository.State;
import state.service.TVStartState;
import state.service.TVStopState;

public class TVRemote {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();

    }

}
