package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorDuotoneIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 48.000 L 128.000 128.000 L 40.870 128.000 C 40.288 122.687 39.997 117.345 40.000 112.000 L 40.000 56.000 C 40.000 51.582 43.582 48.000 48.000 48.000 ZM 128.000 128.000 L 128.000 232.000 C 128.000 232.000 206.060 210.700 215.130 128.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.460 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.460 154.040 233.050 177.130 214.190 C 198.480 196.670 224.000 164.720 224.000 112.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 120.000 220.550 C 108.872 215.765 98.463 209.458 89.070 201.810 C 67.920 184.510 54.870 162.440 50.070 136.000 L 120.000 136.000 ZM 120.000 120.000 L 48.230 120.000 C 48.080 117.370 48.000 114.710 48.000 112.000 L 48.000 56.000 L 120.000 56.000 ZM 167.400 201.420 C 157.881 209.231 147.311 215.664 136.000 220.530 L 136.000 136.000 L 205.910 136.000 C 201.160 162.240 188.270 184.180 167.400 201.420 ZM 208.000 112.000 C 208.000 114.710 207.920 117.370 207.770 120.000 L 136.000 120.000 L 136.000 56.000 L 208.000 56.000 Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
