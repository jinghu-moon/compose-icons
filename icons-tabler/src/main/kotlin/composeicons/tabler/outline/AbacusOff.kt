package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AbacusOff: ImageVector
    get() {
        if (_abacusOff != null) return _abacusOff!!
        _abacusOff = tablerOutlineIcon(
            name = "AbacusOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5v16")
            addPathData("M19 21v-2M19 15v-12")
            addPathData("M5 7h2M11 7h8")
            addPathData("M5 15h10")
            addPathData("M8 13v4")
            addPathData("M11 13v4")
            addPathData("M16 16v1")
            addPathData("M14 5v4")
            addPathData("M11 5v2")
            addPathData("M8 8v1")
            addPathData("M3 21h18")
            addPathData("M3 3 21 21")
        }
        return _abacusOff!!
    }

private var _abacusOff: ImageVector? = null
