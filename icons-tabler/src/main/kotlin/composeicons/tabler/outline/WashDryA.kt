package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDryA: ImageVector
    get() {
        if (_washDryA != null) return _washDryA!!
        _washDryA = tablerOutlineIcon(
            name = "WashDryA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 16v-4.8C9 9.543 10.343 8 12 8c1.657 0 3 1.543 3 3.2v4.8")
            addPathData("M15 13h-6")
        }
        return _washDryA!!
    }

private var _washDryA: ImageVector? = null
