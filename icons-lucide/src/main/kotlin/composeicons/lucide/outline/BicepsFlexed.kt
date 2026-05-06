package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BicepsFlexed: ImageVector
    get() {
        if (_bicepsFlexed != null) return _bicepsFlexed!!
        _bicepsFlexed = lucideOutlineIcon(
            name = "BicepsFlexed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.409 13.017c.94-2.178 3.28-3.396 5.603-2.916 2.323 .48 3.989 2.527 3.988 4.899 0 3.866-4 7-9 7C8.923 22 4.847 21.18 2.629 19.538c-.426-.316-.631-.832-.62-1.362C2.118 12.723 2.627 2 10 2c1.657 0 3 1.343 3 3 0 1.105-.895 2-2 2C9.895 7 9.36 6.556 9 6")
            addPathData("M15 14c-1.223-.918-2.798-1.225-4.276-.836C9.246 13.554 8.027 14.599 7.416 16")
            addPathData("M9.964 6.825C8.019 7.977 9.5 13 8 15")
        }
        return _bicepsFlexed!!
    }

private var _bicepsFlexed: ImageVector? = null
