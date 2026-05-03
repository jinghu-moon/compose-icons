package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorBoldIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 80.000 L 212.000 168.000 C 212.000 205.555 181.555 236.000 144.000 236.000 C 106.445 236.000 76.000 205.555 76.000 168.000 L 76.000 61.000 L 48.490 88.490 C 43.796 93.184 36.184 93.184 31.490 88.490 C 26.796 83.796 26.796 76.184 31.490 71.490 L 79.490 23.490 C 81.742 21.231 84.800 19.961 87.990 19.961 C 91.180 19.961 94.238 21.231 96.490 23.490 L 144.490 71.490 C 149.184 76.184 149.184 83.796 144.490 88.490 C 139.796 93.184 132.184 93.184 127.490 88.490 L 100.000 61.000 L 100.000 168.000 C 100.000 192.301 119.699 212.000 144.000 212.000 C 168.301 212.000 188.000 192.301 188.000 168.000 L 188.000 80.000 C 188.000 73.373 193.373 68.000 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
