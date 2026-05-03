package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorBoldIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 152.000 148.000 L 196.000 148.000 L 196.000 164.000 L 116.000 164.000 L 116.000 148.000 ZM 164.000 124.000 L 164.000 108.000 L 196.000 108.000 L 196.000 124.000 ZM 196.000 44.000 L 196.000 84.000 L 152.000 84.000 C 145.373 84.000 140.000 89.373 140.000 96.000 L 140.000 124.000 L 104.000 124.000 C 97.373 124.000 92.000 129.373 92.000 136.000 L 92.000 164.000 L 60.000 164.000 L 60.000 44.000 ZM 60.000 212.000 L 60.000 188.000 L 196.000 188.000 L 196.000 212.000 Z"),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
