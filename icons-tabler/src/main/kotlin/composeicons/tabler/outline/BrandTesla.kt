package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTesla: ImageVector
    get() {
        if (_brandTesla != null) return _brandTesla!!
        _brandTesla = tablerOutlineIcon(
            name = "BrandTesla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21 15 10c2.359 0 3 0 3 1 0 0 1.18-1.745 2-3C16.923 6.536 14 7 14 7L12 9 10 7C10 7 7.077 6.536 4 8c.82 1.255 2 3 2 3 0-1 .744-1 3-1l3 11")
            addPathData("M20 5C14.886 3 9.114 3 4 5")
        }
        return _brandTesla!!
    }

private var _brandTesla: ImageVector? = null
