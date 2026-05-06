package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LineDashed: ImageVector
    get() {
        if (_lineDashed != null) return _lineDashed!!
        _lineDashed = tablerOutlineIcon(
            name = "LineDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h2")
            addPathData("M17 12h2")
            addPathData("M11 12h2")
        }
        return _lineDashed!!
    }

private var _lineDashed: ImageVector? = null
