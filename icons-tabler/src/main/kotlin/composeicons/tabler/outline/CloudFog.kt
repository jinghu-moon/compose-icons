package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = tablerOutlineIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16C4.402 16 2.295 13.985 2.295 11.5 2.295 9.015 4.402 7 7 7 7.614 4.266 10.574 2.498 13.611 3.05 16.649 3.602 18.614 6.266 18 9h1c1.933 0 3.5 1.567 3.5 3.5C22.5 14.433 20.933 16 19 16h-12")
            addPathData("M5 20h14")
        }
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
