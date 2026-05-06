package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoSensor3: ImageVector
    get() {
        if (_photoSensor3 != null) return _photoSensor3!!
        _photoSensor3 = tablerOutlineIcon(
            name = "PhotoSensor3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4h1c1.105 0 2 .895 2 2v1")
            addPathData("M20 17v1c0 1.105-.895 2-2 2h-1")
            addPathData("M7 20h-1C4.895 20 4 19.105 4 18v-1")
            addPathData("M4 7v-1C4 4.895 4.895 4 6 4h1")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M12 18v2")
            addPathData("M4 12h2")
            addPathData("M12 4v2")
            addPathData("M20 12h-2")
        }
        return _photoSensor3!!
    }

private var _photoSensor3: ImageVector? = null
