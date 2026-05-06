package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = tablerOutlineIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.072 20.3c1.115 .936 2.741 .936 3.856 0 1.115-.936 1.397-2.537 .67-3.798L6.503 13.275c-.111-.17-.3-.272-.502-.272-.203 0-.392 .102-.503 .272L3.4 16.502c-.726 1.261-.444 2.862 .671 3.798")
            addPathData("M16.072 20.3c1.115 .936 2.741 .936 3.856 0 1.115-.936 1.397-2.537 .67-3.798L18.503 13.275c-.111-.17-.3-.272-.503-.272-.203 0-.392 .102-.503 .272l-2.098 3.227c-.726 1.261-.444 2.862 .671 3.798")
            addPathData("M10.072 10.3c1.115 .936 2.741 .936 3.856 0 1.115-.936 1.397-2.537 .67-3.798L12.503 3.275c-.111-.17-.3-.272-.503-.272-.203 0-.392 .102-.502 .272L9.4 6.502c-.726 1.261-.444 2.862 .671 3.798h.001")
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
