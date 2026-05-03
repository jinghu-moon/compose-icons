package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorBoldIcon(
            name = "ArrowSquareUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 87.510 128.490 C 85.251 126.238 83.981 123.180 83.981 119.990 C 83.981 116.800 85.251 113.742 87.510 111.490 L 119.510 79.490 C 121.762 77.231 124.820 75.961 128.010 75.961 C 131.200 75.961 134.258 77.231 136.510 79.490 L 168.510 111.490 C 173.204 116.184 173.204 123.796 168.510 128.490 C 163.816 133.184 156.204 133.184 151.510 128.490 L 140.000 117.000 L 140.000 168.000 C 140.000 174.627 134.627 180.000 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 117.000 L 104.490 128.520 C 102.235 130.769 99.179 132.030 95.994 132.024 C 92.809 132.019 89.757 130.747 87.510 128.490 Z"),
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
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
