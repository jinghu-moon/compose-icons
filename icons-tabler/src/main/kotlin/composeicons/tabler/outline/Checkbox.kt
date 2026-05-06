package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Checkbox: ImageVector
    get() {
        if (_checkbox != null) return _checkbox!!
        _checkbox = tablerOutlineIcon(
            name = "Checkbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11l3 3L20 6")
            addPathData("M20 12v6c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h9")
        }
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
