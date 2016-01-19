import Model from "./Model";

class MainView {

    constructor() {
        this.onAjax();
    }

    onAjax() {
        var oAjax = $.ajax({
            url: "/get",
            data: {id: 10001},
            success: $.proxy(this.renderTmpl, this)
        })
    }

    renderTmpl(res) {

    }

}

export default MainView;
