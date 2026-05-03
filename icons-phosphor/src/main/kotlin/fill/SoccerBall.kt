package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorFillIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 136.000 63.380 L 160.790 46.330 C 174.983 52.047 187.450 61.351 196.970 73.330 L 188.970 100.270 C 188.770 100.270 188.560 100.370 188.360 100.440 L 165.540 107.850 C 165.198 107.959 164.863 108.093 164.540 108.250 L 136.000 88.620 C 136.000 88.420 136.000 88.210 136.000 88.000 L 136.000 64.000 C 136.000 63.790 136.000 63.580 136.000 63.380 ZM 95.240 46.330 L 120.000 63.380 C 120.000 63.580 120.000 63.790 120.000 64.000 L 120.000 88.000 C 120.000 88.210 120.000 88.420 120.000 88.620 L 91.440 108.290 C 91.117 108.133 90.782 107.999 90.440 107.890 L 67.620 100.480 C 67.420 100.410 67.210 100.360 67.010 100.310 L 59.010 73.370 C 68.539 61.369 81.024 52.051 95.240 46.330 ZM 82.240 175.420 L 53.900 175.420 C 45.604 162.522 40.848 147.668 40.110 132.350 L 62.110 115.470 C 62.299 115.554 62.493 115.627 62.690 115.690 L 85.520 123.110 C 85.825 123.202 86.136 123.276 86.450 123.330 L 97.240 154.750 C 97.090 154.930 96.940 155.110 96.800 155.300 L 82.700 174.710 C 82.534 174.938 82.380 175.175 82.240 175.420 ZM 150.690 213.000 C 135.822 216.960 120.178 216.960 105.310 213.000 L 95.250 184.600 C 95.380 184.440 95.520 184.290 95.640 184.120 L 109.750 164.700 C 109.916 164.475 110.070 164.242 110.210 164.000 L 145.790 164.000 C 145.930 164.242 146.084 164.475 146.250 164.700 L 160.360 184.120 C 160.480 184.290 160.620 184.440 160.750 184.600 ZM 173.760 175.390 C 173.620 175.145 173.466 174.908 173.300 174.680 L 159.190 155.300 C 159.050 155.110 158.900 154.930 158.750 154.750 L 169.540 123.330 C 169.854 123.276 170.165 123.202 170.470 123.110 L 193.300 115.690 C 193.497 115.627 193.691 115.554 193.880 115.470 L 215.880 132.350 C 215.142 147.668 210.386 162.522 202.090 175.420 Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
