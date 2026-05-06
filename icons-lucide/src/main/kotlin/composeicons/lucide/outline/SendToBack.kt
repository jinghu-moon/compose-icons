package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SendToBack: ImageVector
    get() {
        if (_sendToBack != null) return _sendToBack!!
        _sendToBack = lucideOutlineIcon(
            name = "SendToBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 14h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2Z")
            addPathData("M4 2h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C2.895 10 2 9.105 2 8v-4C2 2.895 2.895 2 4 2Z")
            addPathData("M7 14v1c0 1.105 .895 2 2 2h1")
            addPathData("M14 7h1c1.105 0 2 .895 2 2v1")
        }
        return _sendToBack!!
    }

private var _sendToBack: ImageVector? = null
