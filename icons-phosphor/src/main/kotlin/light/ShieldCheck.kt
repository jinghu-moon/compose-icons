package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorLightIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 42.000 L 48.000 42.000 C 40.268 42.000 34.000 48.268 34.000 56.000 L 34.000 112.000 C 34.000 163.940 59.120 195.400 80.200 212.640 C 102.930 231.240 125.470 237.530 126.420 237.790 C 127.454 238.072 128.546 238.072 129.580 237.790 C 130.530 237.530 153.070 231.240 175.800 212.640 C 196.880 195.400 222.000 163.940 222.000 112.000 L 222.000 56.000 C 222.000 48.268 215.732 42.000 208.000 42.000 ZM 210.000 112.000 C 210.000 149.760 196.060 180.390 168.560 203.060 C 156.496 212.967 142.761 220.640 128.000 225.720 C 113.237 220.645 99.501 212.971 87.440 203.060 C 59.940 180.390 46.000 149.760 46.000 112.000 L 46.000 56.000 C 46.000 54.895 46.895 54.000 48.000 54.000 L 208.000 54.000 C 209.105 54.000 210.000 54.895 210.000 56.000 ZM 172.240 99.760 C 174.580 102.103 174.580 105.897 172.240 108.240 L 116.240 164.240 C 113.897 166.580 110.103 166.580 107.760 164.240 L 83.760 140.240 C 81.557 137.876 81.622 134.192 83.907 131.907 C 86.192 129.622 89.876 129.557 92.240 131.760 L 112.000 151.510 L 163.760 99.760 C 166.103 97.420 169.897 97.420 172.240 99.760 Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
