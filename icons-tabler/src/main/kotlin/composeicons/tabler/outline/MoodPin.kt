package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodPin: ImageVector
    get() {
        if (_moodPin != null) return _moodPin!!
        _moodPin = tablerOutlineIcon(
            name = "MoodPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.301 18.736 4.978 15.294 3.625 11.851 2.271 7.931 3.162 5.411 5.87 2.891 8.578 2.285 12.553 3.883 15.889c1.598 3.336 5.075 5.355 8.765 5.088")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .672 1.56 1 2.5 1 .102 0 .203-.004 .304-.012")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _moodPin!!
    }

private var _moodPin: ImageVector? = null
