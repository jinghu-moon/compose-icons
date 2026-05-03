package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorThinIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 106.830 L 178.830 154.830 C 177.267 156.393 174.733 156.393 173.170 154.830 C 171.607 153.267 171.607 150.733 173.170 149.170 L 214.340 108.000 L 165.000 108.000 C 123.036 107.986 86.381 136.369 75.890 177.000 C 75.432 178.772 73.830 180.008 72.000 180.000 C 71.662 180.000 71.326 179.957 71.000 179.870 C 68.864 179.316 67.579 177.137 68.130 175.000 C 79.512 130.817 119.375 99.955 165.000 100.000 L 214.360 100.000 L 173.170 58.830 C 171.607 57.267 171.607 54.733 173.170 53.170 C 174.733 51.607 177.267 51.607 178.830 53.170 L 226.830 101.170 C 227.581 101.920 228.003 102.938 228.003 104.000 C 228.003 105.062 227.581 106.080 226.830 106.830 ZM 192.000 212.000 L 36.000 212.000 L 36.000 88.000 C 36.000 85.791 34.209 84.000 32.000 84.000 C 29.791 84.000 28.000 85.791 28.000 88.000 L 28.000 216.000 C 28.000 218.209 29.791 220.000 32.000 220.000 L 192.000 220.000 C 194.209 220.000 196.000 218.209 196.000 216.000 C 196.000 213.791 194.209 212.000 192.000 212.000 Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
