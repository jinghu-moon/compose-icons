package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBearRight: ImageVector
    get() {
        if (_arrowBearRight != null) return _arrowBearRight!!
        _arrowBearRight = tablerOutlineIcon(
            name = "ArrowBearRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3h5v5")
            addPathData("M17 3 9.464 10.536C8.527 11.473 8 12.745 8 14.07v6.93")
        }
        return _arrowBearRight!!
    }

private var _arrowBearRight: ImageVector? = null
