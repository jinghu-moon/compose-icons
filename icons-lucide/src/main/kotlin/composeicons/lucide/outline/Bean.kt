package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bean: ImageVector
    get() {
        if (_bean != null) return _bean!!
        _bean = lucideOutlineIcon(
            name = "Bean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.165 6.598C9.954 7.478 9.64 8.36 9 9c-.64 .64-1.521 .954-2.402 1.165-2.959 .709-4.919 3.52-4.561 6.541C2.395 19.727 4.958 22.002 8 22 15.732 22 22 15.732 22 8 22.002 4.958 19.727 2.395 16.706 2.037 13.685 1.679 10.874 3.639 10.165 6.598Z")
            addPathData("M5.341 10.62c.725 1.631 2.443 2.585 4.211 2.337 1.768-.248 3.157-1.638 3.405-3.406C13.205 7.783 12.252 6.065 10.62 5.34")
        }
        return _bean!!
    }

private var _bean: ImageVector? = null
