package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SmartHome: ImageVector
    get() {
        if (_smartHome != null) return _smartHome!!
        _smartHome = tablerOutlineIcon(
            name = "SmartHome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8.71 13.667 4.562c-.963-.749-2.311-.749-3.274 0L5.059 8.71C4.409 9.215 4.03 9.992 4.03 10.815v7.2c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-7.2C20.03 9.992 19.65 9.215 19 8.71")
            addPathData("M16 15c-2.21 1.333-5.792 1.333-8 0")
        }
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
