package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorBoldIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 68.000 L 164.000 68.000 L 164.000 32.000 C 164.000 20.954 155.046 12.000 144.000 12.000 L 112.000 12.000 C 100.954 12.000 92.000 20.954 92.000 32.000 L 92.000 68.000 L 56.000 68.000 C 44.954 68.000 36.000 76.954 36.000 88.000 L 36.000 120.000 C 36.000 131.046 44.954 140.000 56.000 140.000 L 92.000 140.000 L 92.000 224.000 C 92.000 235.046 100.954 244.000 112.000 244.000 L 144.000 244.000 C 155.046 244.000 164.000 235.046 164.000 224.000 L 164.000 140.000 L 200.000 140.000 C 211.046 140.000 220.000 131.046 220.000 120.000 L 220.000 88.000 C 220.000 76.954 211.046 68.000 200.000 68.000 ZM 196.000 116.000 L 152.000 116.000 C 145.373 116.000 140.000 121.373 140.000 128.000 L 140.000 220.000 L 116.000 220.000 L 116.000 128.000 C 116.000 121.373 110.627 116.000 104.000 116.000 L 60.000 116.000 L 60.000 92.000 L 104.000 92.000 C 110.627 92.000 116.000 86.627 116.000 80.000 L 116.000 36.000 L 140.000 36.000 L 140.000 80.000 C 140.000 86.627 145.373 92.000 152.000 92.000 L 196.000 92.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
