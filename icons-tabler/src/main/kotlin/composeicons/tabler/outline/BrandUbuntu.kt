package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandUbuntu: ImageVector
    get() {
        if (_brandUbuntu != null) return _brandUbuntu!!
        _brandUbuntu = tablerOutlineIcon(
            name = "BrandUbuntu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M17.723 7.41C16.698 6.36 15.404 5.612 13.983 5.248M10.012 5.248C8.567 5.619 7.254 6.386 6.223 7.464M4.342 10.679c-.227 .752-.343 1.534-.342 2.32 0 .738 .1 1.453 .287 2.132M6.247 18.559c1.026 1.064 2.328 1.822 3.759 2.19M14.006 20.749c1.427-.369 2.723-1.126 3.747-2.186M19.715 15.133c.191-.694 .288-1.411 .287-2.131 0-.764-.107-1.503-.307-2.203")
            addPathData("M3 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2")
            addPathData("M17 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _brandUbuntu!!
    }

private var _brandUbuntu: ImageVector? = null
