package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorThinIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C92.87 20 44 86.52 44 152c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 86.52 163.13 20 128 20ZM128 228C86.045 227.956 52.044 193.955 52 152 52 123.54 62 92.27 79.33 66.22 94.81 43 113.91 28 128 28c14.09 0 33.19 15 48.67 38.22C194 92.27 204 123.54 204 152c-.044 41.955-34.045 75.956-76 76Z"),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
