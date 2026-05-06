package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CodeXml: ImageVector
    get() {
        if (_codeXml != null) return _codeXml!!
        _codeXml = lucideOutlineIcon(
            name = "CodeXml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 16l4-4L18 8")
            addPathData("M6 8 2 12l4 4")
            addPathData("M14.5 4l-5 16")
        }
        return _codeXml!!
    }

private var _codeXml: ImageVector? = null
