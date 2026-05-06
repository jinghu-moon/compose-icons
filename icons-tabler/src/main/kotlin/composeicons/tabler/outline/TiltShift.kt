package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TiltShift: ImageVector
    get() {
        if (_tiltShift != null) return _tiltShift!!
        _tiltShift = tablerOutlineIcon(
            name = "TiltShift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.56 3.69C7.468 4.142 6.476 4.805 5.64 5.64")
            addPathData("M3.69 8.56C3.237 9.65 3.002 10.819 3 12")
            addPathData("M3.69 15.44c.452 1.092 1.115 2.084 1.95 2.92")
            addPathData("M8.56 20.31c1.09 .453 2.259 .688 3.44 .69")
            addPathData("M15.44 20.31c1.092-.452 2.084-1.115 2.92-1.95")
            addPathData("M20.31 15.44C20.763 14.35 20.998 13.181 21 12")
            addPathData("M20.31 8.56C19.858 7.468 19.195 6.476 18.36 5.64")
            addPathData("M15.44 3.69C14.35 3.237 13.181 3.002 12 3")
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _tiltShift!!
    }

private var _tiltShift: ImageVector? = null
