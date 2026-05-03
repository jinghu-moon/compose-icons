package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorBoldIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 176.000 C 148.000 182.627 142.627 188.000 136.000 188.000 L 120.000 188.000 C 113.373 188.000 108.000 182.627 108.000 176.000 C 108.000 169.373 113.373 164.000 120.000 164.000 L 136.000 164.000 C 142.627 164.000 148.000 169.373 148.000 176.000 ZM 120.000 92.000 L 136.000 92.000 C 142.627 92.000 148.000 86.627 148.000 80.000 C 148.000 73.373 142.627 68.000 136.000 68.000 L 120.000 68.000 C 113.373 68.000 108.000 73.373 108.000 80.000 C 108.000 86.627 113.373 92.000 120.000 92.000 ZM 220.000 40.000 L 220.000 216.000 C 220.000 227.046 211.046 236.000 200.000 236.000 L 56.000 236.000 C 44.954 236.000 36.000 227.046 36.000 216.000 L 36.000 40.000 C 36.000 28.954 44.954 20.000 56.000 20.000 L 200.000 20.000 C 211.046 20.000 220.000 28.954 220.000 40.000 ZM 60.000 44.000 L 60.000 116.000 L 196.000 116.000 L 196.000 44.000 ZM 196.000 212.000 L 196.000 140.000 L 60.000 140.000 L 60.000 212.000 Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
