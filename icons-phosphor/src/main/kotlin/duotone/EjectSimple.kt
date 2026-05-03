package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorDuotoneIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 215.920 152.000 L 40.080 152.000 C 36.963 151.987 34.130 150.187 32.794 147.371 C 31.458 144.555 31.857 141.222 33.820 138.800 L 115.480 38.000 C 118.537 34.234 123.129 32.047 127.980 32.047 C 132.831 32.047 137.423 34.234 140.480 38.000 L 222.180 138.800 C 224.143 141.222 224.542 144.555 223.206 147.371 C 221.870 150.187 219.037 151.987 215.920 152.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 232.000 200.000 C 232.000 204.418 228.418 208.000 224.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 C 24.000 195.582 27.582 192.000 32.000 192.000 L 224.000 192.000 C 228.418 192.000 232.000 195.582 232.000 200.000 ZM 25.590 150.840 C 22.885 145.245 23.665 138.589 27.590 133.770 L 109.260 32.940 C 113.838 27.285 120.724 23.999 128.000 23.999 C 135.276 23.999 142.162 27.285 146.740 32.940 L 228.390 133.770 C 232.291 138.589 233.078 145.219 230.415 150.817 C 227.751 156.415 222.110 159.987 215.910 160.000 L 40.090 160.000 C 33.890 160.014 28.240 156.445 25.590 150.840 ZM 40.000 143.910 C 40.000 143.910 40.000 144.000 40.080 144.020 L 215.910 144.020 C 215.910 144.020 215.990 143.930 215.990 143.890 L 134.300 43.000 C 132.762 41.097 130.447 39.991 128.000 39.991 C 125.553 39.991 123.238 41.097 121.700 43.000 L 40.000 143.840 C 39.997 143.863 39.997 143.887 40.000 143.910 Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
