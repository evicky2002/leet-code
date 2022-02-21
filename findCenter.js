var findCenter = function (edges) {
    var centre = 0
    var centre1 = edges[0][0]
    var centre2 = edges[0][1]
    for (let i = 0; i < edges.length; i++) {
        if (edges[i][0] == centre1) {
            centre = edges[i][0]
            break
        }
        if (edges[i][1] == centre1) {
            centre = edges[i][1]
            break
        }
        if (edges[i][0] == centre2) {
            centre = edges[i][0]
            break
        }
        if (edges[i][1] == centre2) {
            centre = edges[i][1]
            break
        }
    }
    return centre

};