package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorBoldIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 48.000 L 228.000 208.000 C 228.000 219.046 219.046 228.000 208.000 228.000 L 140.000 228.000 C 133.373 228.000 128.000 222.627 128.000 216.000 C 128.000 209.373 133.373 204.000 140.000 204.000 L 204.000 204.000 L 204.000 52.000 L 52.000 52.000 L 52.000 140.000 C 52.000 146.627 46.627 152.000 40.000 152.000 C 33.373 152.000 28.000 146.627 28.000 140.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 128.490 151.510 C 126.238 149.251 123.180 147.981 119.990 147.981 C 116.800 147.981 113.742 149.251 111.490 151.510 L 64.000 199.000 L 48.490 183.510 C 43.796 178.816 36.184 178.816 31.490 183.510 C 26.796 188.204 26.796 195.816 31.490 200.510 L 55.490 224.510 C 57.742 226.769 60.800 228.039 63.990 228.039 C 67.180 228.039 70.238 226.769 72.490 224.510 L 128.490 168.510 C 130.749 166.258 132.019 163.200 132.019 160.010 C 132.019 156.820 130.749 153.762 128.490 151.510 Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
