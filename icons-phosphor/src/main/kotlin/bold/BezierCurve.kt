package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorBoldIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.280 141.000 C 218.869 121.930 207.945 104.883 192.880 92.000 L 240.000 92.000 C 246.627 92.000 252.000 86.627 252.000 80.000 C 252.000 73.373 246.627 68.000 240.000 68.000 L 161.940 68.000 C 156.854 53.618 143.255 44.003 128.000 44.003 C 112.745 44.003 99.146 53.618 94.060 68.000 L 16.000 68.000 C 9.373 68.000 4.000 73.373 4.000 80.000 C 4.000 86.627 9.373 92.000 16.000 92.000 L 63.120 92.000 C 48.055 104.883 37.131 121.930 31.720 141.000 C 14.706 145.053 3.067 160.748 4.129 178.205 C 5.191 195.663 18.646 209.832 36.026 211.793 C 53.405 213.754 69.680 202.941 74.605 186.159 C 79.531 169.377 71.683 151.483 56.000 143.740 C 62.854 123.616 77.758 107.242 97.150 98.530 C 103.661 109.355 115.368 115.975 128.000 115.975 C 140.632 115.975 152.339 109.355 158.850 98.530 C 178.242 107.242 193.146 123.616 200.000 143.740 C 184.317 151.483 176.469 169.377 181.395 186.159 C 186.320 202.941 202.595 213.754 219.974 211.793 C 237.354 209.832 250.809 195.663 251.871 178.205 C 252.933 160.748 241.294 145.053 224.280 141.000 ZM 40.000 188.000 C 33.373 188.000 28.000 182.627 28.000 176.000 C 28.000 169.373 33.373 164.000 40.000 164.000 C 46.627 164.000 52.000 169.373 52.000 176.000 C 52.000 182.627 46.627 188.000 40.000 188.000 ZM 128.000 92.000 C 121.373 92.000 116.000 86.627 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 C 140.000 86.627 134.627 92.000 128.000 92.000 ZM 216.000 188.000 C 209.373 188.000 204.000 182.627 204.000 176.000 C 204.000 169.373 209.373 164.000 216.000 164.000 C 222.627 164.000 228.000 169.373 228.000 176.000 C 228.000 182.627 222.627 188.000 216.000 188.000 Z"),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
