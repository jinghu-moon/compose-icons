package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = lucideOutlineIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.28 9.05C17.936 6.802 17.096 4.385 15.188 3.028 13.279 1.671 10.721 1.671 8.812 3.028 6.904 4.385 6.064 6.802 6.72 9.05 4.236 9.407 2.309 11.4 2.035 13.894c-.274 2.494 1.176 4.858 3.523 5.745 2.347 .887 4.997 .073 6.442-1.979 1.441 2.058 4.093 2.878 6.444 1.992 2.351-.885 3.803-3.251 3.529-5.748C21.698 11.408 19.767 9.414 17.28 9.06Z")
            addPathData("M12 17.66v4.34")
        }
        return _club!!
    }

private var _club: ImageVector? = null
