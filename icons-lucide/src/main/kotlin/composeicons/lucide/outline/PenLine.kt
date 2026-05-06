package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PenLine: ImageVector
    get() {
        if (_penLine != null) return _penLine!!
        _penLine = lucideOutlineIcon(
            name = "PenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21h8")
            addPathData("M21.174 6.812c1.101-1.101 1.101-2.886 0-3.986C20.074 1.725 18.289 1.724 17.188 2.825L3.842 16.174c-.232 .232-.404 .517-.5 .83L2.021 21.356c-.053 .176-.004 .367 .126 .497 .13 .13 .321 .178 .497 .125L6.997 20.658c.313-.095 .598-.266 .83-.497Z")
        }
        return _penLine!!
    }

private var _penLine: ImageVector? = null
