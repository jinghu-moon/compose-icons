package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SquareHalf: ImageVector
    get() {
        if (_squareHalf != null) return _squareHalf!!
        _squareHalf = phosphorFillIcon(
            name = "SquareHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 56.000 56.000 L 128.000 56.000 L 128.000 200.000 L 56.000 200.000 Z"),
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
        return _squareHalf!!
    }

private var _squareHalf: ImageVector? = null
