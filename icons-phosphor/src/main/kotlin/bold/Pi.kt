package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorBoldIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 172.000 C 236.000 194.091 218.091 212.000 196.000 212.000 C 173.909 212.000 156.000 194.091 156.000 172.000 L 156.000 76.000 L 100.000 76.000 L 100.000 200.000 C 100.000 206.627 94.627 212.000 88.000 212.000 C 81.373 212.000 76.000 206.627 76.000 200.000 L 76.000 76.000 L 72.000 76.000 C 52.118 76.000 36.000 92.118 36.000 112.000 C 36.000 118.627 30.627 124.000 24.000 124.000 C 17.373 124.000 12.000 118.627 12.000 112.000 C 12.039 78.879 38.879 52.039 72.000 52.000 L 224.000 52.000 C 230.627 52.000 236.000 57.373 236.000 64.000 C 236.000 70.627 230.627 76.000 224.000 76.000 L 180.000 76.000 L 180.000 172.000 C 180.000 180.837 187.163 188.000 196.000 188.000 C 204.837 188.000 212.000 180.837 212.000 172.000 C 212.000 165.373 217.373 160.000 224.000 160.000 C 230.627 160.000 236.000 165.373 236.000 172.000 Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
