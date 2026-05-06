package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldOff: ImageVector
    get() {
        if (_shieldOff != null) return _shieldOff!!
        _shieldOff = tablerOutlineIcon(
            name = "ShieldOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.67 17.667C16.127 19.284 14.164 20.439 12 21 8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6c.794 .036 1.583-.006 2.357-.124M8.985 4.95C10.082 4.455 11.099 3.798 12 3c2.336 2.067 5.384 3.143 8.5 3 .925 3.147 .522 6.534-1.116 9.376")
            addPathData("M3 3 21 21")
        }
        return _shieldOff!!
    }

private var _shieldOff: ImageVector? = null
