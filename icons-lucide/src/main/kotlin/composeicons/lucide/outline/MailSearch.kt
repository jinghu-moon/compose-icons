package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailSearch: ImageVector
    get() {
        if (_mailSearch != null) return _mailSearch!!
        _mailSearch = lucideOutlineIcon(
            name = "MailSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12.5v-6.5C22 4.895 21.105 4 20 4h-16C2.895 4 2 4.895 2 6v12c0 1.1 .9 2 2 2h7.5")
            addPathData("M22 7l-8.97 5.7c-.63 .395-1.43 .395-2.06 0L2 7")
            addPathData("M18 21c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3Z")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M22 22 20.5 20.5")
        }
        return _mailSearch!!
    }

private var _mailSearch: ImageVector? = null
