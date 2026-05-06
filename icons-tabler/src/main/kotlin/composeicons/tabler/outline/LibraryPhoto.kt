package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LibraryPhoto: ImageVector
    get() {
        if (_libraryPhoto != null) return _libraryPhoto!!
        _libraryPhoto = tablerOutlineIcon(
            name = "LibraryPhoto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 5.667C7 4.194 8.194 3 9.667 3h8.666C19.806 3 21 4.194 21 5.667v8.666C21 15.806 19.806 17 18.333 17h-8.666C8.194 17 7 15.806 7 14.333v-8.666")
            addPathData("M4.012 7.26C3.388 7.616 3.002 8.278 3 8.997v10c0 1.1 .9 2 2 2h10c.75 0 1.158-.385 1.5-1")
            addPathData("M17 7h.01")
            addPathData("M7 13 10.644 9.356c.227-.227 .535-.355 .856-.355 .321 0 .629 .128 .856 .355L16 13")
            addPathData("M15 12l1.644-1.644c.227-.227 .535-.355 .856-.355 .321 0 .629 .128 .856 .355L21 13")
        }
        return _libraryPhoto!!
    }

private var _libraryPhoto: ImageVector? = null
