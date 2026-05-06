package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorThinIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM84 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM156 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM180 168c0 2.209-1.791 4-4 4-8 0-12-5.32-15.2-9.6C157.73 158.31 155.8 156 152 156c-3.8 0-5.73 2.31-8.8 6.4C140 166.68 136 172 128 172c-8 0-12-5.32-15.2-9.6C109.73 158.31 107.8 156 104 156c-3.8 0-5.73 2.31-8.8 6.4C92 166.68 88 172 80 172c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 3.81 0 5.73-2.31 8.8-6.4C92 153.32 96 148 104 148c8 0 12 5.32 15.2 9.6 3.07 4.09 5 6.4 8.8 6.4 3.8 0 5.73-2.31 8.8-6.4C140 153.32 144 148 152 148c8 0 12 5.32 15.2 9.6 3.07 4.09 5 6.4 8.8 6.4 2.209 0 4 1.791 4 4Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
