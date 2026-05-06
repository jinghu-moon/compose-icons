package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitBranchPlus: ImageVector
    get() {
        if (_gitBranchPlus != null) return _gitBranchPlus!!
        _gitBranchPlus = lucideOutlineIcon(
            name = "GitBranchPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3v12")
            addPathData("M18 9c1.657 0 3-1.343 3-3C21 4.343 19.657 3 18 3 16.343 3 15 4.343 15 6c0 1.657 1.343 3 3 3Z")
            addPathData("M6 21c1.657 0 3-1.343 3-3C9 16.343 7.657 15 6 15 4.343 15 3 16.343 3 18c0 1.657 1.343 3 3 3Z")
            addPathData("M15 6C10.029 6 6 10.029 6 15")
            addPathData("M18 15v6")
            addPathData("M21 18h-6")
        }
        return _gitBranchPlus!!
    }

private var _gitBranchPlus: ImageVector? = null
