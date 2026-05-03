package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorBoldIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.450 69.310 C 245.424 67.262 240.590 67.649 236.940 70.310 L 212.000 88.430 L 212.000 72.000 C 212.000 60.954 203.046 52.000 192.000 52.000 L 123.880 52.000 C 117.253 52.000 111.880 57.373 111.880 64.000 C 111.880 70.627 117.253 76.000 123.880 76.000 L 188.000 76.000 L 188.000 144.000 C 188.002 147.624 189.641 151.053 192.460 153.330 C 192.610 153.460 192.770 153.580 192.940 153.710 L 236.940 185.710 C 240.591 188.366 245.424 188.749 249.447 186.699 C 253.470 184.649 256.002 180.515 256.000 176.000 L 256.000 80.000 C 256.000 75.489 253.469 71.359 249.450 69.310 ZM 232.000 152.430 L 212.000 137.890 L 212.000 118.110 L 232.000 103.570 ZM 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 42.690 52.000 L 32.000 52.000 C 20.954 52.000 12.000 60.954 12.000 72.000 L 12.000 184.000 C 12.000 195.046 20.954 204.000 32.000 204.000 L 180.870 204.000 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 36.000 180.000 L 36.000 76.000 L 64.510 76.000 L 159.060 180.000 Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
