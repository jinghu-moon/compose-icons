package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PoundSterling: ImageVector
    get() {
        if (_poundSterling != null) return _poundSterling!!
        _poundSterling = lucideOutlineIcon(
            name = "PoundSterling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 7C18 1.667 10 1.667 10 7")
            addPathData("M10 7v14")
            addPathData("M6 21h12")
            addPathData("M6 13h10")
        }
        return _poundSterling!!
    }

private var _poundSterling: ImageVector? = null
