package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorLightIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.720 67.900 L 134.720 19.730 C 130.538 17.420 125.462 17.420 121.280 19.730 L 33.280 67.910 C 28.795 70.364 26.004 75.068 26.000 80.180 L 26.000 175.820 C 26.004 180.932 28.795 185.636 33.280 188.090 L 121.280 236.270 C 125.463 238.576 130.537 238.576 134.720 236.270 L 222.720 188.090 C 227.205 185.636 229.996 180.932 230.000 175.820 L 230.000 80.180 C 229.999 75.064 227.208 70.356 222.720 67.900 ZM 127.000 30.250 C 127.598 29.923 128.322 29.923 128.920 30.250 L 212.510 76.000 L 128.000 122.240 L 43.490 76.000 ZM 39.000 177.570 C 38.376 177.210 37.994 176.541 38.000 175.820 L 38.000 86.660 L 122.000 132.660 L 122.000 223.000 ZM 216.920 177.570 L 134.000 223.000 L 134.000 132.640 L 218.000 86.640 L 218.000 175.800 C 218.014 176.528 217.631 177.206 217.000 177.570 Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
