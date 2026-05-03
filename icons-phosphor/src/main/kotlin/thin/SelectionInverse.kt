package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorThinIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 216.000 C 148.000 218.209 146.209 220.000 144.000 220.000 L 112.000 220.000 C 109.791 220.000 108.000 218.209 108.000 216.000 C 108.000 213.791 109.791 212.000 112.000 212.000 L 144.000 212.000 C 146.209 212.000 148.000 213.791 148.000 216.000 ZM 40.000 148.000 C 42.209 148.000 44.000 146.209 44.000 144.000 L 44.000 112.000 C 44.000 109.791 42.209 108.000 40.000 108.000 C 37.791 108.000 36.000 109.791 36.000 112.000 L 36.000 144.000 C 36.000 146.209 37.791 148.000 40.000 148.000 ZM 72.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 184.000 C 44.000 181.791 42.209 180.000 40.000 180.000 C 37.791 180.000 36.000 181.791 36.000 184.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 72.000 220.000 C 74.209 220.000 76.000 218.209 76.000 216.000 C 76.000 213.791 74.209 212.000 72.000 212.000 ZM 220.000 48.000 L 220.000 208.000 C 220.000 214.627 214.627 220.000 208.000 220.000 L 184.000 220.000 C 181.791 220.000 180.000 218.209 180.000 216.000 C 180.000 213.791 181.791 212.000 184.000 212.000 L 206.340 212.000 L 44.000 49.660 L 44.000 72.000 C 44.000 74.209 42.209 76.000 40.000 76.000 C 37.791 76.000 36.000 74.209 36.000 72.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 208.000 44.000 L 49.660 44.000 L 212.000 206.340 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 Z"),
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
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
