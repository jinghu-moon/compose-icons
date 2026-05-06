package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CactusOff: ImageVector
    get() {
        if (_cactusOff != null) return _cactusOff!!
        _cactusOff = tablerOutlineIcon(
            name = "CactusOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9v1c0 1.657 1.343 3 3 3h1")
            addPathData("M18 8v5c0 .295-.043 .589-.129 .872M15.857 15.872c-.278 .083-.567 .124-.857 .124h-1")
            addPathData("M10 21v-11M10 6v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v5M14 14v7")
            addPathData("M7 21h10")
            addPathData("M3 3 21 21")
        }
        return _cactusOff!!
    }

private var _cactusOff: ImageVector? = null
