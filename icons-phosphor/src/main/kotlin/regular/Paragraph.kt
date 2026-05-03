package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorRegularIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 40.000 L 96.000 40.000 C 60.654 40.000 32.000 68.654 32.000 104.000 C 32.000 139.346 60.654 168.000 96.000 168.000 L 136.000 168.000 L 136.000 208.000 C 136.000 212.418 139.582 216.000 144.000 216.000 C 148.418 216.000 152.000 212.418 152.000 208.000 L 152.000 56.000 L 176.000 56.000 L 176.000 208.000 C 176.000 212.418 179.582 216.000 184.000 216.000 C 188.418 216.000 192.000 212.418 192.000 208.000 L 192.000 56.000 L 208.000 56.000 C 212.418 56.000 216.000 52.418 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 136.000 152.000 L 96.000 152.000 C 69.490 152.000 48.000 130.510 48.000 104.000 C 48.000 77.490 69.490 56.000 96.000 56.000 L 136.000 56.000 Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
