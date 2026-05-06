package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMailgun: ImageVector
    get() {
        if (_brandMailgun != null) return _brandMailgun!!
        _brandMailgun = tablerOutlineIcon(
            name = "BrandMailgun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 7.752 18.029 4.082 13.874 3.198 9.719 2.313 5.511 4.455 3.781 8.334c-1.73 3.88-.512 8.441 2.922 10.942 3.434 2.501 8.15 2.259 11.31-.579")
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _brandMailgun!!
    }

private var _brandMailgun: ImageVector? = null
