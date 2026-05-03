package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorDuotoneIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 56.000 L 216.000 112.000 C 216.000 208.000 128.000 232.000 128.000 232.000 C 128.000 232.000 40.000 208.000 40.000 112.000 L 40.000 56.000 C 40.000 51.582 43.582 48.000 48.000 48.000 L 208.000 48.000 C 212.418 48.000 216.000 51.582 216.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 53.920 34.620 C 51.445 31.905 47.438 31.226 44.206 32.972 C 40.974 34.718 39.346 38.442 40.260 42.000 C 35.165 44.816 32.001 50.178 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.460 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.490 239.350 161.400 230.940 187.220 205.000 L 202.110 221.380 C 204.022 223.535 206.945 224.496 209.763 223.895 C 212.580 223.294 214.857 221.225 215.724 218.478 C 216.591 215.730 215.913 212.729 213.950 210.620 ZM 127.990 223.620 C 113.844 218.675 100.672 211.294 89.070 201.810 C 61.820 179.510 48.000 149.300 48.000 112.000 L 48.000 56.000 L 51.710 56.000 L 176.410 193.150 C 162.751 206.794 146.210 217.206 128.000 223.620 ZM 224.000 56.000 L 224.000 112.000 C 224.000 132.580 220.110 151.610 212.440 168.590 C 210.620 172.616 205.881 174.405 201.855 172.585 C 197.829 170.765 196.040 166.026 197.860 162.000 C 204.590 147.110 208.000 130.290 208.000 112.000 L 208.000 56.000 L 98.520 56.000 C 94.102 56.000 90.520 52.418 90.520 48.000 C 90.520 43.582 94.102 40.000 98.520 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
