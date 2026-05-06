package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = lucideOutlineIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 21v-11C18 9.448 17.552 9 17 9h-10C6.448 9 6 9.448 6 10v11")
            addPathData("M22 19c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-11C2 7.231 2.44 6.531 3.132 6.197L11.082 2.223c.576-.298 1.261-.298 1.837 0l7.948 3.974C21.56 6.53 22 7.231 22 8Z")
            addPathData("M6 13h12")
            addPathData("M6 17h12")
        }
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
