package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BounceRight: ImageVector
    get() {
        if (_bounceRight != null) return _bounceRight!!
        _bounceRight = tablerOutlineIcon(
            name = "BounceRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15.5C7 14.5 9.5 15 12 20c.5-3 1.5-5.5 3-8")
            addPathData("M18 9C16.895 9 16 8.105 16 7c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2")
        }
        return _bounceRight!!
    }

private var _bounceRight: ImageVector? = null
