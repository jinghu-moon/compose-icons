package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunHigh: ImageVector
    get() {
        if (_sunHigh != null) return _sunHigh!!
        _sunHigh = tablerOutlineIcon(
            name = "SunHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.828 14.828c1.04-1.004 1.457-2.492 1.091-3.89C15.553 9.539 14.461 8.447 13.062 8.081 11.664 7.715 10.176 8.132 9.172 9.172c-1.516 1.57-1.494 4.064 .049 5.607 1.543 1.543 4.038 1.565 5.607 .049")
            addPathData("M6.343 17.657 4.929 19.071")
            addPathData("M6.343 6.343 4.929 4.929")
            addPathData("M17.657 6.343 19.071 4.929")
            addPathData("M17.657 17.657l1.414 1.414")
            addPathData("M4 12h-2")
            addPathData("M12 4v-2")
            addPathData("M20 12h2")
            addPathData("M12 20v2")
        }
        return _sunHigh!!
    }

private var _sunHigh: ImageVector? = null
