package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyleftOff: ImageVector
    get() {
        if (_copyleftOff != null) return _copyleftOff!!
        _copyleftOff = tablerOutlineIcon(
            name = "CopyleftOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.303 9.3c.614 .296 1.109 .792 1.405 1.406M14.122 14.119c-1.125 1.123-2.928 1.18-4.122 .131")
            addPathData("M20.042 16.045C21.79 12.576 21.115 8.378 18.368 5.632 15.622 2.885 11.424 2.21 7.955 3.958M5.637 5.635C3.332 7.902 2.42 11.231 3.248 14.356c.828 3.125 3.268 5.566 6.393 6.395 3.125 .829 6.454-.082 8.722-2.386")
            addPathData("M3 3 21 21")
        }
        return _copyleftOff!!
    }

private var _copyleftOff: ImageVector? = null
