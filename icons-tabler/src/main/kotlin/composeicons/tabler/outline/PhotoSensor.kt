package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoSensor: ImageVector
    get() {
        if (_photoSensor != null) return _photoSensor!!
        _photoSensor = tablerOutlineIcon(
            name = "PhotoSensor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 5h2c1.105 0 2 .895 2 2v2")
            addPathData("M21 15v2c0 1.105-.895 2-2 2h-2")
            addPathData("M7 19h-2C3.895 19 3 18.105 3 17v-2")
            addPathData("M3 9v-2C3 5.895 3.895 5 5 5h2")
            addPathData("M7 10C7 9.448 7.448 9 8 9h8c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-8C7.448 15 7 14.552 7 14v-4")
        }
        return _photoSensor!!
    }

private var _photoSensor: ImageVector? = null
