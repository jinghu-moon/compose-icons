package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) return _squareHalfBottom!!
        _squareHalfBottom = phosphorRegularIcon(
            name = "SquareHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 200.000 56.000 L 200.000 120.000 L 56.000 120.000 L 56.000 56.000 ZM 104.000 136.000 L 104.000 200.000 L 88.000 200.000 L 88.000 136.000 ZM 120.000 136.000 L 136.000 136.000 L 136.000 200.000 L 120.000 200.000 ZM 152.000 136.000 L 168.000 136.000 L 168.000 200.000 L 152.000 200.000 ZM 56.000 136.000 L 72.000 136.000 L 72.000 200.000 L 56.000 200.000 ZM 200.000 200.000 L 184.000 200.000 L 184.000 136.000 L 200.000 136.000 L 200.000 200.000 Z"),
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
