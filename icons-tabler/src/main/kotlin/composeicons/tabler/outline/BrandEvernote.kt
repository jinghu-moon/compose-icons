package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEvernote: ImageVector
    get() {
        if (_brandEvernote != null) return _brandEvernote!!
        _brandEvernote = tablerOutlineIcon(
            name = "BrandEvernote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h5v-5")
            addPathData("M17.9 19C18.5 16.5 19 13.529 19 10 19 5.5 17 5 16 5 14.094 5 13 4.5 12.5 4 12.146 3.646 12 3 11 3h-2L4 8c0 6 2.5 8 5 8 1 0 1.5-.5 2-1.5 .5-1 1.414-.326 2.5 0 1.044 .313 2.01 .255 2.5 .5 1 .5 2 1.5 2 3 0 .5 0 3-3 3-3 0-3-3-1-3")
            addPathData("M15 10h1")
        }
        return _brandEvernote!!
    }

private var _brandEvernote: ImageVector? = null
