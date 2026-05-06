package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRedux: ImageVector
    get() {
        if (_brandRedux != null) return _brandRedux!!
        _brandRedux = tablerOutlineIcon(
            name = "BrandRedux",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.54 7C15.735 4.635 14.004 3 12 3 9.226 3 6.977 5.632 6.977 9.496c0 1.956 1.582 4.727 2.512 6")
            addPathData("M4.711 11.979C3.055 13.856 2.497 16.164 3.5 17.89c1.387 2.39 5.138 2.831 8.501 .9 1.703-.979 2.875-3.362 3.516-4.798")
            addPathData("M15.014 19.99c2.511 0 4.523-.438 5.487-2.1 1.387-2.39-.215-5.893-3.579-7.824C15.22 9.087 12.565 8.831 10.995 8.996")
            addPathData("M10.493 9.862c.48 .276 1.095 .112 1.372-.366 .275-.478 .111-1.089-.367-1.365-.48-.277-1.094-.113-1.373 .366-.275 .479-.11 1.09 .368 1.365")
            addPathData("M8.5 15.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M14.5 14c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _brandRedux!!
    }

private var _brandRedux: ImageVector? = null
