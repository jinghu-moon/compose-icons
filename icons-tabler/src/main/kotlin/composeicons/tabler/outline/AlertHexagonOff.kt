package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertHexagonOff: ImageVector
    get() {
        if (_alertHexagonOff != null) return _alertHexagonOff!!
        _alertHexagonOff = tablerOutlineIcon(
            name = "AlertHexagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.36 18.387l-5.268 3.333c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.445 17.061 3.002 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L5.475 5.493M8.01 4 10.908 2.291c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .414-.116 .812-.326 1.155")
            addPathData("M12 7v1")
            addPathData("M12 8v.01")
            addPathData("M3 3 21 21")
            addPathData("M12 16h.01")
        }
        return _alertHexagonOff!!
    }

private var _alertHexagonOff: ImageVector? = null
