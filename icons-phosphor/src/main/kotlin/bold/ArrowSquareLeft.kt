package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareLeft: ImageVector
    get() {
        if (_arrowSquareLeft != null) return _arrowSquareLeft!!
        _arrowSquareLeft = phosphorBoldIcon(
            name = "ArrowSquareLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 79.510 136.490 C 77.251 134.238 75.981 131.180 75.981 127.990 C 75.981 124.800 77.251 121.742 79.510 119.490 L 111.510 87.490 C 116.204 82.796 123.816 82.796 128.510 87.490 C 133.204 92.184 133.204 99.796 128.510 104.490 L 117.000 116.000 L 168.000 116.000 C 174.627 116.000 180.000 121.373 180.000 128.000 C 180.000 134.627 174.627 140.000 168.000 140.000 L 117.000 140.000 L 128.520 151.510 C 133.214 156.204 133.214 163.816 128.520 168.510 C 123.826 173.204 116.214 173.204 111.520 168.510 Z"),
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
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
