package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) return _arrowDownCircle!!
        _arrowDownCircle = tablerOutlineIcon(
            name = "ArrowDownCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v14")
            addPathData("M9 18l3 3 3-3")
            addPathData("M12 7c1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2")
        }
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
