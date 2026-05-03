package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorBoldIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 68.000 L 36.000 68.000 L 36.000 48.000 C 36.000 41.373 30.627 36.000 24.000 36.000 C 17.373 36.000 12.000 41.373 12.000 48.000 L 12.000 208.000 C 12.000 214.627 17.373 220.000 24.000 220.000 C 30.627 220.000 36.000 214.627 36.000 208.000 L 36.000 180.000 L 232.000 180.000 L 232.000 208.000 C 232.000 214.627 237.373 220.000 244.000 220.000 C 250.627 220.000 256.000 214.627 256.000 208.000 L 256.000 112.000 C 255.972 87.711 236.289 68.028 212.000 68.000 ZM 100.000 156.000 L 36.000 156.000 L 36.000 92.000 L 100.000 92.000 ZM 232.000 156.000 L 124.000 156.000 L 124.000 92.000 L 212.000 92.000 C 223.046 92.000 232.000 100.954 232.000 112.000 Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
