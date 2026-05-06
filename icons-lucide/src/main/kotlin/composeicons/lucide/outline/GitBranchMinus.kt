package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitBranchMinus: ImageVector
    get() {
        if (_gitBranchMinus != null) return _gitBranchMinus!!
        _gitBranchMinus = lucideOutlineIcon(
            name = "GitBranchMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6C10.029 6 6 10.029 6 15v-12")
            addPathData("M21 18h-6")
            addPathData("M21 6c0 1.657-1.343 3-3 3C16.343 9 15 7.657 15 6 15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3Z")
            addPathData("M9 18c0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18 3 16.343 4.343 15 6 15c1.657 0 3 1.343 3 3Z")
        }
        return _gitBranchMinus!!
    }

private var _gitBranchMinus: ImageVector? = null
