package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Codeblock: ImageVector
    get() {
        if (_codeblock != null) return _codeblock!!
        _codeblock = tablerOutlineIcon(
            name = "Codeblock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4 3 6 5 8")
            addPathData("M12 4l2 2L12 8")
            addPathData("M8 8 9 4")
            addPathData("M17 6c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-10C5.895 20 5 19.105 5 18v-7")
        }
        return _codeblock!!
    }

private var _codeblock: ImageVector? = null
