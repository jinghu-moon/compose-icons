package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = lucideOutlineIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v-2")
            addPathData("M5 10v4c0 3.203 2.173 5.997 5.277 6.787 .412 .104 .802 .292 1.102 .592L12 22l.621-.621c.3-.3 .69-.488 1.102-.592C16.827 19.998 19 17.203 19 14v-4")
            addPathData("M12 4C8 4 4.5 6 4 8c-.243 .97-.919 1.952-2 3 1.31-.082 1.972-.29 3-1 .54 .92 .982 1.356 2 2 1.452-.647 1.954-1.098 2.5-2 .595 .995 1.151 1.427 2.5 2 1.31-.621 1.862-1.058 2.5-2 .629 .977 1.162 1.423 2.5 2 1.209-.548 1.68-.967 2-2 1.032 .916 1.683 1.157 3 1C20.703 9.964 20.242 8.97 20 8 19.5 6 16 4 12 4Z")
        }
        return _nut!!
    }

private var _nut: ImageVector? = null
