package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) return _lampDesk!!
        _lampDesk = lucideOutlineIcon(
            name = "LampDesk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.293 2.293c.391-.39 1.023-.39 1.414 0l2.5 2.5 5.994 1.227c.361 .074 .651 .34 .757 .692 .106 .352 .009 .735-.251 .995l-7 7c-.26 .26-.642 .357-.995 .251-.352-.106-.618-.397-.692-.757L10.793 8.207 8.293 5.707c-.39-.39-.39-1.023 0-1.414Z")
            addPathData("M14.207 4.793 10.793 8.207")
            addPathData("M3 20c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-6C3.448 22 3 21.552 3 21Z")
            addPathData("M9.086 6.5 4.293 11.293c-.309 .309-.382 .783-.18 1.17L7 18")
        }
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
