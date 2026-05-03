package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorBoldIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.070 31.120 C 211.166 26.664 203.577 27.026 199.120 31.930 L 195.420 36.000 L 128.000 36.000 C 92.178 35.982 59.606 56.770 44.537 89.269 C 29.467 121.767 34.643 160.059 57.800 187.390 L 39.120 207.930 C 36.175 211.093 35.159 215.595 36.459 219.716 C 37.759 223.838 41.175 226.942 45.401 227.843 C 49.628 228.744 54.012 227.303 56.880 224.070 L 75.550 203.540 C 90.932 214.274 109.243 220.020 128.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 214.627 212.000 208.000 C 212.000 201.373 206.627 196.000 200.000 196.000 L 128.000 196.000 C 115.215 196.014 102.690 192.397 91.880 185.570 L 133.310 140.000 L 200.000 140.000 C 206.627 140.000 212.000 134.627 212.000 128.000 C 212.000 121.373 206.627 116.000 200.000 116.000 L 155.130 116.000 L 216.880 48.070 C 221.336 43.166 220.974 35.577 216.070 31.120 ZM 74.130 169.420 C 67.498 160.799 63.039 150.708 61.130 140.000 L 100.920 140.000 ZM 61.080 116.000 C 66.927 83.617 95.093 60.047 128.000 60.000 L 173.600 60.000 L 122.690 116.000 Z"),
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
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
