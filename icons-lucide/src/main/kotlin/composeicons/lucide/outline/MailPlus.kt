package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailPlus: ImageVector
    get() {
        if (_mailPlus != null) return _mailPlus!!
        _mailPlus = lucideOutlineIcon(
            name = "MailPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 13v-7C22 4.895 21.105 4 20 4h-16C2.895 4 2 4.895 2 6v12c0 1.1 .9 2 2 2h8")
            addPathData("M22 7l-8.97 5.7c-.63 .395-1.43 .395-2.06 0L2 7")
            addPathData("M19 16v6")
            addPathData("M16 19h6")
        }
        return _mailPlus!!
    }

private var _mailPlus: ImageVector? = null
