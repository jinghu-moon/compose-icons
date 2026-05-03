package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorLightIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.720 67.910 L 134.720 19.730 C 130.538 17.420 125.462 17.420 121.280 19.730 L 33.280 67.910 C 28.795 70.364 26.004 75.068 26.000 80.180 L 26.000 175.820 C 26.004 180.932 28.795 185.636 33.280 188.090 L 121.280 236.270 C 125.463 238.576 130.537 238.576 134.720 236.270 L 222.720 188.090 C 227.205 185.636 229.996 180.932 230.000 175.820 L 230.000 80.180 C 229.996 75.068 227.205 70.364 222.720 67.910 ZM 218.000 175.820 C 218.006 176.541 217.624 177.210 217.000 177.570 L 129.000 225.750 C 128.402 226.077 127.678 226.077 127.080 225.750 L 39.000 177.570 C 38.376 177.210 37.994 176.541 38.000 175.820 L 38.000 80.180 C 37.994 79.459 38.376 78.790 39.000 78.430 L 127.000 30.250 C 127.598 29.923 128.322 29.923 128.920 30.250 L 216.920 78.430 C 217.544 78.790 217.926 79.459 217.920 80.180 Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
