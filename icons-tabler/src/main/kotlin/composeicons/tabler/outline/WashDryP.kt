package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDryP: ImageVector
    get() {
        if (_washDryP != null) return _washDryP!!
        _washDryP = tablerOutlineIcon(
            name = "WashDryP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 16v-8h2.5C13.881 8 15 9.119 15 10.5 15 11.881 13.881 13 12.5 13h-2.5")
        }
        return _washDryP!!
    }

private var _washDryP: ImageVector? = null
