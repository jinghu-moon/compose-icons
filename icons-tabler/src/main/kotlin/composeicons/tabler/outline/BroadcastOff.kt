package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BroadcastOff: ImageVector
    get() {
        if (_broadcastOff != null) return _broadcastOff!!
        _broadcastOff = tablerOutlineIcon(
            name = "BroadcastOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.364 19.364c3.027-3.023 3.508-7.759 1.15-11.329C17.156 4.466 12.611 3.049 8.643 4.647M6.155 6.156C4.247 7.786 3.105 10.139 3.007 12.646c-.099 2.508 .855 4.943 2.629 6.718")
            addPathData("M15.536 16.536c1.43-1.43 1.858-3.581 1.084-5.45C15.846 9.218 14.023 8 12 8M9 9C7.84 9.87 7.115 11.2 7.013 12.646c-.103 1.446 .427 2.865 1.452 3.89")
            addPathData("M12 12c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1")
            addPathData("M3 3 21 21")
        }
        return _broadcastOff!!
    }

private var _broadcastOff: ImageVector? = null
