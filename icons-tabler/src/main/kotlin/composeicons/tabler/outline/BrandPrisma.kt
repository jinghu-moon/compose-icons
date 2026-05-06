package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPrisma: ImageVector
    get() {
        if (_brandPrisma != null) return _brandPrisma!!
        _brandPrisma = tablerOutlineIcon(
            name = "BrandPrisma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.186 16.202l3.615 5.313c.265 .39 .754 .57 1.215 .447L19.182 19.244c.313-.081 .573-.296 .711-.588 .138-.292 .138-.63 .002-.923L12.39 2.25c-.072-.148-.219-.244-.384-.251-.164-.007-.319 .077-.403 .218L4.15 15.055c-.211 .357-.197 .804 .037 1.147h-.001")
            addPathData("M8.5 22 12 2")
        }
        return _brandPrisma!!
    }

private var _brandPrisma: ImageVector? = null
