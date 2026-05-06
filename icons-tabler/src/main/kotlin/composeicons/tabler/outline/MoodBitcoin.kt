package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodBitcoin: ImageVector
    get() {
        if (_moodBitcoin != null) return _moodBitcoin!!
        _moodBitcoin = tablerOutlineIcon(
            name = "MoodBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 21v-6M19 15v-1.5M19 22.5v-1.5M17 18h3M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
            addPathData("M20.87 10.48C20.042 5.649 15.5 2.368 10.654 3.101 5.807 3.834 2.438 8.31 3.076 13.17c.637 4.86 5.047 8.316 9.918 7.775")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .357 0 .709-.052 1.043-.151")
        }
        return _moodBitcoin!!
    }

private var _moodBitcoin: ImageVector? = null
