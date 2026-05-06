package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = lucideOutlineIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h3c.866 0 1.634-.557 1.902-1.38L21.958 7.287c.091-.303 .033-.631-.156-.884C21.614 6.149 21.316 6 21 6h-18c-.316-0-.614 .149-.802 .403-.189 .254-.246 .581-.156 .884l1.056 3.334C3.367 11.444 4.134 12 5 12h3")
            addPathData("M18 6v-3C18 2.448 17.552 2 17 2h-3")
            addPathData("M9 10h6c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-6C8.448 22 8 21.552 8 21v-10c0-.552 .448-1 1-1Z")
        }
        return _lectern!!
    }

private var _lectern: ImageVector? = null
