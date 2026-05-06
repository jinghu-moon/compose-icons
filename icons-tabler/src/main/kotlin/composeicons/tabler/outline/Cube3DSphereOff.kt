package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cube3DSphereOff: ImageVector
    get() {
        if (_cube3DSphereOff != null) return _cube3DSphereOff!!
        _cube3DSphereOff = tablerOutlineIcon(
            name = "Cube3DSphereOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 17.6 4 16.5v-2.5")
            addPathData("M4 10v-2.5L6 6.4")
            addPathData("M10 4.1 12 3l2 1.1")
            addPathData("M18 6.4l2 1.1v2.5")
            addPathData("M20 14v2")
            addPathData("M14 19.9 12 21 10 19.9")
            addPathData("M18 8.6 20 7.5")
            addPathData("M12 12v2.5")
            addPathData("M12 18.5v2.5")
            addPathData("M12 12 10 10.88")
            addPathData("M6 8.6 4 7.5")
            addPathData("M3 3 21 21")
        }
        return _cube3DSphereOff!!
    }

private var _cube3DSphereOff: ImageVector? = null
