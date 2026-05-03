package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorBoldIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 203.630 62.650 L 216.880 48.070 C 221.241 43.154 220.837 35.645 215.974 31.226 C 211.111 26.806 203.598 27.120 199.120 31.930 L 185.880 46.490 C 144.642 17.403 88.194 23.600 54.248 60.940 C 20.302 98.281 19.497 155.062 52.370 193.350 L 39.120 207.930 C 36.175 211.093 35.159 215.595 36.459 219.716 C 37.759 223.838 41.175 226.942 45.401 227.843 C 49.628 228.744 54.012 227.303 56.880 224.070 L 70.120 209.510 C 111.358 238.597 167.806 232.400 201.752 195.060 C 235.698 157.719 236.503 100.938 203.630 62.650 ZM 52.000 128.000 C 51.976 100.086 67.269 74.410 91.823 61.134 C 116.378 47.858 146.237 49.124 169.580 64.430 L 68.670 175.430 C 57.865 161.985 51.983 145.249 52.000 128.000 ZM 128.000 204.000 C 113.222 204.014 98.765 199.692 86.420 191.570 L 187.330 80.570 C 205.601 103.369 209.172 134.627 196.515 160.959 C 183.858 187.292 157.216 204.027 128.000 204.000 Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
