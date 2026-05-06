package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorRegularIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 40c0 4.418-3.582 8-8 8h-168c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h168c4.418 0 8 3.582 8 8ZM184 72c0-4.418-3.582-8-8-8h-144c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8ZM168 104c0-4.418-3.582-8-8-8h-104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h104c4.418 0 8-3.582 8-8ZM184 136c0-4.418-3.582-8-8-8h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8ZM184 160h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 192h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 224h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _tornado!!
    }

private var _tornado: ImageVector? = null
