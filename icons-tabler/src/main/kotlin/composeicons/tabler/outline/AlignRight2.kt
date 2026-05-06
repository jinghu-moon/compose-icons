package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlignRight2: ImageVector
    get() {
        if (_alignRight2 != null) return _alignRight2!!
        _alignRight2 = tablerOutlineIcon(
            name = "AlignRight2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v16")
            addPathData("M4 6h12")
            addPathData("M10 12h6")
            addPathData("M6 18h10")
        }
        return _alignRight2!!
    }

private var _alignRight2: ImageVector? = null
