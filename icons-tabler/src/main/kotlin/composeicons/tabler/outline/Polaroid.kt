package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Polaroid: ImageVector
    get() {
        if (_polaroid != null) return _polaroid!!
        _polaroid = tablerOutlineIcon(
            name = "Polaroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M4 16h16")
            addPathData("M4 12 7 9c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M13 12l2-2c.928-.893 2.072-.893 3 0l2 2")
            addPathData("M14 7h.01")
        }
        return _polaroid!!
    }

private var _polaroid: ImageVector? = null
