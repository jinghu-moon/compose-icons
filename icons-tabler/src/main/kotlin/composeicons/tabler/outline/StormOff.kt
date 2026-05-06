package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StormOff: ImageVector
    get() {
        if (_stormOff != null) return _stormOff!!
        _stormOff = tablerOutlineIcon(
            name = "StormOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.884 9.874c-1.173 1.171-1.174 3.071-.003 4.243 1.171 1.173 3.071 1.174 4.243 .003M14.694 10.679c-.3-.609-.797-1.099-1.41-1.39")
            addPathData("M7.037 7.063c-2.732 2.736-2.728 7.168 .007 9.899 2.736 2.732 7.168 2.728 9.9-.007M18.529 14.529c1.004-2.586 .386-5.521-1.576-7.483C14.992 5.085 12.057 4.466 9.471 5.47")
            addPathData("M5.369 14.236C3.764 10.808 3.772 7.563 4.369 4.387")
            addPathData("M18.63 9.76c.922 1.954 1.389 4.091 1.368 6.251M19.628 19.619c-.087 .46-.187 .92-.295 1.377")
            addPathData("M3 3 21 21")
        }
        return _stormOff!!
    }

private var _stormOff: ImageVector? = null
