package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVisa: ImageVector
    get() {
        if (_brandVisa != null) return _brandVisa!!
        _brandVisa = tablerOutlineIcon(
            name = "BrandVisa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 15 20 9l-2.5 6")
            addPathData("M9 15 10 9")
            addPathData("M3 9h1v6h.5L7 9")
            addPathData("M16 9.5C16 9.224 15.776 9 15.5 9h-.75c-.721 0-1.337 .521-1.455 1.233l-.09 .534c-.051 .307 .035 .621 .237 .859 .201 .238 .497 .374 .808 .374 .311-0 .607 .137 .808 .374 .201 .238 .288 .552 .237 .859l-.09 .534c-.119 .711-.734 1.233-1.455 1.233h-.75c-.276 0-.5-.224-.5-.5")
            addPathData("M18 14h2.7")
        }
        return _brandVisa!!
    }

private var _brandVisa: ImageVector? = null
