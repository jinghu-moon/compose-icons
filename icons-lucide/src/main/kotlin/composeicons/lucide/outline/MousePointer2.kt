package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer2: ImageVector
    get() {
        if (_mousePointer2 != null) return _mousePointer2!!
        _mousePointer2 = lucideOutlineIcon(
            name = "MousePointer2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.037 4.688c-.081-.186-.039-.403 .104-.547 .144-.144 .36-.185 .547-.104l16 6.5c.2 .081 .325 .281 .31 .496-.014 .215-.165 .397-.373 .451l-6.124 1.58c-.705 .181-1.255 .731-1.438 1.435l-1.579 6.126c-.054 .209-.236 .359-.451 .373-.215 .014-.415-.111-.496-.31Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _mousePointer2!!
    }

private var _mousePointer2: ImageVector? = null
