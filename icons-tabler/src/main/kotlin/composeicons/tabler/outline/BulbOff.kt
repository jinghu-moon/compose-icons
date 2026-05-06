package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BulbOff: ImageVector
    get() {
        if (_bulbOff != null) return _bulbOff!!
        _bulbOff = tablerOutlineIcon(
            name = "BulbOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h1M12 3v1M20 12h1M5.6 5.6l.7 .7M18.4 5.6l-.7 .7")
            addPathData("M11.089 7.083c1.622-.301 3.287 .217 4.452 1.385 1.165 1.168 1.679 2.834 1.374 4.455M15.537 15.534c-.168 .168-.347 .324-.537 .466-.792 .784-1.163 1.898-1 3 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 .163-1.102-.208-2.216-1-3C7.839 15.129 7.113 13.797 7.012 12.349 6.91 10.901 7.443 9.48 8.472 8.456")
            addPathData("M9.7 17h4.6")
            addPathData("M3 3 21 21")
        }
        return _bulbOff!!
    }

private var _bulbOff: ImageVector? = null
