package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Affiliate: ImageVector
    get() {
        if (_affiliate != null) return _affiliate!!
        _affiliate = tablerOutlineIcon(
            name = "Affiliate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.931 6.936l1.275 4.249M12.813 16.794l4.251 1.275")
            addPathData("M11.683 12.317 17.442 6.558")
            addPathData("M4 5.5C4 6.328 4.672 7 5.5 7 6.328 7 7 6.328 7 5.5 7 4.672 6.328 4 5.5 4 4.672 4 4 4.672 4 5.5")
            addPathData("M17 5.5C17 6.328 17.672 7 18.5 7 19.328 7 20 6.328 20 5.5 20 4.672 19.328 4 18.5 4 17.672 4 17 4.672 17 5.5")
            addPathData("M17 18.5c0 .828 .672 1.5 1.5 1.5C19.328 20 20 19.328 20 18.5 20 17.672 19.328 17 18.5 17 17.672 17 17 17.672 17 18.5")
            addPathData("M4 15.5C4 17.985 6.015 20 8.5 20 10.985 20 13 17.985 13 15.5 13 13.015 10.985 11 8.5 11 6.015 11 4 13.015 4 15.5")
        }
        return _affiliate!!
    }

private var _affiliate: ImageVector? = null
