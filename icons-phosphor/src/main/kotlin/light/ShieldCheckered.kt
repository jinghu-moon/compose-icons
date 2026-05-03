package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorLightIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 42.000 L 48.000 42.000 C 40.268 42.000 34.000 48.268 34.000 56.000 L 34.000 112.000 C 34.000 163.940 59.120 195.400 80.200 212.640 C 102.930 231.240 125.470 237.530 126.420 237.790 C 127.454 238.072 128.546 238.072 129.580 237.790 C 130.530 237.530 153.070 231.240 175.800 212.640 C 196.880 195.400 222.000 163.940 222.000 112.000 L 222.000 56.000 C 222.000 48.268 215.732 42.000 208.000 42.000 ZM 210.000 56.000 L 210.000 112.000 C 210.000 115.390 209.880 118.720 209.660 122.000 L 134.000 122.000 L 134.000 54.000 L 208.000 54.000 C 209.105 54.000 210.000 54.895 210.000 56.000 ZM 46.000 56.000 C 46.000 54.895 46.895 54.000 48.000 54.000 L 122.000 54.000 L 122.000 122.000 L 46.340 122.000 C 46.120 118.720 46.000 115.390 46.000 112.000 ZM 47.710 134.000 L 122.000 134.000 L 122.000 223.520 C 109.512 218.487 97.859 211.588 87.440 203.060 C 65.500 185.000 52.200 161.800 47.710 134.000 ZM 168.560 203.060 C 158.141 211.588 146.488 218.487 134.000 223.520 L 134.000 134.000 L 208.290 134.000 C 203.800 161.800 190.500 185.000 168.560 203.060 Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
