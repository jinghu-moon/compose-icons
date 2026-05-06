package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) return _dumbbell!!
        _dumbbell = lucideOutlineIcon(
            name = "Dumbbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.596 12.768c.781 .781 2.048 .781 2.829 0 .781-.781 .781-2.048 0-2.829L18.657 8.172c.781 .781 2.048 .781 2.829-0 .781-.781 .781-2.048-0-2.829L18.657 2.515c-.781-.781-2.047-.781-2.828-.001-.781 .781-.781 2.047-0 2.829L14.061 3.575c-.781-.781-2.048-.781-2.829 0-.781 .781-.781 2.048 0 2.829Z")
            addPathData("M2.5 21.5 3.9 20.1")
            addPathData("M20.1 3.9 21.5 2.5")
            addPathData("M5.343 21.485c.781 .781 2.047 .781 2.829 0 .781-.781 .781-2.047 0-2.829l1.767 1.768c.781 .781 2.048 .781 2.829 0 .781-.781 .781-2.048 0-2.829L6.404 11.232c-.781-.781-2.048-.781-2.829 0-.781 .781-.781 2.048 0 2.829l1.768 1.767c-.781-.781-2.048-.781-2.829 0-.781 .781-.781 2.048 .001 2.828Z")
            addPathData("M9.6 14.4 14.4 9.6")
        }
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
