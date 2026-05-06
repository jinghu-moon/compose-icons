package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Brackets: ImageVector
    get() {
        if (_brackets != null) return _brackets!!
        _brackets = tablerOutlineIcon(
            name = "Brackets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h-3v16h3")
            addPathData("M16 4h3v16h-3")
        }
        return _brackets!!
    }

private var _brackets: ImageVector? = null
