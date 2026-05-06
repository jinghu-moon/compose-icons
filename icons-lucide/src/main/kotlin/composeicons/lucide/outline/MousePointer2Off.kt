package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer2Off: ImageVector
    get() {
        if (_mousePointer2Off != null) return _mousePointer2Off!!
        _mousePointer2Off = lucideOutlineIcon(
            name = "MousePointer2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.55 8.45l5.138 2.087c.2 .081 .325 .281 .31 .496-.014 .215-.165 .397-.373 .451l-6.124 1.58c-.705 .181-1.255 .731-1.438 1.435l-1.579 6.126c-.054 .209-.236 .359-.451 .373-.215 .014-.415-.111-.496-.31L8.45 15.551")
            addPathData("M22 2 2 22")
            addPathData("M6.816 11.528 4.037 4.688c-.081-.186-.039-.403 .104-.547 .144-.144 .36-.185 .547-.104l6.84 2.779")
        }
        return _mousePointer2Off!!
    }

private var _mousePointer2Off: ImageVector? = null
