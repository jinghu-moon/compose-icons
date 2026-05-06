package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpCircle: ImageVector
    get() {
        if (_arrowUpCircle != null) return _arrowUpCircle!!
        _arrowUpCircle = tablerOutlineIcon(
            name = "ArrowUpCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v-14")
            addPathData("M15 6 12 3 9 6")
            addPathData("M12 17c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2")
        }
        return _arrowUpCircle!!
    }

private var _arrowUpCircle: ImageVector? = null
