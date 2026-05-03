package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorLightIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.650 121.640 L 181.380 40.230 C 178.782 36.336 174.411 33.999 169.730 34.000 L 86.270 34.000 C 81.589 33.999 77.218 36.336 74.620 40.230 L 20.350 121.640 C 18.104 125.008 17.425 129.184 18.490 133.090 L 39.930 211.680 C 41.589 217.770 47.118 221.997 53.430 222.000 L 80.000 222.000 C 87.732 222.000 94.000 215.732 94.000 208.000 L 94.000 190.000 L 162.000 190.000 L 162.000 208.000 C 162.000 215.732 168.268 222.000 176.000 222.000 L 202.570 222.000 C 208.882 221.997 214.411 217.770 216.070 211.680 L 237.510 133.090 C 238.575 129.184 237.896 125.008 235.650 121.640 ZM 80.000 178.000 C 78.895 178.000 78.000 177.105 78.000 176.000 L 78.000 65.490 L 106.000 82.000 L 106.000 136.000 C 106.000 139.314 108.686 142.000 112.000 142.000 C 115.314 142.000 118.000 139.314 118.000 136.000 L 118.000 89.070 L 125.000 93.170 C 126.882 94.281 129.218 94.281 131.100 93.170 L 138.050 89.070 L 138.050 128.000 C 138.050 131.314 140.736 134.000 144.050 134.000 C 147.364 134.000 150.050 131.314 150.050 128.000 L 150.050 82.000 L 178.050 65.490 L 178.050 176.000 C 178.050 177.105 177.155 178.000 176.050 178.000 ZM 86.270 46.000 L 169.730 46.000 C 170.397 46.001 171.020 46.335 171.390 46.890 L 175.490 53.040 L 128.000 81.000 L 80.510 53.000 L 84.610 46.850 C 84.989 46.310 85.610 45.992 86.270 46.000 ZM 82.000 208.000 C 82.000 209.105 81.105 210.000 80.000 210.000 L 53.430 210.000 C 52.533 209.996 51.748 209.395 51.510 208.530 L 30.070 129.930 C 29.921 129.373 30.019 128.779 30.340 128.300 L 66.000 74.800 L 66.000 176.000 C 66.000 183.732 72.268 190.000 80.000 190.000 L 82.000 190.000 ZM 225.930 129.930 L 204.490 208.530 C 204.252 209.395 203.467 209.996 202.570 210.000 L 176.000 210.000 C 174.895 210.000 174.000 209.105 174.000 208.000 L 174.000 190.000 L 176.000 190.000 C 183.732 190.000 190.000 183.732 190.000 176.000 L 190.000 74.800 L 225.660 128.300 C 225.981 128.779 226.079 129.373 225.930 129.930 Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
