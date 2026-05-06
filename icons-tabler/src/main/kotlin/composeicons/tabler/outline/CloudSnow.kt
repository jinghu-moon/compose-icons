package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = tablerOutlineIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18C4.402 18 2.295 15.985 2.295 13.5 2.295 11.015 4.402 9 7 9 7.614 6.266 10.574 4.498 13.611 5.05 16.649 5.602 18.614 8.266 18 11h1c1.933 0 3.5 1.567 3.5 3.5C22.5 16.433 20.933 18 19 18")
            addPathData("M11 15v.01M11 18.01v.01M11 21.02v.01M15 17.03v.01M15 20.04v.01")
        }
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
