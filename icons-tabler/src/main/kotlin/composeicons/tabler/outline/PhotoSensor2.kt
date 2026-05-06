package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoSensor2: ImageVector
    get() {
        if (_photoSensor2 != null) return _photoSensor2!!
        _photoSensor2 = tablerOutlineIcon(
            name = "PhotoSensor2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 5h2c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-2")
            addPathData("M7 19h-2C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h2")
            addPathData("M8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12")
        }
        return _photoSensor2!!
    }

private var _photoSensor2: ImageVector? = null
