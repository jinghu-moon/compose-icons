package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorThinIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 48.000 L 220.000 208.000 C 220.000 214.627 214.627 220.000 208.000 220.000 L 136.000 220.000 C 133.791 220.000 132.000 218.209 132.000 216.000 C 132.000 213.791 133.791 212.000 136.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 144.000 C 44.000 146.209 42.209 148.000 40.000 148.000 C 37.791 148.000 36.000 146.209 36.000 144.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 117.170 157.170 L 64.000 210.340 L 42.830 189.170 C 41.267 187.607 38.733 187.607 37.170 189.170 C 35.607 190.733 35.607 193.267 37.170 194.830 L 61.170 218.830 C 61.920 219.581 62.938 220.003 64.000 220.003 C 65.062 220.003 66.080 219.581 66.830 218.830 L 122.830 162.830 C 124.393 161.267 124.393 158.733 122.830 157.170 C 121.267 155.607 118.733 155.607 117.170 157.170 Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
