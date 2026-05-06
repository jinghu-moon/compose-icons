package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PackageOpen: ImageVector
    get() {
        if (_packageOpen != null) return _packageOpen!!
        _packageOpen = lucideOutlineIcon(
            name = "PackageOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-9")
            addPathData("M15.17 2.21c.506-.283 1.124-.283 1.63 0L21 4.57c.606 .342 .98 .984 .98 1.68 0 .696-.374 1.338-.98 1.68L8.82 14.79c-.508 .29-1.132 .29-1.64 0L3 12.43c-.606-.342-.98-.984-.98-1.68 0-.696 .374-1.338 .98-1.68Z")
            addPathData("M20 13v3.87c.001 .769-.427 1.475-1.11 1.83l-6 3.08c-.558 .29-1.222 .29-1.78 0L5.11 18.7C4.427 18.345 3.999 17.639 4 16.87v-3.87")
            addPathData("M21 12.43c.606-.342 .98-.984 .98-1.68 0-.696-.374-1.338-.98-1.68L8.83 2.2c-.505-.289-1.125-.289-1.63 0L3 4.57c-.606 .342-.98 .984-.98 1.68 0 .696 .374 1.338 .98 1.68l12.18 6.86c.505 .29 1.125 .29 1.63 0Z")
        }
        return _packageOpen!!
    }

private var _packageOpen: ImageVector? = null
