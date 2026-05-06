package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PenTool: ImageVector
    get() {
        if (_penTool != null) return _penTool!!
        _penTool = lucideOutlineIcon(
            name = "PenTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.707 21.293c-.391 .39-1.023 .39-1.414 0L12.707 19.707c-.39-.391-.39-1.024 0-1.414l5.586-5.586c.391-.39 1.024-.39 1.414 0l1.586 1.586c.39 .391 .39 1.023 0 1.414Z")
            addPathData("M18 13 16.625 6.126c-.076-.382-.367-.685-.746-.776L3.235 2.028c-.339-.082-.696 .018-.942 .265-.246 .246-.347 .603-.265 .942L5.35 15.879c.091 .379 .394 .67 .776 .746L13 18")
            addPathData("M2.3 2.3 9.586 9.586")
            addPathData("M13 11c0 1.105-.895 2-2 2C9.895 13 9 12.105 9 11 9 9.895 9.895 9 11 9c1.105 0 2 .895 2 2Z")
        }
        return _penTool!!
    }

private var _penTool: ImageVector? = null
