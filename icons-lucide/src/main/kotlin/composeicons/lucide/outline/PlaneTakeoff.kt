package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlaneTakeoff: ImageVector
    get() {
        if (_planeTakeoff != null) return _planeTakeoff!!
        _planeTakeoff = lucideOutlineIcon(
            name = "PlaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 22h20")
            addPathData("M6.36 17.4 4 17 2 13l1.1-.55c.566-.285 1.234-.285 1.8 0l.17 .1c.566 .285 1.234 .285 1.8 0L8 12 5 6l.9-.45c.678-.334 1.487-.256 2.09 .2l4.02 3c.605 .46 1.419 .538 2.1 .2L18.3 6.89c.535-.27 1.152-.331 1.73-.17L21 7c.406 .113 .739 .402 .908 .788 .169 .386 .155 .827-.038 1.202l-.38 .76c-.23 .46-.6 .84-1.07 1.08L7.58 17.2c-.378 .187-.805 .25-1.22 .18Z")
        }
        return _planeTakeoff!!
    }

private var _planeTakeoff: ImageVector? = null
