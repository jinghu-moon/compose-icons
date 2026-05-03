package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorLightIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.910 83.090 C 166.341 43.893 131.350 15.904 91.668 18.102 C 51.985 20.301 20.301 51.985 18.102 91.668 C 15.904 131.350 43.893 166.341 83.090 172.910 C 89.659 212.107 124.650 240.096 164.332 237.898 C 204.015 235.699 235.699 204.015 237.898 164.332 C 240.096 124.650 212.107 89.659 172.910 83.090 ZM 226.000 160.000 C 225.996 162.977 225.789 165.951 225.380 168.900 L 171.620 115.130 C 173.203 108.877 174.002 102.451 174.000 96.000 C 174.000 95.830 174.000 95.670 174.000 95.510 C 204.325 102.131 225.958 128.961 226.000 160.000 ZM 45.310 53.790 L 100.810 109.290 C 95.912 115.010 91.870 121.410 88.810 128.290 L 34.000 73.480 C 36.604 66.313 40.431 59.651 45.310 53.790 ZM 73.480 34.000 L 128.280 88.810 C 121.400 91.870 115.000 95.912 109.280 100.810 L 53.780 45.310 C 59.644 40.430 66.309 36.603 73.480 34.000 ZM 94.000 160.000 C 94.044 123.567 123.567 94.044 160.000 94.000 C 160.650 94.000 161.300 94.000 161.950 94.000 C 161.950 94.650 162.000 95.300 162.000 96.000 C 161.956 132.433 132.433 161.956 96.000 162.000 C 95.350 162.000 94.700 162.000 94.000 161.950 C 94.000 161.300 94.000 160.650 94.000 160.000 ZM 146.710 155.190 L 202.210 210.690 C 196.349 215.569 189.687 219.396 182.520 222.000 L 127.720 167.190 C 134.597 164.129 140.993 160.087 146.710 155.190 ZM 155.190 146.710 C 160.088 140.990 164.130 134.590 167.190 127.710 L 222.000 182.520 C 219.384 189.690 215.543 196.352 210.650 202.210 ZM 160.490 82.010 L 160.000 82.010 C 153.549 82.008 147.123 82.807 140.870 84.390 L 87.100 30.620 C 90.049 30.211 93.023 30.004 96.000 30.000 C 127.039 30.042 153.869 51.675 160.490 82.000 ZM 30.000 96.000 C 30.004 93.023 30.211 90.049 30.620 87.100 L 84.380 140.870 C 82.797 147.123 81.998 153.549 82.000 160.000 C 82.000 160.170 82.000 160.330 82.000 160.490 C 51.675 153.869 30.042 127.039 30.000 96.000 ZM 95.510 174.000 L 96.000 174.000 C 102.451 174.002 108.877 173.203 115.130 171.620 L 168.900 225.380 C 165.951 225.789 162.977 225.996 160.000 226.000 C 128.961 225.958 102.131 204.325 95.510 174.000 Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
