package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDocker: ImageVector
    get() {
        if (_brandDocker != null) return _brandDocker!!
        _brandDocker = tablerOutlineIcon(
            name = "BrandDocker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12.54C20.196 12.195 19.299 11.46 18.477 9.6c-.487 .696-1.102 1.568-.92 2.4 .028 .238-.32 1-.557 1h-14c0 5.208 3.164 7 6.196 7 4.124 .022 7.828-1.376 9.854-5 1.146-.101 2.296-1.505 2.95-2.46")
            addPathData("M5 10h3v3h-3v-3")
            addPathData("M8 10h3v3h-3v-3")
            addPathData("M11 10h3v3h-3v-3")
            addPathData("M8 7h3v3h-3v-3")
            addPathData("M11 7h3v3h-3v-3")
            addPathData("M11 4h3v3h-3v-3")
            addPathData("M4.571 18c1.5 0 2.047-.074 2.958-.78")
            addPathData("M10 16v.01")
        }
        return _brandDocker!!
    }

private var _brandDocker: ImageVector? = null
