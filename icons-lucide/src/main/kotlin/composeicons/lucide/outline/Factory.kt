package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = lucideOutlineIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16h.01")
            addPathData("M16 16h.01")
            addPathData("M3 19c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-10.5c0-.183-.099-.351-.259-.439-.16-.088-.356-.081-.51 .017l-4.462 2.844c-.154 .098-.349 .105-.51 .017-.16-.088-.26-.256-.259-.439v-2c0-.183-.099-.351-.259-.439-.16-.088-.356-.081-.51 .017L9.77 10.922c-.154 .099-.35 .106-.51 .018C9.099 10.852 9 10.683 9 10.5v-5.5C9 3.895 8.105 3 7 3h-2C3.895 3 3 3.895 3 5Z")
            addPathData("M8 16h.01")
        }
        return _factory!!
    }

private var _factory: ImageVector? = null
