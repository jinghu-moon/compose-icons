package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownBar: ImageVector
    get() {
        if (_arrowDownBar != null) return _arrowDownBar!!
        _arrowDownBar = tablerOutlineIcon(
            name = "ArrowDownBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v18")
            addPathData("M9 18l3 3 3-3")
            addPathData("M9 3h6")
        }
        return _arrowDownBar!!
    }

private var _arrowDownBar: ImageVector? = null
