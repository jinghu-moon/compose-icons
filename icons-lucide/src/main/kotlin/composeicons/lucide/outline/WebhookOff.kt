package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WebhookOff: ImageVector
    get() {
        if (_webhookOff != null) return _webhookOff!!
        _webhookOff = lucideOutlineIcon(
            name = "WebhookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17h-5c-1.09-.02-1.94 .92-2.5 1.9C8.423 20.814 5.999 21.492 4.085 20.415 2.171 19.338 1.493 16.914 2.57 15")
            addPathData("M9 3.4c.852-.988 2.133-1.499 3.432-1.367 1.298 .131 2.451 .888 3.088 2.027")
            addPathData("M6 17 9.1 11.2c.311-.644 .332-1.39 .057-2.05")
            addPathData("M20.3 20.3c-.677 .464-1.48 .708-2.3 .7")
            addPathData("M18.6 13c1.752 .269 3.118 1.658 3.357 3.414")
            addPathData("M12 6l.6 1")
            addPathData("M2 2 22 22")
        }
        return _webhookOff!!
    }

private var _webhookOff: ImageVector? = null
