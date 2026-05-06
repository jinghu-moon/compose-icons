package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Olympics: ImageVector
    get() {
        if (_olympics != null) return _olympics!!
        _olympics = tablerOutlineIcon(
            name = "Olympics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9c0 1.657 1.343 3 3 3C7.657 12 9 10.657 9 9 9 7.343 7.657 6 6 6 4.343 6 3 7.343 3 9")
            addPathData("M15 9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 7.343 19.657 6 18 6 16.343 6 15 7.343 15 9")
            addPathData("M9 9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 7.343 13.657 6 12 6 10.343 6 9 7.343 9 9")
            addPathData("M6 15c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C12 13.343 10.657 12 9 12 7.343 12 6 13.343 6 15")
            addPathData("M12 15c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _olympics!!
    }

private var _olympics: ImageVector? = null
