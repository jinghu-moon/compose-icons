package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNexo: ImageVector
    get() {
        if (_brandNexo != null) return _brandNexo!!
        _brandNexo = tablerOutlineIcon(
            name = "BrandNexo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3l5 3v12l-5 3L7 15v-6l10 6v-6L12 6 17 3")
            addPathData("M12 6 7 3 2 6v12l5 3 4.7-3.13")
        }
        return _brandNexo!!
    }

private var _brandNexo: ImageVector? = null
