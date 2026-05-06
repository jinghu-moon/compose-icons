package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TableOff: ImageVector
    get() {
        if (_tableOff != null) return _tableOff!!
        _tableOff = tablerOutlineIcon(
            name = "TableOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h12c1.105 0 2 .895 2 2v12M20.415 20.413c-.375 .376-.884 .588-1.415 .587h-14C3.895 21 3 20.105 3 19v-14C3 4.45 3.223 3.95 3.583 3.588")
            addPathData("M3 10h7M14 10h7")
            addPathData("M10 3v3M10 10v11")
            addPathData("M3 3 21 21")
        }
        return _tableOff!!
    }

private var _tableOff: ImageVector? = null
