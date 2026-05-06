package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ContactRound: ImageVector
    get() {
        if (_contactRound != null) return _contactRound!!
        _contactRound = lucideOutlineIcon(
            name = "ContactRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 2v2")
            addPathData("M17.915 22c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6")
            addPathData("M8 2v2")
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
            addPathData("M5 4h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-14C3 4.895 3.895 4 5 4Z")
        }
        return _contactRound!!
    }

private var _contactRound: ImageVector? = null
