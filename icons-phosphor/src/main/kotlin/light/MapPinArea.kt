package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorLightIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 114.000 80.000 C 114.000 72.268 120.268 66.000 128.000 66.000 C 135.732 66.000 142.000 72.268 142.000 80.000 C 142.000 87.732 135.732 94.000 128.000 94.000 C 120.268 94.000 114.000 87.732 114.000 80.000 ZM 66.000 80.000 C 66.000 45.758 93.758 18.000 128.000 18.000 C 162.242 18.000 190.000 45.758 190.000 80.000 C 190.000 138.810 133.390 171.830 131.000 173.210 C 129.144 174.282 126.856 174.282 125.000 173.210 C 122.610 171.830 66.000 138.810 66.000 80.000 ZM 78.000 80.000 C 78.000 124.520 116.810 153.490 128.000 160.910 C 139.180 153.490 178.000 124.530 178.000 80.000 C 178.000 52.386 155.614 30.000 128.000 30.000 C 100.386 30.000 78.000 52.386 78.000 80.000 ZM 202.080 149.510 C 200.053 148.690 197.740 149.038 196.043 150.418 C 194.347 151.798 193.536 153.992 193.926 156.143 C 194.317 158.295 195.847 160.064 197.920 160.760 C 215.500 167.250 226.000 175.940 226.000 184.000 C 226.000 200.080 185.750 218.000 128.000 218.000 C 70.250 218.000 30.000 200.080 30.000 184.000 C 30.000 175.940 40.500 167.250 58.080 160.760 C 60.153 160.064 61.683 158.295 62.074 156.143 C 62.464 153.992 61.653 151.798 59.957 150.418 C 58.260 149.038 55.947 148.690 53.920 149.510 C 30.760 158.060 18.000 170.310 18.000 184.000 C 18.000 197.340 30.180 209.380 52.310 217.880 C 72.620 225.700 99.500 230.000 128.000 230.000 C 156.500 230.000 183.380 225.700 203.690 217.880 C 225.820 209.380 238.000 197.340 238.000 184.000 C 238.000 170.310 225.240 158.060 202.080 149.510 Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
