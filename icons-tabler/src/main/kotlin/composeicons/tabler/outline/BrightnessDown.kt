package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessDown: ImageVector
    get() {
        if (_brightnessDown != null) return _brightnessDown!!
        _brightnessDown = tablerOutlineIcon(
            name = "BrightnessDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M12 5v.01")
            addPathData("M17 7v.01")
            addPathData("M19 12v.01")
            addPathData("M17 17v.01")
            addPathData("M12 19v.01")
            addPathData("M7 17v.01")
            addPathData("M5 12v.01")
            addPathData("M7 7v.01")
        }
        return _brightnessDown!!
    }

private var _brightnessDown: ImageVector? = null
