package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorRegularIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.200 151.870 L 237.200 151.870 C 236.532 150.006 235.747 148.185 234.850 146.420 L 193.260 51.800 C 192.867 50.889 192.303 50.061 191.600 49.360 C 185.599 43.357 177.458 39.985 168.970 39.985 C 160.482 39.985 152.341 43.357 146.340 49.360 C 144.845 50.857 144.004 52.885 144.000 55.000 L 144.000 80.000 L 112.000 80.000 L 112.000 55.000 C 112.002 52.878 111.160 50.842 109.660 49.340 C 103.659 43.337 95.518 39.965 87.030 39.965 C 78.542 39.965 70.401 43.337 64.400 49.340 C 63.697 50.041 63.133 50.869 62.740 51.780 L 21.150 146.400 C 20.253 148.165 19.468 149.986 18.800 151.850 L 18.800 151.850 C 12.363 169.861 17.233 189.975 31.197 203.047 C 45.161 216.118 65.552 219.651 83.100 212.041 C 100.647 204.430 112.002 187.127 112.000 168.000 L 112.000 96.000 L 144.000 96.000 L 144.000 168.000 C 143.990 187.129 155.340 204.438 172.888 212.055 C 190.436 219.672 210.831 216.142 224.798 203.071 C 238.765 190.000 243.638 169.884 237.200 151.870 ZM 76.710 59.750 C 82.191 55.135 90.071 54.727 96.000 58.750 L 96.000 132.260 C 83.288 120.846 65.460 117.066 49.210 122.340 ZM 64.000 200.000 C 46.327 200.000 32.000 185.673 32.000 168.000 C 32.000 150.327 46.327 136.000 64.000 136.000 C 81.673 136.000 96.000 150.327 96.000 168.000 C 96.000 185.673 81.673 200.000 64.000 200.000 ZM 160.000 58.740 C 165.929 54.717 173.809 55.125 179.290 59.740 L 206.790 122.320 C 190.539 117.049 172.710 120.832 160.000 132.250 ZM 192.000 200.000 C 174.327 200.000 160.000 185.673 160.000 168.000 C 160.000 150.327 174.327 136.000 192.000 136.000 C 209.673 136.000 224.000 150.327 224.000 168.000 C 224.000 185.673 209.673 200.000 192.000 200.000 Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
