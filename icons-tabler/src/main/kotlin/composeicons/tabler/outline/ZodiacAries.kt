package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacAries: ImageVector
    get() {
        if (_zodiacAries != null) return _zodiacAries!!
        _zodiacAries = tablerOutlineIcon(
            name = "ZodiacAries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5C10.589 3.119 8.058 2.475 5.92 3.453 3.782 4.431 2.614 6.767 3.115 9.064 3.615 11.362 5.649 13 8 13")
            addPathData("M16 13c2.351 0 4.385-1.638 4.885-3.936C21.386 6.767 20.218 4.431 18.08 3.453 15.942 2.475 13.411 3.119 12 5")
            addPathData("M12 21v-16")
        }
        return _zodiacAries!!
    }

private var _zodiacAries: ImageVector? = null
