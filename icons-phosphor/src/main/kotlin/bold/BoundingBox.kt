package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorBoldIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 100.000 C 219.046 100.000 228.000 91.046 228.000 80.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 L 176.000 28.000 C 164.954 28.000 156.000 36.954 156.000 48.000 L 156.000 52.000 L 100.000 52.000 L 100.000 48.000 C 100.000 36.954 91.046 28.000 80.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 80.000 C 28.000 91.046 36.954 100.000 48.000 100.000 L 52.000 100.000 L 52.000 156.000 L 48.000 156.000 C 36.954 156.000 28.000 164.954 28.000 176.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 80.000 228.000 C 91.046 228.000 100.000 219.046 100.000 208.000 L 100.000 204.000 L 156.000 204.000 L 156.000 208.000 C 156.000 219.046 164.954 228.000 176.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 176.000 C 228.000 164.954 219.046 156.000 208.000 156.000 L 204.000 156.000 L 204.000 100.000 ZM 180.000 52.000 L 204.000 52.000 L 204.000 76.000 L 180.000 76.000 ZM 52.000 52.000 L 76.000 52.000 L 76.000 76.000 L 52.000 76.000 ZM 76.000 204.000 L 52.000 204.000 L 52.000 180.000 L 76.000 180.000 ZM 204.000 204.000 L 180.000 204.000 L 180.000 180.000 L 204.000 180.000 ZM 180.000 156.000 L 176.000 156.000 C 164.954 156.000 156.000 164.954 156.000 176.000 L 156.000 180.000 L 100.000 180.000 L 100.000 176.000 C 100.000 164.954 91.046 156.000 80.000 156.000 L 76.000 156.000 L 76.000 100.000 L 80.000 100.000 C 91.046 100.000 100.000 91.046 100.000 80.000 L 100.000 76.000 L 156.000 76.000 L 156.000 80.000 C 156.000 91.046 164.954 100.000 176.000 100.000 L 180.000 100.000 Z"),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
