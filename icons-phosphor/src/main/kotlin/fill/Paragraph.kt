package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorFillIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 C 216.000 52.418 212.418 56.000 208.000 56.000 L 192.000 56.000 L 192.000 208.000 C 192.000 212.418 188.418 216.000 184.000 216.000 C 179.582 216.000 176.000 212.418 176.000 208.000 L 176.000 56.000 L 152.000 56.000 L 152.000 208.000 C 152.000 212.418 148.418 216.000 144.000 216.000 C 139.582 216.000 136.000 212.418 136.000 208.000 L 136.000 168.000 L 96.000 168.000 C 60.654 168.000 32.000 139.346 32.000 104.000 C 32.000 68.654 60.654 40.000 96.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
