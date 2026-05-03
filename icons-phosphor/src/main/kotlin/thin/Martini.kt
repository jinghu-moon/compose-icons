package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorThinIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.830 42.830 C 235.975 41.686 236.318 39.964 235.698 38.469 C 235.079 36.973 233.619 35.999 232.000 36.000 L 24.000 36.000 C 22.381 35.999 20.921 36.973 20.302 38.469 C 19.682 39.964 20.025 41.686 21.170 42.830 L 124.000 145.660 L 124.000 212.000 L 88.000 212.000 C 85.791 212.000 84.000 213.791 84.000 216.000 C 84.000 218.209 85.791 220.000 88.000 220.000 L 168.000 220.000 C 170.209 220.000 172.000 218.209 172.000 216.000 C 172.000 213.791 170.209 212.000 168.000 212.000 L 132.000 212.000 L 132.000 145.660 ZM 33.660 44.000 L 222.340 44.000 L 198.340 68.000 L 57.660 68.000 ZM 128.000 138.340 L 65.660 76.000 L 190.340 76.000 Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
