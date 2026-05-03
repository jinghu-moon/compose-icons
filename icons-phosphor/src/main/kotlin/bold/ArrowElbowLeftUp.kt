package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorBoldIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 192.000 C 244.000 198.627 238.627 204.000 232.000 204.000 L 88.000 204.000 C 81.373 204.000 76.000 198.627 76.000 192.000 L 76.000 77.000 L 48.490 104.490 C 43.796 109.184 36.184 109.184 31.490 104.490 C 26.796 99.796 26.796 92.184 31.490 87.490 L 79.490 39.490 C 81.742 37.231 84.800 35.961 87.990 35.961 C 91.180 35.961 94.238 37.231 96.490 39.490 L 144.490 87.490 C 149.184 92.184 149.184 99.796 144.490 104.490 C 139.796 109.184 132.184 109.184 127.490 104.490 L 100.000 77.000 L 100.000 180.000 L 232.000 180.000 C 238.627 180.000 244.000 185.373 244.000 192.000 Z"),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
