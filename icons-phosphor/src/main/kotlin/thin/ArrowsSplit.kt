package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorThinIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 186.830 L 194.830 218.830 C 194.080 219.581 193.062 220.003 192.000 220.003 C 190.938 220.003 189.920 219.581 189.170 218.830 L 157.170 186.830 C 155.607 185.267 155.607 182.733 157.170 181.170 C 158.733 179.607 161.267 179.607 162.830 181.170 L 188.000 206.340 L 188.000 137.660 L 128.000 77.660 L 68.000 137.660 L 68.000 206.340 L 93.170 181.170 C 94.733 179.607 97.267 179.607 98.830 181.170 C 100.393 182.733 100.393 185.267 98.830 186.830 L 66.830 218.830 C 66.080 219.581 65.062 220.003 64.000 220.003 C 62.938 220.003 61.920 219.581 61.170 218.830 L 29.170 186.830 C 27.607 185.267 27.607 182.733 29.170 181.170 C 30.733 179.607 33.267 179.607 34.830 181.170 L 60.000 206.340 L 60.000 136.000 C 59.999 134.939 60.420 133.921 61.170 133.170 L 124.000 70.340 L 124.000 24.000 C 124.000 21.791 125.791 20.000 128.000 20.000 C 130.209 20.000 132.000 21.791 132.000 24.000 L 132.000 70.340 L 194.830 133.170 C 195.580 133.921 196.001 134.939 196.000 136.000 L 196.000 206.340 L 221.170 181.170 C 222.733 179.607 225.267 179.607 226.830 181.170 C 228.393 182.733 228.393 185.267 226.830 186.830 Z"),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
