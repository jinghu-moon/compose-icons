package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorLightIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 50.000 C 183.035 49.994 178.174 51.421 174.000 54.110 L 174.000 44.000 C 174.001 30.712 163.983 19.562 150.771 18.145 C 137.559 16.729 125.405 25.504 122.590 38.490 C 114.625 33.090 104.328 32.531 95.826 37.037 C 87.323 41.543 82.004 50.377 82.000 60.000 L 82.000 131.000 L 74.470 118.900 C 67.326 106.443 51.437 102.136 38.980 109.280 C 26.523 116.424 22.216 132.313 29.360 144.770 C 60.760 211.000 78.510 238.000 128.000 238.000 C 175.474 237.945 213.945 199.474 214.000 152.000 L 214.000 76.000 C 214.000 61.641 202.359 50.000 188.000 50.000 ZM 202.000 152.000 C 201.950 192.849 168.849 225.950 128.000 226.000 C 107.000 226.000 93.490 220.950 81.250 208.550 C 67.810 195.000 55.540 172.000 40.100 139.430 L 39.870 139.000 C 36.004 132.304 38.299 123.741 44.995 119.875 C 51.691 116.009 60.254 118.304 64.120 125.000 L 64.220 125.170 L 82.900 155.170 C 84.313 157.450 87.068 158.515 89.648 157.779 C 92.227 157.042 94.004 154.683 94.000 152.000 L 94.000 60.000 C 94.000 52.268 100.268 46.000 108.000 46.000 C 115.732 46.000 122.000 52.268 122.000 60.000 L 122.000 120.000 C 122.000 123.314 124.686 126.000 128.000 126.000 C 131.314 126.000 134.000 123.314 134.000 120.000 L 134.000 44.000 C 134.000 36.268 140.268 30.000 148.000 30.000 C 155.732 30.000 162.000 36.268 162.000 44.000 L 162.000 120.000 C 162.000 123.314 164.686 126.000 168.000 126.000 C 171.314 126.000 174.000 123.314 174.000 120.000 L 174.000 76.000 C 174.000 68.268 180.268 62.000 188.000 62.000 C 195.732 62.000 202.000 68.268 202.000 76.000 Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
