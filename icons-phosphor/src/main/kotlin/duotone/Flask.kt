package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorDuotoneIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 216.000 L 48.000 216.000 C 45.117 216.001 42.456 214.450 41.035 211.941 C 39.615 209.431 39.655 206.352 41.140 203.880 L 71.620 153.080 L 71.620 153.080 C 84.850 150.600 103.620 151.670 127.990 164.000 C 160.240 180.330 182.740 176.910 195.490 171.650 L 195.490 171.650 L 214.830 203.880 C 216.312 206.347 216.355 209.420 214.942 211.928 C 213.529 214.435 210.878 215.990 208.000 216.000 Z"),
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
        pathData = parseSvgPathData("M 221.690 199.770 L 160.000 96.920 L 160.000 40.000 L 168.000 40.000 C 172.418 40.000 176.000 36.418 176.000 32.000 C 176.000 27.582 172.418 24.000 168.000 24.000 L 88.000 24.000 C 83.582 24.000 80.000 27.582 80.000 32.000 C 80.000 36.418 83.582 40.000 88.000 40.000 L 96.000 40.000 L 96.000 96.920 L 34.310 199.770 C 31.348 204.708 31.268 210.857 34.101 215.871 C 36.933 220.884 42.242 223.989 48.000 224.000 L 208.000 224.000 C 213.764 224.000 219.082 220.899 221.922 215.884 C 224.762 210.868 224.685 204.713 221.720 199.770 ZM 110.860 103.250 C 111.608 102.010 112.002 100.588 112.000 99.140 L 112.000 40.000 L 144.000 40.000 L 144.000 99.140 C 143.998 100.588 144.392 102.010 145.140 103.250 L 183.360 167.000 C 171.360 169.370 154.290 168.370 131.610 156.890 C 115.700 148.840 100.560 144.570 86.390 144.080 ZM 48.000 208.000 L 76.540 160.420 C 90.790 158.690 106.850 162.270 124.360 171.140 C 143.360 180.750 159.360 184.020 172.360 184.020 C 178.972 184.049 185.554 183.140 191.910 181.320 L 208.000 208.000 Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
