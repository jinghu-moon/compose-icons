package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessUp: ImageVector
    get() {
        if (_brightnessUp != null) return _brightnessUp!!
        _brightnessUp = tablerOutlineIcon(
            name = "BrightnessUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M12 5v-2")
            addPathData("M17 7 18.4 5.6")
            addPathData("M19 12h2")
            addPathData("M17 17l1.4 1.4")
            addPathData("M12 19v2")
            addPathData("M7 17 5.6 18.4")
            addPathData("M6 12h-2")
            addPathData("M7 7 5.6 5.6")
        }
        return _brightnessUp!!
    }

private var _brightnessUp: ImageVector? = null
