package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HammerOff: ImageVector
    get() {
        if (_hammerOff != null) return _hammerOff!!
        _hammerOff = tablerOutlineIcon(
            name = "HammerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.698 10.72 4.03 17.418c-.395 .393-.617 .927-.617 1.484 0 .557 .222 1.091 .617 1.483 .823 .819 2.153 .819 2.976 0l6.696-6.676")
            addPathData("M18.713 14.702l2-2c.39-.39 .39-1.023 0-1.414L13.127 3.702c-.391-.39-1.024-.39-1.414 0l-2 2")
            addPathData("M3 3 21 21")
        }
        return _hammerOff!!
    }

private var _hammerOff: ImageVector? = null
