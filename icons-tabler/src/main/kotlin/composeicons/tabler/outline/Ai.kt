package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ai: ImageVector
    get() {
        if (_ai != null) return _ai!!
        _ai = tablerOutlineIcon(
            name = "Ai",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16v-6C8 8.895 8.895 8 10 8c1.105 0 2 .895 2 2v6")
            addPathData("M8 13h4")
            addPathData("M16 8v8")
        }
        return _ai!!
    }

private var _ai: ImageVector? = null
