package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = lucideOutlineIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 4c0 1.105-.895 2-2 2C9.895 6 9 5.105 9 4 9 2.895 9.895 2 11 2c1.105 0 2 .895 2 2Z")
            addPathData("M20 8c0 1.105-.895 2-2 2C16.895 10 16 9.105 16 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M22 16c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 10c2.761 0 5 2.239 5 5v3.5c-.001 1.728-1.263 3.198-2.971 3.459C9.32 22.22 7.677 21.194 7.16 19.545Q6.52 17.48 4.46 16.84C2.811 16.324 1.786 14.682 2.046 12.974 2.306 11.266 3.772 10.003 5.5 10Z")
        }
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
