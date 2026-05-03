package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareDownLeft: ImageVector
    get() {
        if (_arrowSquareDownLeft != null) return _arrowSquareDownLeft!!
        _arrowSquareDownLeft = phosphorThinIcon(
            name = "ArrowSquareDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 162.830 93.170 C 163.581 93.920 164.003 94.938 164.003 96.000 C 164.003 97.062 163.581 98.080 162.830 98.830 L 105.660 156.000 L 144.000 156.000 C 146.209 156.000 148.000 157.791 148.000 160.000 C 148.000 162.209 146.209 164.000 144.000 164.000 L 96.000 164.000 C 93.791 164.000 92.000 162.209 92.000 160.000 L 92.000 112.000 C 92.000 109.791 93.791 108.000 96.000 108.000 C 98.209 108.000 100.000 109.791 100.000 112.000 L 100.000 150.340 L 157.170 93.170 C 157.920 92.419 158.938 91.997 160.000 91.997 C 161.062 91.997 162.080 92.419 162.830 93.170 Z"),
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
        return _arrowSquareDownLeft!!
    }

private var _arrowSquareDownLeft: ImageVector? = null
