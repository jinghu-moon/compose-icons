package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Message2Pin: ImageVector
    get() {
        if (_message2Pin != null) return _message2Pin!!
        _message2Pin = tablerOutlineIcon(
            name = "Message2Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M12.5 20.5 12 21 9 18h-3C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v4")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _message2Pin!!
    }

private var _message2Pin: ImageVector? = null
