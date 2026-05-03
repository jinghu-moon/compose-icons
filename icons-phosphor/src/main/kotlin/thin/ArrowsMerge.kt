package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorThinIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 40.000 L 188.000 104.000 C 188.001 105.061 187.580 106.079 186.830 106.830 L 132.000 161.660 L 132.000 222.340 L 157.170 197.170 C 158.733 195.607 161.267 195.607 162.830 197.170 C 164.393 198.733 164.393 201.267 162.830 202.830 L 130.830 234.830 C 130.080 235.581 129.062 236.003 128.000 236.003 C 126.938 236.003 125.920 235.581 125.170 234.830 L 93.170 202.830 C 91.607 201.267 91.607 198.733 93.170 197.170 C 94.733 195.607 97.267 195.607 98.830 197.170 L 124.000 222.340 L 124.000 161.660 L 69.170 106.830 C 68.420 106.079 67.999 105.061 68.000 104.000 L 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 C 74.209 36.000 76.000 37.791 76.000 40.000 L 76.000 102.340 L 128.000 154.340 L 180.000 102.340 L 180.000 40.000 C 180.000 37.791 181.791 36.000 184.000 36.000 C 186.209 36.000 188.000 37.791 188.000 40.000 Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
