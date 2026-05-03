package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) return _squareHalfBottom!!
        _squareHalfBottom = phosphorLightIcon(
            name = "SquareHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 42.000 L 56.000 42.000 C 48.268 42.000 42.000 48.268 42.000 56.000 L 42.000 200.000 C 42.000 207.732 48.268 214.000 56.000 214.000 L 200.000 214.000 C 207.732 214.000 214.000 207.732 214.000 200.000 L 214.000 56.000 C 214.000 48.268 207.732 42.000 200.000 42.000 ZM 56.000 54.000 L 200.000 54.000 C 201.105 54.000 202.000 54.895 202.000 56.000 L 202.000 122.000 L 54.000 122.000 L 54.000 56.000 C 54.000 54.895 54.895 54.000 56.000 54.000 ZM 106.000 134.000 L 106.000 202.000 L 86.000 202.000 L 86.000 134.000 ZM 118.000 134.000 L 138.000 134.000 L 138.000 202.000 L 118.000 202.000 ZM 150.000 134.000 L 170.000 134.000 L 170.000 202.000 L 150.000 202.000 ZM 54.000 200.000 L 54.000 134.000 L 74.000 134.000 L 74.000 202.000 L 56.000 202.000 C 54.895 202.000 54.000 201.105 54.000 200.000 ZM 200.000 202.000 L 182.000 202.000 L 182.000 134.000 L 202.000 134.000 L 202.000 200.000 C 202.000 201.105 201.105 202.000 200.000 202.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
