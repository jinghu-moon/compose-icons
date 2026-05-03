package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorFillIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.810 75.790 C 230.563 81.055 223.433 84.010 216.000 84.000 C 214.095 83.997 212.196 83.802 210.330 83.420 L 179.760 140.190 L 179.760 140.190 C 189.956 150.384 190.745 166.654 181.582 177.785 C 172.420 188.917 156.302 191.272 144.338 183.226 C 132.374 175.180 128.476 159.364 135.330 146.680 L 109.270 120.620 C 105.194 122.825 100.635 123.986 96.000 124.000 C 94.095 123.997 92.196 123.803 90.330 123.420 L 59.760 180.180 L 59.760 180.180 C 70.694 191.115 70.693 208.843 59.759 219.777 C 48.824 230.712 31.096 230.712 20.161 219.777 C 9.227 208.843 9.226 191.115 20.160 180.180 L 20.160 180.180 C 26.828 173.518 36.400 170.658 45.630 172.570 L 76.200 115.800 L 76.200 115.800 C 65.285 104.853 65.285 87.137 76.200 76.190 L 76.200 76.190 C 86.030 66.354 101.590 65.223 112.739 73.534 C 123.889 81.845 127.249 97.080 120.630 109.310 L 146.690 135.370 C 152.502 132.244 159.228 131.264 165.690 132.600 L 196.260 75.830 L 196.260 75.830 C 191.008 70.579 188.058 63.457 188.058 56.030 C 188.058 48.603 191.008 41.481 196.260 36.230 L 196.260 36.230 C 207.195 25.295 224.925 25.295 235.860 36.230 C 246.795 47.165 246.795 64.895 235.860 75.830 Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
