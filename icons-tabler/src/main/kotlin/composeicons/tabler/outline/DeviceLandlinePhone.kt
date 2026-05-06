package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceLandlinePhone: ImageVector
    get() {
        if (_deviceLandlinePhone != null) return _deviceLandlinePhone!!
        _deviceLandlinePhone = tablerOutlineIcon(
            name = "DeviceLandlinePhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 3h-2c-1.105 0-2 .895-2 2v14c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-14C22 3.895 21.105 3 20 3")
            addPathData("M16 4h-11C3.343 4 2 5.343 2 7v10c0 1.657 1.343 3 3 3h11")
            addPathData("M12 8h-6v3h6v-3")
            addPathData("M12 14v.01")
            addPathData("M9 14v.01")
            addPathData("M6 14v.01")
            addPathData("M12 17v.01")
            addPathData("M9 17v.01")
            addPathData("M6 17v.01")
        }
        return _deviceLandlinePhone!!
    }

private var _deviceLandlinePhone: ImageVector? = null
