package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCohost: ImageVector
    get() {
        if (_brandCohost != null) return _brandCohost!!
        _brandCohost = tablerOutlineIcon(
            name = "BrandCohost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 14c0 1.105 1.343 2 3 2 1.657 0 3-.895 3-2 0-1.105-1.343-2-3-2-1.657 0-3 .895-3 2")
            addPathData("M4.526 17.666C3.393 16.894 2.629 15.742 2.235 14.21c-.398-1.54-.29-2.937 .32-4.19C3.165 8.765 4.145 7.68 5.493 6.766 6.841 5.852 8.423 5.141 10.242 4.634c1.81-.504 3.516-.708 5.12-.61 1.608 .1 2.979 .537 4.112 1.31 1.133 .773 1.897 1.924 2.291 3.456 .398 1.541 .29 2.938-.32 4.192-.61 1.253-1.59 2.337-2.938 3.252-1.348 .915-2.93 1.626-4.749 2.133-1.81 .503-3.516 .707-5.12 .61C7.03 18.875 5.659 18.439 4.526 17.667")
            addPathData("M11 12.508C10.47 12.192 9.77 12 9 12c-1.657 0-3 .895-3 2 0 1.105 1.343 2 3 2 .767 0 1.467-.192 2-.508")
        }
        return _brandCohost!!
    }

private var _brandCohost: ImageVector? = null
