package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitMergeConflict: ImageVector
    get() {
        if (_gitMergeConflict != null) return _gitMergeConflict!!
        _gitMergeConflict = lucideOutlineIcon(
            name = "GitMergeConflict",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6h4c1.105 0 2 .895 2 2v7")
            addPathData("M6 12v9")
            addPathData("M9 3 3 9")
            addPathData("M9 9 3 3")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _gitMergeConflict!!
    }

private var _gitMergeConflict: ImageVector? = null
