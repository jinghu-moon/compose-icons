package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareUpLeft: ImageVector
    get() {
        if (_arrowSquareUpLeft != null) return _arrowSquareUpLeft!!
        _arrowSquareUpLeft = phosphorThinIcon(
            name = "ArrowSquareUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 162.830 157.170 C 164.393 158.733 164.393 161.267 162.830 162.830 C 161.267 164.393 158.733 164.393 157.170 162.830 L 100.000 105.660 L 100.000 144.000 C 100.000 146.209 98.209 148.000 96.000 148.000 C 93.791 148.000 92.000 146.209 92.000 144.000 L 92.000 96.000 C 92.000 93.791 93.791 92.000 96.000 92.000 L 144.000 92.000 C 146.209 92.000 148.000 93.791 148.000 96.000 C 148.000 98.209 146.209 100.000 144.000 100.000 L 105.660 100.000 Z"),
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
        return _arrowSquareUpLeft!!
    }

private var _arrowSquareUpLeft: ImageVector? = null
