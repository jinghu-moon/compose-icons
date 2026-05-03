package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorRegularIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 157.730 113.130 C 156.529 111.378 156.075 109.219 156.467 107.132 C 156.859 105.044 158.065 103.197 159.820 102.000 L 227.480 55.700 C 231.121 53.447 235.890 54.461 238.300 57.999 C 240.711 61.537 239.909 66.346 236.480 68.910 L 168.810 115.210 C 167.484 116.124 165.911 116.613 164.300 116.610 C 161.671 116.600 159.215 115.299 157.730 113.130 ZM 238.600 198.220 C 236.103 201.865 231.125 202.796 227.480 200.300 L 136.000 137.700 L 93.490 166.780 C 100.205 183.833 93.037 203.210 76.839 211.786 C 60.642 220.362 40.587 215.400 30.256 200.261 C 19.926 185.122 22.619 164.638 36.511 152.683 C 50.403 140.728 71.060 141.119 84.490 153.590 L 121.830 128.000 L 84.440 102.410 C 71.055 114.817 50.487 115.192 36.659 103.281 C 22.831 91.371 20.154 70.974 30.441 55.899 C 40.727 40.824 60.695 35.879 76.828 44.411 C 92.961 52.944 100.112 72.233 93.440 89.220 L 236.440 187.090 C 238.206 188.277 239.427 190.118 239.832 192.206 C 240.237 194.295 239.794 196.459 238.600 198.220 ZM 80.000 180.000 C 80.002 170.458 73.264 162.244 63.906 160.381 C 54.548 158.517 45.177 163.524 41.524 172.339 C 37.871 181.153 40.953 191.321 48.886 196.623 C 56.818 201.926 67.392 200.886 74.140 194.140 C 77.905 190.400 80.015 185.307 80.000 180.000 ZM 74.140 90.130 C 79.861 84.411 81.573 75.808 78.478 68.333 C 75.383 60.859 68.090 55.986 60.000 55.986 C 51.910 55.986 44.617 60.859 41.522 68.333 C 38.427 75.808 40.139 84.411 45.860 90.130 C 49.591 93.917 54.684 96.049 60.000 96.049 C 65.316 96.049 70.409 93.917 74.140 90.130 Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
