package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonOff: ImageVector
    get() {
        if (_hexagonOff != null) return _hexagonOff!!
        _hexagonOff = tablerOutlineIcon(
            name = "HexagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.693 4.69 11.029 3.3c.622-.346 1.378-.346 2 0l6 3.573h-.029c.623 .36 1.005 1.027 1 1.747v6.536c0 .246-.045 .485-.13 .707M17.71 17.71l-4.739 3.027c-.604 .335-1.338 .335-1.942 0L5.029 16.904C4.394 16.552 4.001 15.883 4 15.157v-6.537C4 7.894 4.394 7.225 5.029 6.872L6.183 6.185")
            addPathData("M3 3 21 21")
        }
        return _hexagonOff!!
    }

private var _hexagonOff: ImageVector? = null
