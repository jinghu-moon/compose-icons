package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorThinIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 193.660 124.000 L 132.000 62.340 L 132.000 44.000 L 150.340 44.000 L 212.000 105.660 L 212.000 124.000 ZM 132.000 73.660 L 182.340 124.000 L 132.000 124.000 ZM 212.000 48.000 L 212.000 94.340 L 161.660 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 48.000 44.000 L 124.000 44.000 L 124.000 124.000 L 44.000 124.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 ZM 105.660 212.000 L 44.000 150.340 L 44.000 132.000 L 62.340 132.000 L 124.000 193.660 L 124.000 212.000 ZM 124.000 182.340 L 73.660 132.000 L 124.000 132.000 ZM 44.000 208.000 L 44.000 161.660 L 94.340 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 ZM 208.000 212.000 L 132.000 212.000 L 132.000 132.000 L 212.000 132.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
