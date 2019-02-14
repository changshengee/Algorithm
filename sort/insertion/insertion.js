var ins = function () {

    function insertion(vars) {
        let size = vars.length;
        var preIndex, current;
        for (var i = 1; i < size; i++) {
            preIndex = i - 1;
            current = vars[i];
            while (preIndex >= 0 && current < vars[preIndex]) {
                vars[preIndex + 1] = vars[preIndex];
                preIndex--;
            }
            vars[preIndex+1]=current;
        }
        return vars;
    }

    function dom() {
        $('#change-insertion').off('click').on('click', function () {
            var list = $('#insertion').val();
            $('#insertion').val(insertion(list.split(',')))
        })
    }

    return {
        init: function () {
            dom();
        }
    }
}();