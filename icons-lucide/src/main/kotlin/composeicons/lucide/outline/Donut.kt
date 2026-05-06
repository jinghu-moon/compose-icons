package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Donut: ImageVector
    get() {
        if (_donut != null) return _donut!!
        _donut = lucideOutlineIcon(
            name = "Donut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.5 10c-.742-.015-1.439-.358-1.903-.938C18.134 8.483 17.951 7.727 18.1 7h-.1C16.946 7.011 15.966 6.459 15.429 5.551c-.536-.908-.548-2.033-.029-2.951C11.098 1.027 6.278 2.578 3.7 6.364c-2.578 3.786-2.254 8.839 .786 12.265 3.04 3.426 8.019 4.349 12.084 2.24 4.066-2.109 6.179-6.711 5.129-11.169-.3 .2-.8 .3-1.2 .3")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
        }
        return _donut!!
    }

private var _donut: ImageVector? = null
