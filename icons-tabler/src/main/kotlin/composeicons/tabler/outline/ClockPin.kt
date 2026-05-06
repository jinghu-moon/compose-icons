package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockPin: ImageVector
    get() {
        if (_clockPin != null) return _clockPin!!
        _clockPin = tablerOutlineIcon(
            name = "ClockPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.971 11.278C20.573 6.332 16.246 2.641 11.299 3.027 6.352 3.414 2.651 7.731 3.026 12.679c.375 4.948 4.683 8.659 9.632 8.297")
            addPathData("M12 7v5l1.5 1.5")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _clockPin!!
    }

private var _clockPin: ImageVector? = null
