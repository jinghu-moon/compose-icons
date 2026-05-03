package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorThinIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 L 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 218.610 C 121.670 212.520 105.000 194.200 96.730 164.000 L 159.270 164.000 C 151.000 194.200 134.330 212.520 128.000 218.610 ZM 94.820 156.000 C 91.060 137.523 91.060 118.477 94.820 100.000 L 161.180 100.000 C 164.940 118.477 164.940 137.523 161.180 156.000 ZM 128.000 37.390 C 134.330 43.480 151.000 61.800 159.270 92.000 L 96.730 92.000 C 105.000 61.800 121.670 43.480 128.000 37.390 ZM 169.410 100.000 L 215.640 100.000 C 221.453 118.214 221.453 137.786 215.640 156.000 L 169.410 156.000 C 172.863 137.493 172.863 118.507 169.410 100.000 ZM 212.660 92.000 L 167.660 92.000 C 162.613 71.422 152.589 52.398 138.470 36.600 C 171.348 40.420 199.659 61.561 212.660 92.000 ZM 117.540 36.600 C 103.421 52.398 93.397 71.422 88.350 92.000 L 43.350 92.000 C 56.351 61.561 84.662 40.420 117.540 36.600 ZM 40.360 100.000 L 86.590 100.000 C 83.137 118.507 83.137 137.493 86.590 156.000 L 40.360 156.000 C 34.547 137.786 34.547 118.214 40.360 100.000 ZM 43.360 164.000 L 88.360 164.000 C 93.407 184.578 103.431 203.602 117.550 219.400 C 84.665 215.587 56.344 194.445 43.340 164.000 ZM 138.480 219.400 C 152.592 203.600 162.609 184.576 167.650 164.000 L 212.650 164.000 C 199.649 194.439 171.338 215.580 138.460 219.400 Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
