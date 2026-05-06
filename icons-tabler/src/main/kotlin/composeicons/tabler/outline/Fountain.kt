package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fountain: ImageVector
    get() {
        if (_fountain != null) return _fountain!!
        _fountain = tablerOutlineIcon(
            name = "Fountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 16v-5C9 9.895 8.105 9 7 9 5.895 9 5 9.895 5 11")
            addPathData("M15 16v-5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M12 16v-10C12 4.343 13.343 3 15 3c1.657 0 3 1.343 3 3")
            addPathData("M6 6C6 4.343 7.343 3 9 3c1.657 0 3 1.343 3 3")
            addPathData("M3 16h18v2c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-2")
        }
        return _fountain!!
    }

private var _fountain: ImageVector? = null
