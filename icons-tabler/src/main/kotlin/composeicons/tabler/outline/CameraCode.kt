package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraCode: ImageVector
    get() {
        if (_cameraCode != null) return _cameraCode!!
        _cameraCode = tablerOutlineIcon(
            name = "CameraCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20h-6C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v4")
            addPathData("M14.948 13.559c.242-1.276-.365-2.562-1.503-3.188-1.138-.625-2.549-.447-3.497 .441-.947 .888-1.216 2.285-.665 3.461 .551 1.176 1.796 1.864 3.084 1.705")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _cameraCode!!
    }

private var _cameraCode: ImageVector? = null
