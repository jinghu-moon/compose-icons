package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorLightIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 110.000 116.000 C 110.000 121.523 105.523 126.000 100.000 126.000 C 94.477 126.000 90.000 121.523 90.000 116.000 C 90.000 110.477 94.477 106.000 100.000 106.000 C 105.523 106.000 110.000 110.477 110.000 116.000 ZM 156.000 106.000 C 150.477 106.000 146.000 110.477 146.000 116.000 C 146.000 121.523 150.477 126.000 156.000 126.000 C 161.523 126.000 166.000 121.523 166.000 116.000 C 166.000 110.477 161.523 106.000 156.000 106.000 ZM 222.000 120.000 L 222.000 216.000 C 221.999 218.318 220.662 220.428 218.568 221.420 C 216.473 222.411 213.994 222.108 212.200 220.640 L 186.670 199.750 L 161.130 220.640 C 158.920 222.449 155.740 222.449 153.530 220.640 L 128.000 199.750 L 102.470 220.640 C 100.260 222.449 97.080 222.449 94.870 220.640 L 69.330 199.750 L 43.800 220.640 C 42.006 222.108 39.527 222.411 37.432 221.420 C 35.338 220.428 34.001 218.318 34.000 216.000 L 34.000 120.000 C 34.000 68.085 76.085 26.000 128.000 26.000 C 179.915 26.000 222.000 68.085 222.000 120.000 ZM 210.000 120.000 C 210.000 74.713 173.287 38.000 128.000 38.000 C 82.713 38.000 46.000 74.713 46.000 120.000 L 46.000 203.340 L 65.530 187.340 C 67.740 185.531 70.920 185.531 73.130 187.340 L 98.670 208.230 L 124.200 187.340 C 126.410 185.531 129.590 185.531 131.800 187.340 L 157.330 208.230 L 182.870 187.340 C 185.080 185.531 188.260 185.531 190.470 187.340 L 210.000 203.340 Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
