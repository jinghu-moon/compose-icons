package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LibraryPlus: ImageVector
    get() {
        if (_libraryPlus != null) return _libraryPlus!!
        _libraryPlus = tablerFilledIcon(
            name = "LibraryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.333 2C20.358 2 22 3.642 22 5.667v8.666C22 16.358 20.358 18 18.333 18h-8.666C7.642 18 6 16.358 6 14.333v-8.666C6 3.642 7.642 2 9.667 2ZM14 6c-.552 0-1 .448-1 1v2h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h2c.552 0 1-.448 1-1C18 9.448 17.552 9 17 9h-2v-2C15 6.448 14.552 6 14 6")
            addPathData("M3.517 6.391c.48-.273 1.091-.106 1.364 .374 .273 .48 .106 1.091-.374 1.364C4.194 8.307 4.001 8.639 4 8.997v10c0 .548 .452 1 1 1h10c.284 0 .405-.088 .626-.486 .268-.483 .877-.656 1.36-.388 .483 .268 .656 .877 .388 1.36-.546 .98-1.28 1.514-2.374 1.514h-10c-1.652 0-3-1.348-3-3v-10.002C2.001 7.917 2.58 6.923 3.517 6.39")
        }
        return _libraryPlus!!
    }

private var _libraryPlus: ImageVector? = null
