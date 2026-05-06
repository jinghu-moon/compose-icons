package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NotebookTabs: ImageVector
    get() {
        if (_notebookTabs != null) return _notebookTabs!!
        _notebookTabs = lucideOutlineIcon(
            name = "NotebookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 6h4")
            addPathData("M2 10h4")
            addPathData("M2 14h4")
            addPathData("M2 18h4")
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
            addPathData("M15 2v20")
            addPathData("M15 7h5")
            addPathData("M15 12h5")
            addPathData("M15 17h5")
        }
        return _notebookTabs!!
    }

private var _notebookTabs: ImageVector? = null
