package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) return _brandAngular!!
        _brandAngular = tablerOutlineIcon(
            name = "BrandAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.428 17.245l6.076 3.471c.307 .176 .685 .176 .992 0l6.076-3.471c.27-.154 .453-.426 .495-.734L20.39 6.807c.064-.47-.211-.92-.658-1.078L12.332 3.117c-.215-.076-.45-.076-.665 0L4.268 5.73c-.447 .158-.722 .608-.658 1.078l1.323 9.704c.042 .308 .225 .58 .495 .734v-.001")
            addPathData("M9 15 12 7l3 8")
            addPathData("M10 13h4")
        }
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
