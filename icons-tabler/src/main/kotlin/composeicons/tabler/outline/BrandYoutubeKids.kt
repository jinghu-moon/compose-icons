package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYoutubeKids: ImageVector
    get() {
        if (_brandYoutubeKids != null) return _brandYoutubeKids!!
        _brandYoutubeKids = tablerOutlineIcon(
            name = "BrandYoutubeKids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.608 17.75l-3.9 .268h-.027c-1.273 .103-2.526 .381-3.722 .828l-2.511 .908c-1.078 .389-2.269 .311-3.287-.216C4.162 19.027 3.438 18.103 3.181 17.011L1.805 10.961C1.582 9.975 1.776 8.94 2.341 8.101 2.922 7.243 3.815 6.647 4.83 6.44L16.08 4.086c2.137-.448 4.247 .85 4.713 2.9l1.403 6.162c.245 1.081-.011 2.215-.697 3.086-.705 .891-1.756 1.441-2.89 1.512v.002l-.001 .002")
            addPathData("M9 10l1.208 5 4.292-4L9 10")
        }
        return _brandYoutubeKids!!
    }

private var _brandYoutubeKids: ImageVector? = null
