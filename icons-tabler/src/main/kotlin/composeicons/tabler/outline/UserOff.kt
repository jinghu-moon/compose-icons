package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserOff: ImageVector
    get() {
        if (_userOff != null) return _userOff!!
        _userOff = tablerOutlineIcon(
            name = "UserOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.18 8.189c.391 1.25 1.367 2.231 2.616 2.627M14.303 10.271c1.305-.92 1.937-2.528 1.609-4.091C15.583 4.618 14.357 3.4 12.793 3.082 11.228 2.765 9.624 3.408 8.713 4.719")
            addPathData("M6 21v-2c0-2.209 1.791-4 4-4h4c.412 0 .81 .062 1.183 .178M17.816 17.796c.12 .38 .184 .785 .184 1.204v2")
            addPathData("M3 3 21 21")
        }
        return _userOff!!
    }

private var _userOff: ImageVector? = null
