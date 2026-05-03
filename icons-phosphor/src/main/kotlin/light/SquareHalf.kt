package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquareHalf: ImageVector
    get() {
        if (_squareHalf != null) return _squareHalf!!
        _squareHalf = phosphorLightIcon(
            name = "SquareHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 42.000 L 56.000 42.000 C 48.268 42.000 42.000 48.268 42.000 56.000 L 42.000 200.000 C 42.000 207.732 48.268 214.000 56.000 214.000 L 200.000 214.000 C 207.732 214.000 214.000 207.732 214.000 200.000 L 214.000 56.000 C 214.000 48.268 207.732 42.000 200.000 42.000 ZM 134.000 118.000 L 202.000 118.000 L 202.000 138.000 L 134.000 138.000 ZM 134.000 106.000 L 134.000 86.000 L 202.000 86.000 L 202.000 106.000 ZM 134.000 150.000 L 202.000 150.000 L 202.000 170.000 L 134.000 170.000 ZM 202.000 56.000 L 202.000 74.000 L 134.000 74.000 L 134.000 54.000 L 200.000 54.000 C 201.105 54.000 202.000 54.895 202.000 56.000 ZM 54.000 200.000 L 54.000 56.000 C 54.000 54.895 54.895 54.000 56.000 54.000 L 122.000 54.000 L 122.000 202.000 L 56.000 202.000 C 54.895 202.000 54.000 201.105 54.000 200.000 ZM 200.000 202.000 L 134.000 202.000 L 134.000 182.000 L 202.000 182.000 L 202.000 200.000 C 202.000 201.105 201.105 202.000 200.000 202.000 Z"),
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
