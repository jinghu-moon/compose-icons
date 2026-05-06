package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListVideo: ImageVector
    get() {
        if (_listVideo != null) return _listVideo!!
        _listVideo = lucideOutlineIcon(
            name = "ListVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-18")
            addPathData("M10 12h-7")
            addPathData("M10 19h-7")
            addPathData("M15 12.003c-.001-.361 .193-.695 .507-.873 .314-.178 .7-.173 1.01 .014l4.997 2.997c.303 .18 .488 .507 .488 .859 0 .352-.185 .679-.488 .859l-4.997 2.997c-.309 .187-.696 .192-1.01 .014-.314-.178-.508-.512-.507-.874Z")
        }
        return _listVideo!!
    }

private var _listVideo: ImageVector? = null
