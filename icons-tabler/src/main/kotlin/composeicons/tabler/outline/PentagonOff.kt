package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonOff: ImageVector
    get() {
        if (_pentagonOff != null) return _pentagonOff!!
        _pentagonOff = tablerOutlineIcon(
            name = "PentagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.133 4.133 10.837 2.168c.693-.504 1.633-.504 2.326 0l8.021 5.828c.694 .504 .984 1.397 .719 2.212l-1.887 5.808M19.035 19.036l-.196 .602c-.265 .815-1.024 1.367-1.881 1.367h-9.916C6.185 21.005 5.426 20.453 5.161 19.638L2.097 10.208C1.832 9.393 2.122 8.5 2.816 7.996L5.81 5.82")
            addPathData("M3 3 21 21")
        }
        return _pentagonOff!!
    }

private var _pentagonOff: ImageVector? = null
