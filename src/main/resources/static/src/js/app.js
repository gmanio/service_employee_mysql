import Model from "./Model";
import MainView from "./MainView";

class App {
    /**
     * @Constructor
     */
    constructor() {
        this.model = new Model();
        this.loadComponent();
    }

    loadComponent() {
        this.mainView = new MainView();
    }
}

$(document).ready(function(){

    // ** Entry Poiont **
    new App();

});

