package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WandSparkles: ImageVector
    get() {
        if (_wandSparkles != null) return _wandSparkles!!
        _wandSparkles = lucideOutlineIcon(
            name = "WandSparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.64 3.64 20.36 2.36c-.227-.23-.537-.359-.86-.359-.323 0-.633 .129-.86 .359L2.36 18.64c-.23 .227-.359 .537-.359 .86 0 .323 .129 .633 .359 .86l1.28 1.28c.226 .232 .536 .363 .86 .363 .324 0 .634-.131 .86-.363L21.64 5.36c.232-.226 .363-.536 .363-.86 0-.324-.131-.634-.363-.86")
            addPathData("M14 7l3 3")
            addPathData("M5 6v4")
            addPathData("M19 14v4")
            addPathData("M10 2v2")
            addPathData("M7 8h-4")
            addPathData("M21 16h-4")
            addPathData("M11 3h-2")
        }
        return _wandSparkles!!
    }

private var _wandSparkles: ImageVector? = null
