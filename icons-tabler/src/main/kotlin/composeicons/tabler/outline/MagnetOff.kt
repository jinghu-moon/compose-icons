package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MagnetOff: ImageVector
    get() {
        if (_magnetOff != null) return _magnetOff!!
        _magnetOff = tablerOutlineIcon(
            name = "MagnetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3c1.105 0 2 .895 2 2M9 9v4c-0 1.341 .89 2.52 2.18 2.887 1.29 .367 2.667-.168 3.372-1.309M15 11v-6c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v8c.001 .876-.142 1.747-.424 2.577M18.113 18.161c-2.167 2.567-5.706 3.506-8.861 2.353C6.098 19.36 4 16.359 4 13v-8c0-.297 .065-.58 .181-.833")
            addPathData("M4 8h4")
            addPathData("M15 8h4")
            addPathData("M3 3 21 21")
        }
        return _magnetOff!!
    }

private var _magnetOff: ImageVector? = null
