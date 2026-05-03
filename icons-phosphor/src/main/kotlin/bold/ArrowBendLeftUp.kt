package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorBoldIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 224.000 C 212.000 230.627 206.627 236.000 200.000 236.000 C 140.381 235.934 92.066 187.619 92.000 128.000 L 92.000 61.000 L 64.490 88.490 C 59.796 93.184 52.184 93.184 47.490 88.490 C 42.796 83.796 42.796 76.184 47.490 71.490 L 95.490 23.490 C 97.742 21.231 100.800 19.961 103.990 19.961 C 107.180 19.961 110.238 21.231 112.490 23.490 L 160.490 71.490 C 165.184 76.184 165.184 83.796 160.490 88.490 C 155.796 93.184 148.184 93.184 143.490 88.490 L 116.000 61.000 L 116.000 128.000 C 116.050 174.371 153.629 211.950 200.000 212.000 C 206.627 212.000 212.000 217.373 212.000 224.000 Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
