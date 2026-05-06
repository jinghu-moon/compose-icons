package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Worm: ImageVector
    get() {
        if (_worm != null) return _worm!!
        _worm = lucideOutlineIcon(
            name = "Worm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 12l-1.5 3")
            addPathData("M19.63 18.81 22 20")
            addPathData("M6.47 8.23c.594-.336 1.333-.278 1.869 .145 .535 .424 .761 1.129 .571 1.785l-.64 2.08c-.852 2.725 .1 5.693 2.379 7.413 2.279 1.721 5.394 1.823 7.781 .257l.42-.27c1.163-.754 1.494-2.307 .74-3.47-.754-1.163-2.307-1.494-3.47-.74l-.42 .27c-.62 .394-1.42 .361-2.006-.082-.586-.443-.835-1.204-.624-1.908l.64-2.08C14.549 8.991 13.667 6.108 11.495 4.39 9.324 2.672 6.315 2.477 3.94 3.9l-.7 .4C2.042 5.004 1.641 6.547 2.345 7.745c.704 1.198 2.247 1.599 3.445 .895Z")
        }
        return _worm!!
    }

private var _worm: ImageVector? = null
