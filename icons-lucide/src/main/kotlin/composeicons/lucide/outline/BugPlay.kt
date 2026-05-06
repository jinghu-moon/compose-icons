package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BugPlay: ImageVector
    get() {
        if (_bugPlay != null) return _bugPlay!!
        _bugPlay = lucideOutlineIcon(
            name = "BugPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 19.655C7.603 18.808 6.001 16.542 6 14v-3C6 8.791 7.791 7 10 7h4c2.197-0 3.984 1.773 4 3.97")
            addPathData("M14 15.003c-.001-.361 .193-.695 .507-.873 .314-.178 .7-.173 1.01 .014l4.997 2.997c.303 .18 .488 .507 .488 .859 0 .352-.185 .679-.488 .859l-4.997 2.997c-.309 .187-.696 .192-1.01 .014-.314-.178-.508-.512-.507-.874Z")
            addPathData("M14.12 3.88 16 2")
            addPathData("M21 5c-.002 2.033-1.53 3.741-3.55 3.97")
            addPathData("M3 21C2.998 18.863 4.675 17.102 6.81 17")
            addPathData("M3 5c.002 2.033 1.53 3.741 3.55 3.97")
            addPathData("M6 13h-4")
            addPathData("M8 2 9.88 3.88")
            addPathData("M9 7.13v-1.13C9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3v1.13")
        }
        return _bugPlay!!
    }

private var _bugPlay: ImageVector? = null
