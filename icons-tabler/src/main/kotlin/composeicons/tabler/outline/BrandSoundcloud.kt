package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSoundcloud: ImageVector
    get() {
        if (_brandSoundcloud != null) return _brandSoundcloud!!
        _brandSoundcloud = tablerOutlineIcon(
            name = "BrandSoundcloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 11h1c1.38 0 3 1.274 3 3 0 1.657-1.5 3-3 3h-6v-10c3 0 4.5 1.5 5 4")
            addPathData("M9 8v9")
            addPathData("M6 17v-7")
            addPathData("M3 16v-2")
        }
        return _brandSoundcloud!!
    }

private var _brandSoundcloud: ImageVector? = null
