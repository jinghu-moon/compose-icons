package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorBoldIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 64.000 C 84.000 57.373 89.373 52.000 96.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 96.000 76.000 C 89.373 76.000 84.000 70.627 84.000 64.000 ZM 216.000 116.000 L 96.000 116.000 C 89.373 116.000 84.000 121.373 84.000 128.000 C 84.000 134.627 89.373 140.000 96.000 140.000 L 216.000 140.000 C 222.627 140.000 228.000 134.627 228.000 128.000 C 228.000 121.373 222.627 116.000 216.000 116.000 ZM 216.000 180.000 L 96.000 180.000 C 89.373 180.000 84.000 185.373 84.000 192.000 C 84.000 198.627 89.373 204.000 96.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 ZM 56.000 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 C 28.000 70.627 33.373 76.000 40.000 76.000 L 56.000 76.000 C 62.627 76.000 68.000 70.627 68.000 64.000 C 68.000 57.373 62.627 52.000 56.000 52.000 ZM 56.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 L 56.000 140.000 C 62.627 140.000 68.000 134.627 68.000 128.000 C 68.000 121.373 62.627 116.000 56.000 116.000 ZM 56.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 56.000 204.000 C 62.627 204.000 68.000 198.627 68.000 192.000 C 68.000 185.373 62.627 180.000 56.000 180.000 Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
