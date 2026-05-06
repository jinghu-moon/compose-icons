package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScribbleOff: ImageVector
    get() {
        if (_scribbleOff != null) return _scribbleOff!!
        _scribbleOff = tablerOutlineIcon(
            name = "ScribbleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c2 3 4 4 7 4 1.95 0 4.324-1.268 5.746-3.256M16.927 12.932c.049-.308 .073-.62 .073-.932C17 8 14 5 11 5c-.642 0-1.239 .069-1.78 .201M6.728 6.716C6.258 7.333 6 8.102 6 9c0 2.5 2 5 6 5 .597 0 1.203-.055 1.808-.156M16.91 12.923C19.145 11.97 21.062 10.5 22 9")
            addPathData("M3 3 21 21")
        }
        return _scribbleOff!!
    }

private var _scribbleOff: ImageVector? = null
