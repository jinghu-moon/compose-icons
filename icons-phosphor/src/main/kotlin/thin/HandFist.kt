package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorThinIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 84.000 L 180.000 84.000 L 180.000 64.000 C 179.995 51.420 171.600 40.389 159.477 37.029 C 147.355 33.670 134.480 38.807 128.000 49.590 C 121.520 38.807 108.645 33.670 96.523 37.029 C 84.400 40.389 76.005 51.420 76.000 64.000 L 76.000 68.430 C 68.041 60.307 55.960 57.805 45.429 62.098 C 34.898 66.391 28.011 76.628 28.000 88.000 L 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 L 228.000 112.000 C 228.000 96.536 215.464 84.000 200.000 84.000 ZM 152.000 44.000 C 163.046 44.000 172.000 52.954 172.000 64.000 L 172.000 84.000 L 136.000 84.000 C 134.636 84.000 133.283 84.237 132.000 84.700 L 132.000 64.000 C 132.000 52.954 140.954 44.000 152.000 44.000 ZM 84.000 64.000 C 84.000 52.954 92.954 44.000 104.000 44.000 C 115.046 44.000 124.000 52.954 124.000 64.000 L 124.000 104.000 C 124.000 115.046 115.046 124.000 104.000 124.000 C 92.954 124.000 84.000 115.046 84.000 104.000 ZM 36.000 88.000 C 36.000 76.954 44.954 68.000 56.000 68.000 C 67.046 68.000 76.000 76.954 76.000 88.000 L 76.000 104.000 C 76.000 115.046 67.046 124.000 56.000 124.000 C 44.954 124.000 36.000 115.046 36.000 104.000 ZM 220.000 128.000 C 220.000 178.810 178.810 220.000 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 L 36.000 123.580 C 42.067 129.772 50.659 132.806 59.269 131.794 C 67.879 130.783 75.534 125.840 80.000 118.410 C 84.702 126.232 92.921 131.272 102.025 131.915 C 111.129 132.558 119.975 128.724 125.730 121.640 C 128.823 130.033 135.725 136.453 144.320 138.930 C 131.666 147.010 124.005 160.986 124.000 176.000 C 124.000 178.209 125.791 180.000 128.000 180.000 C 130.209 180.000 132.000 178.209 132.000 176.000 C 132.000 156.118 148.118 140.000 168.000 140.000 C 170.209 140.000 172.000 138.209 172.000 136.000 C 172.000 133.791 170.209 132.000 168.000 132.000 L 152.000 132.000 C 140.954 132.000 132.000 123.046 132.000 112.000 L 132.000 96.000 C 132.000 93.791 133.791 92.000 136.000 92.000 L 200.000 92.000 C 211.046 92.000 220.000 100.954 220.000 112.000 Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
