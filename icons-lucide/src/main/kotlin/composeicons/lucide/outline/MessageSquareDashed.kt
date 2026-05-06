package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareDashed: ImageVector
    get() {
        if (_messageSquareDashed != null) return _messageSquareDashed!!
        _messageSquareDashed = lucideOutlineIcon(
            name = "MessageSquareDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3h2")
            addPathData("M16 19h-2")
            addPathData("M2 12v-2")
            addPathData("M2 16v5.286c0 .287 .173 .546 .438 .656 .265 .11 .571 .049 .774-.154L4.361 20.639")
            addPathData("M20 19c1.105 0 2-.895 2-2v-1")
            addPathData("M22 10v2")
            addPathData("M22 6v-1C22 3.895 21.105 3 20 3")
            addPathData("M4 3C2.895 3 2 3.895 2 5v1")
            addPathData("M8 19h2")
            addPathData("M8 3h2")
        }
        return _messageSquareDashed!!
    }

private var _messageSquareDashed: ImageVector? = null
