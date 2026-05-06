package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Columns3Cog: ImageVector
    get() {
        if (_columns3Cog != null) return _columns3Cog!!
        _columns3Cog = lucideOutlineIcon(
            name = "Columns3Cog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 21h-5.5C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v5.5")
            addPathData("M14.3 19.6l1-.4")
            addPathData("M15 3v7.5")
            addPathData("M15.2 16.9l-.9-.3")
            addPathData("M16.6 21.7l.3-.9")
            addPathData("M16.8 15.3l-.4-1")
            addPathData("M19.1 15.2l.3-.9")
            addPathData("M19.6 21.7l-.4-1")
            addPathData("M20.7 16.8l1-.4")
            addPathData("M21.7 19.4l-.9-.3")
            addPathData("M9 3v18")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _columns3Cog!!
    }

private var _columns3Cog: ImageVector? = null
