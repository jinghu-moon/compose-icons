package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WritingOff: ImageVector
    get() {
        if (_writingOff != null) return _writingOff!!
        _writingOff = tablerOutlineIcon(
            name = "WritingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 7h4")
            addPathData("M16 16v1l2 2 .5-.5M20 16v-11C20 3.879 19.121 3 18 3c-1.121 0-2 .879-2 2v7")
            addPathData("M18 19h-13C3.895 19 3 18.105 3 17c0-1.105 .895-2 2-2h4c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-3")
            addPathData("M3 3 21 21")
        }
        return _writingOff!!
    }

private var _writingOff: ImageVector? = null
