package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGumroad: ImageVector
    get() {
        if (_brandGumroad != null) return _brandGumroad!!
        _brandGumroad = tablerOutlineIcon(
            name = "BrandGumroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M13.5 13h2.5v3")
            addPathData("M15.024 9.382C13.816 7.986 11.809 7.599 10.168 8.444 8.527 9.29 7.677 11.148 8.112 12.943 8.547 14.737 10.154 16 12 16c1.862 0 2.554-1.278 3-3")
        }
        return _brandGumroad!!
    }

private var _brandGumroad: ImageVector? = null
