package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlignJustified: ImageVector
    get() {
        if (_alignJustified != null) return _alignJustified!!
        _alignJustified = tablerOutlineIcon(
            name = "AlignJustified",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M4 12h16")
            addPathData("M4 18h12")
        }
        return _alignJustified!!
    }

private var _alignJustified: ImageVector? = null
