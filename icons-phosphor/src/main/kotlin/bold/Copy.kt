package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorBoldIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 28.000 L 88.000 28.000 C 81.373 28.000 76.000 33.373 76.000 40.000 L 76.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 81.373 28.000 88.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 168.000 228.000 C 174.627 228.000 180.000 222.627 180.000 216.000 L 180.000 180.000 L 216.000 180.000 C 222.627 180.000 228.000 174.627 228.000 168.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 ZM 156.000 204.000 L 52.000 204.000 L 52.000 100.000 L 156.000 100.000 ZM 204.000 156.000 L 180.000 156.000 L 180.000 88.000 C 180.000 81.373 174.627 76.000 168.000 76.000 L 100.000 76.000 L 100.000 52.000 L 204.000 52.000 Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
