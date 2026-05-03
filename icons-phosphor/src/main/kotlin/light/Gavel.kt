package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorLightIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.910 118.100 L 225.910 102.100 C 220.535 96.732 211.860 96.630 206.360 101.870 L 154.130 49.640 C 159.370 44.140 159.268 35.465 153.900 30.090 L 137.900 14.090 C 135.274 11.464 131.713 9.989 128.000 9.989 C 124.287 9.989 120.726 11.464 118.100 14.090 L 54.100 78.090 C 51.474 80.716 49.999 84.277 49.999 87.990 C 49.999 91.703 51.474 95.264 54.100 97.890 L 70.100 113.890 C 75.475 119.258 84.150 119.360 89.650 114.120 L 99.520 124.000 L 32.730 190.790 C 24.518 199.878 24.870 213.808 33.530 222.471 C 42.189 231.133 56.119 231.489 65.210 223.280 L 132.000 156.490 L 141.870 166.360 C 136.630 171.860 136.732 180.535 142.100 185.910 L 158.100 201.910 C 160.726 204.536 164.287 206.011 168.000 206.011 C 171.713 206.011 175.274 204.536 177.900 201.910 L 241.900 137.910 C 244.530 135.285 246.009 131.723 246.011 128.007 C 246.013 124.291 244.538 120.727 241.910 118.100 ZM 150.350 157.860 L 98.140 105.660 L 145.660 58.140 L 197.860 110.340 ZM 78.590 105.410 L 62.590 89.410 C 62.214 89.035 62.003 88.526 62.003 87.995 C 62.003 87.464 62.214 86.955 62.590 86.580 L 126.590 22.580 C 126.965 22.204 127.474 21.993 128.005 21.993 C 128.536 21.993 129.045 22.204 129.420 22.580 L 145.420 38.580 C 145.796 38.955 146.007 39.464 146.007 39.995 C 146.007 40.526 145.796 41.035 145.420 41.410 L 81.420 105.410 C 81.045 105.786 80.536 105.997 80.005 105.997 C 79.474 105.997 78.965 105.786 78.590 105.410 ZM 56.730 214.800 C 52.371 218.601 45.813 218.376 41.723 214.287 C 37.634 210.197 37.409 203.639 41.210 199.280 L 108.000 132.490 L 123.520 148.000 ZM 233.420 129.420 L 169.420 193.420 C 169.045 193.796 168.536 194.007 168.005 194.007 C 167.474 194.007 166.965 193.796 166.590 193.420 L 150.590 177.420 C 150.214 177.045 150.003 176.536 150.003 176.005 C 150.003 175.474 150.214 174.965 150.590 174.590 L 214.590 110.590 C 214.965 110.214 215.474 110.003 216.005 110.003 C 216.536 110.003 217.045 110.214 217.420 110.590 L 233.420 126.590 C 233.796 126.965 234.007 127.474 234.007 128.005 C 234.007 128.536 233.796 129.045 233.420 129.420 Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
