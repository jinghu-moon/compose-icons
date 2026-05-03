package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorLightIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.720 67.910 L 134.720 19.730 C 130.538 17.420 125.462 17.420 121.280 19.730 L 33.280 67.910 C 28.795 70.364 26.004 75.068 26.000 80.180 L 26.000 175.820 C 26.004 180.932 28.795 185.636 33.280 188.090 L 121.280 236.270 C 125.463 238.576 130.537 238.576 134.720 236.270 L 222.720 188.090 C 227.205 185.636 229.996 180.932 230.000 175.820 L 230.000 80.180 C 229.996 75.068 227.205 70.364 222.720 67.910 ZM 127.000 30.250 C 127.598 29.923 128.322 29.923 128.920 30.250 L 212.510 76.000 L 178.570 94.570 L 94.050 48.310 ZM 122.000 223.000 L 39.000 177.570 C 38.376 177.210 37.994 176.541 38.000 175.820 L 38.000 86.660 L 122.000 132.660 ZM 43.490 76.000 L 81.560 55.150 L 166.070 101.410 L 128.000 122.240 ZM 218.000 175.820 C 218.006 176.541 217.624 177.210 217.000 177.570 L 217.000 177.570 L 134.000 223.000 L 134.000 132.640 L 170.000 112.930 L 170.000 152.000 C 170.000 155.314 172.686 158.000 176.000 158.000 C 179.314 158.000 182.000 155.314 182.000 152.000 L 182.000 106.370 L 218.000 86.660 Z"),
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
        return _package!!
    }

private var _package: ImageVector? = null
