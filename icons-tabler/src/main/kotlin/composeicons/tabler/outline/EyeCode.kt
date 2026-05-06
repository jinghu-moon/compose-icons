package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeCode: ImageVector
    get() {
        if (_eyeCode != null) return _eyeCode!!
        _eyeCode = tablerOutlineIcon(
            name = "EyeCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M11.11 17.958C7.901 17.651 5.2 15.665 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6-.21 .352-.427 .688-.647 1.008")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _eyeCode!!
    }

private var _eyeCode: ImageVector? = null
