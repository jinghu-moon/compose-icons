package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpBar: ImageVector
    get() {
        if (_arrowUpBar != null) return _arrowUpBar!!
        _arrowUpBar = tablerOutlineIcon(
            name = "ArrowUpBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21v-18")
            addPathData("M15 6 12 3 9 6")
            addPathData("M9 21h6")
        }
        return _arrowUpBar!!
    }

private var _arrowUpBar: ImageVector? = null
