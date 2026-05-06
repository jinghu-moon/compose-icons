package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmongUs: ImageVector
    get() {
        if (_brandAmongUs != null) return _brandAmongUs!!
        _brandAmongUs = tablerOutlineIcon(
            name = "BrandAmongUs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.646 12.774c-1.939 .396-4.467 .317-6.234-.601C1.958 10.91 2.875 7.513 5.835 7.191c2.254-.224 3.814-.354 5.65 .214 .835 .256 1.93 .569 1.355 3.281-.191 1.067-1.07 1.904-2.194 2.088")
            addPathData("M5.84 7.132c.083-.564 .214-1.12 .392-1.661C6.688 4.535 7.327 3.403 10.217 3.015c.956-.034 1.914-.008 2.867 .08 1.776 .14 2.643 1.234 3.287 3.368 .339 1.157 .46 2.342 .629 3.537v11L4.296 20.981c-.552-2.386-.262-5.894 .204-8.481")
            addPathData("M17 10c.991 .163 2.105 .383 3.069 .67 .255 .13 .52 .275 .534 .505 .264 3.434 .57 7.448 .278 9.825h-3.881")
        }
        return _brandAmongUs!!
    }

private var _brandAmongUs: ImageVector? = null
