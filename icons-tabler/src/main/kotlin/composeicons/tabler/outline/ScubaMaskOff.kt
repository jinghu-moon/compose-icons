package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaMaskOff: ImageVector
    get() {
        if (_scubaMaskOff != null) return _scubaMaskOff!!
        _scubaMaskOff = tablerOutlineIcon(
            name = "ScubaMaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7h5c.552 0 1 .448 1 1v4.5c0 .154-.014 .304-.04 .45M14.96 14.957c-.15 .028-.305 .043-.463 .043h-.5c-1.105 0-2-.895-2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105-.895 2-2 2h-.5C4.116 15 2.997 13.881 2.997 12.5v-4.5c0-.552 .448-1 1-1h3")
            addPathData("M10 17c0 1.105 .895 2 2 2h3.5c.971 .002 1.926-.255 2.765-.744M20.265 16.256c.47-.81 .739-1.752 .739-2.756v-9.5")
            addPathData("M3 3 21 21")
        }
        return _scubaMaskOff!!
    }

private var _scubaMaskOff: ImageVector? = null
