package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadarOff: ImageVector
    get() {
        if (_radarOff != null) return _radarOff!!
        _radarOff = tablerOutlineIcon(
            name = "RadarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.291 11.295c-.285 .286-.369 .716-.214 1.089 .155 .373 .519 .616 .923 .616v8c2.488 0 4.74-1.01 6.37-2.642M20.045 16.039C20.675 14.786 21.002 13.403 21 12h-5")
            addPathData("M16 9C14.825 7.437 12.847 6.703 10.937 7.12M8.471 8.467C7.446 9.491 6.915 10.91 7.017 12.355c.102 1.446 .826 2.776 1.984 3.647")
            addPathData("M20.486 9C19.623 6.566 17.755 4.62 15.359 3.658 12.963 2.695 10.268 2.808 7.961 3.968M5.644 5.643C3.457 7.828 2.545 10.981 3.227 13.996c.682 3.015 2.863 5.468 5.777 6.499")
            addPathData("M3 3 21 21")
        }
        return _radarOff!!
    }

private var _radarOff: ImageVector? = null
