package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) return _arrowSquareRight!!
        _arrowSquareRight = phosphorThinIcon(
            name = "ArrowSquareRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 170.830 125.170 C 171.581 125.920 172.003 126.938 172.003 128.000 C 172.003 129.062 171.581 130.080 170.830 130.830 L 138.830 162.830 C 137.267 164.393 134.733 164.393 133.170 162.830 C 131.607 161.267 131.607 158.733 133.170 157.170 L 158.340 132.000 L 88.000 132.000 C 85.791 132.000 84.000 130.209 84.000 128.000 C 84.000 125.791 85.791 124.000 88.000 124.000 L 158.340 124.000 L 133.170 98.830 C 131.607 97.267 131.607 94.733 133.170 93.170 C 134.733 91.607 137.267 91.607 138.830 93.170 Z"),
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
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
