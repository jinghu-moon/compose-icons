package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorFillIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 176.000 72.000 L 159.920 72.000 C 152.235 71.993 145.631 77.451 144.190 85.000 L 137.640 120.000 L 168.000 120.000 C 172.418 120.000 176.000 123.582 176.000 128.000 C 176.000 132.418 172.418 136.000 168.000 136.000 L 134.640 136.000 L 127.530 173.900 C 124.691 189.033 111.477 199.999 96.080 200.000 L 80.000 200.000 C 75.582 200.000 72.000 196.418 72.000 192.000 C 72.000 187.582 75.582 184.000 80.000 184.000 L 96.080 184.000 C 103.765 184.007 110.369 178.549 111.810 171.000 L 118.360 136.000 L 88.000 136.000 C 83.582 136.000 80.000 132.418 80.000 128.000 C 80.000 123.582 83.582 120.000 88.000 120.000 L 121.360 120.000 L 128.470 82.100 C 131.309 66.967 144.523 56.001 159.920 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 C 184.000 68.418 180.418 72.000 176.000 72.000 Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
