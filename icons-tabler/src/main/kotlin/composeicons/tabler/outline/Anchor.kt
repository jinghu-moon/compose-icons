package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = tablerOutlineIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9v12M4 13c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8M21 13h-2M5 13h-2")
            addPathData("M9 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 4.343 13.657 3 12 3 10.343 3 9 4.343 9 6")
        }
        return _anchor!!
    }

private var _anchor: ImageVector? = null
