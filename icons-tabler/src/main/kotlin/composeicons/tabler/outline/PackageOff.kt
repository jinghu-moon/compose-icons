package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PackageOff: ImageVector
    get() {
        if (_packageOff != null) return _packageOff!!
        _packageOff = tablerOutlineIcon(
            name = "PackageOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.812 4.793 12 3l8 4.5v8.5M17.718 17.784 12 21 4 16.5v-9L6.223 6.25")
            addPathData("M14.543 10.57 20 7.5")
            addPathData("M12 12v9")
            addPathData("M12 12 4 7.5")
            addPathData("M16 5.25 11.65 7.697 9.086 9.139 8 9.75")
            addPathData("M3 3 21 21")
        }
        return _packageOff!!
    }

private var _packageOff: ImageVector? = null
