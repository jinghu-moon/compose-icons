package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = tablerOutlineIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 6h9")
            addPathData("M11 12h9")
            addPathData("M12 18h8")
            addPathData("M4 16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 .591-.5 1-1 1.5L4 20h4")
            addPathData("M6 10v-6L4 6")
        }
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
