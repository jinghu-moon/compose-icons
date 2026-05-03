package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) return _squareHalfBottom!!
        _squareHalfBottom = phosphorBoldIcon(
            name = "SquareHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 36.000 L 56.000 36.000 C 44.954 36.000 36.000 44.954 36.000 56.000 L 36.000 200.000 C 36.000 211.046 44.954 220.000 56.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 56.000 C 220.000 44.954 211.046 36.000 200.000 36.000 ZM 196.000 60.000 L 196.000 116.000 L 60.000 116.000 L 60.000 60.000 ZM 116.000 140.000 L 116.000 196.000 L 100.000 196.000 L 100.000 140.000 ZM 140.000 140.000 L 156.000 140.000 L 156.000 196.000 L 140.000 196.000 ZM 60.000 140.000 L 76.000 140.000 L 76.000 196.000 L 60.000 196.000 ZM 180.000 196.000 L 180.000 140.000 L 196.000 140.000 L 196.000 196.000 Z"),
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
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
