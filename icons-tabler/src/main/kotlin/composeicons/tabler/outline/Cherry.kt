package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cherry: ImageVector
    get() {
        if (_cherry != null) return _cherry!!
        _cherry = tablerOutlineIcon(
            name = "Cherry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16.5C4 18.433 5.567 20 7.5 20 9.433 20 11 18.433 11 16.5 11 14.567 9.433 13 7.5 13 5.567 13 4 14.567 4 16.5")
            addPathData("M14 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M9 13c.366-2 1.866-3.873 4.5-5.6")
            addPathData("M17 15C15.667 12.667 14.667 9.667 16 6")
            addPathData("M5 6C8.667 3.333 12.333 3.333 16 6 12.333 8.667 8.667 8.667 5 6")
        }
        return _cherry!!
    }

private var _cherry: ImageVector? = null
