package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = tablerOutlineIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h11c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-11C5.448 20 5 19.552 5 19v-14C5 4.448 5.448 4 6 4M9 4v18")
            addPathData("M13 8h2")
            addPathData("M13 12h2")
        }
        return _notebook!!
    }

private var _notebook: ImageVector? = null
