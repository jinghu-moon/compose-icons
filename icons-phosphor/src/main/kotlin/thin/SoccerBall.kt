package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorThinIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 168.870 175.420 L 157.180 159.330 L 171.130 118.690 L 190.060 112.540 L 219.710 135.280 C 218.600 149.483 214.182 163.229 206.810 175.420 ZM 87.130 175.420 L 49.190 175.420 C 41.818 163.229 37.400 149.483 36.290 135.280 L 65.940 112.540 L 84.870 118.690 L 98.820 159.330 ZM 51.690 76.660 L 60.560 106.580 L 36.000 125.390 C 36.482 107.984 41.925 91.077 51.690 76.660 ZM 106.130 156.000 L 92.770 117.080 L 128.000 92.850 L 163.230 117.080 L 149.870 156.000 ZM 195.440 106.580 L 204.310 76.660 C 214.075 91.077 219.518 107.984 220.000 125.390 ZM 198.310 68.740 L 187.590 104.930 L 168.590 111.090 L 132.000 85.900 L 132.000 66.100 L 164.680 43.640 C 177.666 49.318 189.172 57.906 198.310 68.740 ZM 155.540 40.210 L 128.000 59.150 L 100.460 40.210 C 118.391 34.597 137.609 34.597 155.540 40.210 ZM 91.320 43.640 L 124.000 66.100 L 124.000 85.900 L 87.360 111.090 L 68.360 104.930 L 57.690 68.740 C 66.828 57.906 78.334 49.318 91.320 43.640 ZM 54.610 183.420 L 86.340 183.420 L 97.440 214.780 C 80.405 208.738 65.515 197.835 54.610 183.420 ZM 106.910 217.560 L 93.640 180.060 L 105.320 164.000 L 150.680 164.000 L 162.360 180.060 L 149.090 217.560 C 135.218 220.813 120.782 220.813 106.910 217.560 ZM 158.560 214.780 L 169.660 183.420 L 201.390 183.420 C 190.485 197.835 175.595 208.738 158.560 214.780 Z"),
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
