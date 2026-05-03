package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorThinIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 ZM 92.000 80.000 C 92.000 84.418 88.418 88.000 84.000 88.000 C 79.582 88.000 76.000 84.418 76.000 80.000 C 76.000 75.582 79.582 72.000 84.000 72.000 C 88.418 72.000 92.000 75.582 92.000 80.000 ZM 92.000 176.000 C 92.000 180.418 88.418 184.000 84.000 184.000 C 79.582 184.000 76.000 180.418 76.000 176.000 C 76.000 171.582 79.582 168.000 84.000 168.000 C 88.418 168.000 92.000 171.582 92.000 176.000 ZM 92.000 128.000 C 92.000 132.418 88.418 136.000 84.000 136.000 C 79.582 136.000 76.000 132.418 76.000 128.000 C 76.000 123.582 79.582 120.000 84.000 120.000 C 88.418 120.000 92.000 123.582 92.000 128.000 Z"),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
