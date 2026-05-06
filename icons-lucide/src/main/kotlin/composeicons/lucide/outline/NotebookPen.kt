package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NotebookPen: ImageVector
    get() {
        if (_notebookPen != null) return _notebookPen!!
        _notebookPen = lucideOutlineIcon(
            name = "NotebookPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.4 2h-7.4C4.895 2 4 2.895 4 4v16c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-7.4")
            addPathData("M2 6h4")
            addPathData("M2 10h4")
            addPathData("M2 14h4")
            addPathData("M2 18h4")
            addPathData("M21.378 5.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0L13.364 7.634c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
        }
        return _notebookPen!!
    }

private var _notebookPen: ImageVector? = null
