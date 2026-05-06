package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBearRight2: ImageVector
    get() {
        if (_arrowBearRight2 != null) return _arrowBearRight2!!
        _arrowBearRight2 = tablerOutlineIcon(
            name = "ArrowBearRight2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3h5v5")
            addPathData("M20 3l-7.536 7.536c-.937 .937-1.464 2.209-1.464 3.534v6.93")
            addPathData("M4 5 8.5 9.5")
        }
        return _arrowBearRight2!!
    }

private var _arrowBearRight2: ImageVector? = null
