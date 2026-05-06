package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Transfer: ImageVector
    get() {
        if (_transfer != null) return _transfer!!
        _transfer = tablerOutlineIcon(
            name = "Transfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10h-16L9.5 4")
            addPathData("M4 14h16l-5.5 6")
        }
        return _transfer!!
    }

private var _transfer: ImageVector? = null
