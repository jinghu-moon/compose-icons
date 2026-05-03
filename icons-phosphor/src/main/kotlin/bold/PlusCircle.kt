package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlusCircle: ImageVector
    get() {
        if (_plusCircle != null) return _plusCircle!!
        _plusCircle = phosphorBoldIcon(
            name = "PlusCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 180.000 128.000 C 180.000 134.627 174.627 140.000 168.000 140.000 L 140.000 140.000 L 140.000 168.000 C 140.000 174.627 134.627 180.000 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 140.000 L 88.000 140.000 C 81.373 140.000 76.000 134.627 76.000 128.000 C 76.000 121.373 81.373 116.000 88.000 116.000 L 116.000 116.000 L 116.000 88.000 C 116.000 81.373 121.373 76.000 128.000 76.000 C 134.627 76.000 140.000 81.373 140.000 88.000 L 140.000 116.000 L 168.000 116.000 C 174.627 116.000 180.000 121.373 180.000 128.000 Z"),
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
        return _plusCircle!!
    }

private var _plusCircle: ImageVector? = null
