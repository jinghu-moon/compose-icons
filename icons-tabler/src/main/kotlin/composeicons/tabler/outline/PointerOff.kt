package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerOff: ImageVector
    get() {
        if (_pointerOff != null) return _pointerOff!!
        _pointerOff = tablerOutlineIcon(
            name = "PointerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.662 11.628l2.229-1.496c.441-.238 .688-.725 .62-1.221-.069-.497-.439-.898-.929-1.007L9.569 5.601M4 4 7.904 17.563c.109 .489 .51 .859 1.007 .928 .497 .069 .983-.179 1.221-.62l2.09-3.093 4.907 4.907c.2 .2 .472 .313 .754 .313 .283 0 .554-.112 .755-.313l.524-.524")
            addPathData("M3 3 21 21")
        }
        return _pointerOff!!
    }

private var _pointerOff: ImageVector? = null
