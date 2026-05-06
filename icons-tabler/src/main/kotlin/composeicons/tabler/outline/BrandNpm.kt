package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNpm: ImageVector
    get() {
        if (_brandNpm != null) return _brandNpm!!
        _brandNpm = tablerOutlineIcon(
            name = "BrandNpm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M1 8h22v7h-12v2h-4v-2h-6v-7")
            addPathData("M7 8v7")
            addPathData("M14 8v7")
            addPathData("M17 11v4")
            addPathData("M4 11v4")
            addPathData("M11 11v1")
            addPathData("M20 11v4")
        }
        return _brandNpm!!
    }

private var _brandNpm: ImageVector? = null
