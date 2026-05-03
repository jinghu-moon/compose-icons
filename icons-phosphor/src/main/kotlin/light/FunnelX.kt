package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorLightIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.790 50.340 C 226.587 45.245 221.551 41.961 216.000 42.000 L 40.000 42.000 C 34.463 42.011 29.452 45.284 27.217 50.350 C 24.983 55.416 25.944 61.324 29.670 65.420 L 29.730 65.480 L 98.000 138.380 L 98.000 216.000 C 98.005 221.160 100.847 225.898 105.396 228.332 C 109.946 230.766 115.466 230.500 119.760 227.640 L 151.760 206.310 C 155.657 203.715 157.999 199.342 158.000 194.660 L 158.000 138.380 L 226.340 65.380 C 230.094 61.309 231.058 55.392 228.790 50.340 ZM 217.530 57.280 L 147.630 131.900 C 146.586 133.010 146.003 134.476 146.000 136.000 L 146.000 194.660 C 146.002 195.331 145.668 195.958 145.110 196.330 L 113.110 217.660 C 112.497 218.069 111.708 218.108 111.058 217.761 C 110.408 217.414 110.001 216.737 110.000 216.000 L 110.000 136.000 C 110.000 134.477 109.421 133.012 108.380 131.900 L 38.530 57.320 C 37.986 56.748 37.855 55.899 38.200 55.190 C 38.497 54.460 39.212 53.987 40.000 54.000 L 216.000 54.000 C 216.796 53.976 217.523 54.451 217.820 55.190 C 218.163 55.880 218.048 56.710 217.530 57.280 ZM 244.240 211.770 C 245.845 213.266 246.506 215.518 245.963 217.644 C 245.420 219.770 243.760 221.430 241.634 221.973 C 239.508 222.516 237.256 221.855 235.760 220.250 L 216.000 200.490 L 196.250 220.250 C 193.903 222.562 190.130 222.549 187.799 220.221 C 185.468 217.892 185.451 214.120 187.760 211.770 L 207.520 192.000 L 187.760 172.240 C 185.416 169.896 185.416 166.094 187.760 163.750 C 190.104 161.406 193.906 161.406 196.250 163.750 L 216.000 183.520 L 235.760 163.760 C 238.110 161.451 241.882 161.468 244.211 163.799 C 246.539 166.130 246.552 169.903 244.240 172.250 L 224.490 192.000 Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
