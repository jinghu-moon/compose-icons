package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorBoldIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 156.000 C 165.284 155.983 154.934 159.897 146.910 167.000 L 106.100 140.800 C 108.633 132.455 108.633 123.545 106.100 115.200 L 146.910 89.000 C 163.335 103.435 187.886 103.555 204.452 89.283 C 221.018 75.011 224.531 50.712 212.685 32.332 C 200.839 13.953 177.258 7.116 157.418 16.308 C 137.578 25.501 127.548 47.910 133.910 68.830 L 93.090 95.000 C 75.408 79.374 48.547 80.478 32.207 97.503 C 15.868 114.528 15.868 141.412 32.207 158.437 C 48.547 175.462 75.408 176.566 93.090 160.940 L 133.900 187.200 C 128.377 205.364 135.127 225.021 150.643 235.961 C 166.159 246.900 186.942 246.654 202.195 235.351 C 217.448 224.047 223.731 204.235 217.779 186.207 C 211.828 168.179 194.985 156.001 176.000 156.000 ZM 176.000 36.000 C 187.046 36.000 196.000 44.954 196.000 56.000 C 196.000 67.046 187.046 76.000 176.000 76.000 C 164.954 76.000 156.000 67.046 156.000 56.000 C 156.000 44.954 164.954 36.000 176.000 36.000 ZM 64.000 148.000 C 52.954 148.000 44.000 139.046 44.000 128.000 C 44.000 116.954 52.954 108.000 64.000 108.000 C 75.046 108.000 84.000 116.954 84.000 128.000 C 84.000 139.046 75.046 148.000 64.000 148.000 ZM 176.000 220.000 C 164.954 220.000 156.000 211.046 156.000 200.000 C 156.000 188.954 164.954 180.000 176.000 180.000 C 187.046 180.000 196.000 188.954 196.000 200.000 C 196.000 211.046 187.046 220.000 176.000 220.000 Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
