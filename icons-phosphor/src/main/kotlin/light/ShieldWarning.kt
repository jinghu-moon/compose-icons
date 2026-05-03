package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorLightIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 122.000 136.000 L 122.000 96.000 C 122.000 92.686 124.686 90.000 128.000 90.000 C 131.314 90.000 134.000 92.686 134.000 96.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 ZM 128.000 162.000 C 122.477 162.000 118.000 166.477 118.000 172.000 C 118.000 177.523 122.477 182.000 128.000 182.000 C 133.523 182.000 138.000 177.523 138.000 172.000 C 138.000 166.477 133.523 162.000 128.000 162.000 ZM 222.000 56.000 L 222.000 112.000 C 222.000 163.940 196.880 195.400 175.800 212.640 C 153.070 231.240 130.530 237.530 129.580 237.790 C 128.546 238.072 127.454 238.072 126.420 237.790 C 125.420 237.530 102.930 231.240 80.200 212.640 C 59.120 195.400 34.000 163.940 34.000 112.000 L 34.000 56.000 C 34.000 48.268 40.268 42.000 48.000 42.000 L 208.000 42.000 C 215.732 42.000 222.000 48.268 222.000 56.000 ZM 210.000 56.000 C 210.000 54.895 209.105 54.000 208.000 54.000 L 48.000 54.000 C 46.895 54.000 46.000 54.895 46.000 56.000 L 46.000 112.000 C 46.000 149.750 59.940 180.390 87.440 203.060 C 99.501 212.971 113.237 220.645 128.000 225.720 C 142.761 220.640 156.496 212.967 168.560 203.060 C 196.060 180.390 210.000 149.750 210.000 112.000 Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
