package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorThinIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.170 84.830 C 165.428 46.169 131.299 18.166 92.261 20.086 C 53.223 22.006 22.006 53.223 20.086 92.261 C 18.166 131.299 46.169 165.428 84.830 171.170 C 90.572 209.831 124.701 237.834 163.739 235.914 C 202.777 233.994 233.994 202.777 235.914 163.739 C 237.834 124.701 209.831 90.572 171.170 84.830 ZM 28.000 96.000 C 28.044 60.798 54.946 31.450 90.011 28.350 C 125.076 25.249 156.710 49.422 162.930 84.070 C 161.930 84.070 160.930 84.000 160.000 84.000 C 118.045 84.044 84.044 118.045 84.000 160.000 C 84.000 161.000 84.000 162.000 84.070 162.930 C 51.655 157.112 28.048 128.933 28.000 96.000 ZM 164.000 96.000 C 164.007 106.742 161.453 117.332 156.550 126.890 L 129.110 99.450 C 138.668 94.547 149.258 91.993 160.000 92.000 C 161.300 92.000 162.600 92.000 163.880 92.120 C 164.000 93.400 164.000 94.700 164.000 96.000 ZM 92.000 160.000 C 91.993 149.258 94.547 138.668 99.450 129.110 L 126.890 156.550 C 117.332 161.453 106.742 164.007 96.000 164.000 C 94.700 164.000 93.400 163.950 92.120 163.880 C 92.050 162.600 92.000 161.300 92.000 160.000 ZM 134.000 152.360 L 103.640 122.000 C 108.538 114.769 114.769 108.538 122.000 103.640 L 152.360 134.000 C 147.462 141.231 141.231 147.462 134.000 152.360 ZM 160.000 228.000 C 127.067 227.952 98.888 204.345 93.070 171.930 C 94.070 171.930 95.070 172.000 96.000 172.000 C 137.955 171.956 171.956 137.955 172.000 96.000 C 172.000 95.000 172.000 94.000 171.930 93.070 C 206.578 99.290 230.751 130.924 227.650 165.989 C 224.550 201.054 195.202 227.956 160.000 228.000 Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
