package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSymfony: ImageVector
    get() {
        if (_brandSymfony != null) return _brandSymfony!!
        _brandSymfony = tablerOutlineIcon(
            name = "BrandSymfony",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 13c.458 .667 1.125 1 2 1 1.313 0 2-.875 2-1.5 0-1.5-2-1-2-2C8 9.875 8.516 9 9.5 9 12 9 11.063 11 15 11c.667 0 1-.333 1-1")
            addPathData("M9 17c-.095 .667 .238 1 1 1 1.714 0 2.714-2 3-6 .286-4 1.571-6 3-6 .571 0 .905 .333 1 1")
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10")
        }
        return _brandSymfony!!
    }

private var _brandSymfony: ImageVector? = null
