package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorFillIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 202.050 55.000 C 182.559 35.100 155.855 23.921 128.000 24.000 L 120.000 24.000 C 115.582 24.000 112.000 27.582 112.000 32.000 L 112.000 59.530 L 11.810 121.190 C 9.996 122.307 8.702 124.102 8.216 126.176 C 7.730 128.250 8.091 130.433 9.220 132.240 L 23.000 154.240 L 23.300 154.670 C 30.418 164.608 42.597 169.594 54.640 167.500 C 68.570 165.140 93.260 160.960 116.040 170.790 L 89.440 207.360 C 82.137 203.889 75.368 199.390 69.340 194.000 C 66.026 191.054 60.951 191.351 58.005 194.665 C 55.059 197.979 55.356 203.054 58.670 206.000 C 77.756 222.918 102.426 232.179 127.930 232.000 L 130.100 232.000 C 171.649 231.179 208.722 205.702 224.380 167.207 C 240.039 128.713 231.278 84.592 202.100 55.000 ZM 124.000 112.000 C 117.373 112.000 112.000 106.627 112.000 100.000 C 112.000 93.373 117.373 88.000 124.000 88.000 C 130.627 88.000 136.000 93.373 136.000 100.000 C 136.000 106.627 130.627 112.000 124.000 112.000 Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
