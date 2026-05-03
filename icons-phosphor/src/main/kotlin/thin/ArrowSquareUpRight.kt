package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareUpRight: ImageVector
    get() {
        if (_arrowSquareUpRight != null) return _arrowSquareUpRight!!
        _arrowSquareUpRight = phosphorThinIcon(
            name = "ArrowSquareUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 164.000 96.000 L 164.000 144.000 C 164.000 146.209 162.209 148.000 160.000 148.000 C 157.791 148.000 156.000 146.209 156.000 144.000 L 156.000 105.660 L 98.830 162.830 C 97.267 164.393 94.733 164.393 93.170 162.830 C 91.607 161.267 91.607 158.733 93.170 157.170 L 150.340 100.000 L 112.000 100.000 C 109.791 100.000 108.000 98.209 108.000 96.000 C 108.000 93.791 109.791 92.000 112.000 92.000 L 160.000 92.000 C 162.209 92.000 164.000 93.791 164.000 96.000 Z"),
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
        return _arrowSquareUpRight!!
    }

private var _arrowSquareUpRight: ImageVector? = null
