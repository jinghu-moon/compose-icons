package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImagePlay: ImageVector
    get() {
        if (_imagePlay != null) return _imagePlay!!
        _imagePlay = lucideOutlineIcon(
            name = "ImagePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15.003c-.001-.361 .193-.695 .507-.873 .314-.178 .7-.173 1.01 .014l4.997 2.997c.303 .18 .488 .507 .488 .859 0 .352-.185 .679-.488 .859l-4.997 2.997c-.309 .187-.696 .192-1.01 .014-.314-.178-.508-.512-.507-.874Z")
            addPathData("M21 12.17v-7.17C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h6")
            addPathData("M6 21l5-5")
            addPathData("M11 9c0 1.105-.895 2-2 2C7.895 11 7 10.105 7 9 7 7.895 7.895 7 9 7c1.105 0 2 .895 2 2Z")
        }
        return _imagePlay!!
    }

private var _imagePlay: ImageVector? = null
