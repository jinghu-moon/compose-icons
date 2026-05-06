package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JumpRope: ImageVector
    get() {
        if (_jumpRope != null) return _jumpRope!!
        _jumpRope = tablerOutlineIcon(
            name = "JumpRope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 14v-6C6 6.343 7.343 5 9 5c1.657 0 3 1.343 3 3v8c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-6")
            addPathData("M16 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2C16.895 10 16 9.105 16 8v-3")
            addPathData("M4 16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2C4.895 21 4 20.105 4 19v-3")
        }
        return _jumpRope!!
    }

private var _jumpRope: ImageVector? = null
