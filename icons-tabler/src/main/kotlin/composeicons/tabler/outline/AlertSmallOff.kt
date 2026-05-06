package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertSmallOff: ImageVector
    get() {
        if (_alertSmallOff != null) return _alertSmallOff!!
        _alertSmallOff = tablerOutlineIcon(
            name = "AlertSmallOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16h.01")
            addPathData("M12 7v1")
            addPathData("M3 3 21 21")
        }
        return _alertSmallOff!!
    }

private var _alertSmallOff: ImageVector? = null
