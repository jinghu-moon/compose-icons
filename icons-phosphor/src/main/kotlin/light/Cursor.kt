package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorLightIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 166.590 134.100 C 166.107 133.640 165.898 132.962 166.040 132.310 C 166.157 131.693 166.557 131.168 167.120 130.890 L 213.370 113.130 L 213.610 113.030 C 218.861 110.674 222.135 105.345 221.863 99.596 C 221.592 93.847 217.830 88.850 212.380 87.000 L 52.290 34.700 C 47.297 33.070 41.811 34.383 38.097 38.097 C 34.383 41.811 33.070 47.297 34.700 52.290 L 87.000 212.380 C 88.767 217.908 93.801 221.743 99.600 221.980 C 99.830 221.980 100.060 221.980 100.290 221.980 C 105.818 221.979 110.815 218.688 113.000 213.610 C 113.038 213.532 113.071 213.452 113.100 213.370 L 130.860 167.120 C 131.145 166.541 131.692 166.135 132.329 166.030 C 132.966 165.925 133.614 166.133 134.070 166.590 L 185.380 217.900 C 188.006 220.526 191.567 222.001 195.280 222.001 C 198.993 222.001 202.554 220.526 205.180 217.900 L 217.870 205.210 C 220.496 202.584 221.971 199.023 221.971 195.310 C 221.971 191.597 220.496 188.036 217.870 185.410 ZM 209.410 196.730 L 196.730 209.410 C 196.355 209.786 195.846 209.997 195.315 209.997 C 194.784 209.997 194.275 209.786 193.900 209.410 L 142.590 158.100 C 139.314 154.824 134.629 153.381 130.077 154.245 C 125.526 155.110 121.696 158.171 119.850 162.420 C 119.812 162.498 119.779 162.578 119.750 162.660 L 102.000 208.910 C 101.621 209.586 100.885 209.981 100.112 209.926 C 99.340 209.870 98.669 209.373 98.390 208.650 L 46.110 48.570 C 45.854 47.869 46.038 47.083 46.580 46.570 C 46.937 46.209 47.422 46.004 47.930 46.000 C 48.147 46.002 48.363 46.036 48.570 46.100 L 208.650 98.380 C 209.373 98.659 209.870 99.330 209.926 100.103 C 209.981 100.875 209.586 101.611 208.910 101.990 L 162.660 119.750 L 162.420 119.850 C 158.171 121.696 155.110 125.526 154.245 130.077 C 153.381 134.629 154.824 139.314 158.100 142.590 L 158.100 142.590 L 209.410 193.900 C 209.786 194.275 209.997 194.784 209.997 195.315 C 209.997 195.846 209.786 196.355 209.410 196.730 Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
