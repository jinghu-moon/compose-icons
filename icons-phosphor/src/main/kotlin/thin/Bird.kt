package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorThinIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 68.000 C 172.000 72.418 168.418 76.000 164.000 76.000 C 159.582 76.000 156.000 72.418 156.000 68.000 C 156.000 63.582 159.582 60.000 164.000 60.000 C 168.418 60.000 172.000 63.582 172.000 68.000 ZM 236.000 80.000 C 236.001 81.338 235.333 82.588 234.220 83.330 L 212.000 98.140 L 212.000 120.000 C 211.939 175.203 167.203 219.939 112.000 220.000 L 24.000 220.000 C 19.386 220.001 15.180 217.356 13.181 213.197 C 11.183 209.038 11.746 204.102 14.630 200.500 L 100.000 98.080 L 100.000 76.890 C 100.000 45.670 125.000 20.150 155.720 20.000 L 156.000 20.000 C 180.926 19.976 202.861 36.446 209.790 60.390 L 234.220 76.670 C 235.333 77.412 236.001 78.662 236.000 80.000 ZM 224.790 80.000 L 204.110 66.220 C 203.297 65.667 202.711 64.840 202.460 63.890 C 196.947 42.746 177.850 27.994 156.000 28.000 L 155.760 28.000 C 129.430 28.130 108.000 50.060 108.000 76.890 L 108.000 99.520 C 107.999 100.456 107.670 101.362 107.070 102.080 L 20.840 205.560 C 19.911 206.766 19.748 208.395 20.419 209.762 C 21.089 211.129 22.478 211.996 24.000 212.000 L 52.790 212.000 L 124.930 125.440 C 126.368 123.839 128.815 123.662 130.468 125.041 C 132.121 126.419 132.387 128.858 131.070 130.560 L 63.210 212.000 L 112.000 212.000 C 162.787 211.945 203.945 170.787 204.000 120.000 L 204.000 96.000 C 203.999 94.662 204.667 93.412 205.780 92.670 Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
