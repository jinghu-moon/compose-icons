package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGatsby: ImageVector
    get() {
        if (_brandGatsby != null) return _brandGatsby!!
        _brandGatsby = tablerOutlineIcon(
            name = "BrandGatsby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.296 14.297l6.407 6.407C6.676 19.902 4.281 17.587 3.378 14.588l-.082-.291")
            addPathData("M16 13h5c-.41 3.603-3.007 6.59-6.386 7.614L3.386 9.385C4.357 6.182 7.026 3.783 10.313 3.157c3.288-.627 6.651 .623 8.733 3.243")
        }
        return _brandGatsby!!
    }

private var _brandGatsby: ImageVector? = null
