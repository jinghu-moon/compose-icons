package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStorj: ImageVector
    get() {
        if (_brandStorj != null) return _brandStorj!!
        _brandStorj = tablerOutlineIcon(
            name = "BrandStorj",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 16.448 4.552 16 4 16c-.552 0-1 .448-1 1")
            addPathData("M3 7c0 .552 .448 1 1 1C4.552 8 5 7.552 5 7 5 6.448 4.552 6 4 6 3.448 6 3 6.448 3 7")
            addPathData("M19 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M19 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1C21 6.448 20.552 6 20 6c-.552 0-1 .448-1 1")
            addPathData("M11 3c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 2.448 12.552 2 12 2c-.552 0-1 .448-1 1")
            addPathData("M11 21c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M12 21 4 17v-10L12 3l8 4v10l-8 4")
            addPathData("M9.1 15C8.066 15.001 7.186 14.249 7.024 13.228c-.161-1.021 .444-2.008 1.428-2.326C8.734 9.254 9.771 8 11.5 8c1.694 0 2.906 1.203 3.23 2.8h.17c1.119 .001 2.041 .881 2.095 1.999 .054 1.118-.779 2.082-1.893 2.191L14.9 15h-5.8")
            addPathData("M4 7 8.323 9.702")
            addPathData("M16.413 14.758 20 17")
            addPathData("M4 17 7.529 14.794")
            addPathData("M14.609 10.37 20 7")
            addPathData("M12 3v5")
            addPathData("M12 15v6")
        }
        return _brandStorj!!
    }

private var _brandStorj: ImageVector? = null
