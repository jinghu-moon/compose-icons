package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = tablerOutlineIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4h18")
            addPathData("M4 4v10c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-10")
            addPathData("M12 16v4")
            addPathData("M9 20h6")
            addPathData("M8 12 11 9l2 2L16 8")
        }
        return _presentation!!
    }

private var _presentation: ImageVector? = null
