package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = lucideOutlineIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 7 8.7 2.7c-.94-.936-2.46-.936-3.4 0L2.7 5.3c-.936 .94-.936 2.46 0 3.4L7 13")
            addPathData("M8 6 10 4")
            addPathData("M18 16l2-2")
            addPathData("M17 11l4.3 4.3c.94 .94 .94 2.46 0 3.4l-2.6 2.6c-.94 .94-2.46 .94-3.4 0L11 17")
            addPathData("M21.174 6.812c1.101-1.101 1.101-2.886 0-3.986C20.074 1.725 18.289 1.724 17.188 2.825L3.842 16.174c-.232 .232-.404 .517-.5 .83L2.021 21.356c-.053 .176-.004 .367 .126 .497 .13 .13 .321 .178 .497 .125L6.997 20.658c.313-.095 .598-.266 .83-.497Z")
            addPathData("M15 5l4 4")
        }
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
