package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spool: ImageVector
    get() {
        if (_spool != null) return _spool!!
        _spool = lucideOutlineIcon(
            name = "Spool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 13.44 4.442 17.082c-.949 .28-1.55 1.211-1.415 2.191 .135 .98 .966 1.714 1.955 1.727h14.018c.996 .001 1.841-.732 1.981-1.718 .14-.986-.467-1.926-1.423-2.203l-1.115-.32C17.588 16.511 16.999 15.727 17 14.837v-7.177")
            addPathData("M7 10.56 19.558 6.918c.949-.28 1.55-1.211 1.415-2.191C20.838 3.747 20.007 3.013 19.018 3h-14.018C4.004 2.999 3.159 3.732 3.019 4.718c-.14 .986 .467 1.926 1.423 2.203l1.115 .32C6.412 7.489 7.001 8.273 7 9.163v7.178")
        }
        return _spool!!
    }

private var _spool: ImageVector? = null
