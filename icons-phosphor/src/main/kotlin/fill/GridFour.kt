package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GridFour: ImageVector
    get() {
        if (_gridFour != null) return _gridFour!!
        _gridFour = phosphorFillIcon(
            name = "GridFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 56.000 L 216.000 116.000 C 216.000 118.209 214.209 120.000 212.000 120.000 L 136.000 120.000 L 136.000 44.000 C 136.000 41.791 137.791 40.000 140.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 ZM 116.000 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 116.000 C 40.000 118.209 41.791 120.000 44.000 120.000 L 120.000 120.000 L 120.000 44.000 C 120.000 41.791 118.209 40.000 116.000 40.000 ZM 212.000 136.000 L 136.000 136.000 L 136.000 212.000 C 136.000 214.209 137.791 216.000 140.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 140.000 C 216.000 137.791 214.209 136.000 212.000 136.000 ZM 40.000 140.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 116.000 216.000 C 118.209 216.000 120.000 214.209 120.000 212.000 L 120.000 136.000 L 44.000 136.000 C 41.791 136.000 40.000 137.791 40.000 140.000 Z"),
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
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
