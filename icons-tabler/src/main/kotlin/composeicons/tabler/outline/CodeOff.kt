package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CodeOff: ImageVector
    get() {
        if (_codeOff != null) return _codeOff!!
        _codeOff = tablerOutlineIcon(
            name = "CodeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8 3 12l4 4")
            addPathData("M17 8l4 4-2.5 2.5")
            addPathData("M14 4 12.799 8.805 11.997 12.012 9.997 20")
            addPathData("M3 3 21 21")
        }
        return _codeOff!!
    }

private var _codeOff: ImageVector? = null
