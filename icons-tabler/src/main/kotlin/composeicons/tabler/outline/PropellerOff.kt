package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PropellerOff: ImageVector
    get() {
        if (_propellerOff != null) return _propellerOff!!
        _propellerOff = tablerOutlineIcon(
            name = "PropellerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.448 10.432c-1.063 .644-1.619 1.876-1.399 3.099 .221 1.223 1.172 2.183 2.393 2.415 1.221 .232 2.458-.314 3.111-1.371")
            addPathData("M14.272 10.272c.66-1.459 1.058-2.888 1.198-4.286C15.69 4.356 14.708 3 12 3 10.06 3 9 3.696 8.645 4.69M9.342 9.343c.145 .384 .309 .77 .491 1.157")
            addPathData("M13.169 16.751c.97 1.395 2.057 2.523 3.257 3.386 1.02 .789 2.265 .853 3.408-.288M21.313 17.356c.492-1.634-.19-2.726-1.416-3.229-.82-.37-1.703-.654-2.65-.852")
            addPathData("M8.664 13c-1.693 .143-3.213 .52-4.56 1.128-1.522 .623-2.206 2.153-.852 4.498 1.354 2.345 3.02 2.517 4.321 1.512 1.2-.863 2.287-1.991 3.258-3.386")
            addPathData("M3 3 21 21")
        }
        return _propellerOff!!
    }

private var _propellerOff: ImageVector? = null
