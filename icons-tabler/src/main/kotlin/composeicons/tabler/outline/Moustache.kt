package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moustache: ImageVector
    get() {
        if (_moustache != null) return _moustache!!
        _moustache = tablerOutlineIcon(
            name = "Moustache",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9c1.072-0 2.063 .572 2.599 1.5 .933 1.333 2.133 1.556 3.126 1.556h.291l.77-.044h.213c-.963 1.926-3.163 2.925-6.6 3h-.4-.165c-1.657-.046-2.963-1.426-2.917-3.083 .046-1.657 1.426-2.963 3.082-2.917L15 9")
            addPathData("M9 9C7.928 9 6.937 9.572 6.401 10.5c-.933 1.333-2.133 1.556-3.126 1.556h-.291l-.77-.044h-.213c.963 1.926 3.163 2.925 6.6 3h.4 .165c1.657-.046 2.963-1.426 2.917-3.083C12.038 10.273 10.658 8.966 9.001 9.012L9 9")
        }
        return _moustache!!
    }

private var _moustache: ImageVector? = null
