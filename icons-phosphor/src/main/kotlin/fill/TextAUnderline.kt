package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorFillIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.730 120.000 L 107.270 120.000 L 128.000 75.090 ZM 216.000 32.000 L 216.000 224.000 C 216.000 228.418 212.418 232.000 208.000 232.000 L 48.000 232.000 C 43.582 232.000 40.000 228.418 40.000 224.000 L 40.000 32.000 C 40.000 27.582 43.582 24.000 48.000 24.000 L 208.000 24.000 C 212.418 24.000 216.000 27.582 216.000 32.000 ZM 76.650 167.260 C 80.660 169.108 85.408 167.358 87.260 163.350 L 99.890 136.000 L 156.110 136.000 L 168.740 163.350 C 170.677 167.206 175.323 168.832 179.241 167.024 C 183.159 165.216 184.938 160.626 183.260 156.650 L 135.260 52.650 C 133.951 49.821 131.117 48.010 128.000 48.010 C 124.883 48.010 122.049 49.821 120.740 52.650 L 72.740 156.650 C 70.892 160.660 72.642 165.408 76.650 167.260 ZM 200.000 192.000 C 200.000 187.582 196.418 184.000 192.000 184.000 L 64.000 184.000 C 59.582 184.000 56.000 187.582 56.000 192.000 C 56.000 196.418 59.582 200.000 64.000 200.000 L 192.000 200.000 C 196.418 200.000 200.000 196.418 200.000 192.000 Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
