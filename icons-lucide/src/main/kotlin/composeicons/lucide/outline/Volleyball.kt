package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = lucideOutlineIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.1 7.1C15.097 7.073 18.969 8.494 22 11.1")
            addPathData("M12 12C9.917 14.799 6.767 16.61 3.3 17")
            addPathData("M16.8 13.6c-1.985 3.514-5.186 6.181-9 7.5")
            addPathData("M20.7 17C18.601 14.219 15.46 12.413 12 12 10.699 8.794 10.699 5.206 12 2")
            addPathData("M6.3 3.8c-.782 3.937-.107 8.024 1.9 11.5")
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
        }
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
