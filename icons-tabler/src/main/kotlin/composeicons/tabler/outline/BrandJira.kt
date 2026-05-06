package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandJira: ImageVector
    get() {
        if (_brandJira != null) return _brandJira!!
        _brandJira = tablerOutlineIcon(
            name = "BrandJira",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4h-9v1.5C11 6.881 12.119 8 13.5 8h1.5c.552 0 1 .448 1 1v1.5C16 11.881 17.119 13 18.5 13h1.5v-9")
            addPathData("M15 8h-8v1.5C7 10.881 8.119 12 9.5 12h1.5c.552 0 1 .448 1 1v1.5C12 15.881 13.119 17 14.5 17h1.5v-8C16 8.448 15.552 8 15 8")
            addPathData("M11 12h-8v1.5C3 14.881 4.119 16 5.5 16h1.5c.552 0 1 .448 1 1v1.5C8 19.881 9.119 21 10.5 21h1.5v-8c0-.552-.448-1-1-1")
        }
        return _brandJira!!
    }

private var _brandJira: ImageVector? = null
